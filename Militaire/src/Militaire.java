
import java.util.Comparator;
import java.util.Date;

public class Militaire {
    private int code;
    private String nom;
    private String prenom;
    private Date dateDebut;

    // Getter & Setter
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateDebut() {
        return dateDebut;
    }
    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    // Constructeur 
    public Militaire(int code, String nom, String prenom, Date dateDebut) {
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDebut = dateDebut;
    }
    
    public String toString() {
		return "Code : "+ this.code + "\nNom : " + this.nom + "\nPrenom : " + this.prenom + "\nDebut : " + this.dateDebut;
	}

    public String printAll() {
        return this.nom + " " + this.prenom;
    }

    // Trie des codes
    public static Comparator<Militaire> ComparatorAge = new Comparator<Militaire>() {
        public int compare(Militaire e1, Militaire e2) {
            return (int) (e1.getCode() - e2.getCode());
        }
    };

}
