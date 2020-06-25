package br.com.mastertech.cotacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.cloud.sleuth.annotation.SpanTag;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class CotacaoService {

    @Autowired
    private CotacaoFeign cotacaoFeign;

    @NewSpan(name = "buscar-service")
    public HashMap<String, Object> buscar(@SpanTag("origin") String origin, @SpanTag("destiny") String destiny) {
        return cotacaoFeign.buscar(origin + "-" + destiny);
    }
}
