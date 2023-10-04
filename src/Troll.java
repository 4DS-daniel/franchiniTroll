import java.util.Random;

public class Troll {
    private float hp;
    private float gold;
    private float xp;

    public Troll() {
        this.hp = 500;
        this.gold = 200;
        this.xp = 50;
    }

    public float getHp() {
        return hp;
    }

    public float getGold() {
        return gold;
    }

    public float getXp() {
        return xp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public void setGold(float gold) {
        this.gold = gold;
    }

    public void setXp(float xp) {
        this.xp = xp;
    }
    public float attack() {
        Random rand = new Random();
        return rand.nextFloat();
    }

    @Override
    public String toString() {
        return "Troll{" +
                "hp=" + hp +
                ", gold=" + gold +
                ", xp=" + xp +
                '}';
    }
}
