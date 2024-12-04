package files;
import java.util.Scanner;

public class inventario 
{
    int pociones_curativas;
    int pociones_ataque;
    int pociones_defensa;
    int numPociones;

    //Función para elegir las pociones en el combate
    public static int switchPotis(jugador player, int eleccion)
    {
        switch (eleccion) {
            case 1:
                if (player.myInventario.pociones_ataque <= 0)
                {
                    files.printTexto.textoEfectoEscritura("No tienes esa poción. Elige otra.");
                    eleccion = 0;
                }
                else
                {
                    player.myInventario.pociones_ataque--;
                    player.myArma.dmgActual = player.myArma.dmgActual + 3;
                }
                break;
            case 2:
                if (player.myInventario.pociones_defensa <= 0)
                {
                    files.printTexto.textoEfectoEscritura("No tienes esa poción. Elige otra.");
                    eleccion = 0;
                }
                else
                {
                    player.myInventario.pociones_defensa--;
                    player.defensaActual = player.defensaActual + 2;

                }
                    break;
            default:
                if (player.myInventario.pociones_curativas <= 0)
                {
                    files.printTexto.textoEfectoEscritura("No tienes esa poción. Elige otra.");
                    eleccion = 0;
                }
                else
                {
                    player.myInventario.pociones_curativas--;
                    player.hp = player.hp + 10;
                    if (player.hp > player.maxHp)
                    {
                        player.hp = player.maxHp;
                    }
                }
                break;
        }
        return eleccion;
    }
    //Función para la gestión de que tipo de poción quieres usar
    public static void gestionPociones(jugador player)
    {
        int eleccion;
        Scanner teclado;

        eleccion = 0;
        teclado = new Scanner(System.in);
        files.printTexto.printInventario(player.myInventario);
        while (eleccion != 1 && eleccion != 2 && eleccion != 3)
        {
            files.printTexto.printSeparador();
            files.printTexto.textoEfectoEscritura("Que poción quieres usar??");
            files.printTexto.elegirPoti(player.myInventario);
            eleccion = files.Main.gestionNumero(teclado);
            eleccion = switchPotis(player, eleccion);
        }
    }
    //Función para declarar el inventario
    public inventario(int atack_potion, int defense_potion, int heal_potion)
    {
        pociones_ataque = atack_potion;
        pociones_defensa = defense_potion;
        pociones_curativas = heal_potion;
        numPociones = atack_potion + defense_potion + heal_potion;
    }
    //Función para crear el inventario
    public static inventario setInventario(int dificil)
    {
        inventario myInventario;
        switch (dificil) {
            case 1:
                myInventario = new inventario(1, 1, 1);
                break ;
            case 2:
                myInventario = new inventario(2, 2, 2);
                break ;
            default:
                myInventario = new inventario(3, 3, 3);
                break;
        }
        return myInventario;
    }
    //Función para cuando abres el cofre
    public static void abrirCofre(jugador player)
    {
        int pociones_curativas;
        int pociones_ataque;
        int pociones_defensa;

        files.printTexto.printSeparador();
        files.printTexto.textoEfectoEscritura(files.printTexto.green + "Enhorabuena!!! Has encontrado un cofre!!!");
        pociones_curativas = files.combate.tirarDado(5);
        files.printTexto.textoEfectoEscritura(files.printTexto.red + "Has encontrado " + pociones_curativas + " curativas!!");
        pociones_ataque = files.combate.tirarDado(5);
        files.printTexto.textoEfectoEscritura(files.printTexto.blue + "Has encontrado " + pociones_ataque + " de ataque!!");
        pociones_defensa = files.combate.tirarDado(5);
        files.printTexto.textoEfectoEscritura(files.printTexto.yellow + "Has encontrado " + pociones_defensa + " de defensa!!");
        actualizaInventario(player.myInventario, pociones_ataque, pociones_defensa, pociones_curativas);
        files.printTexto.printInventario(player.myInventario);
        files.printTexto.printSeparador();

    }
    //Función para actualizar el inventario
    public static void actualizaInventario(inventario myInventario,int atack_potion, int defense_potion, int heal_potion)
    {
        myInventario.pociones_ataque = myInventario.pociones_ataque + atack_potion;
        myInventario.pociones_defensa = myInventario.pociones_defensa+ defense_potion;
        myInventario.pociones_curativas = myInventario.pociones_curativas + heal_potion;
        myInventario.numPociones = myInventario.pociones_curativas + myInventario.pociones_defensa + myInventario.pociones_ataque;
    }
}
