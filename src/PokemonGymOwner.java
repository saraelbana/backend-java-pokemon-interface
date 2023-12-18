import java.util.ArrayList;
import java.util.List;

public class PokemonGymOwner {
    //("Brock", "Pewter City", pokemons)
    String name;
    String town;
    List<Pokemon> pokemons = new ArrayList<>();

    public PokemonGymOwner(String name, String town, List<Pokemon> pokemons) {
        this.name = name;
        this.town = town;
        this.pokemons = pokemons;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }
}
