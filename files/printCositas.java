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
            files.printCositas.textoEfectoEscritura(linea);
        }
        teclado.close();
    }

    public static void textoEfectoEscritura(String linea){
        for (char caracter : linea.toCharArray()){
            System.out.print(caracter);
            try {
                Thread.sleep(15);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        System.out.println();
    }

    public static void menuCombate()
    {
        files.printCositas.textoEfectoEscritura(green +"----------------Es tu turno---------------" + files.printCositas.blue);
        files.printCositas.textoEfectoEscritura("Que quieres hacer?");
        files.printCositas.textoEfectoEscritura("1. Tirar dado y atacar");
        files.printCositas.textoEfectoEscritura("2. Usar poción de ayuda");
        files.printCositas.textoEfectoEscritura("3. Mirar tus estadisticas y tu inventario" + yellow);
    }

    public static void bienvenida()
    {
        printSeparador();
        files.printCositas.textoEfectoEscritura("Bienvenido al templo");
        printSeparador();
    }
    
    public static void printElegirCamino()
    {
        printSeparador();
        files.printCositas.textoEfectoEscritura("Que camino eliges:");
        files.printCositas.textoEfectoEscritura("1. Camino de la magia");
        files.printCositas.textoEfectoEscritura("2. Camino de la destrucción");
        files.printCositas.textoEfectoEscritura("3. Camino de la arqueria");
    }

    public static void imprimirEstadisticas(arma myArma)
    {
        switch (myArma.tipo) {
            case 1:
                printSeparador();
                files.printCositas.textoEfectoEscritura("------------------Mago--------------------");
                break;
            case 2:
                printSeparador();
                files.printCositas.textoEfectoEscritura("-----------------Guerrero------------------");
                break;
            default:
                printSeparador();
                files.printCositas.textoEfectoEscritura("-----------------Arquero------------------");
                break;
        }
        files.printCositas.textoEfectoEscritura("- Daño base: " + myArma.dmg);
        files.printCositas.textoEfectoEscritura("- Ataque especial: "+ myArma.AtaqueEspecial);
        printSeparador();
    }

    public static void imprimirEnemigo(enemigo myEnemy)
    {
        printSeparador();
        files.printCositas.textoEfectoEscritura("Enemigo "+ myEnemy.nombre+" ha aparecido.");
        files.printCositas.textoEfectoEscritura("Tiene " + myEnemy.hp + " de vida.");
        files.printCositas.textoEfectoEscritura("Tiene " + myEnemy.defensa + " de defensa.");
        printSeparador();
    }

    public static void printStats(jugador player)
    {
        printSeparador();
        files.printCositas.textoEfectoEscritura("-------Aquí estan tus estadisticas--------");
        System.out.printf("Tienes %d/%d %n", player.hp, player.maxHp);
        System.out.printf("Tienes %d de defensa %n", player.defensaActual);
        System.out.printf("Tienes %d de ataque %n", player.myArma.dmgActual);
        printSeparador();
    }

    public static void elegirPoti(inventario myInventario)
    {
        printSeparador();
        files.printCositas.textoEfectoEscritura("Que poción quieres usar??");
        files.printCositas.textoEfectoEscritura("1. Poción de ataque. Ganas 3 de ataque");
        files.printCositas.textoEfectoEscritura("2. Poción de defensa. Ganas 2 de defensa");
        files.printCositas.textoEfectoEscritura("3- Pocion de vida. Te curas 10 de hp");
        printSeparador();

    }

    public static void printInventario(inventario myInventario)
    {
        printSeparador();
        files.printCositas.textoEfectoEscritura(cyan + "---------Aquí esta tu inventario----------");
        System.out.printf("Tienes %d pociones curativas %n", myInventario.pociones_curativas);
        System.out.printf("Tienes %d pociones de ataque %n", myInventario.pociones_ataque);
        System.out.printf("Tienes %d pociones defensivas %n", myInventario.pociones_defensa);
        printSeparador();
    }
}
