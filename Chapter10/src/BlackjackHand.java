public class BlackjackHand extends Deck {

    public int getValue () {
        int value = 0;
        for (Card card: this.getCards()) {
            BlackjackCard blackjackCard = (BlackjackCard) card;
            if (blackjackCard.isAce()) {
                if (value + blackjackCard.getValue() > 21) {
                    value += blackjackCard.rankNumber;
                } else {
                    value += blackjackCard.getValue();
                }

            } else {
                value += blackjackCard.getValue();
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
