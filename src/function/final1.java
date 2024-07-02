package function;
public class final1 
{
		 final int m=9;
		void main() 
		{
			System.out.println("finally");
		}
	}
	class end extends final1
	{
		void main() {
			 m=89;
				System.out.println(m);
			}

		
		public static void main(String[] args) {
			final1 ob=new final1();
			end ob2=new end();
			ob.main();
			ob2.main();

		}

}
	
