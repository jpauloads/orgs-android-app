package com.example.orgs.dao

import com.example.orgs.model.Produto

class ProdutosDao {

//    Assim ocorre uma lista diferente para cada instancia do DAO
//    private val produtos = mutableListOf<Produto>()

    fun adiciona(produto: Produto){
        produtos.add(produto)
    }

    fun buscaTodos() : List<Produto> {
        return produtos.toList()
    }

    //Para ter uma instancia estática e salvar os produtos é feito o companion object
    companion object {
        private val produtos = mutableListOf<Produto>()
    }
}