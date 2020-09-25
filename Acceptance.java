import java.util.Scanner;

public class Acceptance {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );
		
		int elite = 0;
		int solid = 0;
		int acceptable = 0;
		int nope = 0;
		boolean admitted;
		String reason = "";
			
		System.out.print( "Enter your SAT score: " );
		int sat = input.nextInt();
		
		if( sat >= 1500 ) elite += 1;
		else if( sat >= 1400 ) solid += 1;
		else if( sat >= 1300 ) acceptable += 1;
		else {
			nope += 1;
			reason += "SAT Score too low\n";
		}

		System.out.print( "Enter your class rank: " );
		int rank = input.nextInt();
		
		if( rank >= 95 ) elite += 1;
		else if( rank >= 90 ) solid += 1;
		else if( rank >= 85 ) acceptable += 1;
		else {
			nope += 1;
			reason += "Rank too low\n";
		}

		System.out.print( "Enter how many awards you've won: " );
		int awards = input.nextInt();

		if( awards >= 10 ) elite += 1;
		else if( awards >= 8 ) solid += 1;
		else if( awards >= 3 ) acceptable += 1;
		else {
			nope += 1;
			reason += "Number of awards won too low\n";
		}

		System.out.print( "Enter what state you're from: " );
		String state = input.nextLine();

		if( "Colorado".equals( state ) ) elite += 1;
		else if( "Florida".equals( state ) ) {
			nope += 1;
			reason += "You live in Florida. Enough said\n";
		}
		else acceptable += 1;

		if( elite < 1 ) {
			admitted = false;
			System.out.println( "You're not elite enough." );
		}
		else if( solid < 2 ) {
			admitted = false;
			System.out.println( "Not solid enough" );
		}
		else if(  )

	}

}