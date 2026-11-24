#we use module as mixins

module Logger
    def log(msg)
        puts "Log: #{msg}"
    end
end

class Teacher
    include Logger
    def initialize(name)
        @name = name
    end

    def teach
        log(" #{@name} is teaching.")
    end
end

teacher1 = Teacher.new("Mr. Smith")
teacher1.teach
