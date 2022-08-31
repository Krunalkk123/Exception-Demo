package pack1;

import java.util.Scanner;

/*Exception            : > An Un-expected event occurs in the program that is called as Exception.
 *Exception Handling   : > Exception handling means Not removing the exception but providing alternate to the that to execute the program.
 *types : 1) Compile time Or checked Exception.
 *        2) Runtime or Unchecked.
 * */
public class ClassA {

	Scanner sc=new Scanner(System.in);
	
	public void display() {
		
			
		try {
			System.out.println("try : The try statement defines the code block to run (to try). ");
			System.out.println("please enter a number : ");
			int a=sc.nextInt();
			System.out.println(a/0);
			
			
		}
		catch(Exception e) { // catch block only execute when there is exception in try block.
			System.out.println("------------------------");
			System.out.println("catch : The catch statement defines a code block to handle any error. ");
			//System.out.println("catch block executed : "+e);
			//System.out.println("Reason of Exception"+e.getMessage())
            System.out.println("Name and Reason of Exception"+e.toString());
           // e.printStackTrace();
			System.out.println("--------------------------");
		}
		finally {
			 System.out.println("finally : The finally statement defines a code block to run regardless of the result. ");
		}
	}
	
	public static void main(String[] args) {
		
	   ClassA obj=new ClassA();
	   obj.display();
	}
}

//e.getMessage()      :- this method will give the reason of exception.
//e.toString()        :- this method will give Name & reason of the Exception.
//e.printStackTrace() :- this method will print complete information about the exception.