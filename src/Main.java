import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Troll troll = new Troll();
        Random rand = new Random();
        System.out.println("Benvenuto guerriero nella terra dei Goblin, combatti per sopravvivere!");

        do {
            System.out.println("Il guerriero attacca: " + rand.nextFloat(50, 100) );
        } while (troll.getHp() > 0);
    }
}