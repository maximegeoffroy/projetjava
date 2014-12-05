package megacasting.entite;

public class Metier {
    private int id;
    private String libelle;
    private int idDomaineMetier;

    // Accesseurs
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public int getIdDomaineMetier() {
        return idDomaineMetier;
    }
    public void setIdDomaineMetier(int idDomaineMetier) {
        this.idDomaineMetier = idDomaineMetier;
    }

    @Override
    public String toString() {
        return this.libelle;
    }
    
    
    // Constructeurs
    public Metier(String libelle, int idDomaineMetier) {
        this.libelle = libelle;
        this.idDomaineMetier = idDomaineMetier;
    }
    public Metier() {
    }
    
    
    
}
