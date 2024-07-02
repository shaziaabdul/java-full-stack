package function;
import java.util.Scanner;
public class methods2 { 
	int id;
	String name;
	void acceptinfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your id");
		id=sc.nextInt();
		System.out.println("enter your name");
		
		name=sc.next();
	}
	void displayinfo() {
		System.out.println(id+"  "+name);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*methods2 ob1=new methods2();
		ob1.acceptinfo();
		ob1.displayinfo();*/
		methods2 arr[]=new methods2[4];
		/*arr[0]=new methods2();
		arr[0].acceptinfo();
		arr[0].displayinfo();*/
		for(int i=0;i<arr.length;i++) {
			arr[i]=new methods2();
			arr[i].acceptinfo();
			arr[i].displayinfo();
			
		}
		

	}

}
