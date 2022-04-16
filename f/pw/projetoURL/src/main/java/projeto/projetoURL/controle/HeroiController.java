package projeto.projetoURL.controle;

import org.springframework.web.bind.annotation.*;
import projeto.projetoURL.entidade.Heroi;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/herois")
public class HeroiController {

    private List<Heroi> herois = new ArrayList<>();

    @GetMapping
    public List<Heroi> getHerois() {
        return herois;
    }

    @PostMapping
    public String postHeroi(@RequestBody Heroi novoHeroi) {
        herois.add(novoHeroi);
        return "Heroi cadastrado com sucesso";
    }

    @GetMapping
    public Heroi getHeroi(@PathVariable int indice) {

        for(Heroi heroi : herois) {
            if(!heroi.equals(indice)) {
                return null;
            }
        }
        return herois.get(indice);
    }

    @PutMapping("/indice")
    public String atualizarHeroiPorIndice(
            @PathVariable int indice,
            @RequestBody Heroi heroiAtualizado) {

        herois.set(indice, heroiAtualizado);
        return "heroi atualizado com sucesso";
    }

    @DeleteMapping("{indice}")
    public String  deletarHeroiPosIndice(
            @PathVariable int indice) {

        herois.remove(indice);
        return "heroi removido com sucesso...";

    }

}
