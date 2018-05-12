package teamitp;

class Rank {
    private int number;

    private Rank(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        if (number == 1) {
            return "A";
        } else if (number == 11) {
            return "J";
        } else if (number == 12) {
            return "Q";
        } else if (number == 13) {
            return "K";
        } else {
            return Integer.toString(number);
        }
    }

    static Rank of(int number) {
        return new Rank(number);
    }
}