import java.util.Scanner;
public class Login
{
	
	
	protected String username; 
    protected String password;
		
public void Log_in()
    {
				
        Scanner Scan = new Scanner(System.in);
		System.out.println();
		System.out.println("                 Board of Intermediate and Secondary Education,Dhaka 2020 ");
        System.out.println("                                        Teacher Login");
        System.out.print("Username : ");
        username = Scan.next(); 
        System.out.print("Password : ");
        password = Scan.next(); 

        while (!username.equalsIgnoreCase("teacher@gmail.com") || !password.equals("1234DhA")) 
        {
            System.out.println("Invalid Username or Password"); 
            System.out.println("     Please Try Again");
            System.out.print("Username : ");
            username = Scan.next();
            System.out.print("Password : ");
            password = Scan.next();
        }
		Display_options D_options = new Display_options();
        D_options.Displayoptions();
    }
}