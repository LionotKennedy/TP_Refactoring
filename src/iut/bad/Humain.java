package iut.bad;

public class Humain implements Consommation {

	public Humain(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	public void details() {
	    System.out.println(toString());
	}

	public String toString() {
		return nom + " " + prenom + " " + age;
	}
	
    @Override
    public void manger() {
    	System.out.println(nom + " mange.");
    }

    @Override
    public void boire() { 
    	System.out.println(nom + " boit.");
    }
	
    public void ami(Humain h, int dureeJours) {
        System.out.println(this + " est ami avec " + h + " pendant " + dureeJours + " jours");
    }
    
    public void ami(Humain h) {
        ami(h, 100);
    }
    
//    public void ami(Humain h) {
//        System.out.println(this + " est ami avec " + h);
//    }
//    
//	public void manger() {
//	    System.out.println(nom + " mange.");
//	}
//
//	public void boire() {
//	    System.out.println(nom + " boit.");
//	}
//	
	protected String nom;
	protected String prenom;
	protected int age;
}