package teamitp;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Deck {

    private List<Card> cards = new ArrayList<Card>();

    public Deck() {
    }

    public Deck(Card[] cards) {
        this.cards.addAll(Arrays.asList(cards));
    }

    static Deck createNewDeck() {
        Card[] deck = new Card[52];
        for (int i = 0; i < deck.length; i++) {
            deck[i] = new Card(Suit.values()[i / 13], Rank.of((i % 13) + 1));
        }
        return new Deck(deck);
    }

    public Card takeRandom() {
        Random rand = new Random();
        int index = rand.nextInt(this.cards.size());
        Card cardTaken = cards.get(index);
        cards.remove(index);
        return cardTaken;
    }
}