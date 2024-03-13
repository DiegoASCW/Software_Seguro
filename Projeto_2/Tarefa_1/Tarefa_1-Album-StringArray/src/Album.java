import java.util.ArrayList;
import java.util.List;

public class Album {

    private String nome;
    private int ano_de_lancamento;
    private List<String> musicas_string;

    public Album(String nome, int ano_de_lancamento, List<String> musicas_string){
        this.nome = nome;
        this.ano_de_lancamento = ano_de_lancamento;
        this.musicas_string = musicas_string;
    }

    public void listar_album(){
        System.out.printf("Nome: %s\nAno de lançamento: %d\n", this.nome, this.ano_de_lancamento);
        listar_musicas();
    }

    public void listar_musicas (){
        int contador = 1;

        for (String m : this.musicas_string){
            System.out.printf("Musica %d: %s\n", contador, m);
            contador ++;
        }
    }

}