package ws;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueService")
public class BanqueService {
    @WebMethod(operationName = "convert")
    public double conversion(@WebParam(name="montant") double mt){
        return mt*11.12;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name="code") int code){
        return new Compte(code, Math.random()*9999, new Date());
    }
    @WebMethod
    public List<Compte> getComptes() {
        return List.of(
                new Compte(11, Math.random()*9999, new Date()),
                new Compte(22, Math.random()*4443, new Date()),
                new Compte(33, Math.random()*1000, new Date())
        );
    }

}

