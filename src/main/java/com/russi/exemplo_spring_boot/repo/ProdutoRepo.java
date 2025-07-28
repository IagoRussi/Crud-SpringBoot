package com.russi.exemplo_spring_boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.russi.exemplo_spring_boot.model.Produto;

public interface ProdutoRepo extends JpaRepository<Produto, Integer> {

}
