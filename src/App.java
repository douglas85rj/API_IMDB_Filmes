import java.net.http.HttpClient;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
       
        //Coletar os dados do servidor IMDB (Top 250 filmes)
        String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json";
         HttpClient client = HttpClient.newHttpClient();
        //Filtar algumas informações da API (título, poster, classificação)


        //Exibir e manipular as informações coletadas do IMDB
    }
}
