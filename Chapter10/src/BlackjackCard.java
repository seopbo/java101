public class BlackjackCard extends Card {
    public BlackjackCard (int suitNumber, int rankNumber) {
        super(suitNumber, rankNumber);
    }

    public int getValue () {
        String rank = this.getRank();
        switch (rank) {
            case "Ace":
                return 11;
            case "Jack":
            case "Queen":
            case "King":
                return 10;
            default:
                return Integer.parseInt(rank);
        }
    }

    public boolean isAce () {
        if (this.getRank() == "Ace") {
            return true;
        }
        return false;
    }
}