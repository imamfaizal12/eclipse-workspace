public class CookingKuy {
	
	public static void main (String [] args) {
		
	int cheese = 3; //piece
	
	int cheeseAfterSlice = startCooking.doSliceCheese(cheese);
	String quantitySoySauce = startCooking.quantitySoySauce(99);
	boolean guah = startCooking.isCheeseSlice(cheese, cheeseAfterSlice);
		
		
	System.out.println (cheeseAfterSlice);	
	System.out.println (quantitySoySauce);
	System.out.println (guah);
	
	}
}



//method
class startCooking {
	
	static int doSliceCheese (int cheese) {
		int amountCheeseAfterSlice = cheese * 20;
		return amountCheeseAfterSlice; }

	static boolean isCheeseSlice (int before, int after) {
		boolean isCheeseSlice = false;
		
		
		
		return isCheeseSlice;
	
	}
	
	
	

	static String quantitySoySauce (int amountSoySauce) {
		String quantitySoySauce = "Less Black";
		
		if (amountSoySauce < 2) {
			quantitySoySauce = "Less Black";}
		if (amountSoySauce == 2) {
			quantitySoySauce = "Enough Black";}
		if (amountSoySauce > 2) {
			quantitySoySauce = "Too Black";}
			
		return quantitySoySauce;
		}
		
}

		