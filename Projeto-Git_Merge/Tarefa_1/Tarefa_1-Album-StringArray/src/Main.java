import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {

        List<String> lista_de_musicas = new ArrayList<>();
        lista_de_musicas.add("ANSI C");
        lista_de_musicas.add("Runst!");
        lista_de_musicas.add("Mortal Python");

        Album album = new Album("Programáticas", 2024, lista_de_musicas);

        album.listar_album();
    }
}