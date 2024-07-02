package function;
 class Animal 
{
	void cry() {
		
		System.out.println("crying");
	}
}
	class Dog extends Animal
	{
	void eat() 
	{
		System.out.println("eating");
	}
	}
	class Babydog extends Dog
	{
	void bark() 
	{
		System.out.println("barking");
	}
	}
 public class inheritance{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Babydog b=new Babydog();
         b.cry();      
         b.eat();
         b.bark();


	}

}
