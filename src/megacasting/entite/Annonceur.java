package megacasting.entite;

public class Annonceur extends Societe {
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
    

    // Constructeurs
    public Annonceur(int identifiant) {
        this.id = identifiant;
    }

    public Annonceur() {
    }
    
    
    
}
