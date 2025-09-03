public class HarryPotter extends Personaje {
    public HarryPotter() {
        super("Harry Potter");
        this.hechizoHabil = new ExpectoPatronum(); // Hechizo inicial
    }

    @Override
    public void presentarse() {
        System.out.println("Soy Harry Potter");
    }
}
