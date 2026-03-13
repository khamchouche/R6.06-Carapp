public class Conducteur {
    public static final int AGE_MAJORITE = 18;
    private String name;
    private int years;

    public Conducteur(String name, int years) {
        this.name = name;
        this.years = years;
    }

    public boolean estAdulte() {
        return years >= AGE_MAJORITE; //ajout constante
    }
    public String getNom() {
        return this.name; // ou this.name selon ton refactoring
    }
}
