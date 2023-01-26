package studio1;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Scanner scan = new Scanner(System.in);  
    	System.out.print("The first of two integers to be averaged?");
    	double n1 = scan.nextDouble();
    	System.out.print("The second of two integers to be averaged?");
    	double n2 = scan.nextDouble();
    	double avg=(n1+n2)/2;
    	System.out.print("Average of "+n1+" and "+n2+" is "+avg+".");
	}

}
