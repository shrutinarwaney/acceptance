import java.util.Scanner;

public class Acceptance {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );
		
		int elite = 0;
		int solid = 0;
		int acceptable = 0;
		int nope = 0;
		boolean admitted = true;
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
		String state = input.next();


		if( "Colorado".equals( state ) ) elite += 1;
		else if( "Florida".equals( state ) ) {
			nope += 1;
			reason += "You live in Florida. Enough said\n";
		}
		else acceptable += 1;
		

		System.out.print( "What is your last name: " );
		String lastname = input.next();

		input.close();

		if( ( elite >= 1 || solid >= 2 || "Padjen".equals( lastname ) ) && nope == 0 ) {
			System.out.println( "Accepted" );
		}
		else if( nope > 0 ) {
			System.out.println( "Not accepted: too many nopes" );
			System.out.println( "\tReasons: " + reason );
		}
		else {
			System.out.println( "Not accepted" );
		}

	}

}