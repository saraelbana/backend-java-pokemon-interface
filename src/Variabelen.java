import java.util.Arrays;
import java.util.List;

// Deze klasse dient als naslagwerk en dient uiteindelijk verwijderd te worden voor je het huiswerk inlevert.
// In deze klasse staan een aantal variabelen die in meerdere klassen voorkomen en een aantal variabelen die slechts één keer gebruikt kunnen worden.
public class Variabelen {
    /*deze komen meerdere keren voor*/
    String type;

    // are these the attacks names?
    List<String> attacks = Arrays.asList("Attack1","Attack2","Attack3","Attack4");
    String name;

    /*deze variabelen komen eenmaal voor*/
    List<Pokemon> pokemons;
    int level;
    int hp;
    String food;
    String sound;
    String town;

}
