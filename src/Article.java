
public class Article {
	
	private int num;
	private String nom;
	private int prix;
	
	public Article() {
		
	}
	
	public Article (int N, String Ref, int P) {
		this.num=N;
		this.nom=Ref;
		this.prix=P;
	}
	
	public String toString() {
		return "le numéro de référence de l'article est :"+num+"le nom de l'article est :"+nom+"le prix de l'article est de :"+prix;
	}
	
	//getter 
	
	public int getnum () {
		return num;
	}
	
	public String getnom() {
		return nom;
	}
	
	public int getprix () {
		return prix;
	}
	
	//setter
	
	public void setnum (int S) {
		num=S;
	}
	
	public void setnom (String S) {
		nom=S;
	}
	
	public void setprix (int S) {
		prix=S;
	}
	
	public boolean equals (Object o) {
		if ( ((Article) o).getnom() == nom && ((Article) o).getnum() == num && ((Article) o).getprix() == prix ) {
			return true;
		}
		else {
			return false;
		}
	}

}
