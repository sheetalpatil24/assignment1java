import java.util.Scanner;


public class Assignment1 {


	
	    public static void main( String[] args ) {
	    	System.out.println("Welcome to Line Comparison Computation Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first co-ordinate");
        int X1=sc.nextInt();
        int Y1=sc.nextInt();
        System.out.println("enter the second co-ordinate");
        int X2=sc.nextInt();
        int Y2=sc.nextInt();
        System.out.println("the first co-ordinate is (" +X1 +","+Y1+") ");
        System.out.println("the second co-ordinate is (" +X2 +","+Y2+") ");
        double length2;
        int point3=(X2-X1)*(X2-X1);
        int point4=(Y2-Y1)*(Y2-Y1);
        length2=Math.sqrt(point3+point4);
        System.out.println("length of the line is "+length2);
        
      }
    

    }
	  
