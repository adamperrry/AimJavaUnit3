package Exercise2;

import java.util.Random;

public class Deck {
    // encapsulated array variable to hold the cards
    private Card[] deck;

    // parameterized constructor accepting an array of card objects
    public Deck(Card[] cards) {
        this.deck = cards;
    }

    // method to shuffle the deck object
    public void shuffleDeck() {
        Random r = new Random();
        for (int i = this.deck.length - 1; i > 0; i--) {
            // generate random index from 0 to i (nextInt is exclusive, hece +1)
            int j = r.nextInt(i + 1);
            Card temp = this.deck[i];
            this.deck[i] = this.deck[j];
            this.deck[j] = temp;
        }
    }

    // toString that will list all cards as "Card: x of x"
    @Override
    public String toString() {
        String deckList = "";
        for (Card card : this.deck) {
            deckList += "Card: " + Card.rankToString(card.getRank()) + " of " 
                + Card.suitToString(card.getSuit()) + "\n";
        }
        return deckList;
    }
}
