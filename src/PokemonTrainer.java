import java.util.ArrayList;
import java.util.List;

public class PokemonTrainer {

    private String username;
    List<Pokemon> trainerPokemons= new ArrayList<Pokemon>();
    PokemonTrainer(String username, Pokemon pokemon){
        this.username = username;
        trainerPokemons.add(pokemon);
    }

}
