package Exercise2;

public class Card {
    // encapsulated member variables for rank and suit
    private final int rank;
    private final int suit;

    // parameterized constructor - leaving out assertion data validation
    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // getters for encapsulated object variables
    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }

    // static class methods
    public static boolean isValidRank(int rank) {
        return 1 <= rank && rank <= 13;
    }

    public static boolean isValidSuit(int suit) {
        return 1 <= suit && suit <= 4;
    }

    public static String rankToString(int rank) {
        String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", 
            "Jack", "Queen", "King" };

        return (rank > 0 && rank < 14) ? ranks[rank - 1] : null;
    }

    public static String suitToString(int suit) {
        String[] suits = { "Diamonds", "Clubs", "Hearts", "Spades"};

        return (suit > 0 && suit < 5) ? suits[suit - 1] : null;
    }

}
