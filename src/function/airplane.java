package function;
import java.util.Scanner;
public class airplane {
	String Flightnum;
	String Destination;
	int DepartureTime;
	int delayTime;
	int min;
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Flight Number");
		Flightnum=sc.next();
		System.out.println("enter Destination");
		Destination=sc.next();
		System.out.println("enter Departure Time");
		DepartureTime=sc.nextInt();
		System.out.println("enter delayTime");
		delayTime=sc.nextInt();
		System.out.println("enter minutes");
		min=sc.nextInt();
	}
 void checkStatus() 
		{
			 if (delayTime == 0) 
			 {
			   System.out.println("Flight " + Flightnum + " is on time.");
			 } 
			 else 
			 {
			   System.out.println("Flight " + Flightnum + " is delayed by " + delayTime+"hours"+" "+min+"minutes");
			 }
	}
	void delay() {
		
			int y=DepartureTime+delayTime;
		System.out.println("Flight is delayed for :"+y+"hours"+"  "+min+"minutes");
		}
public static void main(String[] args) {
		airplane ob=new airplane();
		ob.input();
		ob.checkStatus();
		ob.delay();
}
}


