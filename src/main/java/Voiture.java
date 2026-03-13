public class Voiture {
    private String modele;
    private String couleur;
    private int vitesse;

    public Voiture(String model, String color) {
        this.modele = model;
        this.couleur = color;
        this.vitesse = 0;
    }

    static void gererVitesse(Voiture voiture, int nouvelleVitesse) {
        if (voiture.getVitesse() >= nouvelleVitesse) {
            while (voiture.getVitesse() > nouvelleVitesse) {
                voiture.ralentir();
            }
        } else  {
            while (voiture.getVitesse() < nouvelleVitesse) {
                voiture.accelerer();
            }
        }
    }

    public int getVitesse() {
        return this.vitesse;
    }

    public void accelerer() {
        if (vitesse + 10 <= 120) {
            vitesse += 10;
            // afficher détails
            afficherDetails();
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }
//ajout methode pour eviter repetition dans acceler et ralentir
    private void afficherDetails() {
        System.out.println("Modèle : " + modele);
        System.out.println("Couleur : " + couleur);
        System.out.println("Vitesse actuelle : " + vitesse);
    }

    public void ralentir() {
        if (vitesse - 10 >= 0) {
            vitesse -= 10;
            // afficher détails
            afficherDetails();
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }

    public void changerVitesse(int nouvelleVitesse, Conducteur conducteur) {
        System.out.println(conducteur.getNom() + " change la vitesse de la voiture à " + nouvelleVitesse);
        int vitesseActuelle;
        gererVitesse(this, nouvelleVitesse);
    }

    public void arreterVoiture(Conducteur conducteur) {
        System.out.println(conducteur.getNom() + " arrête la voiture.");
    }

    public void demarrerVoiture(Conducteur conducteur) {
        if (conducteur.estAdulte()) {
            System.out.println(conducteur.getNom() + " démarre la voiture.");
        } else {
            System.out.println("Le conducteur n'est pas assez âgé pour conduire.");
        }
    }
}

