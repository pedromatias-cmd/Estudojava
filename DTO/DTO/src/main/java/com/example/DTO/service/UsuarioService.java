package com.example.DTO.service;

import com.example.DTO.dto.UsuarioRequestDTO;
import com.example.DTO.dto.UsuarioRespnseDTO;
import com.example.DTO.model.Usuario;
import com.example.DTO.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public Usuario salvarUsuario(UsuarioRequestDTO usuarioRequestDTO) {
        if (usuarioRepository.findBYemail(usuarioRequestDTO.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Usuário já Cadastrado");
        }

        Usuario usuario = new Usuario();
        usuario.setNome(usuarioRequestDTO.getNome());
        usuario.setEmail(usuarioRequestDTO.getEmail());
        usuario.setSenha(usuarioRequestDTO.getSenha());
        //Criptografando a senha antes de salvar;
        usuario.setSenha(bCryptPasswordEncoder.encode(usuarioRequestDTO.getSenha()));

        usuarioRepository.save(usuario);
        return usuario;
    }

    //consultar tabela no banco de dados
    public List<UsuarioRespnseDTO>ListarTodos(){
        return usuarioRepository
                //Retorna com os dados de todos os usuários na tabela.
                .findAll()
                //Envia os dados obtidos para as próximas funções abaixo.
                .stream()
                //Envia os dados de "nome" e "email" da tabela usuários para o response.
                .map(u -> new UsuarioRespnseDTO(u.getNome(), u.getEmail()))
                //Transforma todos os dados em uma lista.
                .toList();
    }
}

