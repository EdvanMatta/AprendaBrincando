package aprendabrincando.edvanmatta.com.aprendabrincando;

/**
 * Created by Familia_Matta on 07/05/2017.
 */

public class Usuario {

    private String nome;
    private String nomeJogo;
    private int pontoAcertos;
    private int pontoErros;

    public Usuario(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeJogo() {
        return nomeJogo;
    }

    public void setNomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }

    public int getPontoAcertos() {
        return pontoAcertos;
    }

    public void setPontoAcertos(int pontoAcertos) {
        this.pontoAcertos = pontoAcertos;
    }

    public int getPontoErros() {
        return pontoErros;
    }

    public void setPontoErros(int pontoErros) {
        this.pontoErros = pontoErros;
    }
}
