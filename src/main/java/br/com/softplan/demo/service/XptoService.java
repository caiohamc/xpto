package br.com.softplan.demo.service;

import br.com.softplan.demo.model.Xpto;
import br.com.softplan.demo.repository.XptoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class XptoService {

    private final XptoRepository repository;

    public Xpto buscarPorId(Integer id) {
        return this.repository.buscarPorId(id);
    }

    public List<Xpto> listar() {
        return this.repository.listar();
    }

//    public Xpto registrar(XptoRequest request) {
//        Xpto xpto = new Xpto();
//        xpto.setCodigo(1);
//        xpto.setNome("Caio");
//
//        return this.repository.save(xpto);
//    }
}