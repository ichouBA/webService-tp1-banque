import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class BanqueJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9191/", new BanqueService());
        System.out.println("the Banque Web Service is published on the Address http://localhost:9191");
    }
}