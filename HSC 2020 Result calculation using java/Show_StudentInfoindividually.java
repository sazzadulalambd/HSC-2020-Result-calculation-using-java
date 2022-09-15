import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Formatter;
import java.util.Scanner;
public class Show_StudentInfoindividually extends Get_information
{ 

		
		public String name; 
        public String HSC_Roll;
		public String grade;
		
		
  public void ShowStudentInfoindividually() 
  {
	  
	  
	  System.out.print("Enter HSC Roll: ");
            HSC_Roll =Scan.next();
			while (HSC_Roll.length()!=super.x) 
        {
            System.out.println("Invalid HSC Roll !! HSC Roll must be within 6 digit "); 
            System.out.println("                Please Try Again");
            System.out.print("Enter HSC Roll: ");
            HSC_Roll =Scan.next();
        }


	  
        try {
            File f = new File("studentlist.txt");
            Scanner scan = new Scanner(f);

            String format = " %1$-16s %2$-45s %3$-4s\n";

            System.out.println("\n----------------------------------------------------------------------");
            System.out.println("        Board of Intermediate and Secondary Education,Dhaka 2020 ");
            System.out.println("                           HSC RESULT 2020 ");
            System.out.println();
			 System.out.println("----------------------------------------------------------------------");
            System.out.format(format, "Roll", "Name", "Grade");
            System.out.println("----------------------------------------------------------------------");
            while (scan.hasNextLine()) 
			{
                String line = scan.nextLine();
               
				if(line.contains(HSC_Roll) )
				{
					String[] details = line.split(",");
                    name = details[0];
                    HSC_Roll = details[1];
                    grade = details[2];
					System.out.format(format, HSC_Roll, name, grade);
				}
            
            }
			scan.close();
             System.out.println("----------------------------------------------------------------------");
            Show_StudentInfo S = new  Show_StudentInfo();
			S.ShowStudentInfo();
        } 
		catch (FileNotFoundException e) 
		{
            System.out.println("------No students to Display------");
            Display_options D_options = new Display_options();
			D_options.Displayoptions();
        }
    }
}