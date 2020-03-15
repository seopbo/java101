public class BlackjackHand extends Deck<BlackjackCard> {

    public int getValue () {
        int value = 0;
        for (BlackjackCard card: this.getCards()) {
//            BlackjackCard blackjackCard = (BlackjackCard) card;
            if (card.isAce()) {
                if (value + card.getValue() > 21) {
                    value += card.rankNumber;
                } else {
                    value += card.getValue();
                }

            } else {
                value += card.getValue();
            }
        }
        return value;
    }

    public boolean isBusted() {
        if (this.getValue() > 21) {
            return true;
        }
        return false;
    }

    public boolean isBlackjack () {
        if (this.getCards().size() == 2 && this.getValue() == 21) {
            return true;
        }
        return false;
    }
}
