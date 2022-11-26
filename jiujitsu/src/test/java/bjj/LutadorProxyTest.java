package bjj;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


public class LutadorProxyTest {

    @BeforeEach
    void setUp(){
        BD.addLutador(new Lutador("001", "Roger Gracie", "Preta", 84.0f, "absoluto" ));
        BD.addLutador(new Lutador("002", "Marcus Buchecha", "Preta", 100.0f, "absoluto" ));
    }

    @Test
    void deveRetornaNomeFaixaCategoria(){
        LutadorProxy lutador = new LutadorProxy("001");
        assertEquals(Arrays.asList("Roger Gracie", "Preta", "absoluto"), lutador.acessarDadosLutador());
    }

    @Test
    void deveRetornaPesoLutador(){
        Organizacao organizacao = new Organizacao("Thales Brow", true);
        LutadorProxy lutadorProxy = new LutadorProxy("001");
        assertEquals(Arrays.asList(84.0f), lutadorProxy.acessarPeso(organizacao));
    }

    @Test
    void deveRetornaOrganizadorNaoAutorizadoAcesso() {
        try {
            Organizacao organizacao = new Organizacao("Bob Esponja", false);
            LutadorProxy lutadorProxy = new LutadorProxy("002");
            lutadorProxy.acessarPeso(organizacao);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Acesso incorreto", e.getMessage());
        }
    }





}
