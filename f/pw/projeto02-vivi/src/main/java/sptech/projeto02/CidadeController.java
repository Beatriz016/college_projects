package sptech.projeto02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cidades")
public class CidadeController {

    @GetMapping("/listar")
    public String listar() {
        return "todas as cidades";
    }

    @GetMapping("top-5")
    public String top() {
        return String.format("As top 5 São A, B e C");
    }

    @GetMapping
    public String home() {
        return "Bem vindos á API de cidades";
    }

}
