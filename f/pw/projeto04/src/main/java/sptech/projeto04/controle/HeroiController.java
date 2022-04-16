package sptech.projeto04.controle;

import org.springframework.web.bind.annotation.*;
import sptech.projeto04.entidade.Heroi;

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

  // "CREATE"
  @PostMapping
  public String postHeroi(@RequestBody Heroi novoHeroi) {
    if (existsByNome(novoHeroi.getNome())) {
      return "Herói já cadastrado =(";
    }
    herois.add(novoHeroi);
    return "Herói cadastrado com sucesso";
  }

  // "READ"
  @GetMapping("/{indice}")
  public Heroi getHeroi(@PathVariable Integer indice) {
    if (isIndiceValido(indice)) {
      return herois.get(indice);
    }
    return null;
  }

  // "UPDATE"
  @PutMapping("/{indice}")
  public String atualizarHeroiPorIndice(@PathVariable int indice, @RequestBody Heroi heroiAtualizado) {
    if (isIndiceValido(indice)){
      herois.set(indice, heroiAtualizado);
      return "Heroi atualizado com sucesso!";
    }
    return "Heroi não encontrado =(";
  }

  // "DELETE"
  @DeleteMapping("/{indice}")
  public String removerPorIndice(@PathVariable int indice) {
    if (isIndiceValido(indice)){
      herois.remove(indice);
      return "Heroi removido com sucesso...";
    }
    return "Heroi não encontrado =(";
  }

  public boolean existsByNome(String nome) {
    return herois.stream()
        .anyMatch(heroi -> heroi.getNome().equalsIgnoreCase(nome));
  }

  public boolean isIndiceValido(int indice) {
    return indice >= 0 && indice < herois.size();
  }
}
