package br.com.softplan.demo.service;

import br.com.softplan.demo.model.Xpto;
import br.com.softplan.demo.repository.XptoRepository;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
@RequiredArgsConstructor
class XptoServiceTest {

    @Autowired
    private final XptoService service;

    @Mock
    private final XptoRepository repository;

    @Test
    void deveRetornarXpto() {
        Xpto xpto = new Xpto();
        xpto.setCodigo(1);
        xpto.setNome("Caio");
        when(repository.buscarPorId(1)).thenReturn(xpto);

        Xpto xpto2 = this.service.buscarPorId(1);

        assertEquals(1, xpto2.getCodigo());
        assertEquals("Caio", xpto2.getNome());
    }
}