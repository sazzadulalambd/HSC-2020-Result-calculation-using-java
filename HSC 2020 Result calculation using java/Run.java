public class Run
{
	public static void main(String args[]) 
	{
		Display_options D_options = new Display_options();
	    Get_information G = new Get_information();
		Show_StudentInfo S = new  Show_StudentInfo();
		Show_StudentfullInfo SF = new Show_StudentfullInfo();
	    Show_StudentInfoindividually SI = new Show_StudentInfoindividually();
		Result_Summary R = new Result_Summary();
	    Login L = new Login();
		L.Log_in();
    }

}