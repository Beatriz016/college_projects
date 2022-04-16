package sptech.projeto02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Registrar_jogo02 {
    private Integer count;
    private Integer point;

    @GetMapping("/register_victory")
    public void count_victory() {
        count += 3;
        point++;
    }

    @GetMapping("/register_defeat")
    public void count_defeat() {
        count += 0;
        point++;
    }

    @GetMapping("register_tie")
    public void count_tie() {
        count += 1;
        point++;
    }

    @GetMapping("/pontuation")
    public String count_pontuation() {

    }
}
