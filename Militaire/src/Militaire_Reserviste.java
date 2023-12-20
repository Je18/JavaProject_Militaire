
import java.util.Date;

public class Militaire_Reserviste extends Militaire{
    private int nbIntervention;

    // Getter & Setter
    public int getNbIntervention() {
        return nbIntervention;
    }
    public void setNbIntervention(int nbIntervention) {
        this.nbIntervention = nbIntervention;
    }

    // Constructeur 
    public Militaire_Reserviste(int code, String nom, String prenom, Date dateDebut, int nbIntervention) {
        super(code, nom, prenom, dateDebut);
        this.nbIntervention = nbIntervention;
    }

    public String toString() {
		return super.toString() + "\nNombre d'intervention : " + this.nbIntervention + "\nFonction : RESERVISTE";
	}

    public String printAll() {
        return super.printAll() + " a effectué " + this.nbIntervention + " interventions";
    }

}
