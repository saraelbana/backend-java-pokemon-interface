import java.util.ArrayList;
import java.util.List;

public class PokemonTrainer {
    private String username;
    List<Pokemon> pokemons= new ArrayList<Pokemon>();
    PokemonTrainer(String username, List<Pokemon> pokemons){
        this.username = username;
        this.pokemons = pokemons;
    }
    public String getName() {
        return username;
    }
    public List<Pokemon> getPokemons(){
        return pokemons;
    }
    public void displayPokemonNames(){
        for(int i=0; i<pokemons.size();i++){
            System.out.println(pokemons.get(i).name);
        }
    }
    public void changeTrainerName(String newUsername){
        this.username = newUsername;
    }
    public void addNewPokemon(Pokemon pokemon){
        pokemons.add(pokemon);
    }
    public void addSetPokemon(List<Pokemon> pokemons){
        for (int i=0; i<pokemons.size(); i++){
            pokemons.add(pokemons.get(i));
        }
    }
}
