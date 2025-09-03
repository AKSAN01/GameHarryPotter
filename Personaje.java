public abstract class Personaje {
    protected String nombre;
    protected Hechizo hechizoHabil; 

    public Personaje(String nombre) {
        this.nombre = nombre;
    }


    public void lanzarHechizo() {
        System.out.print(nombre + " lanza: ");
        hechizoHabil.ejecutar();
    }


    public void setHechizoHabil(Hechizo nuevoHechizo) {
        this.hechizoHabil = nuevoHechizo;
        System.out.println("\n>> " + nombre + " ha cambiado su hechizo principal. <<\n");
    }
    
    public abstract void presentarse();
}
