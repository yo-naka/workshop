package teamitp;

class Card {
    String suit;
    int rank;

    @Override
    public String toString() {
        return String.format("{ Suit: %s; Rank: %s }", suit, rank);
    }
}
