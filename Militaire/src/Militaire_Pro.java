
import java.util.Date;

public class Militaire_Pro extends Militaire{
    private int nbAnneeFormation;

    // Getter & Setter
    public int getNbAnneeFormation() {
        return nbAnneeFormation;
    }

    public void setNbAnneeFormation(int nbAnneeFormation) {
        this.nbAnneeFormation = nbAnneeFormation;
    }

    // Constructeur 
    public Militaire_Pro(int code, String nom, String prenom, Date dateDebut, int nbAnneeFormation) {
        super(code, nom, prenom, dateDebut);
        this.nbAnneeFormation = nbAnneeFormation;
    }

    // Méthodes
    public String toString() {
		return super.toString() + "\nAnnée de formation : " + this.nbAnneeFormation + "\nFonction : PROFESSIONNEL";
	}

    public String printAll() {
        return super.printAll() + " formé pendant " + this.nbAnneeFormation + " années";
    }
}
