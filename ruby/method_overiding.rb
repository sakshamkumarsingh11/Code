class Animal
    def sound
        puts " Animal makes a sound"
    end
end

class Dog < Animal
    def sound
        puts " Dog makes sound"
    end
end

animal1 = Animal.new
animal1.sound
dog1 = Dog.new
dog1.sound