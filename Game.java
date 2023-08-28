import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {

    public static List<Card> allCards = new ArrayList<>();

    /**
     * Initialize all cards
     */

    static {
        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] colors = {"♠", "♥", "♣", "♦"};

        for (String size : sizes) {
            for (String color : colors) {
                // initialize card object and add to the List
                Card card = new Card(size, color);
                allCards.add(card);
            }
        }

        Card joker1 = new Card("", "👲");
        Card joker2 = new Card("", "🃏");

        Collections.addAll(allCards, joker1, joker2);

        System.out.println("New Cards: " + allCards.toString());
    }


    public static void main(String[] args) {

    }

}
