package files;
import java.util.Scanner;

public class inventario 
{
    int pociones_curativas;
    int pociones_ataque;
    int pociones_defensa;
    int numPociones;


    public static int switchPotis(jugador player, int eleccion)
    {
        switch (eleccion) {
            case 1:
                if (player.myInventario.pociones_ataque <= 0)
                {
                    files.printCositas.textoEfectoEscritura("No tienes esa poción. Elige otra.");
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
                    files.printCositas.textoEfectoEscritura("No tienes esa poción. Elige otra.");
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
                    files.printCositas.textoEfectoEscritura("No tienes esa poción. Elige otra.");
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
    public static void gestionPociones(jugador player)
    {
        int eleccion;
        Scanner teclado;

        eleccion = 0;
        teclado = new Scanner(System.in);
        files.printCositas.printInventario(player.myInventario);
        while (eleccion != 1 && eleccion != 2 && eleccion != 3)
        {
            files.printCositas.textoEfectoEscritura("Que poción quieres usar??");
            files.printCositas.elegirPoti(player.myInventario);
            eleccion = files.Main.gestionNumero(teclado);
            eleccion = switchPotis(player, eleccion);
        }
    }

    public inventario(int atack_potion, int defense_potion, int heal_potion)
    {
        pociones_ataque = atack_potion;
        pociones_defensa = defense_potion;
        pociones_curativas = heal_potion;
        numPociones = atack_potion + defense_potion + heal_potion;
    }

    public static void actualizaInventario(inventario myInventario,int atack_potion, int defense_potion, int heal_potion)
    {
        myInventario.pociones_ataque = myInventario.pociones_ataque + atack_potion;
        myInventario.pociones_defensa = myInventario.pociones_defensa+ defense_potion;
        myInventario.pociones_curativas = myInventario.pociones_curativas + heal_potion;
        myInventario.numPociones = myInventario.pociones_curativas + myInventario.pociones_defensa + myInventario.pociones_ataque;
    }

}
