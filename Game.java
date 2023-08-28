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

        // shuffle all the cards
        Collections.shuffle(allCards);
        System.out.println("Cards after shuffling: " + allCards.toString());

        System.out.println("================================================================");

        // initialize players' containers
        List<Card> p1 = new ArrayList<>();
        List<Card> p2 = new ArrayList<>();
        List<Card> p3 = new ArrayList<>();

        // assign cards to the players
        for (int i = 0; i < allCards.size()-3; i++) {
            if (i % 3 == 0) {
                p1.add(allCards.get(i));
            } else if (i % 3 == 1) {
                p2.add(allCards.get(i));
            } else {
                p3.add(allCards.get(i));
            }
        }

        // take the last three cards in the deck
        List<Card> lastThree = allCards.subList(allCards.size()-3, allCards.size());

        // sort cards in the containers


        System.out.println("Player1 cards: " + p1.toString());
        System.out.println("Player2 cards: " + p2.toString());
        System.out.println("Player3 cards: " + p3.toString());
        System.out.println("Last three cards: " + lastThree.toString());
    }

}
