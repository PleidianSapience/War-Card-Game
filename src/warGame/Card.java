package warGame;

public class Card {

	int value;
	String suit;
	
	//Constructor
	public Card(int value, String name) {
		super();
		this.value = value;
		this.suit = name;
	}
	
	//Method to describe card
	public  String getCardFace () {
		StringBuilder sb = new StringBuilder(value);
		
		if(this.value <= 10)
			sb.append(this.value);
		else {
			switch(this.value) {
			case(11):
				sb.append("Jack");
				break;
			case(12):
				sb.append("Queen");
				break;
			case(13):
				sb.append("King");
				break;
			case(14):
				sb.append("Ace");
				break;
			
			}
				
		}
		return sb.toString() + " of " + this.suit;
	}
	//Getters and Setters

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	
}
