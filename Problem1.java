
class Animal{
	public void makeSound() {
		System.out.println("Sound by animal");
	}
}
class Dog extends Animal{
	
	@Override
	public void makeSound() {
		System.out.println("Dog Barks");
	}
}
class Cat extends Animal{
	
	@Override
	public void makeSound() {
		System.out.println("Cat Meows");
	}
}
class Cow extends Animal{
	
	@Override
	public void makeSound() {
		System.out.println("Cow Moos");
	}
}
public class Problem1 {
	public static void main(String[] args) {
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal cow = new Cow();
		
		dog.makeSound();
		cat.makeSound();
		cow.makeSound();
	}
}
