package com.valdosm.cursomc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdosm.cursomc.domain.Categoria;
import com.valdosm.cursomc.repository.CategoriaRepository;
import com.valdosm.cursomc.service.exception.ObjectNotFoundException;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository repository;
    public List<Categoria> fidAll(){
        return repository.findAll();
    }
    //por id
    public Categoria findById( Integer id){
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado Id:" + id+ ", Tipo:" +Categoria.class.getName()));       
    } 
}
