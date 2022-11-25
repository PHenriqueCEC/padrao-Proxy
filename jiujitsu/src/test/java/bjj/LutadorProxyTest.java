package bjj;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


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

    



}
