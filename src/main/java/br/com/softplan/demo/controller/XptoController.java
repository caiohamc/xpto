package br.com.softplan.demo.controller;

import br.com.softplan.demo.model.Xpto;
import br.com.softplan.demo.service.XptoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/xptos")
public class XptoController {

    private final XptoService service;

    @GetMapping("/{id}")
    public Xpto buscarPorId(@RequestParam Integer id) {
        return this.service.buscarPorId(id);
    }

    @GetMapping
    public List<Xpto> listar() {
        return this.service.listar();
    }

//    @PostMapping
//    public ResponseEntity<Void> registrar(@RequestBody RegistrarXptoRequest request) {
//        UUID id = this.service.registrar(id);
//        // retornar
//    }
}