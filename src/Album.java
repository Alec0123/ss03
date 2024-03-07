import java.util.ArrayList;
import java.util.List;

public class Album {

    private String genero;
    private int ano;
    private String nomeAlbum;
    private String artista;
    private List<Musica> musicas;

    public Album(String genero, int ano, String nomeAlbum, String artista) {
        this.genero = genero;
        this.ano = ano;
        this.nomeAlbum = nomeAlbum;
        this.artista = artista;
        this.musicas = new ArrayList<>();
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nomeAlbum;
    }

    public void setNome(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void adicionarMusica(Musica musica) {
        this.musicas.add(musica);
    }

    public void mostraTodosOsDados() {
        System.out.println("**Álbum:** " + nomeAlbum);
        System.out.println("**Artista:** " + artista);
        System.out.println("**Gênero:** " + genero);
        System.out.println("**Ano:** " + ano);
        System.out.println("**Músicas:**");
        for (Musica musica : musicas) {
            System.out.println("  - " + musica.getTitulo());
        }
    }
}
