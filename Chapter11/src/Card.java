public class Card implements Comparable<Card>{
    public final int suitNumber;
    public final int rankNumber;

    public Card(int suitNumber, int rankNumber) {
        this.suitNumber = suitNumber;
        this.rankNumber = rankNumber;
    }

    public String getSuit() {
        switch (suitNumber) {
            case 1:
                return "Clubs";
            case 2:
                return "Diamonds";
            case 3:
                return "Hearts";
            case 4:
                return "Spades";
            default:
                return "";
        }
    }

    public String getRank() {
        switch (rankNumber) {
            case 1:
                return "Ace";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            default:
                return String.valueOf(rankNumber);
        }
    }

    public String toString() {
        return getRank() + " of " + getSuit();
    }

    @Override
    public int compareTo(Card o) {
        if (this.suitNumber > o.suitNumber) {
            return 1;
        } else if (this.suitNumber == o.suitNumber) {
            if (this.rankNumber > o.rankNumber) {
                return 1;
            } else if (this.rankNumber == o.rankNumber) {
                return 0;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }
}