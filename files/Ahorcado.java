package files;
import java.util.Scanner;

public class Ahorcado 
{
    //Función para transformar el el String
    public static String transformarString(String name)
    {
        String aux= "";
        for (int i = 0; i < name.length(); i++)
        {
            if(name.charAt(i) >='a' && name.charAt(i) <= 'z')
            {
                aux+=Character.toUpperCase(name.charAt(i));
            }
            else
            {
                aux += name.charAt(i);
            }
        }
        return aux;
    }
    //Función para transformar el string en un array de String
    public static String[] stringToArray(String texto)
    {
        String[] textoArray = new String[1];

        textoArray[0] = texto;
        return textoArray;
    }
    //Función para imprimir la palabra a adivinar
    public static void imprimirAhorcado(char[] adivinadas)
    {
        for (char letra : adivinadas)
        {
            System.out.print(files.printTexto.green + letra + " ");
        }
        System.out.println(files.printTexto.white + "");
    }
    //Función para jugar al ahorcado
    public static boolean ahorcado(String adivinanza, jugador player) 
    {
        Scanner teclado = new Scanner(System.in);
        adivinanza = transformarString(adivinanza);
        char[] adivinadas = new char[adivinanza.length()];
        for (int x = 0; x < adivinadas.length; x++) 
        {
            adivinadas[x] = '_';
        }
        int intentos = 6;
        boolean juegoTerminado = false;

        while (intentos > 0 && !juegoTerminado) 
        {
            files.printTexto.printSeparador();
            System.out.print("Palabra: ");
            imprimirAhorcado(adivinadas);
            System.out.println(files.printTexto.red +"Intentos restantes: " + intentos);
            files.printTexto.printSeparador();
            System.out.print("Introduce una letra: ");
            char letra = teclado.next().charAt(0);
            if(letra >='a' && letra <= 'z')
            {
                letra = Character.toUpperCase(letra);
            }
            boolean acierto = false;
            
            for (int x = 0; x < adivinanza.length(); x++) 
            {
                if (adivinanza.charAt(x) == letra) 
                {
                    adivinadas[x] = letra;
                    acierto = true;
                }
            }
            if (!acierto) 
            {
                intentos--;
            }
            juegoTerminado = true;
            for (char c : adivinadas) 
            {
                if (c == '_') 
                {
                    juegoTerminado = false;
                    break;
                }
            }
        }
        if (juegoTerminado) 
        {
            files.printTexto.printSeparador();
            System.out.println(files.printTexto.green +"Enhorabuena, has salvado tu vida... por ahora: "+ files.printTexto.white);
            files.printTexto.printSeparador();
            files.combate.resetearStats(player);
            files.combate.subirDeNivel(player);
            files.inventario.abrirCofre(player);
            files.combate.curarteTrasCombate(player, teclado);
            return true;
        } 
        else 
        {
            files.printTexto.printSeparador();
            System.out.println(files.printTexto.red + "Has perdido y has sido ahorcado. La palabra era: " + adivinanza);
            files.printTexto.printSeparador();
            return false;
        }
    }
    //Función para elegir la moneda
    public static int eleccionMoneda(Scanner teclado, int x, int y)
    {
        int eleccion;
        eleccion = 0;
        while (eleccion <= 0 || eleccion >= 13)
        {
            files.printTexto.textoEfectoEscritura(" 1. Blanco \n 2. C \n 3. Paloma \n 4. Negro \n 5. Faisán \n 6. S \n 7. Cuervo \n 8. Rojo \n 9. K \n 10. E \n 11. Amarillo \n 12. Águila \n");
            System.out.println("Cual va en la posición " + x +" "+ y);
            eleccion = files.Main.gestionNumero(teclado);
            if (eleccion <= 0 || eleccion >= 13)
            {
                files.printTexto.textoEfectoEscritura("Número incorrecto!!");
            }
        }
        return eleccion;
    }
    //Función para imprimir las monedas
    public static void printMonedas(String[][] rellenar) 
    {
        for (int i = 0; i < rellenar.length; i++)
        {
            for (int j = 0; j < rellenar[i].length; j++)
            {
                System.out.print(rellenar[i][j] + " ");
            }
            System.out.println();
        }
    }
    //Función del acertijo de monedas
    public static void acertijoMonedas(jugador player)
    {
        String[][] solucion = new String[3][4];
        String[][] rellenar = new String[3][4];
        String[] desordenados = new String[12];
        Scanner teclado;
        int eleccion;
        int intentos = 12;
        int x = 0;
        int y = 0;

        teclado = new Scanner(System.in);
        solucion[0][0] = "Negro";
        solucion[0][1] = "Blanco";
        solucion[0][2] = "Amarillo";
        solucion[0][3] = "Rojo";
        solucion[1][0] = "E";
        solucion[1][1] = "S";
        solucion[1][2] = "K";
        solucion[1][3] = "C";
        solucion[2][0] = "Cuervo";
        solucion[2][1] = "Paloma";
        solucion[2][2] = "Aguila";
        solucion[2][3] = "Faisan";
        desordenados[0] = "Blanco";
        desordenados[1] = "C";
        desordenados[2] = "Paloma";
        desordenados[3] = "Negro";
        desordenados[4] = "Faisan";
        desordenados[5] = "S";
        desordenados[6] = "Cuervo";
        desordenados[7] = "Rojo";
        desordenados[8] = "K";
        desordenados[9] = "E";
        desordenados[10] = "Amarillo";
        desordenados[11] = "Aguila";

        for (int i = 0; i < rellenar.length; i++)
        {
            for (int j = 0; j < rellenar[i].length; j++)
            {
                rellenar[i][j] = "_";
            }
        }
        while (intentos > 0)
        {
            printMonedas(rellenar);
            if (x == 3)
            {
                System.out.println("Ganaste");
                files.combate.resetearStats(player);
                files.combate.subirDeNivel(player);
                files.inventario.abrirCofre(player);
                files.combate.curarteTrasCombate(player, teclado);
                return ;
            }
            eleccion = eleccionMoneda(teclado, x, y);
            if (desordenados[eleccion - 1].equals(solucion[x][y]))
            {
                rellenar[x][y] = desordenados[eleccion - 1];
                y++;
                if (y > 3)
                {
                    y = 0;
                    x++;
                }
            }
            else
            {
                System.out.println("Posicion incorrecta");
                intentos--;
                System.out.println("Te quedan " + intentos + " intentos");
            }
        }
        System.out.println("Vuelves a empezar!!!");
        files.printTexto.printSeparador();
        acertijoMonedas(player);
    }
    //Función para el acertijo de la estatua
    public static void acertijoEstatua(jugador player)
    {
        int intentos;
        Scanner teclado;

        intentos = 2;
        teclado = new Scanner(System.in);
        files.printTexto.textoEfectoEscritura("El extraño pasadizo llega a su fin y te sitúas en una sala completamente vacía con algo cubierto en una gran manta en el centro. Te mata la curiosidad y lo destapas. Es una estatua humanoide a la que le faltan los dientes y las uñas, tiene agujeros en sus dos lóbulos y en la izquierda de su labio inferior y, además, tiene la mano extendida. Los extraños cofres que has conseguido anteriormente ya tienen sentido, pero hay un problema, solo tienes un diente, una uña y un pendiente. No sabes para qué sirve la tela vieja. Llevas buscando media hora los demás elementos del puzzle pero no hay manera, la sala está totalmente vacía.\r\n" + //
                          "\r\n" + //
                          "Desesperado, comienzas a buscar respuestas en los objetos y en las paredes que puedan tener relación con el acertijo. Te tumbas en el suelo a inspeccionar el techo, es alto. Estabas a punto de quedarte dormido, pero entre tus párpados a punto de cerrarse ves algo extraño en el techo. Te levantas y sacas de tu mochila tus prismáticos:…\"Riqueza\"…\"3\"…\"necesidad\"…\"el cuarto\"…\"más afilado\"…\"abajo\"…\"derecha\"…\"2 maneras\"...\"utilidad\"...\"10\"...\"derecha\"…. Apuntas lo leído en tu libreta y te acercas a la estatua. Puede que estés cansado, pero tu mente está más activa que nunca, al fin y al cabo te fascinan los acertijos.");
        while (intentos > 0)
        {
            files.printTexto.textoEfectoEscritura("Lóbulo (1) _              Lóbulo (2) _");
            files.printTexto.textoEfectoEscritura("             Labio (3) _");
            int eleccion;
            eleccion = 0;
            while (eleccion == 0)
            {
                System.out.println("¿En que posición colocas el pendiente? ");
                eleccion = files.Main.gestionNumero(teclado);
                if (eleccion <= 0 || eleccion >= 4)
                {
                    files.printTexto.textoEfectoEscritura("Número incorrecto!!");
                }
            }
            if (eleccion == 3)
            {
                files.printTexto.textoEfectoEscritura("Has puesto el pendiente en el labio, correcto");
                break ;
            }
            else
            {
                intentos--;
                files.printTexto.textoEfectoEscritura("No es la posición correcta. Inténtalo de nuevo.");
                if (intentos == 0)
                {
                    files.printTexto.textoEfectoEscritura("Has perdido!!! Vuelve a intentarlo.");
                    acertijoEstatua(player);
                }
            }
        }
        files.printTexto.textoEfectoEscritura("Comienzas con el pendiente que simboliza la riqueza, cuentas de arriba a abajo. Uno, dos… tres. Pones el pendiente en el agujero del labio.");
        intentos = 3;
        while (intentos > 0)
        {
            files.printTexto.textoEfectoEscritura("1_ 2_");
            files.printTexto.textoEfectoEscritura("3_ 4_");
            int eleccion;
            eleccion = 0;
            while (eleccion == 0)
            {
                System.out.println("¿En que posición colocas el diente? ");
                eleccion = files.Main.gestionNumero(teclado);
                if (eleccion <= 0 || eleccion >= 5)
                {
                    files.printTexto.textoEfectoEscritura("Número incorrecto!!");
                }
            }
            if (eleccion == 1)
            {
                files.printTexto.textoEfectoEscritura("Has puesto el diente arriba a la izquierda, correcto");
                break ;
            }
            else
            {
                intentos--;
                files.printTexto.textoEfectoEscritura("No es la posición correcta. Inténtalo de nuevo.");
                if (intentos == 0)
                {
                    files.printTexto.textoEfectoEscritura("Has perdido!!! Vuelves a empezar.");
                    acertijoEstatua(player);
                }
            }
        }
        files.printTexto.textoEfectoEscritura("Necesidad… te quedan un diente y una uña. Relacionas diente con comer, comer es necesario. El cuarto más afilado, abajo, derecha, 2 maneras. Es un colmillo, sin duda. Cualquiera pensaría que abajo a la derecha es donde debe situarlo, pero este tipo de enigmas no suelen ser tan sencillos, y hay un texto que no debes pasar por alto, \"2 maneras\".\r\n" + //
                        "\r\n" + //
                        "Comienzas a contar desde el cuarto colmillo a la derecha de la boca: 1,2(abajo); 3,4(arriba)… Hay otra forma: 1,3(abajo); 2,4(arriba). Definitivamente debes situarlo en la posición más alta a la izquierda. La tela te estorba y tu mochila está hasta arriba, decides dejarla en la mano de la estatua mientras sigues con el acertijo.");
        intentos = 9;
        while (intentos > 0)
        {
            files.printTexto.textoEfectoEscritura("1_ 2_ 3_ 4_ 5_ 6_ 7_ 8_ 9_ 10_");
            int eleccion;
            eleccion = 0;
            while (eleccion == 0)
            {
                System.out.println("¿En que posición colocas la uña? ");
                eleccion = files.Main.gestionNumero(teclado);
                if (eleccion <= 0 || eleccion >= 11)
                {
                    files.printTexto.textoEfectoEscritura("Número incorrecto!!");
                }
            }
            if (eleccion == 1)
            {
                files.printTexto.textoEfectoEscritura("Has puesto la uña en el meñique de la mano izquierda, correcto.");
                break ;
            }
            else
            {
                intentos--;
                files.printTexto.textoEfectoEscritura("No es la posición correcta. Inténtalo de nuevo.");
                if (intentos == 0)
                {
                    files.printTexto.textoEfectoEscritura("Has perdido!!! Vuelves a empezar");
                    acertijoEstatua(player);
                }
            }
        }
        files.printTexto.textoEfectoEscritura("La uña debe pertenecer a \"utilidad\", ya que una de las partes más útiles de nuestro cuerpo son las manos y la uña que tienes en tu mano no es lo suficientemente grande para pertenecer al pie. Las manos de la estatua suman 10 dedos en total, a eso se refiere el 10. Usando el mismo razonamiento que con los dientes, comienzas a contar desde la derecha y sitúas la uña en el meñique izquierdo.");
        files.printTexto.textoEfectoEscritura("La inmensa pared detrás de la estatua se abre ante ti. Corres hacia la salida pero te vuelves a por la tela que por poco dejas atrás. No llega a pasar un segundo cuando la enorme pared se cierra de golpe en frente tuya. Intentas situar un objeto alternativo a la tela en la mano de la estatua, pero no funciona. Sin embargo, pones la tela de nuevo y… está abierta.");
        files.combate.resetearStats(player);
        files.combate.subirDeNivel(player);
        files.inventario.abrirCofre(player);
        files.combate.curarteTrasCombate(player, teclado);
        
    }
    //Función para el acertijo de los pilares
    public static void acertijoPilares(jugador player)
    {
        int intentos;
        Scanner teclado;
        int i;
        char letra;
        String solucion = "KAUIL";
        char[] resolver = new char[5];

        for (int j = 0; j < 5; j++)
        {
            resolver[j] = '_';
        }
        intentos = 3;
        i = 0;
        teclado = new Scanner(System.in);
        while (intentos > 0)
        {
            files.printTexto.textoEfectoEscritura("I K U L A");
            files.printTexto.textoEfectoEscritura("Ordena las letras.");
            for (int j = 0; j < 5; j++)
            {
                System.out.print(resolver[j]);
            }
            System.out.println("");
            files.printTexto.textoEfectoEscritura("¿Qué letra va en la posición " + (i + 1) + "?");
            letra = teclado.next().charAt(0);
            if(letra >='a' && letra <= 'z')
            {
                letra = Character.toUpperCase(letra);
            }
            if (letra == solucion.charAt(i))
            {
                resolver[i] = letra;
                i++;
            }
            else
            {
                files.printTexto.textoEfectoEscritura("Posición incorrecta");
                intentos--;
                files.printTexto.textoEfectoEscritura("Te quedan " + intentos + " intentos");
            }
            if (i == resolver.length)
            {
                files.printTexto.textoEfectoEscritura("Has ganado!");
                files.combate.resetearStats(player);
                files.combate.subirDeNivel(player);
                files.inventario.abrirCofre(player);
                files.combate.curarteTrasCombate(player, teclado);
                return ;
            }
        }
        files.printTexto.textoEfectoEscritura("Has perdido. Vuelves a empezar");
        acertijoPilares(player);
    }
}
