package files;
import java.util.Scanner;

public class combate 
{
    public static void menuCombate()
    {
        System.out.println("----------------Es tu turno---------------");
        System.out.println("Que quieres hacer?");
        System.out.println("1. Tirar dado y atacar");
        System.out.println("2. Usar poción de ayuda");
        System.out.println("3. Mirar tus estadisticas y tu inventario");
    }

    public static void gestionTurno(jugador player, int eleccion)
    {
        switch (eleccion)
        {
            case 1:
                //atacar
                break;
            case 2:
                if (player.myInventario.numPociones > 0)
                {
                    files.inventario.gestionPociones(player);
                    files.jugador.printStats(player);
                }
                else
                {
                    System.out.println("------------------------------------------");
                    System.out.println("No tienes pociones disponibles!!!");
                    System.out.println("------------------------------------------");
                }
                break ;
            default:
                files.jugador.printStats(player);
                files.inventario.printInventario(player.myInventario);
                break ;
        }
    }

    public static boolean simularCombate(int numEnemigos, jugador player)
    {
        Scanner teclado;
        int eleccion;
        
        teclado = new Scanner(System.in);
        System.out.println("------------------------------------------");
        System.out.println("Bienvenido a la fase de combate!!!!");
        while (numEnemigos > 0 && player.hp > 0)
        {
            menuCombate();
            eleccion = files.Main.gestionNumero(teclado);
            while (eleccion != 1 && eleccion != 2 && eleccion != 3)
            {
                eleccion = files.Main.gestionNumero(teclado);
            }
            gestionTurno(player, eleccion);
        }
        if (player.hp > 0)
        {
            return (true);
        }
        return (false);
    }    
}
