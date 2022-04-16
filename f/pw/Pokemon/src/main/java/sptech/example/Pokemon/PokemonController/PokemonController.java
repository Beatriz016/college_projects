package sptech.example.Pokemon.PokemonController;

import sptech.example.Pokemon.Pokemon.Pokemon;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    private List<Pokemon> pokemons = new ArrayList<>(List.of(
            new Pokemon("Pikachu", "nana", false, 20.0),
            new Pokemon("Bubassaur", "bebe", false, 20.0)
    ));

//    @PostMapping()
//    public String oi() {
//        return "oi";
//    }

    @PostMapping("/adicionarPokemon")
    public void adicionar(@RequestBody Pokemon pokemon){
        pokemons.add(pokemon);
    }

    @DeleteMapping("/cadastrar/{indice}")
    public String remover(@PathVariable int indice) {
        return "sptech/example/Pokemon/Pokemon" + indice + "removido com sucesso";
    }


}
