package Exercise2;

public class App {
    public static void main(String[] args) {
        // tell user what program does
        System.out.println("\nThis program creates a deck of cards, shuffles ");
        System.out.println("them and displays each card in random order.\n");

        // nested for-loop to generate 4 sets of 13 cards = 52 total
        Card[] cards = new Card[52];
        int counter = 0;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 14; j++) {
                // create Card objects and add them to the cards array
                int suit = i;
                int rank = j;

                if (Card.isValidRank(rank) && Card.isValidSuit(suit)) {
                    cards[counter] = new Card(suit, rank);
                    counter++;
                }
            }
        }

        // load cards into a Deck object
        Deck deck = new Deck(cards);

        // shuffle the deck
        deck.shuffleDeck();

        // print out the cards via the deck's toString method
        System.out.println(deck);
        System.out.println("Goodbye...");
    }

}
