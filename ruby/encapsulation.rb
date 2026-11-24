class BankAcc
    def initialize(balance)
        @balance = balance 
    end

    def deposit(amount)
        if amount>0
            @balance += amount
        else
            puts "Deposit amount must be positive."
        end
    end

    def show_balance
        puts "balance is #{@balance}"
    end
end

account1 = BankAcc.new(1000)
account1.deposit(500)
account1.show_balance