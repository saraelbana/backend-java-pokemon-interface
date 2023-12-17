import java.util.List;

public class WaterPokemon extends Pokemon{
    WaterPokemon(String name, float weight, float height, String food, String sound){
        super( name,  weight,  height,  food,  sound);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setLevel(int level) {
        super.setLevel(level);
    }

    @Override
    public void setHeight(float height) {
        super.setHeight(height);
    }

    @Override
    public void setWeight(float weight) {
        super.setWeight(weight);
    }

    @Override
    public void setFood(String food) {
        super.setFood(food);
    }

    @Override
    public void setSound(String sound) {
        super.setSound(sound);
    }

    @Override
    public void setDefence(String defence) {
        super.setDefence(defence);
    }

    @Override
    public List<String> getAttacks() {
        return super.getAttacks();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getLevel() {
        return super.getLevel();
    }

    @Override
    public float getHeight() {
        return super.getHeight();
    }

    @Override
    public float getWeight() {
        return super.getWeight();
    }

    @Override
    public String getFood() {
        return super.getFood();
    }

    @Override
    public String getSound() {
        return super.getSound();
    }

    @Override
    public String getDefence() {
        return super.getDefence();
    }

    @Override
    public void setAttacks(List<String> attacks) {
        super.setAttacks(attacks);
    }

    @Override
    public void setType(String type) {
        super.setType(type);
    }

    @Override
    public void setHp(int hp) {
        super.setHp(hp);
    }

    @Override
    public int getHp() {
        return super.getHp();
    }

    @Override
    public String getType() {
        return super.getType();
    }
}
