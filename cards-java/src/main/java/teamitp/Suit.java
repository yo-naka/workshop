package teamitp;

enum Suit {
    Club, Diamond, Heart, Spade;

    @Override
    public String toString() {
        switch (this) {
        case Club:
            return "♠";
        case Diamond:
            return "♦";
        case Heart:
            return "♣";
        case Spade:
            return "♥";
        }
        throw new IllegalArgumentException();
    }
}