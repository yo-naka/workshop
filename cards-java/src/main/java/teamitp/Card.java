package teamitp;

class Card {
    Suit suit;
    Rank rank;

    Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return String.format("{ Suit: %s; Rank: %s }", suit, rank);
    }
}
