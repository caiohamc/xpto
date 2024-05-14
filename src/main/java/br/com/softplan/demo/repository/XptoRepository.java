package br.com.softplan.demo.repository;

import br.com.softplan.demo.model.Xpto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class XptoRepository {

    public Xpto buscarPorId(Integer id) {
        Xpto xpto = new Xpto();
        xpto.setCodigo(1);
        xpto.setNome("Caio");
        return xpto;
    }

    public List<Xpto> listar() {
        Xpto xpto1 = new Xpto();
        xpto1.setCodigo(1);
        xpto1.setNome("Caio");

        Xpto xpto2 = new Xpto();
        xpto2.setCodigo(2);
        xpto2.setNome("Alexandre");

        return List.of(xpto1, xpto2);
    }
}