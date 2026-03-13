public class Application {
    public static void main(String[] args) {
        Voiture maVoiture = new Voiture("Sedan", "Bleu");
        Conducteur moi = new Conducteur("John", 20);

        maVoiture.demarrerVoiture(moi);
        maVoiture.accelerer();
        maVoiture.changerVitesse(80, moi);
        maVoiture.ralentir();
        maVoiture.changerVitesse(30, moi);
        maVoiture.arreterVoiture(moi);
        System.out.println("fini");
    }
}
