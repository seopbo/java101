import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>();
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public ArrayList<Card> getCards() {
        return this.cards;
    }

    public void print() {
        for (Card card: this.cards) {
            System.out.println(card.toString());
        }
    }

    public void shuffle() {
        Random random = new Random();
        ArrayList<Card> tmp = new ArrayList<>();

        while (!this.cards.isEmpty()) {
            int index = random.nextInt(this.getCards().size());
            tmp.add(this.cards.remove(index));
        }
        this.cards = tmp;
    }

    public Deck deal(int count) {
        Deck hand = new Deck();
        if (count == 5) {
            int finalIndex = this.cards.size() - 1;
            for (int i = 0; i < count; i++) {
                hand.addCard(this.cards.remove(finalIndex));
                finalIndex--;
            }
        }
        return hand;
    }
}