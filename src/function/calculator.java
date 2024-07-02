package function;

public class calculator {
			int a,b;
			int sum()
			{
				return a+b;
			}
			int sub()
			{
				return a-b;
			}
			int mul()
			{
				return a*b;
			}
			int div()
			{
				return a/b;
			}
			

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				calculator n=new calculator();
				n.a=8;
				n.b=7;
				System.out.println(n.sum());
				System.out.println(n.sub());
				System.out.println(n.mul());
				System.out.println(n.div());
				

			}


	}


