class Animal 
    def eat
        puts "Animal is eating"
    end
    def sleep
        puts "Animal is sleeping"
    end

end 

class Dog <Animal
    def bark
        puts "Dog is barking"
    end
end
#class name must start with capital letter
class Cat < Animal
    def meow
        puts "Cat is meowing"
    end
end

dog1=dog.new
dog1.eat
dog1.bark

cat1=cat.new
cat1.sleep
cat1.meow