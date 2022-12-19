package ws;


import java.util.Date;

public class Compte {
    private int code;
    private double solde;
    private Date dateateCreation;

    public Date getDateateCreation(){
        return dateateCreation;
    }
    public void setDateateCreation(Date dateateCreation){
        this.dateateCreation=dateateCreation;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Compte(int code, double solde, Date dateCreation){
        this.code=code;
        this.solde =solde;
        this.dateateCreation = dateCreation;
    }
    public Compte(){

    }
}
