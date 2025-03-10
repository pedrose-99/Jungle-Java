package files;
import java.util.Scanner;

public class Main 
{
    //Función para poder elegir entre dos caminos
    public static int elegir(String eleccion1, String eleccion2, Scanner teclado)
    {
        int eleccion;

        eleccion = 0;
        while (eleccion != 1 && eleccion != 2)
        {
            files.printTexto.printSeparador();
            files.printTexto.textoEfectoEscritura("¿Que camino eliges?");
            files.printTexto.textoEfectoEscritura("1- " + files.printTexto.blue +eleccion1 + files.printTexto.white);
            files.printTexto.textoEfectoEscritura("2- " + files.printTexto.purple+eleccion2 + files.printTexto.white);
            System.out.print("Elegiste el camino: ");
            eleccion = files.Main.gestionNumero(teclado);
            files.printTexto.printSeparador();
            if (eleccion != 1 && eleccion != 2)
            {
                files.printTexto.textoEfectoEscritura("Ese camino no existe.");
            }
        }
        return eleccion;
    }
    //Función para poder gestionar si te pasan algo que no sea un int
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
            files.printTexto.printSeparador();
            files.printTexto.textoEfectoEscritura(files.printTexto.red +"Eleccion incorrecta!!!"+ files.printTexto.white);
            return (0); 
        }
        return eleccion;
    }
    //Función para gestionar el uso de las pociones
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
            files.printTexto.printSeparador();
            files.printTexto.textoEfectoEscritura(files.printTexto.red +"Eleccion incorrecta!!!"+ files.printTexto.white);
            return (-1); 
        }
        return eleccion;
    }
    //Función para elegir el camino 
    public static int elegirCamino(Scanner teclado)
    {
        int eleccion;

        eleccion = 0;
        while (eleccion != 1 && eleccion != 2 && eleccion != 3)
        {
            files.printTexto.printElegirCamino();
            System.out.print("Elegiste el camino: ");
            eleccion = gestionNumero(teclado);
            files.printTexto.printSeparador();
            if (eleccion != 1 && eleccion != 2 && eleccion != 3)
            {
                files.printTexto.textoEfectoEscritura("Ese camino no existe.");
            }
        }
        return (eleccion);
    }
    //Funcion para elegir la dificultad
    public static int elegirDificultad(Scanner teclado)
    {
        int dificil;

        dificil = 0;
        while (dificil != 1 && dificil != 2 && dificil != 3)
        {
            files.printTexto.printSeparador();
            System.out.print("Seleccione la dificultad entre "+ files.printTexto.yellow+"1 "+files.printTexto.blue+ "2 " +files.printTexto.red+ "3: "+ files.printTexto.white);
            dificil = gestionNumero(teclado);
            files.printTexto.printSeparador();
            if (dificil != 1 && dificil != 2 && dificil != 3)
            {
                files.printTexto.printSeparador();
                files.printTexto.textoEfectoEscritura(files.printTexto.red + "Esa dificultad no existe!!!.");
                files.printTexto.printSeparador();
            }
        }
        files.printTexto.textoEfectoEscritura("La dificultad seleccionado es: " + dificil);
        return (dificil);
    }
    //Void main para poder ejecutar el código
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        inventario myInventario;
        arma myArma;
        int eleccion;
        jugador player;
        int dificil;
        String respuesta;
        try {
            while (true)
            {
                respuesta = "";
                files.printTexto.bienvenida();
                dificil = elegirDificultad(teclado);
                myInventario = files.inventario.setInventario(dificil);
                eleccion = elegirCamino(teclado);
                myArma = files.arma.setArma(eleccion);
                player = files.jugador.setJugador(eleccion, myInventario, myArma);
                switch (eleccion) 
                {
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
                while (respuesta.isEmpty())
                {
                    files.printTexto.printSeparador();
                    System.out.print("¿Quieres probar otros caminos? si/no: " );
                    respuesta = teclado.next();
                    if (!respuesta.equals("si") && !respuesta.equals("no") && !respuesta.equals("SI") && !respuesta.equals("NO"))
                    {
                        respuesta = "";
                        System.out.println("La respuesta no es valida. Escribe si o no.");
                    }
                }
                if (respuesta.equals("no") || respuesta.equals("NO"))
                {
                    break ;
                }
            }
            files.printTexto.printSeparador();
            files.printTexto.textoEfectoEscritura(files.printTexto.yellow +"Gracias por jugar.");
            files.printTexto.printSeparador();
            teclado.close();
        } catch (Exception e) {
        }
    }
}
