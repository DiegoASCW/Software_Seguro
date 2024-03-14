import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {

        List<Musica> playlist = new ArrayList<Musica>();
        playlist.add(new Musica("COBOLÍSTICO"));
        playlist.add(new Musica("C#!"));
        playlist.add(new Musica("Javai"));

        Album album = new Album("Programáticas", 2024, playlist);

        album.listar_album();
    }
}