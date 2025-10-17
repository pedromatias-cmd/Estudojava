package com.example.DTO1.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UsuarioRequestDTO {
    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @NotBlank(message = "O email deve ser obrigatório")
    @Email(message = "O E-mail deve ser válido. ")
    private String email;

    @NotBlank(message = "A senha é obrigatória")
    @Size(min = 3, max = 10, message = "A senha deve ter no mínimo 3 caracters e no máximo 20")
    private String senha;

    public UsuarioRequestDTO() {
    }

    public UsuarioRequestDTO(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public @NotBlank(message = "O nome é obrigatório") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigatório") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "O email deve ser obrigatório") @Email(message = "O E-mail deve ser válido. ") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "O email deve ser obrigatório") @Email(message = "O E-mail deve ser válido. ") String email) {
        this.email = email;
    }

    public @NotBlank(message = "A senha é obrigatória") @Size(min = 3, max = 10, message = "A senha deve ter no mínimo 3 caracters e no máximo 20") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "A senha é obrigatória") @Size(min = 3, max = 10, message = "A senha deve ter no mínimo 3 caracters e no máximo 20") String senha) {
        this.senha = senha;
    }
}
