package megacasting.entite;

public class DomaineMetier {
    private int id;
    private String libelle;

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

    @Override
    public String toString() {
        return this.libelle;
    }
    

    // Constructeur
    public DomaineMetier(String libelle) {
        this.libelle = libelle;
    }
    public DomaineMetier() {
    }
    
    
}
