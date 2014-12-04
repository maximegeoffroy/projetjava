package megacasting.entite;

import java.util.Date;


public class Offre {

    private int id;
    private String intitule;
    private String reference;
    private Date datePublication;
    private int dureeDiffusion;
    private Date dateDebutContrat;
    private int nbPostes;
    private String localisation;
    private String descriptionPoste;
    private String descriptionProfil;
    private String telephone;
    private String mail;
    private int idTypeContrat;
    private int idMetier;
    private int idDomaineMetier;
    private int idAnnonceur;
    
    // Accesseurs
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getIntitule() {
        return intitule;
    }
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
    public String getReference() {
        return reference;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }
    public Date getDatePublication() {
        return datePublication;
    }
    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }
    public int getDureeDiffusion() {
        return dureeDiffusion;
    }
    public void setDureeDiffusion(int dureeDiffusion) {
        this.dureeDiffusion = dureeDiffusion;
    }
    public Date getDateDebutContrat() {
        return dateDebutContrat;
    }
    public void setDateDebutContrat(Date dateDebutContrat) {
        this.dateDebutContrat = dateDebutContrat;
    }
    public int getNbPostes() {
        return nbPostes;
    }
    public void setNbPostes(int nbPostes) {
        this.nbPostes = nbPostes;
    }
    public String getLocalisation() {
        return localisation;
    }
    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }
    public String getDescriptionPoste() {
        return descriptionPoste;
    }
    public void setDescriptionPoste(String descriptionPoste) {
        this.descriptionPoste = descriptionPoste;
    }
    public String getDescriptionProfil() {
        return descriptionProfil;
    }
    public void setDescriptionProfil(String descriptionProfil) {
        this.descriptionProfil = descriptionProfil;
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
    public int getIdTypeContrat() {
        return idTypeContrat;
    }
    public void setIdTypeContrat(int idTypeContrat) {
        this.idTypeContrat = idTypeContrat;
    }
    public int getIdMetier() {
        return idMetier;
    }
    public void setIdMetier(int idMetier) {
        this.idMetier = idMetier;
    }
    public int getIdDomaineMetier() {
        return idDomaineMetier;
    }
    public void setIdDomaineMetier(int idDomaineMetier) {
        this.idDomaineMetier = idDomaineMetier;
    }
    public int getIdAnnonceur() {
        return idAnnonceur;
    }
    public void setIdAnnonceur(int idAnnonceur) {
        this.idAnnonceur = idAnnonceur;
    }

    // Constructeurs
    public Offre(String intitule, String reference, Date datePublication, int dureeDiffusion, Date dateDebutContrat, int nbPostes, String descriptionPoste, String descriptionProfil, String telephone, String mail, int idTypeContrat, int idMetier, int idDomaineMetier, int idAnnonceur) {
        this.intitule = intitule;
        this.reference = reference;
        this.datePublication = datePublication;
        this.dureeDiffusion = dureeDiffusion;
        this.dateDebutContrat = dateDebutContrat;
        this.nbPostes = nbPostes;
        this.descriptionPoste = descriptionPoste;
        this.descriptionProfil = descriptionProfil;
        this.telephone = telephone;
        this.mail = mail;
        this.idTypeContrat = idTypeContrat;
        this.idMetier = idMetier;
        this.idDomaineMetier = idDomaineMetier;
        this.idAnnonceur = idAnnonceur;
        
    }
    public Offre() {
    }
      
    
    
}
