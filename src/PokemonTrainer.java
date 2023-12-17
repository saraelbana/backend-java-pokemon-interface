import java.util.ArrayList;
import java.util.List;

public class PokemonTrainer {

    private String username;
    List<Pokemon> trainerPokemons= new ArrayList<Pokemon>();
    PokemonTrainer(String username, List<Pokemon> pokemon){
        this.username = username;
        trainerPokemons = pokemon;
    }

    public String getUsername() {
        return username;
    }

    public List<Pokemon> getTrainerPokemons() {
        return trainerPokemons;
    }
    public void displayPokemonNames(){
        for(int i=0; i<trainerPokemons.size();i++){
            System.out.println(trainerPokemons.get(i).name);
        }
    }
    public void changeTrainerName(String newUsername){
        this.username = newUsername;
    }
}
