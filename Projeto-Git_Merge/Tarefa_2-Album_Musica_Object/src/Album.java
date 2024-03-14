import java.util.ArrayList;
import java.util.List;

public class Album {

    private String nome;
    private int ano_de_lancamento;
    private List<Musica> musicas_obj_list;

    public Album(String nome, int ano_de_lancamento, List<Musica> musicas_obj_list){
        this.nome = nome;
        this.ano_de_lancamento = ano_de_lancamento;
        this.musicas_obj_list = musicas_obj_list;
    }

    public void listar_album(){
        System.out.printf("Nome: %s\nAno de lançamento: %d\n", this.nome, this.ano_de_lancamento);
        listar_musicas();
    }

    public void listar_musicas (){
        int contador = 1;

        for (Musica m : this.musicas_obj_list){
            System.out.printf("Musica %d: %s\n", contador, m.getNome_da_musica());
            contador ++;
        }
    }

}