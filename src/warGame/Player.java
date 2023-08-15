package warGame;
import java.util.*;
public class Player {

	/*
	 * i. Fields
1. hand (List of Card)
2. score (set to 0 in the constructor)
3. name
	 */
	
	 List <Card> hand;
	 int score;
	String name;
	
	//Constructor 
	public Player(String name) {
		super();
		this.hand  = new ArrayList<Card>();
		this.score = 0;
		this.name = name;
	}

	//Methods
	
	//Add Card To Hand
	public  void addToHand (Card card) {
		hand.add(card);
	}
	//Flip
	public Card flip () {return this.getHand().remove(0);}
	
	//Describe
	public void describePlayer (int playerNumber) {
		System.out.println("\nPlayer " + playerNumber +": "+ this.name+"\n");
		for (Card card : hand) {
			if (card.getValue() == 14)
			{
				System.out.print("Ace "+" of "+card.getSuit()+"\n");
			}
			//System.out.print(card.getCardFace(card.getValue())+" of "+card.getSuit()+"\n");
		}
		
	}
	
	//Increment Score
	public  void incrementScore() {
		score++;
	}
	
	//Getters and Setters
	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//Methods
	
}
