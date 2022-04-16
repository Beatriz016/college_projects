package sptech.example.projeto02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sptech.example.projeto02.entidade.Salgadinho;
import sptech.example.projeto02.repositorio.SalgadinhoRepository;

import java.util.List;


@RestController
@RequestMapping("/salgadinhos")
public class SalgadinhoController {

    @Autowired
    private SalgadinhoRepository repository;

    @PostMapping()
    public ResponseEntity postSalgadinho(@RequestBody Salgadinho novoSalgadinho) {
        repository.save(novoSalgadinho);
        return ResponseEntity.status(201).build();
    }

    @GetMapping
    public ResponseEntity getSalgadinho() {
        List<Salgadinho> salgadinhos = repository.findAll();
        if(salgadinhos.isEmpty()) {
            return ResponseEntity.status(204).build();

        }
        return ResponseEntity.status(200).body(salgadinhos);
    }

    @DeleteMapping("/{codigo}")
    public ResponseEntity deleteSalgadinho(@PathVariable int codigo) {
        if(repository.existsById(codigo)) {
            repository.deleteById(codigo);
            return ResponseEntity.status(200).build();
        }
        return ResponseEntity.status(404).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity selectId(@PathVariable int  id) {
        if(repository.existsById(id)) {
            return  ResponseEntity.status(200).build();
        }
        return  ResponseEntity.status(404).build();
    }

    @PutMapping("/{atualizar}/{indice}")
    public ResponseEntity update(@PathVariable int atualizar, @RequestBody indice) {

    }
}
