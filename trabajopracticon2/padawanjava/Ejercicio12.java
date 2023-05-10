package trabajopracticon2.padawanjava;

public class Ejercicio12 {
    public static void main(String[] args) {
       
        String equipo1 = "Boca";
        String equipo2 = "River";
        String equipo="Boca";


        String entrenador1 = "Jorge Almirón";
        String entrenador2 = "Martín Demichelis";
        

        String jugador1Equipo1 = "Miguel Merentiel";
        String jugador2Equipo1 = "Sergio Romero";
        String jugador3Equipo1 = "Darío Benedetto";
        
        String jugador1Equipo2 = "Pablo Solari";
        String jugador2Equipo2 = "Franco Armani";
        String jugador3Equipo2 = "Miguel Borja";


        switch (equipo){

        case "Boca":
        System.out.println("Jugadores del Equipo de Futbol");
        System.out.println("==============================");
        System.out.println("Equipo: " + equipo1);
        System.out.println("Entrenador: " + entrenador1);
        System.out.println("Jugadores: ");
        System.out.println("- " + jugador1Equipo1);
        System.out.println("- " + jugador2Equipo1);
        System.out.println("- " + jugador3Equipo1);
        break;
        case "River":
        System.out.println("Jugadores del Equipo de Futbol");
        System.out.println("==============================");
        System.out.println("Equipo: " + equipo2);
        System.out.println("Entrenador: " + entrenador2);
        System.out.println("Jugadores: ");
        System.out.println("- " + jugador1Equipo2);
        System.out.println("- " + jugador2Equipo2);
        System.out.println("- " + jugador3Equipo2);
        
        }

    }
}
