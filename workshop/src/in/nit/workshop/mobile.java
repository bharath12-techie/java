package in.nit.workshop;

public class mobile {
	public static void message(String emailto,String CC,String Sub, String content) {
		System.out.println("email to:"+emailto);
		System.out.println("CC:"+CC);
		System.out.println("Sub:"+Sub);
		System.out.println("content:"+content);
		
	}
	
     public static void login(String email, String password) {
    	 System.out.println("enter your emailId:"+email);
    	 System.out.println("enter your password:"+password);
     }

}
