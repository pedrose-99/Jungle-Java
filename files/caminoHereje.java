package files;
import java.util.Scanner;

public class caminoHereje
{
    
    
    public static void finalHereje(jugador player, int dificultad)
    {

    }
    public static void caminoArco(jugador player , int dificultad)
    {
        int eleccion;
        Scanner teclado;
        teclado = new Scanner(System.in);
        files.printCositas.textoEfectoEscritura("Despiertas en un pozo húmedo y oscuro, apenas iluminado por un tenue resplandor que se filtra desde una grieta en el techo. El aire está cargado de humedad, y un hedor metálico a sangre y moho te invade al respirar. Las paredes de piedra están frías al tacto, y el sonido del agua goteando reverbera, intensificando la sensación de aislamiento.\r\n" + //
                        "\r\n" + //
                        "Frente a ti, una figura encadenada yace en posición agónica. Su carne ha comenzado a descomponerse, dejando al descubierto fragmentos de hueso. Sin embargo, lo más perturbador es la inscripción en la pared: escrita con letras temblorosas y burdas, como si el autor hubiera estado al borde de la muerte. La frase, trazada con sangre seca, reza:");
        files.printCositas.textoEfectoEscritura("Por la noche sube, por la mañana baja. Si de aquí quieres salir, la respiración a media noche deberás aguantar.");
        files.Ahorcado.ahorcado("Secreto");
        files.printCositas.textoEfectoEscritura("Debes decidir si hacer caso al acertijo que reza la piedra ensangrentada, subes junto a la marea por las paredes del pozo y al salir del mismo encontrarás una sala plagada de oro con un carcaj lleno de flechas indígenas, que te aumentarán el daño Sigues el acertijo de la piedra ensangrentada, tomando cada palabra como una clave. Mientras el agua sube, trepas con cuidado por las paredes del pozo, usando las grietas y salientes para impulsarte. El agua helada roza tus piernas, y por un momento sientes que el ascenso será imposible. Sin embargo, un instinto inexplicable te impulsa hacia arriba, hasta que encuentras una abertura en lo alto. Con un esfuerzo final, te impulsas al interior de un corredor de piedra que desemboca en una sala majestuosa.\r\n" + //
                        "\r\n" + //
                        "\r\n" + //
                        "La luz de antorchas dispuestas en las esquinas ilumina el lugar. El suelo está cubierto de monedas de oro, figuras ceremoniales y artefactos de jade. En el centro de la sala, sobre un pedestal de piedra negra, destaca un carcaj lleno de flechas indígenas. Las flechas son largas y están decoradas con plumas rojas y símbolos tallados en la madera, que parecen brillar tenuemente con un aura sobrenatural. Cuando tomas el carcaj, sientes un escalofrío recorrer tu cuerpo, seguido de una ola de energía. Un mensaje se graba en tu mente, como un susurro antiguo: \"La fuerza es tuya, pero no será eterna. Usa cada flecha con sabiduría, pues una será el juicio y otra el sacrificio.\" Tu cuerpo se siente más fuerte y ágil, y un extraño instinto te dice que estas flechas tienen el poder de dañar incluso a los enemigos más invulnerables. Sin embargo, también percibes un peligro latente en la sala. El oro bajo tus pies parece formar ondas, como si algo estuviera vivo bajo la superficie.\r\n" + //
                        "\r\n" + //
                        "");
        eleccion = files.Main.elegir("CORRER HACIA LA SALIDA DE LA CAMARA", "Explorar", teclado);
        // Correr salida
        if (eleccion == 1)
        {
            files.printCositas.textoEfectoEscritura("Al ver cómo el oro bajo tus pies comienza a ondular como si estuviera vivo, decides no arriesgarte. Con el carcaj bien asegurado a tu espalda, corres hacia la puerta de piedra que acaba de abrirse al otro extremo de la sala. Sin embargo, cuando apenas das unos pasos, el oro comienza a reunirse en un solo punto, derritiéndose y moldeándose como si tuviera voluntad propia. Frente a tus ojos, una criatura monstruosa toma forma: un ser humanoide gigantesco compuesto enteramente de monedas fundidas. Su cuerpo brilla con un resplandor dorado, y su rostro carece de ojos, salvo por dos cuencas vacías de las que emana un humo oscuro. Cada paso que da hace temblar la sala, y un sonido metálico, como el eco de miles de monedas cayendo, llena el aire.\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Decides no enfrentar a la criatura y corres hacia la puerta abierta, dejando atrás el rugido metálico y los ecos de monedas cayendo. Con cada paso, sientes cómo la criatura te persigue, pero logras cruzar el umbral justo a tiempo. Al pasar por la puerta, esta se cierra automáticamente detrás de ti con un estruendo ensordecedor, dejando a la criatura atrapada al otro lado.Respiras aliviado, pero tu victoria es breve. La sala en la que ahora te encuentras tiene una atmósfera extrañamente opresiva, iluminada únicamente por antorchas que parecen encenderse solas al entrar. En el centro de la sala, un altar de piedra desgastado descansa bajo una luz tenue que cae desde una abertura en el techo. Sobre el altar, un extraño artefacto en forma de corazón de obsidiana emite un brillo pulsante, como si estuviera vivo.");
            files.printCositas.textoEfectoEscritura("Al acercarte, notas inscripciones en las paredes que parecen advertencias: \"Quien tome el corazón del jaguar enfrentará su furia eterna. El poder no es para los vivos.\" Pero antes de que puedas retroceder, el suelo bajo tus pies comienza a temblar. Las paredes se desplazan, revelando filas de lanzas y cuchillas ocultas, que lentamente comienzan a acercarse. De repente, el corazón de obsidiana comienza a latir más fuerte. Un zumbido inunda tus oídos, y notas que el objeto parece atraer tu atención de manera hipnótica. Una voz etérea susurra en tu mente: \"Tómalo, y enfrentarás el desafío. Si no lo haces, serás devorado por esta sala.\" Pero sin darte cuenta pisas una losa que dispara un dardo con veneno mortal y caes al suelo muriendo agonizantemente\r\n");
            return ;
        }
        //explorar
        else
        {
            files.printCositas.textoEfectoEscritura("Decides observar con detenimiento las paredes de la cámara. Están cubiertas de glifos mayas que cuentan la historia de un antiguo ritual: un guerrero fue enviado a un pozo sagrado para enfrentar pruebas de vida y muerte. Solo aquellos que demuestren fuerza y sabiduría pueden acceder al \"Camino del Cielo\", un sendero que promete llevar a un poder más allá de lo humano. Sin embargo, una advertencia destaca entre los grabados: \"No toques lo que no es tuyo, o el oro será tu perdición.\" En ese momento, un sonido profundo y reverberante llena la sala. El pedestal donde estaba el carcaj comienza a hundirse lentamente en el suelo, mientras una puerta de piedra se abre al otro extremo de la cámara.\r\n" + //
                                "\r\n" + //
                                "Las monedas se mueven como si una fuerza invisible las empujara hacia una esquina de la sala, donde forman un pequeño montón y entre ellas empiezan a apilarse. De repente, ese montón se transforma. El oro se funde, dando paso a una figura extraña hecha de oro maya. Una voz surge de su interior y dice: “Has adquirido el carcaj. Ahora demuestra si eres digno de él”. Tu corazón se acelera.\r\n" + //
                                "");

            files.combate.simularCombate(1*dificultad, "Guarlock", player);
        }
    }   
}
