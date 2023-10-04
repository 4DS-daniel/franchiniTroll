public class Troll {
    private float hp;
    private float gold;
    private float xp;

    public Troll(float hp, float gold, float xp) {
        this.hp = hp;
        this.gold = gold;
        this.xp = xp;
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
}
