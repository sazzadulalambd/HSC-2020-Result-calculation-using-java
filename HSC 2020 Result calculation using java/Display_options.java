import java.util.Scanner;
public class Display_options
{ 
    Get_information G = new Get_information();
	Show_StudentInfo S = new Show_StudentInfo();
	Result_Summary R = new Result_Summary();
	
	public void Displayoptions()
    {
		Scanner Scan = new Scanner(System.in);
		
        int option;
        System.out.println();
        System.out.println("\t-------------------------------");
        System.out.println("\t|         Main menu           |");
	    System.out.println("\t|1.Make Students Resultsheet  |");
        System.out.println("\t|2.Show Students Results      |");
        System.out.println("\t|3.Results Summary            |");
        System.out.println("\t|4.Exit                       |");
		System.out.println("\t-------------------------------");
        System.out.print("Enter your option : ");
        option = Scan.nextInt();
        My_option(option);
    }
	public void My_option(int option) 
    {
        switch (option) {
            case 1:
                G.Getinformation();
                break;
            case 2:
			    S.ShowStudentInfo();
                break;	
			case 3:
			    R.Result_Summary();
                break;
            case 4:
               System.out.println("----Welcome----");
                return;
				
            default:
                System.out.println();
                System.out.println("\t||||||||||||||||||||||||");
                System.out.println("\t||  incorrect option  ||");
                System.out.println("\t||||||||||||||||||||||||");
                Displayoptions();
        }
    }
}