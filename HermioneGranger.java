public class HermioneGranger extends Personaje {
    public HermioneGranger() {
        super("Hermione Granger");
        this.hechizoHabil = new WingardiumLeviosa(); // Hechizo inicial
    }

    @Override
    public void presentarse() {
        System.out.println("Soy Hermione Granger. Es le-vi-O-sa, no levio-SA.");
    }
}
