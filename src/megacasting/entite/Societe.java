package megacasting.entite;


public class Societe {
    private int id;
    private String raisonSociale;
    private String telephone;
    private String mail;
    private String adresse;
    private String siret;

    @Override
    public String toString() {
        return this.raisonSociale;
    }

    // Accesseurs
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getRaisonSociale() {
        return raisonSociale;
    }
    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String getSiret() {
        return siret;
    }
    public void setSiret(String siret) {
        this.siret = siret;
    }


    // Constructeur
    public Societe(String raisonSociale, String telephone, String mail, String adresse, String siret) {
        this.raisonSociale = raisonSociale;
        this.telephone = telephone;
        this.mail = mail;
        this.adresse = adresse;
        this.siret = siret;
    }
    public Societe() {
    }
    
    
}
