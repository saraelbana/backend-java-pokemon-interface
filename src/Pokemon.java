import java.util.List;

public abstract class Pokemon {
    String name;
    int level;
    float height;
    float weight;
    String food;
    String sound;
    String defence;
    List<String> attacks;
    String type;

    /*
    `hp` (health points)
    `xp` (experience points)
    `special`
    `accuracy`
    */

    // private static final FirePokemon charizard =
    // new FirePokemon("Charrizard", 76, 150, "firenougats", "GRRRRRRRRRRRRRRR");

    Pokemon(){}
    Pokemon(String name, float weight, float height, String food, String sound){
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.food = food;
        this.sound = sound;

    }
    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setDefence(String defence) {
        this.defence = defence;
    }

    public void setAttacks(List<String> attacks) {
        this.attacks = attacks;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }

    public String getDefence() {
        return defence;
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public String getType() {
        return type;
    }
}
