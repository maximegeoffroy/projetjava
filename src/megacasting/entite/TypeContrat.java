package megacasting.entite;

public class TypeContrat {
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

    // Constructeur
    public TypeContrat(String libelle) {
        this.libelle = libelle;
    }
    public TypeContrat() {
    }

    @Override
    public String toString() {
        return  libelle;
    }
    
    
    
    
}
