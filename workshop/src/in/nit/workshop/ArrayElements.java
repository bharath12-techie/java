package in.nit.workshop;

public class ArrayElements {

	
	public static void main(String args[]) {
	// declare array
		String names[] = {"Bharath","Sunil","Sunith","Vidyadhar"};
		int[] numbers = {1,2,3,4};
		char[]ch= {'A','B','C','D'};
		System.out.println("names:"+names.length);
		System.out.println("numbers:"+numbers.length);
		System.out.println("ch:"+ch.length);
		
		// display array element
		System.out.println("displaying the names");
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
	
        System.out.println("displaying the numbers");
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        
        System.out.println("displaying the characters");
        System.out.println(ch[0]);
        System.out.println(ch[1]);
        System.out.println(ch[2]);
        System.out.println(ch[3]);
	}
	
}