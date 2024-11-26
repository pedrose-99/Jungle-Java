package files;
import java.util.Scanner;

public class Ahorcado 
{
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
    public static void ahorcado(String adivinanza) 
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
            System.out.println("Palabra: " + String.valueOf(adivinadas));
            System.out.println("Intentos restantes: " + intentos);
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
            System.out.println("Enhorabuena, has salvado tu vida... por ahora: " + adivinanza);
        } 
        else 
        {
            System.out.println("Has perdido y has sido ahorcado. La palabra era: " + adivinanza);
        }
    }
    public static int eleccionMoneda(Scanner teclado, int x, int y)
    {
        int eleccion;
        eleccion = 0;
        while (eleccion <= 0 || eleccion >= 13)
        {
            files.printCositas.textoEfectoEscritura("1. Blanco \n 2. C \n 3. Paloma \n 4. Negro \n 5. Paisan \n 6. S \n 7. Cuervo \n 8. Rojo \n 9. R \n 10. E \n 11. Amarillo \n 12. Aguila \n");
            System.out.println("Cual va en la posicion " + x + y);
            eleccion = files.Main.gestionNumero(teclado);
            if (eleccion <= 0 || eleccion >= 13)
            {
                files.printCositas.textoEfectoEscritura("Numero incorrecto!!");
            }
        }
        return eleccion;
    }
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
    public static void acertijoMonedas()
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
            }
        }
        
    }
}


/*
 * Ahorcado silvia:
 * tienes una lista de palabras deshordenadas:
 * 1. Blanco
 * 2. c
 * 3. Paloma
 * 4. Negro
 * 5. S
 * 6. Cuervo
 * 7. Paisan
 * 8. Rojo
 * 9. R
 * 10. Amarillo
 * 11 E
 * 12 Anguila
 * 
 * solucion:
 * Negro blanco amarillo rojo
 * e s k c
 * cuervo paloma aguila faisan
 * 
 * No mueres, te manda el resultado;
 * 
 * Tienes que escribir los numeros en una matriz.
 * _ _ _ _
 * _ _ _ _
 * _ _ _ _
 * Se rellena
 * negro _ _ _ 
 * _ _ _ _
 * _ _ _ _
 */