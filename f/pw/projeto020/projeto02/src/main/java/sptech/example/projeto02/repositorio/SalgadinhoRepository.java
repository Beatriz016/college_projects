package sptech.example.projeto02.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import sptech.example.projeto02.entidade.Salgadinho;

public interface SalgadinhoRepository extends JpaRepository<Salgadinho,Integer> {

}
