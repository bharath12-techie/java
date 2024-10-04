package in.nit.workshop;

public class BrandName {

	public static void main(String[] args) {
		String BrandNames[] = {"vivo","oppo","xiomi","oneplus"};
		System.out.println("BrandNames:"+BrandNames.length);
		System.out.println(BrandNames[0]);
		System.out.println(BrandNames[1]);
		System.out.println(BrandNames[2]);
		System.out.println(BrandNames[3]);
		System.out.println("reversing the array");
	    for( int index = BrandNames.length-1;index>=0;index--) {
	    	System.out.println(BrandNames[index]);
	    }
	}

}
