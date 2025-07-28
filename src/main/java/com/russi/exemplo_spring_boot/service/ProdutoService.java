package com.russi.exemplo_spring_boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.russi.exemplo_spring_boot.model.Produto;
import com.russi.exemplo_spring_boot.repo.ProdutoRepo;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepo repo;

    //Create
    public void inserirProduto(Produto p) {
        repo.save(p);
    }


    //Read
    public List<Produto> listarProdutos(){
        return repo.findAll();
    }



    //Update
    public void atualizarProduto(Produto p) {
        repo.save(p);
    }


    //Delete
    public void deletarProduto(int id){
        repo.deleteById(id);
    }


}