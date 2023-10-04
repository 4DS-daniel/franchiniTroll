import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Troll troll = new Troll();
        Random rand = new Random();
        float life_player = 500;
        Scanner input = new Scanner(System.in);
        int flag = 1;
        System.out.println("Benvenuto guerriero nella terra dei Goblin, combatti per sopravvivere!");

        do {
            int damage = rand.nextInt(50, 100);
            System.out.println("Il guerriero attacca: " + damage);
            troll.setHp(troll.getHp()-damage);
            System.out.println("- Vita del Troll: " + troll.getHp());

            flag = input.nextInt();
            damage = troll.attack();
            System.out.println("Il Troll attacca: " + damage);
            life_player = life_player - damage;
            System.out.println("- Vita del Giocatore: " + life_player);
            System.out.println("Vuoi contiuare il combattimento? Premi 1 per continuare o 2 per uscire: \nScelta: ");
            flag = input.nextInt();
            if (flag == 2) {
                System.out.println("Uscira combattimento!");
            }
        } while (troll.getHp() > 0 && life_player > 0 && flag != 2);
    }
}