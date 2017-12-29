//AccessModifier
public class CookingTime {

	public static void main (String []args) {
		
	int amountEgg = 5; //butir
	
	int skinEggAfterBreakUp = Activity.doBreakUpEgg(amountEgg);	
	boolean isSkinEggBreakUp = Activity.isSkinEggBreakUp (amountEgg , skinEggAfterBreakUp);
	String levelSugar = Activity.levelSugar(3);
	
	System.out.println (skinEggAfterBreakUp);	
	System.out.println (isSkinEggBreakUp);	
	System.out.println (levelSugar);
	}
	
	private static void a () {
		
	}
}

//method 
class Activity {
	
	static int doBreakUpEgg (int amountEgg) {
		int amountSkinEggAfterBreakUp = amountEgg * 2;
		return amountSkinEggAfterBreakUp;
		}
	
	
	
	static boolean isSkinEggBreakUp (int before , int after) {
		boolean isBreakUp = false;
		
		if (after / 2 == before);
			isBreakUp = true;
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
