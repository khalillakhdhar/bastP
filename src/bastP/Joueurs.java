package bastP;

public class Joueurs {
	public static int id=0;
	private String nom,prenom;
	private int age;
	private String categorie;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public Joueurs(String nom, String prenom, int age) {
		super();
		Joueurs.id++;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.categorie = definirCategorie();
	}
	public Joueurs() {
		super();
		// TODO Auto-generated constructor stub
		Joueurs.id++;

	}
	public String definirCategorie()
	{
		return age<10 ? "Minimes" :
			   age<14 ? "Cadet" :
			   age<18 ? "Junior":
	   		   age< 40 ? "Sénior":
	   	"Refusé";			
	}
	@Override
	public String toString() {
		return "Joueurs [nom=" + nom + ", prenom=" + prenom +",id="+Joueurs.id+ ", age=" + age + ", categorie=" + categorie + "]";
	}
	
	

}
