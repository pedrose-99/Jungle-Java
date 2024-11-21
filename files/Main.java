package files;
import java.util.Scanner;

public class Main 
{
    public static void bienvenida()
    {
        System.out.println("------------------------------------------");
        System.out.println("Bienvenido al templo");
        System.out.println("------------------------------------------");
    }
    
    public static int gestionNumero(Scanner teclado)
    {
        int eleccion;
        String opcion;

        opcion = teclado.next();
        try {
            eleccion = Integer.parseInt(opcion);
        } 
        catch (NumberFormatException nfe) 
        {
            System.out.println("Eleccion incorrecta!!!");
            return (0); 
        }
        return eleccion;
    }

    public static int eleccionCamino(Scanner teclado)
    {
        int eleccion;

        eleccion = 0;
        while (eleccion != 1 && eleccion != 2 && eleccion != 3)
        {
            System.out.println("------------------------------------------");
            System.out.println("Que camino eliges:");
            System.out.println("1. Camino de la magia");
            System.out.println("2. Camino de la destrucción");
            System.out.println("3. Camino de la arqueria");
            System.out.print("Elegiste el camino: ");
            eleccion = gestionNumero(teclado);
            System.out.println("------------------------------------------");
            if (eleccion != 1 && eleccion != 2 && eleccion != 3)
            {
                System.out.println("Ese camino no existe.");
            }
        }
        return (eleccion);
    }

    public static int setDificultad(Scanner teclado)
    {
        int dificil;

        dificil = 0;
        System.out.println("------------------------------------------");
        while (dificil != 1 && dificil != 2 && dificil != 3)
        {
            System.out.print("Seleccione la dificultad entre 1, 2 y 3: ");
            dificil = gestionNumero(teclado);
            System.out.println("------------------------------------------");
        }
        System.out.println("La dificultad seleccionado es: " + dificil);
        return (dificil);
    }
    public static void main(String[] args) 
    {
        String black="\033[30m"; 
        String red="\033[31m"; 
        String green="\033[32m"; 
        String yellow="\033[33m"; 
        String blue="\033[34m"; 
        String purple="\033[35m"; 
        String cyan="\033[36m"; 
        String white="\033[37m";
        //System.out.println(black+ "textoooooo " + white);
        
        inventario myInventario = new inventario(1, 0,0);
        Scanner teclado = new Scanner(System.in);
        arma myArma;
        int eleccion;
        jugador player;
        int dificil;
    
        dificil = setDificultad(teclado);
        eleccion = eleccionCamino(teclado);
        myArma = new arma(eleccion);
        myArma.imprimirEstadisticas(myArma);
        myInventario.printInventario(myInventario);
        player = files.jugador.setJugador(eleccion, myInventario, myArma, dificil);
        files.combate.simularCombate((2 * player.dificultad), "pepito", player);
    }
}
