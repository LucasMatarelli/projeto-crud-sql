package com.partica3.meu_crud.service; // <-- Corrigido!

import com.partica3.meu_crud.entity.Produto;
import com.partica3.meu_crud.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;
    public Produto salvar(Produto produto) { return produtoRepository.save(produto); }
    public List<Produto> buscarTodos() { return produtoRepository.findAll(); }
    public Optional<Produto> buscarPorId(Long id) { return produtoRepository.findById(id); }
    public void deletar(Long id) { produtoRepository.deleteById(id); }
}