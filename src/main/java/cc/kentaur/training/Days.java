package cc.kentaur.training;

public class Days {
	public static void main(String[] args) {
		// Execute different block of code based on the value of a condition
		
		String dayOfWeek = "Tuesday";
		
		switch (dayOfWeek) {
			case "Monday" : 
				System.out.println("Today is monday");				
				break;
			case "Tuesday" :
				System.out.println("Today is Tuesday");
				break;
			case "Wednsday" :
				System.out.println("Today is Wednsday");
				break;
			case "Thursday" :
				System.out.println("Today is Thurday");
				break;
			case "Friday" :
				System.out.println("Today is Friday");
				break;		
		}
	}

}
