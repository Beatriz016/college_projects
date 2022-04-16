import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LimiteUltrapassadoExeption extends Exception {
    String data;

    public LimiteUltrapassadoExeption(String s) {
        super(s);
        data = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss"));
    }

}
