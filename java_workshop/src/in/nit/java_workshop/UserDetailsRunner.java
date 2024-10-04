package in.nit.java_workshop;

public class UserDetailsRunner {
	
	public static void main(String[]args) {
		System.out.println("main method started");
	
	//create object
	UserDetails basavaraj = new UserDetails();
	System.out.println("user details:"+basavaraj);
	basavaraj.userId=12;
	basavaraj.userName="basavaraj";
	basavaraj.Age=22;
	basavaraj.Gender="male";
	basavaraj.DOB=2-8-2003;
	basavaraj.Password="Bharath@123";
	//display it
	System.out.println("user Id:"+basavaraj.userId+"user name:"+basavaraj.userName+"age:"+basavaraj.Age+"Gender:"+basavaraj.Gender+"DOB:"+basavaraj.DOB+"Password:"+basavaraj.Password);


}
}