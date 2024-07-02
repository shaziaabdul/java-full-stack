package function;
	public class saloon
		{
		String name;
		customer cus;
		 
	saloon(String name,customer cus)
		 {
			 this.name=name;
			 this.cus=cus;
		 }
		 void display() 
		 {
			 System.out.println(name+" "+cus.city+" "+cus.country);
		 }
	public static void main(String[] args) {
		customer c=new customer("vizag","India");
		saloon s=new saloon("ramu",c);
		s.display();
	}
	}



