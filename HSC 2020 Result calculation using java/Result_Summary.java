import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Result_Summary 
{ 

		public String ADD;
		public int ADD1;
		public int ADD2;
		public int ADD3;
		public int ADD4;
		public int ADD5;
		public int ADD6;
		public int ADD7;
		int count1=1;
		int count2=1;
		int count3=1;
		int count4=1;
		int count5=1;
		int count6=1;
		int count7=1;

  public void Result_Summary() 
  {
	  
        try {
            File f = new File("studentlist.txt");
            Scanner scan = new Scanner(f);
			

            
            System.out.println("\n----------------------------------------------------------------------");
            System.out.println("        Board of Intermediate and Secondary Education,Dhaka 2020 ");
            System.out.println("                        HSC RESULT SUMMARY 2020 ");
            System.out.println();
			System.out.println("----------------------------------------------------------------------");
            
			
            while (scan.hasNextLine())
				{
                
                String line = scan.nextLine();
                String[] details = line.split(",");
				ADD = details[2];
				
			
				    if(ADD.equals("A+"))
				    {
					
					ADD1=count1++;
				    }
					else if(ADD.equals("A"))
				    {
					
					ADD2=count2++;
				    }
					else if(ADD.equals("A-"))
				    {
					
					ADD3=count3++;
					}
				    
					else if(ADD.equals("B"))
				    {
					
					ADD4=count4++;
				    }
					else if(ADD.equals("C"))
				    {
					
					ADD5=count5++;
				    }
					else if(ADD.equals("D"))
				    {
					
					ADD6=count6++;
				    }
					else if(ADD.equals("F"))
				    {
					
					ADD7=count7++;
				    }
					else 
		            {
                    ADD = "Invalid";
                    }
           
            }
			    System.out.println("TOTAL NUMBER OF STUDENT GET A+      ="+ADD1);
                System.out.println("TOTAL NUMBER OF STUDENT GET A       ="+ADD2);
                System.out.println("TOTAL NUMBER OF STUDENT GET A-      ="+ADD3);
                System.out.println("TOTAL NUMBER OF STUDENT GET B       ="+ADD4);
                System.out.println("TOTAL NUMBER OF STUDENT GET C       ="+ADD5);
                System.out.println("TOTAL NUMBER OF STUDENT GET D       ="+ADD6);
                System.out.println("TOTAL NUMBER OF STUDENT GET F       ="+ADD7);
                System.out.println("TOTAL STUDENT NUMBER                ="+(ADD1+ADD2+ADD3+ADD4+ADD5+ADD6+ADD7));
            System.out.println("----------------------------------------------------------------------");
            Display_options D_options = new Display_options();
			D_options.Displayoptions();
        } 
		catch (FileNotFoundException e) 
		{
            System.out.println("------No Result Entry------");
            Display_options D_options = new Display_options();
			D_options.Displayoptions();
        }
    }
}