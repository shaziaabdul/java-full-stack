package function;
import java.util.Scanner;
public class Factorial 
{
    public static void main(String[] args) 
    {
		// TODO Auto-generated method stub
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter a number");
    	int number=sc.nextInt();
    	int i,fact=1;
    	for(i=1;i<=number;i++)
    	{
    		fact=fact*i;
    	}
    	System.out.println("factorial of"+" "+number+" "+"is:"+fact);
    	

	}

}
