package br.com.vini.spring_boot_essentials.controller;

import br.com.vini.spring_boot_essentials.database.model.ProdutoEntity;
import br.com.vini.spring_boot_essentials.dto.ProdutoDto;
import br.com.vini.spring_boot_essentials.exception.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoEntity createProduto(@RequestBody ProdutoDto produtoDto) {
        return produtoService.createProduto(produtoDto);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ProdutoEntity updateProduto(@RequestBody ProdutoDto produtoDto,
                                       @PathVariable Integer id) throws NotFoundException {
        return produtoService.atualizarProduto(produtoDto, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProduto(@PathVariable Integer id) {
        produtoService.removerProduto(id);
    }
}
