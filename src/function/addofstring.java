package function;
import java.util.Scanner;

public class addofstring {
String s1,s2;
	
	void Takeinfo()
	{
	Scanner sc=new Scanner(System.in);
	 s1="hello";
	System.out.println("enter s2");
	 s2=sc.next();
	}
	void displayinfo() {
		System.out.println(s1+" "+s2);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addofstring k=new addofstring();
		k.Takeinfo();
		k.displayinfo();
		

	}

}
