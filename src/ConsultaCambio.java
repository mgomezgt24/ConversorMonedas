import com.google.gson.Gson;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCambio {
    URI direccion = URI.create("https:v6.exchangerate-api.com/v6/cb3821530df6ef4c073c12ec/latest/USD");

    public Cambio buscarCambio(){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Cambio.class);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

}
