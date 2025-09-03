public class Simu {
    public static void main(String[] args) {
        Personaje harry = new HarryPotter();
        Personaje ron = new RonWeasley();
        Personaje hermione = new HermioneGranger();

        harry.presentarse();
        ron.presentarse();
        hermione.presentarse();

        System.out.println("--- INICIO DEL JUEGO: HECHIZOS PRINCIPALES ---");
        harry.lanzarHechizo();
        ron.lanzarHechizo();
        hermione.lanzarHechizo();

        System.out.println("\n=======================================================");
        System.out.println("    Un momento... ¡Los anteojos de Harry se rompieron!");
        System.out.println("=======================================================");

        //Cambio de comportamiento (estrategia) en tiempo de ejecución.

        hermione.setHechizoHabil(new OculusReparo());
        
        System.out.println("--- HERMIONE USA UN NUEVO HECHIZO ---");
        hermione.lanzarHechizo();
        System.out.println("=======================================================\n");
        hermione.setHechizoHabil(new WingardiumLeviosa());
        System.out.println("--- HERMIONE VUELVE A SU HECHIZO HABITUAL ---");
        hermione.lanzarHechizo();
    }
}
