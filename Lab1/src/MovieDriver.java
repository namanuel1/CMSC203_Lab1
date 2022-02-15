import java.util.Scanner;

public class MovieDriver {

	
	public static void main(String[] args) {
		Boolean enterAnotherMovie;
		do 
		{
		Scanner keyboard = new Scanner(System.in);
		Movie movieToEnter = new Movie();
		System.out.println("Enter Movie title please?");
		String movieTitle = keyboard.nextLine();
		movieToEnter.setTitle(movieTitle);
		System.out.println("Enter the movie rating please?");
		String movieRating = keyboard.nextLine();
		movieToEnter.setRating(movieRating);
		System.out.println("Enter the number of tickets of sold for this movie");
		int numOfTickets = keyboard.nextInt();
		movieToEnter.setSoldTickets(numOfTickets);
		System.out.println(movieToEnter.toString());
		System.out.println("Do you want to enter another? (y or n)");
		String yesOrNo = keyboard.next();
		if (yesOrNo.equals("y")) {
			enterAnotherMovie = true;
		}
		else if (yesOrNo.equals("n")) {
			System.out.println("Goodbye");
			break;
		}
		else {
			System.out.println("Enter valid input");
		}
		}
		
	while (enterAnotherMovie = true);
	}
}
