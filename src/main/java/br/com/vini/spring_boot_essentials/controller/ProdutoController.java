package br.com.vini.spring_boot_essentials.controller;

import br.com.vini.spring_boot_essentials.database.model.ProdutoEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import br.com.vini.spring_boot_essentials.service.ProdutoService;

import java.util.List;

@RestController
@RequestMapping("/v1/produtos")
@RequiredArgsConstructor
public class ProdutoController {

    private final  ProdutoService produtoService;

    @GetMapping( produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<ProdutoEntity> findAll() {
        return produtoService.findAll();
    }

}
