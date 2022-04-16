package sptech.example.c102211004beatrizvitoriacardoso.controller;

import org.springframework.web.bind.annotation.*;
import sptech.example.c102211004beatrizvitoriacardoso.entidade.Usuarios;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

    private static List<Usuarios> usuarios = new ArrayList<>(List.of(
            new Usuarios("Zé Buduia Loko","senhaloka","loginloko")

    ));

    @PostMapping
    public String cadastrarUsuario(@RequestBody Usuarios usuario) {

        if(usuario.equals(usuario.getNome())) {
            return "usuario já cadastrado";
        }
        usuarios.add(usuario);
        return String.format("Usuário %s cadastrado no sistema", usuario.getNome());
    }

//    boolean autenticado = false;
    @PostMapping("/autenticacao/{usuario}/{senha}")
    public String autenticarUsuario(@RequestBody Usuarios usuarioLogin,
                                    @PathVariable String usuario,
                                    @PathVariable String senha)
    {

        if(usuarioLogin.getNome().equalsIgnoreCase(usuario) && senha.equalsIgnoreCase(usuarioLogin.getSenha())) {
            return String.format("Usuário X agora está autenticado",usuarioLogin.getNome());
        }

        return "Usuário Z não encontrado";
    }

    @GetMapping()
    public String listaUsuarios() {
        for(Usuarios u : usuarios) {
            System.out.println(u);
        }

       return null;
    }

    @DeleteMapping("autenticacao/{usuario}")
    public String logooff(@RequestBody Usuarios usuarioLogin, @PathVariable String usuario) {
        if(autenticarUsuario(usuarioLogin)) {
            System.out.println("Logoff do usuário" + usuarioLogin.getNome() +"concluido");
        } else {
            System.out.println("usuário" + usuarioLogin.getNome() + "NÃO está autenticado");
        }

        return String.format("Usuario %s não encontrado", usuarioLogin.getNome());
    }

    // deletar um usuario
    @DeleteMapping("/deletar/{usuario}")
    public String removerUsuario(@PathVariable int usuario) {
        usuarios.remove(usuario);
        return String.format("usuário %s deletado do sistema", usuario);
    }

    // atualizar o cadastro de algum usuario
    @PutMapping("/atualiza/{usuario}")
    public String atualizaCadastro(@RequestBody Usuarios usuariosLogin, @PathVariable int usuario) {
        usuarios.set(usuario,usuariosLogin);
        return "dados do usuário atualizados";
    }

    //contar quantidade de usuarios por nome
    @GetMapping("/totalUsuarios")
    public String total(@PathVariable String total) {
        long contador = usuarios.stream()
                .filter(usuarios -> usuarios.getNome().equalsIgnoreCase("nome"))
                .count();

        return "total de pessoas com esse nome: " + contador;
    }

}
