class Payment
    def initialize(amount)
        @amount = amount
    end
    def make_payment
        validate_amount(@amount)
        check_balance(@amount)
        process_payment(@amount)

        puts "Payment of #{@amount} has been made successfully."
    end

    private 
    def validate_amount(amount)
        if amount <= 0
            raise "Payment amount must be positive."
        end
    end

    def check_balance(amount)
        balance = 1000
        if amount < balance
            puts "Sufficient balance available."
        else
            raise "Insufficient balance."
        end
    end

    def process_payment(amount)
        puts "Processing payment of #{amount}..."
    end
end

payemnt1 = Payment.new(500)
payemnt1.make_payment

