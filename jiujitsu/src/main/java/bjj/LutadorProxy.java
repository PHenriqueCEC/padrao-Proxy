package bjj;

import java.util.List;

    public class LutadorProxy implements ILutador {
        private Lutador lutador;

        private String inscricao;

        public LutadorProxy(String inscricao) {
            this.inscricao = inscricao;
        }
        @Override
        public List<String> acessarDadosLutador(){
            if(this.lutador == null){
                this.lutador = new Lutador(this.inscricao);
            }
            return this.lutador.acessarDadosLutador();
        }
        @Override
        public List<Float>acessarPeso(Organizacao organizacao){
            if (!organizacao.isAdministrador()) {
                throw new IllegalArgumentException("Acesso incorreto");
            }
            if(this.lutador == null){
                this.lutador = new Lutador(this.inscricao);
            }
            return this.lutador.acessarPeso(organizacao);
        }
}
