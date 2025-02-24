import java.util.Scanner;




public class MovieDriver {

	public static void main(String[] args) {

		String movie = "";
		String rating = "";
		int ticketsSold;
		String answer;
		
		Scanner inpt = new Scanner(System.in);
		Movie myMovie = new Movie();
	do {
		
		
		System.out.println("Enter the name of a movie");
		movie = inpt.nextLine();
		myMovie.setTitle(movie);
		System.out.println("Enter the rating of the movie");
		rating = inpt.nextLine();
		myMovie.setRating(rating);
		System.out.println("Enter the number of tickets sold for this movie");
		ticketsSold = inpt.nextInt();
		myMovie.setSoldTickets(ticketsSold);
		myMovie.toString();
		
		
		System.out.println("Do you want to enter another? (y or n)");
		inpt.nextLine();
		answer = inpt.nextLine();
		
		
		}while(answer.equalsIgnoreCase("Y"));
	
	System.out.println("Goodbye");
	}
	
	
	

}
