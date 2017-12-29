
public class frozenFudgePops {
	
	
	public static void main ( String [] args){
		
		int amountChocolate = 6; //ounces
		int amountMilk = 2; //cups
		float amountCream = 0.5f; //cup
		double amountSugar = 0.25; //cup
		int amountCocoa = 2; //tablespoons
		int amountVanilla = 2; //teaspoons
		int amountSalt = 1; //teaspoon
		int minimumCocoa = 54; //percentage

		String firstFoodstuff = "chocolate";
		String secondFoodstuff = "milk";
		String thirdFoodstuff = "cream";
		String fourthFoodstuff = "sugar";
		String fifthFoodstuff = "cocoa";
		String sixthFoodstuff = "vanilla";
		String seventhFoodstuff = "salt";
		String dessertName = "Frozen Fudge Pops";
		String dessertCall = "Pops";
		String littleDose = " teaspoons ";
		String activity = "Breakup";

		
		
		System.out.println ( dessertName );
		System.out.println ( "INGREDIENTS" );
		System.out.println ( amountChocolate + " ounces" + " good-quality " + firstFoodstuff + ", " + "at least " + minimumCocoa + " percent " + fifthFoodstuff );
		System.out.println ( amountMilk + " cups whole " + secondFoodstuff );
		System.out.println ( amountCream + " cup " + thirdFoodstuff );
		System.out.println ( amountSugar + " cup " + fourthFoodstuff );
		System.out.println ( amountCocoa + " tablespoons" + " unsweetened " + fifthFoodstuff );
		System.out.println ( amountVanilla + littleDose + sixthFoodstuff );
		System.out.println ( amountSalt + littleDose + "kosher " + seventhFoodstuff + " ," + " to taste" );
		
		//MASUK KE CARA MEMASAK
		
		System.out.println ( " " );
		System.out.println ( "PREPARATION" );
		
		//method 
		frozenFudgePops steps  = new frozenFudgePops();	
		int choclateAfterBreakUp = CookingCake.doBreakUpChocolate(amountChocolate);
		boolean isChoclateBreakUp = CookingCake.isChocolateBreakUp(amountChocolate, choclateAfterBreakUp);
		String levelSugar = CookingCake.levelSugar(1);
		
		System.out.println(levelSugar);
		System.out
		
		.println(choclateAfterBreakUp);
		System.out.println(isChoclateBreakUp);
	} //otak
}

class CookingCake {
	
	static int doBreakUpChocolate (int amountChocolate) {
		int amountChocolateAfterBreakUp = amountChocolate * 2;
		return amountChocolateAfterBreakUp;
	}
	
	static boolean isChocolateBreakUp (int before, int after) {
		boolean isBreakUp = false;
		
		if (after / 2 == before) {
			isBreakUp = true;
		}
		return isBreakUp;
	}
	static String levelSugar ( int totalGula ) {
	  String levelSugar = "Kurang Manis";
		
		if (totalGula < 3) {
			levelSugar = "kurang manis"; }	
		
		if (totalGula == 3) {
			levelSugar = "cukup";}
		
		if (totalGula > 3) {
			levelSugar = "Terlalu manis";}
		
		return levelSugar;
}
	}