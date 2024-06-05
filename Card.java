public class Card
{
	private int value;
	private int suit;

	/*
	* suit:
	* 1 = hearts 3 = spades
	* 2 = diamonds 4 = crosses
	* values: 1-13
	*/
	public Card(int suit, int value)
	{
		// suit at least 1 and no higher than 4
		if (suit < 1)
			suit = 1;
		else if (suit > 4)
			suit = 4;
		// value at least 1 and no higher than 13
		if (value < 1)
			value = 1;
		else if (value > 13)
			value = 13;

		this.value = value;
		this.suit = suit;
	}

	public String toString()
	{
		String valueAsCharString = null;
		String suitAsCharString = null;

		switch(value)
		{
			case 1:
				valueAsCharString = "Ace";
				break;
			case 11:
				valueAsCharString = "Jack";
				break;
			case 12:
				valueAsCharString = "Queen";
				break;
			case 13:
				valueAsCharString = "King";
				break;
			default:
				valueAsCharString = ""+value;
				break;
		}

		switch(suit)
		{
			case 1:
				suitAsCharString = "Hearts";
				break;
			case 2:
				suitAsCharString = "Diamonds";
				break;
			case 3:
				suitAsCharString = "Spades";
				break;
			case 4:
				suitAsCharString = "Crosses";
				break;
		}

		return suitAsCharString + " " + valueAsCharString;
	}

	// main method for testing Card class
	public static void main(String[] args) {
		Card heartsTen = new Card(1,10);
		Card spadesAce = new Card(3,1);
		// note the discreet toString method call below
		System.out.println(heartsTen + " and " + spadesAce);
	}
}