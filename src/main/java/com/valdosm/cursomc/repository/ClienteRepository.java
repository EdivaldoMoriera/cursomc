package com.valdosm.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.valdosm.cursomc.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    
}
