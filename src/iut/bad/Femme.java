
package iut.bad;

public class Femme extends Humain {

    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    public static void main(String[] args) {
        Homme h = new Homme("Martin", "Luc", 25);
        Femme f = new Femme("Durand", "Léa", 23);
        h.ami(f);
        f.ami(h);
    }
}