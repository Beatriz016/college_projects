package sptech.projetojpa01.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import sptech.projetojpa01.entidade.Salgadinho;
import sptech.projetojpa01.entidade.SalgadinhoSimplesResposta;

import java.util.List;

public interface SalgadinhoRepository
        extends JpaRepository<Salgadinho, Integer> {

    @Query("Select new sptech.projetojpa01.entidade.SalgadinhoSimplesResposta(s.codigo, s.nome) from Salgadinho s")
    List<SalgadinhoSimplesResposta> listaSimples();

    @Transactional
    @Modifying
    @Query("update Salgadinho s set s.preco = ?2 where s.codigo = ?1")
    void atualizaPreco(Integer codigo, Double novoPreco);

    @Transactional
    @Modifying
    @Query("update Salgadinho s set s.preco = ?3, s.apimentado = ?2 where s.codigo = ?1")
    void atualizarPrecoApimentado();
}
