package teamitp;

public class App {
    public static void main(String[] args) {
        Deck deck = Deck.createNewDeck();
        Card c1 = deck.takeRandom();
        Card c2 = deck.takeRandom();

        int points = calculatePoints(c1.rank, c2.rank);
        System.out.println("[引いたカード]");
        System.out.println(String.format("1枚目: %s", c1));
        System.out.println(String.format("2枚目: %s", c2));
        System.out.println("[合計得点]");
        System.out.println(String.format("%d 点", points));
    }

    private static int calculatePoints(Rank rank1, Rank rank2) {
        int totalPoints = 0;
        if (rank1.value() > 10) {
            totalPoints += 10;
        } else {
            totalPoints += rank1.value();
        }
        if (rank2.value() > 10) {
            totalPoints += 10;
        } else {
            totalPoints += rank2.value();
        }
        return totalPoints;
    }
}
