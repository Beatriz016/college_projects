package sptech.projeto02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/paises")
public class OlimpiadasController {

    List<Pais> paises = new ArrayList<>();

    @GetMapping("/teste")
    public Pais teste(){
        Pais pais = new Pais("Brasil",12,10,2);

        return pais;
    }

    @GetMapping("/listar/adicionar")
    public List<Pais> listarPaises() {
        paises.add(new Pais("Brazil",20,30,10));
        paises.add(new Pais("Canada",12,12,0));
        paises.add(new Pais("Japao",200,350,100));

        return paises;
    }

    @GetMapping("/cadastrar/{nome}/{ouro}/{prata}/{bronze}")
    public String cadastraPais(@PathVariable String nome, @PathVariable int ouro, @PathVariable int prata, @PathVariable int bronze) {
        paises.add(new Pais(nome,ouro,prata,bronze));
        return "Pais cadastrado com sucesso!";
    }

    @GetMapping("/buscar/{indice}")
    public Pais buscarPaisPorIndice(@PathVariable int indice) {
        return paises.get(indice);
    }
}
