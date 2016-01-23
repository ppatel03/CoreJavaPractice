
abstract class Animal{	
	 Animal(String name){
		System.out.println("Animal constructor is called.");
	}
	 
	 Animal(){
			System.out.println("Animal default constructor is called.");
		}
	 
	abstract public void eat();
}

 class Dog extends Animal{
	 
	Dog(){	
		//this("Stanley");		
		//super();
		//this("puppy");
		eat();
		System.out.println("Dog constructor is called.");
	}
	
	Dog(String name){
		super(name);
		System.out.println("Dog name is "+name);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dog is eating.");
		
	}
	
	public static Dog createObject(){
		return new Dog();
	}
}

public class TestAbstract {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();		
		d.eat();
		
		//Array declaration
		int [][]a = new int[3][];
		//Array initialization
		int []b = new int[]{1,2,3};
		//object assignment
		Object c = 3;
		//Wrapper class == comparison 
		Integer i1 = 20;
		Integer i2 = 20;
		
		System.out.println(i1.equals(i2));
		System.out.println(i1==i2);

		
	}

}


