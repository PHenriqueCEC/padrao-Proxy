package bjj;

import java.util.HashMap;
import java.util.Map;

public class BD {
    private static Map<String, Lutador> lutadores = new HashMap<>();

    public static Lutador getLutador(String inscricao){
        return lutadores.get(inscricao);
    }
    public static void addLutador(Lutador lutador){
        lutadores.put(lutador.getInscricao(), lutador);
    }
}
