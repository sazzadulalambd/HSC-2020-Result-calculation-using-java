import java.util.Scanner;
public class Show_StudentInfo
{ 
       Show_StudentfullInfo SF = new Show_StudentfullInfo();
	   Show_StudentInfoindividually SI = new Show_StudentInfoindividually();

  public void ShowStudentInfo() 
  {

		Scanner Scan = new Scanner(System.in);
		
        int Ooption;
        System.out.println();
        System.out.println("\t-------------------------------------");
        System.out.println("\t|       Show Students Results       |");
        System.out.println("\t|1.Board Results                    |");
        System.out.println("\t|2.Student Individual Result        |");
        System.out.println("\t|3.Go Back                          |");
		System.out.println("\t-------------------------------------");
        System.out.print("Enter your option : ");
        Ooption = Scan.nextInt();
        MMy_Ooption(Ooption);
    }
	public void MMy_Ooption(int Ooption) 
    {
		
        switch (Ooption) {
            case 1:
                SF.ShowStudentfullInfo();
                break;
            case 2:
			    SI.ShowStudentInfoindividually();
                break;
            case 3:
			    Display_options D_options = new Display_options();
			    D_options.Displayoptions();
				return;
            
            default:
			    System.out.println();
                System.out.println("\t||||||||||||||||||||||||");
                System.out.println("\t||  incorrect option  ||");
                System.out.println("\t||||||||||||||||||||||||");
                
                ShowStudentInfo();
        }
    }
}