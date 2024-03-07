import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Quantos albuns terão:");
        int qntdAlbum = terminal.nextInt();
        terminal.nextLine();

        Musica[] playlist = new Musica[qntdAlbum];

        String nomeMusica;
        Double duracao;
        String nomeCompositor;
        int idade;

        for (int i=0; i <= qntdAlbum - 1; i++){
            System.out.println("=-=-=-=-=-=-=[Musicas]=-=-=-=-=-=-=");

            System.out.println("Qual o nome do album: ");
            nomeMusica = terminal.nextLine();
            terminal.nextLine();

            System.out.println("Qual a duracao: ");
            duracao = terminal.nextDouble();
            terminal.nextLine();

            System.out.println("Qual o nome do compositor: ");
            nomeCompositor = terminal.nextLine();
            terminal.nextLine();

            System.out.println("Qual a idade dele: ");
            idade = terminal.nextInt();
            terminal.nextLine();

            playlist[i] = new Musica(nomeMusica, duracao, new Pessoa(nomeCompositor, idade));
        }



        System.out.println("Qual seu genero: ");
        String genero = terminal.nextLine();

        System.out.println("Quando foi lancado: ");
        int ano = terminal.nextInt();

        System.out.println("Qual o nome do album: ");
        String nomeAlbum = terminal.nextLine();

        System.out.println("Qual o nome do artista autor: ");
        String nomeArtistaAutor = terminal.nextLine();

        Album novoAlbum = new Album(genero, ano, nomeAlbum, nomeArtistaAutor, playlist);

        novoAlbum.mostraTodosOsDados();

    }
}