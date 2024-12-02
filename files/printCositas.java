package files;

import java.util.Scanner;

public class printCositas 
{
    static String black="\033[30m"; 
    static String red="\033[31m"; //enemigos
    static String green="\033[32m"; //Elecciones de camino
    static String yellow="\033[33m"; //Texto
    static String blue="\033[34m"; //Tu turno
    static String purple="\033[35m"; //Acertijos
    static String cyan="\033[36m"; 
    static String white="\033[37m";
    static String gris="\033[0;90m";
    
    static void printSeparador()
    {
        System.out.println(white + "------------------------------------------" + white);
    }
    static void packTexto(String[] texto)
    {
        Scanner teclado = new Scanner(System.in);
        for(String linea : texto){
            teclado.nextLine();
            textoEfectoEscritura(linea);
        }
        teclado.close();
    }

    public static void textoEfectoEscritura(String linea){
        for (char caracter : linea.toCharArray()){
            System.out.print(caracter);
            try {
                Thread.sleep(0);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        System.out.println();
    }

    public static void menuCombate()
    {
        printSeparador();
        textoEfectoEscritura(green +"----------------Es tu turno---------------" + white);
        printSeparador();
        textoEfectoEscritura("¿Que quieres hacer?");
        textoEfectoEscritura(white + "1. " +blue +" Tirar dado y atacar");
        textoEfectoEscritura(white + "2. " +cyan +" Usar poción de ayuda");
        textoEfectoEscritura(white + "3. " + purple +" Mirar tus estadisticas y tu inventario" + yellow);
    }

    public static void bienvenida()
    {
        printSeparador();
        printSeparador();
        textoEfectoEscritura(green+"Bienvenido al templo");
        printSeparador();
    }
    
    public static void printElegirCamino()
    {
        printSeparador();
        textoEfectoEscritura("Que camino eliges:");
        textoEfectoEscritura("1."+ red +" Camino de la magia");
        textoEfectoEscritura(white +"2."+ blue+ " Camino de la destrucción");
        textoEfectoEscritura(white + "3." +purple+" Camino de la arqueria"+ white);
    }

    public static void imprimirEstadisticas(arma myArma)
    {
        printSeparador();
        switch (myArma.tipo) {
            case 1:
                textoEfectoEscritura(red +"------------------Mago--------------------");
                break;
            case 2:
                textoEfectoEscritura(blue +"-----------------Guerrero------------------");
                break;
            default:
                textoEfectoEscritura(purple +"-----------------Arquero------------------");
                break;
        }
        printSeparador();

    }

    public static void imprimirEnemigos(enemigo[] enemigos)
    {
        for (int i = 0; i < enemigos.length; i++)
        {
            if (enemigos[i].hp > 0)
            {
                files.printCositas.imprimirEnemigo(enemigos[i]);
            }
        }
    }

    public static void imprimirEnemigo(enemigo myEnemy)
    {
        printSeparador();
        textoEfectoEscritura(red+ "Enemigo "+ myEnemy.nombre);
        printSeparador();
        textoEfectoEscritura(red +"Tiene " + myEnemy.hp + " de vida.");
        textoEfectoEscritura(yellow + "Tiene " + myEnemy.defensa + " de defensa.");
        textoEfectoEscritura(blue +"Tiene " + myEnemy.dmg + " de ataque.");
        printSeparador();
    }


    public static void printStats(jugador player)
    {
        printSeparador();
        textoEfectoEscritura(green +"-------Aquí estan tus estadisticas--------");
        printSeparador();
        System.out.printf(red + "Tienes %d/%d %n", player.hp, player.maxHp);
        System.out.printf(yellow + "Tienes %d de defensa %n", player.defensaActual);
        System.out.printf(blue +"Tienes %d de ataque %n", player.myArma.dmgActual);
        printSeparador();
    }

    public static void elegirPoti(inventario myInventario)
    {
        printSeparador();
        textoEfectoEscritura("1."+blue + " Poción de ataque. Ganas 3 de ataque");
        textoEfectoEscritura(white+"2."+ yellow+ " Poción de defensa. Ganas 2 de defensa");
        textoEfectoEscritura(white + "3."+ red+" Pocion de vida. Te curas 10 de hp");
        printSeparador();

    }

    public static void printInventario(inventario myInventario)
    {
        printSeparador();
        textoEfectoEscritura(green + "---------Aquí esta tu inventario----------");
        printSeparador();
        textoEfectoEscritura(blue + "Tienes " +myInventario.pociones_ataque + blue +" pociones de ataque");
        textoEfectoEscritura(yellow +"Tienes "+  myInventario.pociones_defensa + yellow + " pociones defensivas ");
        textoEfectoEscritura(red +"Tienes "+myInventario.pociones_curativas+ red+" pociones curativas");
        printSeparador();
    }

    //Yax-Balam armas: anillo de las bestias, baston de las fieras y arco del juaguar
    public static void printJefeFinal(bossfinal jefeFinal)
    {
        printSeparador();
        textoEfectoEscritura(red+ "Jefe Final Yax-Balam ");
        printSeparador();
        textoEfectoEscritura(red +"Tiene " + jefeFinal.hp + " de vida.");
        textoEfectoEscritura(yellow + "Tiene " + jefeFinal.defensa + " de defensa.");
        textoEfectoEscritura(blue +"Tiene " + jefeFinal.myArma.dmg + " de ataque.");
        printSeparador();
    }
}
