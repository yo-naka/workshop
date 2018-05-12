package teamitp;

public class App {
    public static void main(String[] args) {
        Card[] deck = new Card[52];
        for (int i = 0; i < deck.length; i++) {
            deck[i] = new Card();
            switch (i / 13) {
            case 0:
                deck[i].suit = "Spade";
                break;
            case 1:
                deck[i].suit = "Diamond";
                break;
            case 2:
                deck[i].suit = "Club";
                break;
            case 3:
                deck[i].suit = "Heart";
                break;
            }
            deck[i].rank = (i % 13) + 1;
        }

        for (int i = 0; i < deck.length; i++) {
            System.out.println(deck[i]);
        }
    }
}
