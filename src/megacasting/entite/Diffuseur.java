package megacasting.entite;

public class Diffuseur extends Societe {
    private int id;

    
    // Accesseurs
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return this.getRaisonSociale();
    }
    
    // Constructeur

    public Diffuseur(int id) {
        this.id = id;
    }
    
    public Diffuseur() {
    }
}
