package br.com.vini.spring_boot_essentials.service;

import br.com.vini.spring_boot_essentials.database.model.ProdutoEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    private static final List<ProdutoEntity> PRODUTOS = List.of(
            ProdutoEntity.builder()
                    .id(1)
                    .nome("notebook")
                    .preco(new BigDecimal("5000"))
                    .quantidade(10)
                    .build(),

            ProdutoEntity.builder()
                    .id(2)
                    .nome("iphone")
                    .preco(new BigDecimal("7000"))
                    .quantidade(10)
                    .build(),

            ProdutoEntity.builder()
                    .id(3)
                    .nome("mouse")
                    .preco(new BigDecimal("600"))
                    .quantidade(10)
                    .build()
    );

    public List<ProdutoEntity> findAll() {
        return new ArrayList<>(PRODUTOS);
    }

    public ProdutoEntity createProduto(ProdutoEntity produtoEntity) {
        return produtoEntity;
    }
}