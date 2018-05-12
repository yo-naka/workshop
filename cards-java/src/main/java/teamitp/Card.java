package teamitp;

class Card {
    Suit suit;
    Rank rank;

    @Override
    public String toString() {
        return String.format("{ Suit: %s; Rank: %s }", suit, rank);
    }
}
