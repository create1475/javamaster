package sec18.exam02;


public class AnimalExample {

	public static void main(String[] args) {
		
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-------------");
		
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("-------------");
		
		animalsound(new Dog());//요기부분 이해안감
		animalsound(new Cat());//요기부분 이해안감
		
	
			}
	
	
		public static void animalsound(Animal animal){
			animal.sound();
			
			
		
	}
	

}
