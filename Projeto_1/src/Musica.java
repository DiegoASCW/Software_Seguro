public class Musica {

    private String titulo;
    private double duracao;
    private Pessoa compositor;

    public Musica(String titulo, double duracao, Pessoa compositor){
        this.titulo = titulo;
        this.duracao = duracao;
        this.compositor = compositor;
    }

    public void tocarMusica(){
        System.out.printf("\nTítulo: %s;\nDurção: %f;\nCompositor: %s", this.titulo, this.duracao, this.compositor);
    }

}
