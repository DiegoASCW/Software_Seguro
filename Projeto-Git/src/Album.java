import java.awt.*;

public class Album {

    private String genero;
    private int ano;
    private String nome;
    private String artista;
    private Musica[] musicaPlaylist = new Musica[2];

    public Album(String genero, int ano, String nome, String artista, Musica[] musicaPlaylist){
        this.genero = genero;
        this.ano = ano;
        this.nome = nome;
        this.artista = artista;
        this.musicaPlaylist = musicaPlaylist;
    }

    public void mostraTodosOsDados(){
        System.out.printf("Genero: %s;\nAno: %d;\nNome: %s;\nArtista: %s;", this.genero, this.ano, this.nome, this.artista);

        System.out.println("\n[Músicas]");
        for (Musica m : this.musicaPlaylist){
            m.tocarMusica();
        }
    }
}
