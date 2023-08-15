package warGame;
import java.util.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		//Get User Input and create players.
		System.out.println("Welcome to the game of War.");
		System.out.println("Enter Name for Player 1");
		String name1 = sc.nextLine();
		Player player1 = new Player(name1);
		System.out.println("Enter Name for Player 2");
		String name2 = sc.nextLine();
		Player player2 = new Player(name2);
		
		//Create and Shuffle Deck
		Deck deck = new Deck();
		//shuffle
		deck.shuffleDeck();
		
		//deck.showDeck(); // show deck
		
		//Deal Cards
	
		dealCards(player1,deck);
		dealCards(player2,deck);
		
		//player1.describePlayer(1);
		
		
		//player2.describePlayer(2);
	
		play(deck,player1,player2);
	
	}

	public static void dealCards(Player player, Deck deck) {
		
		for (int i = 0; i < deck.getSize()/2; i++ )
		{
			player.addToHand(deck.draw());
		}
		
	}
	//Methods
	public static void play(Deck gameDeck, Player p1, Player p2) {
		Card p1Card = null;
		Card p2Card = null;
		
		for (int turn = 0; turn < gameDeck.getSize()/2; turn++) 
		{
		

			System.out.printf("%-10s%-20s", "Player 1:", p1.getName()+":"+p1.getScore()); 
			System.out.printf("%-10s%-20s%n", "Player 2:",  p2.getName()+":"+p2.getScore());
			//Flip Cards
			p1Card = p1.flip();
			p2Card = p2.flip();
			//System.out.printf("%10s Player 1","Player 2");
			
			//Compare Cards
			if (p1Card.getValue() > p2Card.getValue())
				p1.incrementScore();
			if (p2Card.getValue() > p1Card.getValue())
				p2.incrementScore();
			
			//Turn Output
			System.out.printf("%-10s        VS       %-20s%n", p1Card.getCardFace(), p2Card.getCardFace());
			System.out.println("\n");
			
			//System.out.println(p1Card.getCardFace() + " VS " + p2Card.getCardFace());
			//System.out.println(p1Card.getCardFace(p1Card.getValue())+" of "+p1Card.getSuit() +" VS " + p2Card.getCardFace(p2Card.getValue())+" of "+p2Card.getSuit());
		}
		Player winner = checkWinner(p1,p2);
		
		//Winner Output
		System.out.println(p1.getName() + " has a score of " + p1.getScore());
		System.out.println(p2.getName() + " has a score of " + p2.getScore());
		
		System.out.println("The winner is " + winner.getName() + " with a score of " + winner.getScore());
	}
	
	public static Player checkWinner (Player p1, Player p2) {
		if (p1.getScore() > p2.getScore())
			return p1;
		else {
			return p2;
		}
	}
	

}
