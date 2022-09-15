import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Get_information implements IGet_grade
{ 
     
        int studentnumber,i;
		
		public String name; 
        public String HSC_Roll; 
        public double JSC_GPA;
        public double SSC_GPA;
		public String grade;
		public int x =6;
	
		Scanner Scan = new Scanner(System.in);

 public void Getinformation()
    {
		
        System.out.println("\tHow many students result do you want to input?\n");
        
        System.out.print("Number of Students--> ");
        studentnumber = Scan.nextInt();
        for (i = 0; i<studentnumber; i++) 
		{
			System.out.println();
            System.out.println("\tStudent no." + (i + 1) );
            Student_information();
        }
		
		Display_options D_options = new Display_options();
        D_options.Displayoptions();
		
		 
		
    }
	
		
    public void Student_information()
    {
		
        try 
		{
	        System.out.println("_____________________________");
            System.out.print("Name: ");
            name =Scan.next();
			
            System.out.print("Enter HSC Roll: ");
            HSC_Roll =Scan.next();
			while (HSC_Roll.length()!=x) 
        {
            System.out.println("Invalid HSC Roll !! HSC Roll must be within 6 digit "); 
            System.out.println("                Please Try Again");
            System.out.print("Enter HSC Roll: ");
            HSC_Roll =Scan.next();
        }
			
			
			
            System.out.print("Enter JSC GPA (out of 5.0): ");
            JSC_GPA =Scan.nextDouble();
			
            System.out.print("Enter SSC GPA (out of 5.0):");
            SSC_GPA =Scan.nextDouble();
			
			
            while (JSC_GPA > 5 || SSC_GPA > 5) 
			{
				System.out.println();
				System.out.println("||||||||||||||||||||||||||");
                System.out.println("||GPA must be within 5.0||");
				System.out.println("||||||||||||||||||||||||||");
				System.out.println();
                System.out.print("Enter JSC GPA: ");
                JSC_GPA =Scan.nextDouble();
				
                System.out.print("Enter SSC GPA: ");
                SSC_GPA =Scan.nextDouble();
            }

            grade = Get_grade(JSC_GPA, SSC_GPA);

            String input = name + "," + HSC_Roll + "," + grade + "\n";
            try 
			{
                File f = new File("studentlist.txt"); 
                write(input, f);
            } 
			catch (Exception e) 
			{
                System.out.println("Invalid Input!");
            }
        } 
		catch (InputMismatchException e)
		{
            System.out.println("\nInvalid Input!");
        }
    }


	  public void write(String input, File f)
    {
        try 
		{
            FileWriter fw = new FileWriter(f, true);
            fw.write(input);
            fw.close();
        } 
		catch (IOException e)
		{
            System.out.println(e);
        }
    }
        
		


    public String Get_grade(double JSC_GPA, double SSC_GPA)
    {
        double Mark = ((JSC_GPA) * 0.25) + ((SSC_GPA) * 0.75);
		
        
		if (Mark>= 5) 
			{
            grade = "A+";
            } 
		else if (Mark >= 4 && Mark < 5)
		    {
            grade = "A";
            } 
	    else if (Mark >=3.5 && Mark < 4) 
		    {
            grade = "A-";
            } 
		else if (Mark >=3 && Mark < 3.5) 
		    {
            grade = "B";
            } 
		else if (Mark >=2 && Mark < 3) 
		    {
            grade = "C";
            } 
		else if (Mark >=1 && Mark < 2) 
		    {
            grade = "D";
            } 
		else if (Mark >=0 && Mark < 1)
		    {
            grade = "F";
            } 
		else 
		    {
            grade = "Invalid";
            }
        return grade;
    }
	
	    
}