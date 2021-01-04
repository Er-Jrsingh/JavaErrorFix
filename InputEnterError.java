package Pack;
import java.util.Scanner;

class Hello {
		 public static void main(String argu[])
		 {
			 System.out.println("Hello World");																//1
			 
			 Student obj=new Student();																			//2
			 obj.math=75;
			 obj.science=60;
			 obj.add();
			 System.out.println("Addition=" + obj.total );
	//Get Input From User 3
			  int roll;	
			 String subject; 
			 float price;
			 
			 Scanner  get_ip = new Scanner (System.in);
			 
			 System.out.print("Enter Roll No: ");
			 roll= get_ip.nextInt();
			 System.out.println("Your Roll No Is :"+ roll);
			 
			 get_ip.nextLine();				//solution of error
			 
			 System.out.print("Enter Subject: ");
			 subject=get_ip.nextLine();
			 System.out.println("your Subject: "+ subject);
			 
			 System.out.print("Enter Price You Pay: ");
			 price=get_ip.nextFloat();
			 System.out.println("Paid: " + price);
		 }
}
	class Student{
		
		int math,science,total;
		
		void add() {
							total=math+science;
		}
	}