import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;

public class sample {
    private JFrame frame;
    private JTextField symptomInput;
    private JTextArea resultArea;
    private JTextField allergyInput;
    private Connection conn;

    public sample() {
        initializeDB();
        initializeUI();
    }

    private void initializeDB() {
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:medicine.db");
            Statement stmt = conn.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS Medicines (\n" +
                    "    disease TEXT,\n" +
                    "    medicine TEXT,\n" +
                    "    side_effects TEXT\n" +
                    ");";
            stmt.execute(sql);
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void initializeUI() {
        frame = new JFrame("Doctor Assistant - Medicine Recommender");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));

        JLabel symptomLabel = new JLabel("Enter Disease/Symptom:");
        symptomInput = new JTextField();
        JLabel allergyLabel = new JLabel("Enter Patient Allergies:");
        allergyInput = new JTextField();
        JButton searchButton = new JButton("Find Medicines");

        inputPanel.add(symptomLabel);
        inputPanel.add(symptomInput);
        inputPanel.add(allergyLabel);
        inputPanel.add(allergyInput);
        inputPanel.add(searchButton);

        resultArea = new JTextArea();
        resultArea.setEditable(false);

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchMedicine();
            }
        });

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(new JScrollPane(resultArea), BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private void searchMedicine() {
        String disease = symptomInput.getText().trim();
        String allergy = allergyInput.getText().trim().toLowerCase();
        resultArea.setText("");

        if (disease.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please enter a disease or symptom.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            PreparedStatement pstmt = conn.prepareStatement("SELECT medicine, side_effects FROM Medicines WHERE disease = ?");
            pstmt.setString(1, disease);
            ResultSet rs = pstmt.executeQuery();
            ArrayList<String> medicines = new ArrayList<>();

            while (rs.next()) {
                String medicine = rs.getString("medicine");
                String sideEffects = rs.getString("side_effects");
                if (!sideEffects.toLowerCase().contains(allergy)) {
                    medicines.add("Medicine: " + medicine + "\nSide Effects: " + sideEffects + "\n");
                }
            }
            
            if (medicines.isEmpty()) {
                resultArea.setText("No suitable medicines found.");
            } else {
                for (String med : medicines) {
                    resultArea.append(med + "\n");
                }
            }

            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(sample::new);
    }
}
