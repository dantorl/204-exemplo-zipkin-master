package br.com.mastertech.cotacao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;

@FeignClient(name = "cotacao", url = "http://economia.awesomeapi.com.br/json/all/")
public interface CotacaoFeign {

    @GetMapping("/{moedas}")
    HashMap<String, Object> buscar(@PathVariable String moedas);
}
