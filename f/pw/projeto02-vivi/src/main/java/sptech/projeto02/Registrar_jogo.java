package sptech.projeto02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Registrar_jogo {
    private Integer count = 0;
    private Integer point = 0;

    @GetMapping("/registrar-vitoria")
    public String count_victory() {
        count += 3;
        point ++;
        return String.format("Vitória Cadastrada");

    }


    @GetMapping("/registrar-derrota")
    public String count_defeat() {
        count += 0;
        point ++;
        return String.format("Derrota Cadastrada");
    }

    @GetMapping("/registrar-empate")
    public String count_tie() {
        count += 1;
        point ++;
        return String.format("Empate Cadastrado");
    }

    @GetMapping("/pontuacao")
    public String point() {
       return String.format("Olá você tem %d pontos e %d partidas", count, point);
    }

}
