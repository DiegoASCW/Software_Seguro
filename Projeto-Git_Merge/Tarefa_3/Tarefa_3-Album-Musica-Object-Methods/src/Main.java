import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {

        List<Musica> playlist = new ArrayList<Musica>();
        playlist.add(new Musica("C+"));
        playlist.add(new Musica("C++"));
        playlist.add(new Musica("C++++"));
        playlist.add(new Musica("C#"));
        playlist.add(new Musica("C 5e+"));

        Album album = new Album("C...", 2024, playlist);

        album.listar_album();
    }
}