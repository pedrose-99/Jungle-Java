package files;
import java.time.format.FormatStyle;
import java.util.Random;
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

    public static void destruccionLucha(int dado, jugador player, enemigo[] enemigos)
    {
        int i;
        boolean enemigoCorrecto;
        int dano;

        i = 0;
        enemigoCorrecto = false;
        while (!enemigoCorrecto)
        {
            if (enemigos[i].hp > 0)
            {
                enemigoCorrecto = true;
            }
            else
            {
                i++;
            }
        }
        if (dado >= 8)
        {
            System.out.println("Has hecho critico!!!! Usas tu ataque especial");
            enemigos[i].hp = enemigos[i].hp - player.myArma.AtaqueEspecial;
            player.hp = player.hp + player.myArma.AtaqueEspecial;
            if (player.hp > player.maxHp)
            {
                player.hp = player.maxHp;
            }
        }
        else
        {
            dano = tirarDado(player.myArma.dmg);
            enemigos[i].hp = enemigos[i].hp - dano;
            player.hp = player.hp - 2;
        }
    }
    public static void jugadorAtaca(jugador player, enemigo[] enemigos)
    {
        int dado;
        int i;
        boolean enemigoCorrecto;
        int dano;

        i = 0;
        enemigoCorrecto = false;
        System.out.println("Atacas!!");
        dado = tirarDado(20);
        if (dado >= enemigos[0].defensa)
        {
            switch (player.myArma.tipo)
            {
                case 1:
                    break;
                case 2:
                    destruccionLucha(dado, player, enemigos);
                    break ;
                default:
                    break ;
            }
        }
        else
        {
            System.out.println("La defensa del enemigo es de " + enemigos[0].defensa + ". Fallaste!!");
        }
    }

    public static boolean gestionTurno(jugador player, int eleccion, enemigo[] enemigos)
    {
        boolean tuTurno = false;
        switch (eleccion)
        {
            case 1:
                //atacar
                jugadorAtaca(player, enemigos);
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
                tuTurno = true;
                break ;
        }
        return tuTurno;
    }

    public static int tirarDado(int maximoDado)
    {
        int num;

        num = (int) (Math.random() * maximoDado) + 1;
        System.out.println("Ha sacado " + num + " de " + maximoDado);
        return (num);
    }

    public static void turnoEnemigos(enemigo[] enemigos, jugador player)
    {
        int romperDefensa;
        int dano;

        System.out.println("------------------------------------------");
        System.out.println("Turno Enemigo, te pegan " + enemigos.length+ " enemigos de nombre " + enemigos[0].nombre);
        for (int i = 0; i < enemigos.length; i++)
        {
            if (enemigos[i].hp > 0)
            {
                System.out.println("------------------------------------------");
                System.out.println("Tu enemigo lanza un dado para intentar romper tu defensa" );
                romperDefensa = tirarDado(20);
                System.out.println("Tu defensa es de: " + player.defensaActual);
                if (player.defensaActual <= romperDefensa)
                {
                    System.out.println("Han roto tu defensa!");
                    dano = tirarDado(enemigos[i].dmg);
                    player.hp = player.hp - dano;
                }
                else
                {
                    System.out.println("Has esquivado el ataque!");
                }
            }
        }
    }

    public static boolean checkEnemigos(enemigo[] enemigos)
    {
        int enemigosMuertos;

        enemigosMuertos = 0;
        for (int i = 0; i < enemigos.length; i++)
        {
            if (enemigos[i].hp <= 0)
            {
                enemigosMuertos++;
            }
        }
        if (enemigosMuertos == enemigos.length)
        {
            return true;
        }
        return false;
    }

    public static boolean simularCombate(int numEnemigos, String nombreEnemigo, jugador player)
    {
        Scanner teclado;
        int eleccion;
        boolean tuTurno;
        boolean enemigosDerrotados = false;
        enemigo[] enemigos = files.enemigo.generacionEnemigos(numEnemigos, nombreEnemigo);
        
        teclado = new Scanner(System.in);
        System.out.println("------------------------------------------");
        System.out.println("Bienvenido a la fase de combate!!!!");
        while (player.hp > 0 && !enemigosDerrotados)
        {
            tuTurno = true;
            while (tuTurno)
            {
                menuCombate();
                eleccion = files.Main.gestionNumero(teclado);
                while (eleccion != 1 && eleccion != 2 && eleccion != 3)
                {
                    eleccion = files.Main.gestionNumero(teclado);
                }
                tuTurno = gestionTurno(player, eleccion, enemigos);
            }
            turnoEnemigos(enemigos, player);
            enemigosDerrotados = checkEnemigos(enemigos);
            for (int i = 0; i < enemigos.length; i++)
            {
                files.enemigo.imprimirEnemigo(enemigos[i]);
            }
        }
        if (player.hp > 0)
        {
            System.out.println("Has muerto!!!");
            return (true);
        }
        System.out.println("Has acabado con todos los enemigos!!");
        return (false);
    }    
}
