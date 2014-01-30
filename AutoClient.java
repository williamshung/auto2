//Curry Williams
import java.util.*;
import java.io.*;
import java.lang.*;

public class  AutoClient
{
	public static void main(String[] args) 
	{
		
		int counter=-1;
		String lines = "";
      Auto[]a;
		int y=0;
		String m=" ";
      double mi=0.0;
      int number=0;
      String line=" ";
      try
		{
		   File data = new File("autoData.txt");
		   Scanner scan = new Scanner(data);
		   while(scan.hasNext())
		   {
            lines = scan.nextLine();
            number++;
         }   
		}
		catch (IOException ioe)
		{
			System.out.println("Error reading file.");
		}
      a=new Auto[number];
		try
		{
		   File data = new File("autoData.txt");
		   Scanner scan1 = new Scanner(data);
		   while(scan1.hasNext())
		   {
            counter++;
            lines = scan1.nextLine();
            y=Integer.parseInt(lines.split(" ")[0]);
            m=lines.split(" ")[1];
            mi=Double.parseDouble(lines.split(" ")[2]);
            a[counter]=new Auto(y,m,mi);
		   }
		}
		catch (IOException ioe)
		{
			System.out.println("Error reading file.");
		}
      			      
		//WRITE 3 SEPARATE STATEMENTS TO OUTPUT THE VALUES OF THE ATTRIBUTES FOR EACH OBJECT

       		 System.out.println("Object 1:"+" "+a[0].toString());
		System.out.println("Object 1:"+" "+a[1].toString());

		System.out.println("Object 1:"+" "+a[2].toString());
		//WRITE THE CODE TO COMPARE a1 AND a2 OBJECTS AND OUTPUT STATEMENTS 
		//INDICATING THAT THEY ARE EQUAL OR THAT THEY ARE ENOT EQUAL
		// WE COULD CAPTURE TEH RETURN VALUE OF THE EQUALS METHDO WHICH IS A BOOLEAN, AND THEN TEST THE BOOLEAN
		//FOR TRUE OR FALSE OR WE CAN HAVE THE INVOCATION TO THE EQUALS METHOD EVALUATE WITHIN TEH IF STRUCTURE.
		if(a[0].equals(a[1]))
		   System.out.println("a1 and a2 are equal");
		else
		    System.out.println("a1 and a2 are NOT equal");
		

		//WRITE THE CODE TO COMPARE a1 AND a3 OBJECTS AND OUTPUT STATEMENTS 
		//INDICATING THAT THEY ARE EQUAL OR THAT THEY ARE ENOT EQUAL

		if(a[1].equals(a[3]))
			
				System.out.println("a1 and a2 are equal");
		else
		    System.out.println("a1 and a2 are NOT equal");
	}
}
