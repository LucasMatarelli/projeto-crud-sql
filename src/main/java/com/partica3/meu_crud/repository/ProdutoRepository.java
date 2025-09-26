package com.partica3.meu_crud.repository; // <-- Corrigido!

import com.partica3.meu_crud.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {}