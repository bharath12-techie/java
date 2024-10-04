package in.nit.workshop;

public class ShopNames {

	public static void main(String[] args) {
		// declare the array
		String shopNames[] = {"mobileshop","groceryshop","jewelleryshop","hardwareshop" };
		for (int index=0; index < shopNames.length; index++ ) {
			System.out.println(shopNames[index]);
			}
		System.out.println("reverse array elements");
		for(int index = shopNames.length-1; index>=0; index--) {
			System.out.println(shopNames[index]);
		
	}
		
          // local variables
		boolean isGood = true;
		if(isGood == true) {
			System.err.println("is good is:"+isGood);
		}else {
			System.out.println("else condition");
			System.err.println("is good is:"+isGood);
		}
	}

}