package files;
import java.util.Scanner;

public class caminoMagia
{
    public static void caminoMago(jugador player, int dificultad)
    {
        int eleccion;
        Scanner teclado;
        
        teclado = new Scanner(System.in);
        files.printCositas.textoEfectoEscritura(" Apareces en una mazmorra en la jungla, no ves nada pero consigues encender un mechero que llevabas encima. Al mirar detenidamente ves sobre un pedestal una varita, al tocarla empiezas a notar una extraña sensación, aún así decides guardarla.\r\n" + //
                        "\r\n" + //
                        "Crees que te has vuelto loco ya que ves dos túneles idénticos, piensas que uno de ellos puede ser tu salida para poder proseguir con la búsqueda de la reliquia perdida de Yax-Balam, pero antes de poder tomar una decisión aparece un babuino y nos indica que debemos tomar uno de los caminos o nos enfrentaremos a una muerte segura.");
        eleccion = 0;
        while (eleccion != 1 && eleccion != 2)
        {
            files.printCositas.printSeparador();
            files.printCositas.textoEfectoEscritura("¿Que camino eliges?");
            files.printCositas.textoEfectoEscritura("1- Camino izquierda");
            files.printCositas.textoEfectoEscritura("2- Camino derecha");
            System.out.print("Elegiste el camino: ");
            eleccion = files.Main.gestionNumero(teclado);
            files.printCositas.printSeparador();
            if (eleccion != 1 && eleccion != 2)
            {
                files.printCositas.textoEfectoEscritura("Ese camino no existe.");
            }
        }
    
        }
}