public class RonWeasley extends Personaje {
    public RonWeasley() {
        super("Ron Weasley");
        this.hechizoHabil = new Expelliarmus(); // Hechizo inicial
    }

    @Override
    public void presentarse() {
        System.out.println("Soy Ron Weasley");
    }
}
