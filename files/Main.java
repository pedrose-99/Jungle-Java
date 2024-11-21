package files;
import java.util.Scanner;

public class Main 
{

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
            files.printCositas.textoEfectoEscritura("Eleccion incorrecta!!!");
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
            files.printCositas.printElegirCamino();
            System.out.print("Elegiste el camino: ");
            eleccion = gestionNumero(teclado);
            files.printCositas.printSeparador();
            if (eleccion != 1 && eleccion != 2 && eleccion != 3)
            {
                files.printCositas.textoEfectoEscritura("Ese camino no existe.");
            }
        }
        return (eleccion);
    }

    public static int setDificultad(Scanner teclado)
    {
        int dificil;

        dificil = 0;
        files.printCositas.printSeparador();
        while (dificil != 1 && dificil != 2 && dificil != 3)
        {
            System.out.print("Seleccione la dificultad entre 1, 2 y 3: ");
            dificil = gestionNumero(teclado);
            files.printCositas.printSeparador();
        }
        files.printCositas.textoEfectoEscritura("La dificultad seleccionado es: " + dificil);
        return (dificil);
    }
    public static void main(String[] args) 
    {
        inventario myInventario = new inventario(1, 0,0);
        Scanner teclado = new Scanner(System.in);
        arma myArma;
        int eleccion;
        jugador player;
        int dificil;
    
        dificil = setDificultad(teclado);
        eleccion = eleccionCamino(teclado);
        myArma = new arma(eleccion);
        files.printCositas.imprimirEstadisticas(myArma);
        files.printCositas.printInventario(myInventario);
        player = files.jugador.setJugador(eleccion, myInventario, myArma, dificil);
        files.combate.simularCombate((2 * player.dificultad), "pepito", player);
    }
}
