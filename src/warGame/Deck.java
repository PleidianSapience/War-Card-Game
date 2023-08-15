package warGame;
import java.util.*;

public class Deck {

	protected List<Card> deck;
	int size;
	
	
	//Constructor
	public Deck() {
		super();
		this.deck = new ArrayList<Card>();
		Card card = null;
		// TODO Auto-generated constructor stub
		for(int i = 1; i <= 4; i++) {
			for(int j = 2; j<=14; j++) {
				if (i == 1)
					card = new Card(j,"Clubs");
				if(i == 2)
					card = new Card(j,"Diamonds");
				if(i == 3)
					card = new Card(j,"Hearts");
				if(i == 4)
					card = new Card(j,"Spades");
				
				this.deck.add(card);	
			}
		}
		//System.out.println(this.getDeck().size());
		this.size = this.deck.size();
	}

	
	
	//Methods
	
	//Shuffle
	public  void shuffleDeck () {
		Collections.shuffle(this.deck);
	}
	
	public  void showDeck () {
		for (Card card : this.deck) {
			System.out.println(card.getValue() + " " + card.getSuit());
		}
	}
	
	//Draw
	public  Card draw () {
		return this.deck.remove(0);
	}
	
	//getters and setters
	public int getSize() {
		return this.size;
	}



	public void setSize(int size) {
		this.size = size;
	}



	public  List<Card> getDeck() {
		return this.deck;
	}



	public  void setDeck(List<Card> deck) {
		this.deck = deck;
	}



}
