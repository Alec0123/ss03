import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler dados da pessoa
        System.out.println("Digite o nome da pessoa: ");
        String nomePessoa = scanner.nextLine();
        System.out.println("Digite a idade da pessoa: ");
        int idadePessoa = scanner.nextInt();

        // Ler dados da música
        System.out.println("Digite o título da música: ");
        String tituloMusica = scanner.nextLine();
        System.out.println("Digite a duração da música: ");
        int duracaoMusica = scanner.nextInt();
        System.out.println("Digite o nome do compositor da música: ");
        String compositorMusica = scanner.nextLine();

        // Ler dados do álbum
        System.out.println("Digite o gênero do álbum: ");
        String generoAlbum = scanner.nextLine();
        System.out.println("Digite o ano do álbum: ");
        int anoAlbum = scanner.nextInt();
        System.out.println("Digite o nome do artista do álbum: ");
        String artistaAlbum = scanner.nextLine();

        // Criar objetos
        Pessoa pessoa = new Pessoa(nomePessoa, idadePessoa);
        Musica musica = new Musica(tituloMusica, duracaoMusica, compositorMusica);
        Album album = new Album(generoAlbum, anoAlbum, nomeAlbum, artistaAlbum);


        // Adicionar música ao álbum
        album.adicionarMusica(musica);

        // Mostrar dados do álbum
        album.mostraTodosOsDados();
    }
}
