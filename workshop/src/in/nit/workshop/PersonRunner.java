package in.nit.workshop;

public class PersonRunner {

	public static void main(String[] args) {
		
		System.out.println("main method is started");
		
		// assign the value
		Person.country = "india";
		Person.state ="karnataka";
		System.out.println("country is:"+Person.country);
		System.out.println("state is:"+Person.state);
	
		// create object
	Person person	= new Person();
	person.personName="bharath";
	person.qualification="bachelor of engineering";
	person.AadharcardNumber="123456789";
	person.pancardnumber="MRFPK8248C";
	System.out.println("personName is:"+person.personName+"personqualification is:"+person.qualification+"personAadharcardNumber is:"+person.AadharcardNumber+"personpancardnumber is:");

	
	//invoke the method
	Person.displayInfo();
	person.getInformation();

	
	

}
}



