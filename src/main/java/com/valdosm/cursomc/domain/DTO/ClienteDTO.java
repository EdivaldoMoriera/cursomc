package com.valdosm.cursomc.domain.DTO;

import java.io.Serializable;

import com.valdosm.cursomc.domain.Cliente;

public class ClienteDTO  implements Serializable{
    private Integer id;
    private String nome;

    public ClienteDTO(Cliente cliente){
        id = cliente.getId();
        nome = cliente.getEmail();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
