package files;
import java.util.Scanner;

public class combate 
{
    public static void arqueroLucha(int dado, jugador player, enemigo[] enemigos)
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
        if (dado >= 18)
        {
            files.printCositas.textoEfectoEscritura("Has hecho critico!!!! Usas tu ataque especial. Pegas 2 veces extra!!");
            dano = tirarDado(player.myArma.AtaqueEspecial);
            enemigos[i].hp = enemigos[i].hp - dano;
            dano = tirarDado(player.myArma.AtaqueEspecial);
            enemigos[i].hp = enemigos[i].hp - dano;
            files.printCositas.textoEfectoEscritura("Ataque extra!!!!");
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
            dano = tirarDado(player.myArma.AtaqueEspecial);
            enemigos[i].hp = enemigos[i].hp - dano;
            dano = tirarDado(player.myArma.AtaqueEspecial);
            enemigos[i].hp = enemigos[i].hp - dano;
        }
        else
        {
            dano = tirarDado(player.myArma.dmg);
            enemigos[i].hp = enemigos[i].hp - dano;
            dano = tirarDado(player.myArma.dmg);
            enemigos[i].hp = enemigos[i].hp - dano;
        }
    }

    public static void magiaLucha(int dado, jugador player, enemigo[] enemigos)
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
        if (dado >= 18)
        {
            files.printCositas.textoEfectoEscritura("Has hecho critico!!!! Usas tu ataque especial y te subes la defensa!!!");
            enemigos[i].hp = enemigos[i].hp - player.myArma.AtaqueEspecial;
            player.defensaActual = player.defensaActual + 2;
            for (int j = 0; j < enemigos.length; j++)
            {
                enemigos[j].hp = enemigos[j].hp - 4;
            }
            files.printCositas.textoEfectoEscritura("Has hecho 4 de daño en area a todos!!");
        }
        else
        {
            dano = tirarDado(player.myArma.dmg);
            enemigos[i].hp = enemigos[i].hp - dano;
            for (int j = 0; j < enemigos.length; j++)
            {
                enemigos[j].hp = enemigos[j].hp - 2;
            }
            files.printCositas.textoEfectoEscritura("Has hecho 2 de daño en area a todos!!");
        }
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
        if (dado >= 18)
        {
            files.printCositas.textoEfectoEscritura("Has hecho critico!!!! Usas tu ataque especial y te curas todo el daño!!!");
            enemigos[i].hp = enemigos[i].hp - player.myArma.AtaqueEspecial;
            player.hp = player.hp + player.myArma.AtaqueEspecial;
            if (player.hp > player.maxHp)
            {
                player.hp = player.maxHp;
            }
            files.printCositas.textoEfectoEscritura("Te has curado "+ player.myArma.AtaqueEspecial);
        }
        else
        {
            dano = tirarDado(player.myArma.dmg);
            enemigos[i].hp = enemigos[i].hp - dano;
            player.hp = player.hp - 2;
            files.printCositas.textoEfectoEscritura("Te has hecho 2 de daño de retroceso!!!");
        }
    }
    public static void jugadorAtaca(jugador player, enemigo[] enemigos)
    {
        int dado;

        files.printCositas.textoEfectoEscritura("Atacas!!");
        dado = tirarDado(20);
        if (dado >= enemigos[0].defensa)
        {
            switch (player.myArma.tipo)
            {
                case 1:
                    magiaLucha(dado, player, enemigos);
                    break;
                case 2:
                    destruccionLucha(dado, player, enemigos);
                    break ;
                default:
                    arqueroLucha(dado, player, enemigos);
                    break ;
            }
        }
        else
        {
            files.printCositas.textoEfectoEscritura("La defensa del enemigo es de " + enemigos[0].defensa + ". Fallaste!!");
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
                    files.printCositas.printStats(player);
                }
                else
                {
                    files.printCositas.printSeparador();
                    files.printCositas.textoEfectoEscritura("No tienes pociones disponibles!!!");
                    files.printCositas.printSeparador();
                }
                break ;
            default:
                files.printCositas.printStats(player);
                files.printCositas.printInventario(player.myInventario);
                tuTurno = true;
                break ;
        }
        return tuTurno;
    }

    public static int tirarDado(int maximoDado)
    {
        int num;

        num = (int) (Math.random() * maximoDado) + 1;
        files.printCositas.textoEfectoEscritura("Ha sacado " + num + " de " + maximoDado);
        return (num);
    }

    public static void turnoEnemigos(enemigo[] enemigos, jugador player)
    {
        int romperDefensa;
        int dano;

        files.printCositas.printSeparador();
        files.printCositas.textoEfectoEscritura("Turno Enemigo, te pegan " + enemigos.length+ " enemigos de nombre " + enemigos[0].nombre);
        for (int i = 0; i < enemigos.length; i++)
        {
            if (enemigos[i].hp > 0)
            {
                files.printCositas.printSeparador();
                files.printCositas.textoEfectoEscritura("Tu enemigo lanza un dado para intentar romper tu defensa" );
                romperDefensa = tirarDado(20);
                files.printCositas.textoEfectoEscritura("Tu defensa es de: " + player.defensaActual);
                if (player.defensaActual <= romperDefensa)
                {
                    files.printCositas.textoEfectoEscritura("Han roto tu defensa!");
                    dano = tirarDado(enemigos[i].dmg);
                    player.hp = player.hp - dano;
                }
                else
                {
                    files.printCositas.textoEfectoEscritura("Has esquivado el ataque!");
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
        files.printCositas.printSeparador();
        files.printCositas.textoEfectoEscritura("Bienvenido a la fase de combate!!!!");
        while (player.hp > 0 && !enemigosDerrotados)
        {
            tuTurno = true;
            while (tuTurno)
            {
                files.printCositas.menuCombate();
                System.out.print(files.printCositas.blue);
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
                files.printCositas.imprimirEnemigo(enemigos[i]);
            }
        }
        if (player.hp <= 0)
        {
            files.printCositas.textoEfectoEscritura("Has muerto!!!");
            return (true);
        }
        files.printCositas.textoEfectoEscritura("Has acabado con todos los enemigos!!");
        return (false);
    }    
}
