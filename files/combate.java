package files;
import java.util.Scanner;

public class combate 
{
    //Función para elegir al enemigo correcto
    public static int enemigoCorrecto(enemigo[] enemigos)
    {
        int i;
        boolean enemigoCorrecto;

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
        return (i);
    }
    //Función para comprobar si el enemigo se ha muerto
    public static void checkVida(int vida)
    {
        if (vida <= 0)
        {
            files.printCositas.printSeparador();
            files.printCositas.textoEfectoEscritura(files.printCositas.red+"Enemigo Muerto!!!!!");
            files.printCositas.printSeparador();
        }
    }
    //Función para el jefe final del camino del hereje
    public static void arqueroBoss(int dado, jugador player, bossfinal jefeFinal)
    {
        int dano;

        if (dado >= 18)
        {
            files.printCositas.textoEfectoEscritura("Jefe Final Yax-Balam  ha hecho crítico!!!! Usa su ataque especial. Pega 1 vez extra!!");
            dano = tirarDado(player.myArma.AtaqueEspecial);
            files.printCositas.textoEfectoEscritura(files.printCositas.red +"Ha hecho " + dano+" de daño");
            player.hp = player.hp - dano;
            dano = tirarDado(player.myArma.AtaqueEspecial);
            player.hp = player.hp - dano;
            files.printCositas.textoEfectoEscritura("Ataque extra!!!!");
            dano = tirarDado(player.myArma.AtaqueEspecial);
            files.printCositas.textoEfectoEscritura(files.printCositas.red +"Ha hecho " + dano+" de daño");
            player.hp = player.hp - dano;
        }
        else
        {
            dano = tirarDado(player.myArma.dmg);
            player.hp = player.hp - dano;
            files.printCositas.textoEfectoEscritura(files.printCositas.red +"Ha hecho " + dano+" de daño");
            dano = tirarDado(player.myArma.dmg);
            player.hp = player.hp - dano;
            files.printCositas.textoEfectoEscritura(files.printCositas.red +"Ha hecho " + dano+" de daño");
        }
    }
    //Función para el jefe final del camino de la magia
    public static void magiaBoss(int dado, jugador player, bossfinal jefeFinal)
    {
        int dano;

        if (dado >= 18)
        {
            files.printCositas.textoEfectoEscritura("Jefe Final Yax-Balam Ha hecho critico!!!! Usa su ataque especial y se sube la defensa!!!");
            player.hp = player.hp - player.myArma.AtaqueEspecial;
            jefeFinal.defensa = jefeFinal.defensa + 1;
            files.printCositas.textoEfectoEscritura(files.printCositas.red +"Ha hecho " + player.myArma.AtaqueEspecial+" de daño");
        }
        else
        {
            dano = tirarDado(player.myArma.dmg);
            player.hp = player.hp - dano;
            files.printCositas.textoEfectoEscritura(files.printCositas.yellow +"Ha hecho " + dano+" de daño");
        }
    }
    //Función para el jefe final del camino de la destrucción
    public static void destruccionBoss(int dado, jugador player, bossfinal jefeFinal)
    {
        int dano;

        if (dado >= 15)
        {
            files.printCositas.textoEfectoEscritura(files.printCositas.yellow+"Jefe Final Yax-Balam Ha hecho critico!!!! Usas su ataque especial y se cura!!!");
            player.hp = player.hp - player.myArma.AtaqueEspecial;
            jefeFinal.hp = jefeFinal.hp + 5;
            if (jefeFinal.hp > jefeFinal.hpMax)
            {
                jefeFinal.hp = jefeFinal.hpMax;
            }
            files.printCositas.textoEfectoEscritura(files.printCositas.red +"Ha hecho " +player.myArma.AtaqueEspecial+" de daño");
            files.printCositas.textoEfectoEscritura(files.printCositas.red+"Se ha curado 5 de vida");
            files.printCositas.printJefeFinal(jefeFinal);
        }
        else
        {
            dano = tirarDado(player.myArma.dmg);
            player.hp = player.hp - dano;
            jefeFinal.hp = jefeFinal.hp - 2;
            files.printCositas.textoEfectoEscritura(files.printCositas.yellow +"Ha hecho " + dano+" de daño");
            files.printCositas.textoEfectoEscritura(files.printCositas.red +"se ha hecho 1 de daño de retroceso!!!");

        }
    }
    //Función para analizar analizar si tienes que hacer el ataque especial o no para el arquero
    public static void arqueroLucha(int dado, jugador player, enemigo[] enemigos)
    {
        int i;
        int dano;

        i = enemigoCorrecto(enemigos);
        if (dado >= 18)
        {
            files.printCositas.textoEfectoEscritura("Has hecho critico!!!! Usas tu ataque especial. Pegas 2 veces extra!!");
            dano = tirarDado(player.myArma.AtaqueEspecial);
            enemigos[i].hp = enemigos[i].hp - dano;
            dano = tirarDado(player.myArma.AtaqueEspecial);
            enemigos[i].hp = enemigos[i].hp - dano;
            checkVida(enemigos[i].hp);
            files.printCositas.imprimirEnemigo(enemigos[i]); 
            files.printCositas.textoEfectoEscritura("Ataque extra!!!!");
            i = enemigoCorrecto(enemigos);
            dano = tirarDado(player.myArma.AtaqueEspecial);
            files.printCositas.textoEfectoEscritura(files.printCositas.yellow +"Has hecho " + dano+" de daño");
            enemigos[i].hp = enemigos[i].hp - dano;
            dano = tirarDado(player.myArma.AtaqueEspecial);
            enemigos[i].hp = enemigos[i].hp - dano;
            files.printCositas.textoEfectoEscritura(files.printCositas.yellow +"Has hecho " + dano+" de daño");
            checkVida(enemigos[i].hp);
            files.printCositas.imprimirEnemigo(enemigos[i]); 
        }
        else
        {
            dano = tirarDado(player.myArma.dmg);
            enemigos[i].hp = enemigos[i].hp - dano;
            files.printCositas.textoEfectoEscritura(files.printCositas.yellow +"Has hecho " + dano+" de daño");
            dano = tirarDado(player.myArma.dmg);
            enemigos[i].hp = enemigos[i].hp - dano;
            files.printCositas.textoEfectoEscritura(files.printCositas.yellow +"Has hecho " + dano+" de daño");
            checkVida(enemigos[i].hp);
            files.printCositas.imprimirEnemigo(enemigos[i]); 
        }
    }
    //Función para analizar analizar si tienes que hacer el ataque especial o no para el mago
    public static void magiaLucha(int dado, jugador player, enemigo[] enemigos)
    {
        int i;
        int dano;

        i = enemigoCorrecto(enemigos);
        if (dado >= 18)
        {
            files.printCositas.textoEfectoEscritura("Has hecho critico!!!! Usas tu ataque especial y te subes la defensa!!!");
            enemigos[i].hp = enemigos[i].hp - player.myArma.AtaqueEspecial;
            player.defensaActual = player.defensaActual + 2;
            files.printCositas.textoEfectoEscritura(files.printCositas.yellow +"Has hecho " + player.myArma.AtaqueEspecial+" de daño");
            checkVida(enemigos[i].hp);
            files.printCositas.imprimirEnemigo(enemigos[i]); 
            for (int j = 0; j < enemigos.length; j++)
            {
                enemigos[j].hp = enemigos[j].hp - 4;
            }
            files.printCositas.textoEfectoEscritura(files.printCositas.yellow +"Has hecho 4 de daño en area a todos!!");
        }
        else
        {
            dano = tirarDado(player.myArma.dmg);
            enemigos[i].hp = enemigos[i].hp - dano;
            files.printCositas.textoEfectoEscritura(files.printCositas.yellow +"Has hecho " + dano+" de daño");
            checkVida(enemigos[i].hp);
            files.printCositas.imprimirEnemigo(enemigos[i]); 
            for (int j = 0; j < enemigos.length; j++)
            {
                enemigos[j].hp = enemigos[j].hp - 2;
            }
            files.printCositas.textoEfectoEscritura(files.printCositas.yellow +"Has hecho 2 de daño en area a todos!!");
        }
    }
    //Función para analizar analizar si tienes que hacer el ataque especial o no para el guerrero
    public static void destruccionLucha(int dado, jugador player, enemigo[] enemigos)
    {
        int i;
        int dano;

        i = enemigoCorrecto(enemigos);
        if (dado >= 15)
        {
            files.printCositas.textoEfectoEscritura(files.printCositas.yellow+"Has hecho critico!!!! Usas tu ataque especial y te curas todo el daño!!!");
            enemigos[i].hp = enemigos[i].hp - player.myArma.AtaqueEspecial;
            player.hp = player.hp + player.myArma.AtaqueEspecial;
            files.printCositas.textoEfectoEscritura(files.printCositas.yellow +"Has hecho " +player.myArma.AtaqueEspecial+" de daño");
            if (player.hp > player.maxHp)
            {
                player.hp = player.maxHp;
            }
            checkVida(enemigos[i].hp);
            files.printCositas.imprimirEnemigo(enemigos[i]); 
            files.printCositas.textoEfectoEscritura(files.printCositas.green+"Te has curado "+ player.myArma.AtaqueEspecial);
            files.printCositas.textoEfectoEscritura("Tu vida es "+ player.hp+ "/" + player.maxHp);
            for (int j = 0; j < enemigos.length; j++)
            {
                enemigos[j].hp = enemigos[j].hp - 4;
            }
            files.printCositas.textoEfectoEscritura(files.printCositas.yellow +"Has hecho 4 de daño en area a todos!!");
        }
        else
        {
            dano = tirarDado(player.myArma.dmg);
            enemigos[i].hp = enemigos[i].hp - dano;
            player.hp = player.hp - 2;
            files.printCositas.textoEfectoEscritura(files.printCositas.yellow +"Has hecho " + dano+" de daño");
            checkVida(enemigos[i].hp);
            files.printCositas.imprimirEnemigo(enemigos[i]);
            files.printCositas.textoEfectoEscritura(files.printCositas.red +"Te has hecho 2 de daño de retroceso!!!");
            files.printCositas.textoEfectoEscritura(files.printCositas.green+"Tu vida es "+ player.hp+ "/" + player.maxHp);

        }
    }
    //Función para analizar analizar si tienes que hacer el ataque especial o no para el arquero en la batalla final
    public static void arqueroLuchaFinal(int dado, jugador player, bossfinal jefeFinal)
    {
        int dano;

        if (dado >= 18)
        {
            files.printCositas.textoEfectoEscritura("Has hecho critico!!!! Usas tu ataque especial. Pegas 2 veces extra!!");
            dano = tirarDado(player.myArma.AtaqueEspecial);
            jefeFinal.hp = jefeFinal.hp - dano;
            dano = tirarDado(player.myArma.AtaqueEspecial);
            jefeFinal.hp = jefeFinal.hp - dano;
            files.printCositas.textoEfectoEscritura("Ataque extra!!!!");
            dano = tirarDado(player.myArma.AtaqueEspecial);
            files.printCositas.textoEfectoEscritura(files.printCositas.yellow +"Has hecho " + dano+" de daño");
            jefeFinal.hp = jefeFinal.hp - dano;
            dano = tirarDado(player.myArma.AtaqueEspecial);
            jefeFinal.hp = jefeFinal.hp - dano;
            files.printCositas.textoEfectoEscritura(files.printCositas.yellow +"Has hecho " + dano+" de daño");
            files.printCositas.printJefeFinal(jefeFinal);
        }
        else
        {
            dano = tirarDado(player.myArma.dmg);
            jefeFinal.hp = jefeFinal.hp - dano;
            files.printCositas.textoEfectoEscritura(files.printCositas.yellow +"Has hecho " + dano+" de daño");
            dano = tirarDado(player.myArma.dmg);
            jefeFinal.hp = jefeFinal.hp - dano;
            files.printCositas.textoEfectoEscritura(files.printCositas.yellow +"Has hecho " + dano+" de daño");
            files.printCositas.printJefeFinal(jefeFinal);
        }
    }
    //Función para analizar analizar si tienes que hacer el ataque especial o no para el mago en la batalla final
    public static void magiaLuchaFinal(int dado, jugador player, bossfinal jefeFinal)
    {
        int dano;

        if (dado >= 18)
        {
            files.printCositas.textoEfectoEscritura("Has hecho critico!!!! Usas tu ataque especial y te subes la defensa!!!");
            jefeFinal.hp = jefeFinal.hp- player.myArma.AtaqueEspecial;
            player.defensaActual = player.defensaActual + 2;
            files.printCositas.textoEfectoEscritura(files.printCositas.yellow +"Has hecho " + player.myArma.AtaqueEspecial+" de daño");
            files.printCositas.printJefeFinal(jefeFinal);

        }
        else
        {
            dano = tirarDado(player.myArma.dmg);
            jefeFinal.hp = jefeFinal.hp - dano;
            files.printCositas.textoEfectoEscritura(files.printCositas.yellow +"Has hecho " + dano+" de daño");
            files.printCositas.printJefeFinal(jefeFinal);


        }
    }
    //Función para analizar analizar si tienes que hacer el ataque especial o no para el guerrero en la batalla final
    public static void destruccionLuchaFinal(int dado, jugador player, bossfinal jefeFinal)
    {
        int dano;

        if (dado >= 15)
        {
            files.printCositas.textoEfectoEscritura(files.printCositas.yellow+"Has hecho critico!!!! Usas tu ataque especial y te curas todo el daño!!!");
            jefeFinal.hp = jefeFinal.hp- player.myArma.AtaqueEspecial;
            player.hp = player.hp + player.myArma.AtaqueEspecial;
            files.printCositas.textoEfectoEscritura(files.printCositas.yellow +"Has hecho " +player.myArma.AtaqueEspecial+" de daño");
            if (player.hp > player.maxHp)
            {
                player.hp = player.maxHp;
            }
            files.printCositas.textoEfectoEscritura(files.printCositas.green+"Te has curado "+ player.myArma.AtaqueEspecial);
            files.printCositas.textoEfectoEscritura("Tu vida es "+ player.hp+ "/" + player.maxHp);
            files.printCositas.printJefeFinal(jefeFinal);

        }
        else
        {
            dano = tirarDado(player.myArma.dmg);
            jefeFinal.hp = jefeFinal.hp - dano;
            player.hp = player.hp - 2;
            files.printCositas.textoEfectoEscritura(files.printCositas.yellow +"Has hecho " + dano+" de daño");
            files.printCositas.textoEfectoEscritura(files.printCositas.red +"Te has hecho 2 de daño de retroceso!!!");
            files.printCositas.textoEfectoEscritura(files.printCositas.green+"Tu vida es "+ player.hp+ "/" + player.maxHp);
            files.printCositas.printJefeFinal(jefeFinal);

        }
    }
    //Función para cuando el jugador ataca
    public static void jugadorAtaca(jugador player, enemigo[] enemigos)
    {
        int dado;

        files.printCositas.textoEfectoEscritura("Atacas!!");
        dado = tirarDado(20);
        if (dado >= enemigos[0].defensa)
        {
            files.printCositas.textoEfectoEscritura(files.printCositas.red +"La defensa del enemigo es de " + enemigos[0].defensa);
            files.printCositas.textoEfectoEscritura(files.printCositas.green +"Superaste la defensa!!"+ files.printCositas.white);
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
            files.printCositas.textoEfectoEscritura(files.printCositas.red +"La defensa del enemigo es de " + enemigos[0].defensa + ". Fallaste!!");
        }
    }
    //Función para gestionar tu turno
    public static boolean gestionTurno(jugador player, int eleccion, enemigo[] enemigos)
    {
        boolean tuTurno = false;
        switch (eleccion)
        {
            case 1:
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
                    files.printCositas.textoEfectoEscritura(files.printCositas.red + "No tienes pociones disponibles!!!");
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
    //Función para tirar el dado
    public static int tirarDado(int maximoDado)
    {
        int num;

        num = (int) (Math.random() * maximoDado) + 1;
        files.printCositas.textoEfectoEscritura(files.printCositas.white + "Ha sacado " + num + " de " + maximoDado);
        return (num);
    }
    //Función para gestionar el turno de los enemigos
    public static void turnoEnemigos(enemigo[] enemigos, jugador player)
    {
        int romperDefensa;
        int dano;

        files.printCositas.printSeparador();
        files.printCositas.textoEfectoEscritura(files.printCositas.red +"----------------Turno Enemigo---------------" + files.printCositas.white);
        files.printCositas.printSeparador();
        for (int i = 0; i < enemigos.length; i++)
        {
            if (enemigos[i].hp > 0)
            {
                files.printCositas.printSeparador();
                files.printCositas.textoEfectoEscritura(files.printCositas.red + enemigos[i].nombre +" lanza un dado para intentar romper tu defensa" );
                romperDefensa = tirarDado(20);
                files.printCositas.textoEfectoEscritura(files.printCositas.green +"Tu defensa es de " + player.defensaActual);
                if (player.defensaActual <= romperDefensa)
                {
                    files.printCositas.textoEfectoEscritura(files.printCositas.red +"Han roto tu defensa!");
                    dano = tirarDado(enemigos[i].dmg);
                    player.hp = player.hp - dano;
                    files.printCositas.textoEfectoEscritura(files.printCositas.red +"Te han quitado " + dano+ " de vida!");
                    files.printCositas.textoEfectoEscritura(files.printCositas.green +"Te queda " + player.hp+ "/" + player.maxHp);
                }
                else
                {
                    files.printCositas.textoEfectoEscritura(files.printCositas.green+"Has esquivado el ataque!");
                }
            }
        }
    }
    //Función para comprobar si los enemigos estan vivos
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
    //Función para resetear tus estadísticas
    public static void resetearStats(jugador player)
    {
        player.defensaActual = player.defensa;
        player.myArma.dmgActual = player.myArma.dmg;
    }
    //Función para subir de nivel
    public static void subirDeNivel(jugador player)
    {
        files.printCositas.printSeparador();
        files.printCositas.textoEfectoEscritura("Has subido de nivel! Tu defensa incrementa en 1, tu ataque en 2 y tu vida en 10!!");
        player.defensa = player.defensa + 1;
        player.defensaActual = player.defensa;
        player.maxHp = player.maxHp + 10;
        player.hp = player.hp + 10;
        player.myArma.dmg = player.myArma.dmg + 2;
        player.myArma.dmgActual = player.myArma.dmg;
        files.printCositas.printSeparador();
        files.printCositas.printStats(player);
    }
    //Función para curarte después del combate
    public static void curarteTrasCombate(jugador player, Scanner teclado)
    {
        int eleccion = 0;

        files.printCositas.printSeparador();
        if (player.myInventario.pociones_curativas > 0)
        {
            files.printCositas.printStats(player);
            System.out.println("¿Cuantas pociones quieres usar?");
            System.out.print(files.printCositas.white +"Elegiste la opción: ");
            eleccion = files.Main.gestionPotis(teclado);
            while (eleccion > player.myInventario.pociones_curativas || eleccion == -1)
            {
                files.printCositas.textoEfectoEscritura("La opción es incorrecta!!!");
                System.out.print(files.printCositas.white +"Elegiste la opción: ");
                eleccion = files.Main.gestionPotis(teclado);
            }
        }
        else
        {
            files.printCositas.textoEfectoEscritura("No tienes pociones curativas. No te puedes curar despues del combate!!");
            return ;
        }
        if (eleccion == 0)
        {
            files.printCositas.printSeparador();
            files.printCositas.textoEfectoEscritura(files.printCositas.green + "Decidiste no curarte. Prosigues tu camino.");
            files.printCositas.printSeparador();
        }
        else
        {
            files.printCositas.printSeparador();
            files.printCositas.textoEfectoEscritura(files.printCositas.red + "Decidiste usar " + eleccion + " pociones. Te curas " + (eleccion * 10) + " de vida");
            player.hp = player.hp + (eleccion * 10);
            if (player.hp > player.maxHp)
            {
                player.hp = player.maxHp;
            }
            player.myInventario.pociones_curativas =  player.myInventario.pociones_curativas - eleccion;
            files.printCositas.printSeparador();
            files.printCositas.printStats(player);
            files.printCositas.printInventario(player.myInventario);
        }
    }
    //Función para cuando el jugador ataca contra el jefe final
    public static void jugadorAtacaJefeFinal(jugador player, bossfinal jefeFinal)
    {
        int dado;

        files.printCositas.textoEfectoEscritura("Atacas!!");
        dado = tirarDado(20);
        if (dado >= jefeFinal.defensa)
        {
            files.printCositas.textoEfectoEscritura(files.printCositas.red +"La defensa del enemigo es de " + jefeFinal.defensa);
            files.printCositas.textoEfectoEscritura(files.printCositas.green +"Superaste la defensa!!"+ files.printCositas.white);
            switch (player.myArma.tipo)
            {
                case 1:
                    magiaLuchaFinal(dado, player, jefeFinal);
                    break;
                case 2:
                    destruccionLuchaFinal(dado, player, jefeFinal);                    
                    break ;
                default:
                    arqueroLuchaFinal(dado, player, jefeFinal);
                    break ;
            }
        }
        else
        {
            files.printCositas.textoEfectoEscritura(files.printCositas.red +"La defensa del enemigo es de " + jefeFinal.defensa + ". Fallaste!!");
        }
    }
    //Función para cuando el jefe final ataca
    public static void jefeFinalAtaca(jugador player, bossfinal jefeFinal)
    {
        int dado;

        files.printCositas.textoEfectoEscritura("El Jefe Final Ataca!!");
        dado = tirarDado(20);
        if (dado >= player.defensaActual)
        {
            files.printCositas.textoEfectoEscritura(files.printCositas.green +"Tu defensa  es de " + player.defensaActual);
            files.printCositas.textoEfectoEscritura(files.printCositas.red +"Superó la defensa!!"+ files.printCositas.white);
            switch (player.myArma.tipo)
            {
                case 1:
                    magiaBoss(dado, player, jefeFinal);
                    break;
                case 2:
                    destruccionBoss(dado, player, jefeFinal);                   
                    break ;
                default:
                    arqueroBoss(dado, player, jefeFinal);
                    break ;
            }
        }
        else
        {
            files.printCositas.textoEfectoEscritura(files.printCositas.green +"Tu defensa es de " + player.defensaActual + ". El jefe final falló!!");
        }
    }
    //Función para gestionar tu turno contra el jefe final
    public static boolean gestionTurnoFinal(jugador player, int eleccion, bossfinal jefeFinal)
    {
        boolean tuTurno = false;
        switch (eleccion)
        {
            case 1:
                jugadorAtacaJefeFinal(player, jefeFinal);
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
                    files.printCositas.textoEfectoEscritura(files.printCositas.red + "No tienes pociones disponibles!!!");
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
    //Función para el combate final
    public static boolean combateFinal(jugador player, int dificultad)
    {
        Scanner teclado;
        int eleccion;
        boolean tuTurno;
        boolean enemigosDerrotados = false;
        bossfinal jefeFinal;
        
        teclado = new Scanner(System.in);
        jefeFinal = files.bossfinal.setBossfinal(player.myArma.tipo, dificultad);
        files.printCositas.printSeparador();
        files.printCositas.textoEfectoEscritura(files.printCositas.green+"Bienvenido a la fase de combate!!!!");
        files.printCositas.printSeparador();
        files.printCositas.printJefeFinal(jefeFinal);
        while (player.hp > 0 && !enemigosDerrotados)
        {
            tuTurno = true;
            while (tuTurno)
            {
                files.printCositas.menuCombate();
                System.out.print(files.printCositas.white +"Elegiste la opción: ");
                eleccion = files.Main.gestionNumero(teclado);
                while (eleccion != 1 && eleccion != 2 && eleccion != 3)
                {
                    files.printCositas.textoEfectoEscritura("La opción es incorrecta!!!");
                    files.printCositas.menuCombate();
                    System.out.print(files.printCositas.white +"Elegiste la opción: ");
                    eleccion = files.Main.gestionNumero(teclado);
                }
                tuTurno = gestionTurnoFinal(player, eleccion, jefeFinal);
            }
            if (jefeFinal.hp < 0)
            {
                enemigosDerrotados = true;
            }
            else
            {
                jefeFinalAtaca(player, jefeFinal);
                files.printCositas.printJefeFinal(jefeFinal);

            }
        }
        if (player.hp <= 0)
        {        
            files.printCositas.printSeparador();
            files.printCositas.textoEfectoEscritura(files.printCositas.red+"Has muerto!!!");
            files.printCositas.printSeparador();
            return (false);
        }
        files.printCositas.printSeparador();
        files.printCositas.textoEfectoEscritura(files.printCositas.green + "Has acabado con el enemigo final!!");
        files.printCositas.printSeparador();
        return (true);
    }
    //Función para simular el combate
    public static boolean simularCombate(int numEnemigos, String nombreEnemigo, jugador player)
    {
        Scanner teclado;
        int eleccion;
        boolean tuTurno;
        boolean enemigosDerrotados = false;
        enemigo[] enemigos = files.enemigo.generacionEnemigos(numEnemigos, nombreEnemigo);
        
        teclado = new Scanner(System.in);
        files.printCositas.printSeparador();
        files.printCositas.textoEfectoEscritura(files.printCositas.green+"Bienvenido a la fase de combate!!!!");
        files.printCositas.printSeparador();
        files.printCositas.imprimirEnemigos(enemigos);
        while (player.hp > 0 && !enemigosDerrotados)
        {
            tuTurno = true;
            while (tuTurno)
            {
                files.printCositas.menuCombate();
                System.out.print(files.printCositas.white +"Elegiste la opción: ");
                eleccion = files.Main.gestionNumero(teclado);
                while (eleccion != 1 && eleccion != 2 && eleccion != 3)
                {
                    files.printCositas.textoEfectoEscritura("La opción es incorrecta!!!");
                    files.printCositas.menuCombate();
                    System.out.print(files.printCositas.white +"Elegiste la opción: ");
                    eleccion = files.Main.gestionNumero(teclado);
                }
                tuTurno = gestionTurno(player, eleccion, enemigos);
            }
            enemigosDerrotados = checkEnemigos(enemigos);
            if (!enemigosDerrotados)
            {
                turnoEnemigos(enemigos, player);
                files.printCositas.imprimirEnemigos(enemigos);
            }
        }
        if (player.hp <= 0)
        {
            files.printCositas.textoEfectoEscritura(files.printCositas.red+"Has muerto!!!");
            return (false);
        }
        files.printCositas.textoEfectoEscritura(files.printCositas.green + "Has acabado con todos los enemigos!!");
        resetearStats(player);
        subirDeNivel(player);
        files.inventario.abrirCofre(player);
        curarteTrasCombate(player, teclado);
        return (true);
    }    
}
