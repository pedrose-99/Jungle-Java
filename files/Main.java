package files;

import java.util.Scanner;
 
public class Main 
{
    public static int elegir(String eleccion1, String eleccion2, Scanner teclado)
    {
        int eleccion;

        eleccion = 0;
        while (eleccion != 1 && eleccion != 2)
        {
            files.printCositas.printSeparador();
            files.printCositas.textoEfectoEscritura("¿Que camino eliges?");
            files.printCositas.textoEfectoEscritura("1- " + files.printCositas.blue +eleccion1 + files.printCositas.white);
            files.printCositas.textoEfectoEscritura("2- " + files.printCositas.purple+eleccion2 + files.printCositas.white);
            System.out.print("Elegiste el camino: ");
            eleccion = files.Main.gestionNumero(teclado);
            files.printCositas.printSeparador();
            if (eleccion != 1 && eleccion != 2)
            {
                files.printCositas.textoEfectoEscritura("Ese camino no existe.");
            }
        }
        return eleccion;
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
            files.printCositas.printSeparador();
            files.printCositas.textoEfectoEscritura(files.printCositas.red +"Eleccion incorrecta!!!"+ files.printCositas.white);
            return (0); 
        }
        return eleccion;
    }

    public static int gestionPotis(Scanner teclado)
    {
        int eleccion;
        String opcion;

        opcion = teclado.next();
        try {
            eleccion = Integer.parseInt(opcion);
        } 
        catch (NumberFormatException nfe) 
        {
            files.printCositas.printSeparador();
            files.printCositas.textoEfectoEscritura(files.printCositas.red +"Eleccion incorrecta!!!"+ files.printCositas.white);
            return (-1); 
        }
        return eleccion;
    }
    public static int elegirCamino(Scanner teclado)
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
        while (dificil != 1 && dificil != 2 && dificil != 3)
        {
            files.printCositas.printSeparador();
            System.out.print("Seleccione la dificultad entre "+ files.printCositas.yellow+"1 "+files.printCositas.blue+ "2 " +files.printCositas.red+ "3: "+ files.printCositas.white);
            dificil = gestionNumero(teclado);
            files.printCositas.printSeparador();
            if (dificil != 1 && dificil != 2 && dificil != 3)
            {
                files.printCositas.printSeparador();
                files.printCositas.textoEfectoEscritura(files.printCositas.red + "Esa dificultad no existe!!!.");
                files.printCositas.printSeparador();
            }
        }
        files.printCositas.textoEfectoEscritura("La dificultad seleccionado es: " + dificil);
        return (dificil);
    }
    public static void main(String[] args) 
    {
        inventario myInventario = new inventario(0, 0,0);
        Scanner teclado = new Scanner(System.in);
        arma myArma;
        int eleccion;
        jugador player;
        int dificil;
    
        files.printCositas.bienvenida();
        dificil = setDificultad(teclado);
        eleccion = elegirCamino(teclado);
        myArma = new arma(eleccion);
        player = files.jugador.setJugador(eleccion, myInventario, myArma, dificil);
        switch (eleccion) {
            case 1:
                files.caminoMagia.caminoMago(player, dificil);
                break;
            case 2:
                files.caminoDestruccion.Destruccion(player, dificil);
                break;
            default:
                files.caminoHereje.caminoArco(player, dificil);
                break;
        }
        teclado.close();
    }
}
