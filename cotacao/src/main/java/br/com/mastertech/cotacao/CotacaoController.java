package br.com.mastertech.cotacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class CotacaoController {

    @Autowired
    private CotacaoService cotacaoService;

    @GetMapping("/{origin}/{destiny}")
    public HashMap<String, Object> buscar(@PathVariable String origin, @PathVariable String destiny) {
        return cotacaoService.buscar(origin, destiny);
    }

}
