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