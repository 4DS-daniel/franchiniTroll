import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Troll troll = new Troll();
        Random rand = new Random();
        System.out.println("Benvenuto guerriero nella terra dei Goblin, combatti per sopravvivere!");

        do {
            float damage = rand.nextFloat(50, 100);
            System.out.println("Il guerriero attacca: " + damage);
            troll.setHp(troll.getHp()-damage);
            System.out.println("- Vita del Troll: " + troll.getHp());

            damage = troll.attack();
            System.out.println("Il Troll attacca: " + damage);
            troll.setHp(troll.getHp()-damage);
            System.out.println("- Vita del Troll: " + troll.getHp());

        } while (troll.getHp() > 0);
    }
}