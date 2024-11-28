package files;
import java.util.Scanner;

public class caminoHereje
{   
    public static void finalHereje(jugador player, int dificultad)
    {
        files.printCositas.textoEfectoEscritura("Te encuentras ante el mayor templo subterráneo que has visto en tus cientos de exploraciones, pero hay algo raro en el ambiente, sientes que te cuesta respirar y empiezas a oír voces, no hay nadie más en la mazmorra. Ante ti se erige una estatua oxidada y llena de enredaderas, a los pies de la estatua lees un texto que reza, “aquí yacen los restos del primer rey de los mayas Yax-Balam” seguido de un acertijo Cuatro paredes y un altar,\n" + //
                        "la vida o la muerte te pueden dar.\n" + //
                        "Tres símbolos debes hallar,\n" + //
                        "y en el orden correcto colocar.\n" + //
                        "Busca en la luz, la sombra y el suelo,\n" + //
                        "y haz tu elección para romper el duelo.");
        files.Ahorcado.ahorcado("enigma", player);
        files.printCositas.textoEfectoEscritura("Sabes perfectamente la respuesta y sin pensártelo la dices en alto… Enigma. Todo empieza a temblar y a llenarse de una niebla densa que no te deja ver, para tu sorpresa la vieja estatua se ha volatilizado y ante ti se alza el fantasma del rey Yax-Balam, se abalanza contra ti portando su mítica vestimenta de guerra, consigue alcanzarte con su lanza pero te revuelves y consigues zafarte, el rey manda a sus esbirros que han salido de la nada a atacarte, luchas contra ellos y tras una ardua batalla consigues eliminarlos y enfrentarte cara a cara con el gran rey maya.") ;
        files.combate.combateFinal(player, dificultad);
        files.printCositas.textoEfectoEscritura("Tras la batalla consigues hacer caer a Yax-Balam, tu arma está quebrada y la única salida que tienes es portar el sagrado arco del jaguar y lanzar una flecha que le haga descansar en paz. Coges el arco y , notas como poco a poco se va cargando de una energía azul y brillante, lanzas una flecha se ve claramente que es un disparo certero hiriendo de gravedad a Yax-Balam. Recoges la reliquia y ante ti se abren unas escaleras que te llevan a la superficie. Te ves en la jungla sin nada a tu alrededor, solo ves árboles, un río y monos. Decides seguir el río y encuentras un poblado en el que te cuentan la historia de Yax-Balam. Los nativos destacan una información que te llama la atención. Parece ser que hay otras dos reliquias perdidas de este rey, las cuales se encuentran en las otras dos rutas que dejaste atrás en tu aventura. Pasas la noche en el pueblo, cuestionándote qué podrían ser esas otras dos reliquias… Solo hay una manera de saberlo…\r\n" + //
                        "");
    }

    public static boolean explorar(jugador player, int dificultad, boolean siguesVivo)
    {
        files.printCositas.textoEfectoEscritura("Decides observar con detenimiento las paredes de la cámara. Están cubiertas de glifos mayas que cuentan la historia de un antiguo ritual: un guerrero fue enviado a un pozo sagrado para enfrentar pruebas de vida y muerte. Solo aquellos que demuestren fuerza y sabiduría pueden acceder al \"Camino del Cielo\", un sendero que promete llevar a un poder más allá de lo humano. Sin embargo, una advertencia destaca entre los grabados: \"No toques lo que no es tuyo, o el oro será tu perdición.\" En ese momento, un sonido profundo y reverberante llena la sala. El pedestal donde estaba el carcaj comienza a hundirse lentamente en el suelo, mientras una puerta de piedra se abre al otro extremo de la cámara.\r\n" + //
                                "\r\n" + //
                                "Las monedas se mueven como si una fuerza invisible las empujara hacia una esquina de la sala, donde forman un pequeño montón y entre ellas empiezan a apilarse. De repente, ese montón se transforma. El oro se funde, dando paso a una figura extraña hecha de oro maya. Una voz surge de su interior y dice: “Has adquirido el carcaj. Ahora demuestra si eres digno de él”. Tu corazón se acelera.\r\n" + //
                                "");

        siguesVivo = files.combate.simularCombate(1*dificultad, "Guarlock", player);
        if (!siguesVivo)
        {
            return siguesVivo;
        }
        files.printCositas.textoEfectoEscritura("Al ver cómo el oro bajo tus pies comienza a ondular como si estuviera vivo, decides no arriesgarte. Con el carcaj bien asegurado a tu espalda, corres hacia la puerta de piedra que acaba de abrirse al otro extremo de la sala. Sin embargo, cuando apenas das unos pasos, el oro comienza a reunirse en un solo punto, derritiéndose y moldeándose como si tuviera voluntad propia. Frente a tus ojos, una criatura monstruosa toma forma: un ser humanoide gigantesco compuesto enteramente de monedas fundidas. Su cuerpo brilla con un resplandor dorado, y su rostro carece de ojos, salvo por dos cuencas vacías de las que emana un humo oscuro. Cada paso que da hace temblar la sala, y un sonido metálico, como el eco de miles de monedas cayendo, llena el aire.\r\n" + //
                                "");
        return siguesVivo;
    }

    public static boolean kakamora(jugador player, int dificultad, boolean siguesVivo)
    {
        files.printCositas.textoEfectoEscritura("Tras regresar al templo y mirar el espejo vibrante, notas que las runas en las paredes comienzan a brillar. Un sonido profundo, como un eco en las entrañas del templo, llena el aire. De repente, una puerta oculta se desliza hacia un lado, revelando un pasadizo oscuro y angosto. La curiosidad te consume, y decides avanzar. Al entrar, te encuentras en una sala circular iluminada por antorchas de fuego azul. En el centro, una mesa de piedra tiene grabado un acertijo rodeado por pequeños guerreros de oro con máscaras: los Kakamora. En la mesa, el acertijo dice: \"Abran mis alas para cruzar el cielo, Pero si me fuerzas, dejas mi canto en silencio. ¿Qué soy?\" Los Kakamora te observan, esperando tu respuesta. Sabes que responder correctamente al acertijo podría ser la clave para avanzar… pero fallar podría significar enfrentarte a la furia de los Kakamora. Con cuidado, piensas en las palabras del acertijo. \"Abran mis alas para cruzar el cielo... si me fuerzas, dejas mi canto en silencio.\" Tras unos momentos de reflexión, murmuras la respuesta: —\"Un ave.\" Por un instante temes lo peor, pero entonces asienten al unísono. Un pasaje secreto se abre al otro lado de la sala, y los Kakamora comienzan a dispersarse, saltando entre las sombras y dejándote avanzar. El nuevo camino te lleva a una cámara final.\r\n" + //
                                                        "");
                                                        files.printCositas.textoEfectoEscritura("el acertijo dice: \\\"Abran mis alas para cruzar el cielo, Pero si me fuerzas, dejas mi canto en silencio. ¿Qué soy?");
        siguesVivo = files.Ahorcado.ahorcado("Unave", player);
        if (!siguesVivo)
        {
            return siguesVivo;
        }
        files.printCositas.textoEfectoEscritura("Por un instante temes lo peor, pero entonces asienten al unísono. Un pasaje secreto se abre al otro lado de la sala, y los Kakamora comienzan a dispersarse, saltando entre las sombras y dejándote avanzar. El nuevo camino te lleva a una cámara final.");
        return siguesVivo;
    }

    public static void caminoArco(jugador player , int dificultad)
    {
        int eleccion;
        Scanner teclado;
        boolean siguesVivo = true;

        teclado = new Scanner(System.in);
        files.printCositas.textoEfectoEscritura("Despiertas en un pozo húmedo y oscuro, apenas iluminado por un tenue resplandor que se filtra desde una grieta en el techo. El aire está cargado de humedad, y un hedor metálico a sangre y moho te invade al respirar. Las paredes de piedra están frías al tacto, y el sonido del agua goteando reverbera, intensificando la sensación de aislamiento.\r\n" + //
                        "\r\n" + //
                        "Frente a ti, una figura encadenada yace en posición agónica. Su carne ha comenzado a descomponerse, dejando al descubierto fragmentos de hueso. Sin embargo, lo más perturbador es la inscripción en la pared: escrita con letras temblorosas y burdas, como si el autor hubiera estado al borde de la muerte. La frase, trazada con sangre seca, reza:");
        files.printCositas.textoEfectoEscritura("No es sangre lo que corre en mis venas,\n" + //
                        "pero si dejo de latir, todo termina.\n" + //
                        "Oscuro y duro como la noche,\n" + //
                        "mi fuerza vive, pero a un precio alto");
        files.Ahorcado.ahorcado("obsidiana", player);
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
            siguesVivo = explorar(player, dificultad, siguesVivo);
            if (!siguesVivo)
            {
                return ;
            }
            eleccion = files.Main.elegir("Sepultar criatura", "Profecia", teclado);
            //Sepultar criatura
            if (eleccion == 1)
            {
                files.printCositas.textoEfectoEscritura("La criatura de oro no para de atacarnos intentamos lanzarle todas las flechas posibles pero sin éxito ya que las flechas no consiguen penetrar en el material , no paramos de esquivar todas las lanzas que nos va tirando nos cuesta esquivarlas van demasiado rapido entonces al ver el techo de la sala se nos ocurre una idea tirar la pared para sepultarlo y acabar con el aplastarlo con todo encima , entonces empezamos a tirar las flechas a las rocas de arriba pero lo curioso es que no utilizamos las flechas que tenemos sino disparando las lanzas que nos esta tirando la criatura de oro , cogemos una disparamos pero tenemos que estar en constante movimiento no es facil cogerlas ya que la criatura no nos deja mucho margen de maniobra entre cada recarga de la criatura para hacer una lanza volvemos con nuestro arco a lanzar otra lanza con el arco así sucesivamente despues de muchos intentos el techo empieza a agrietarse esta a punto de caer solo queda un solo golpe pero en un descuido nos atrapa con una lanza clavada en el cuello de la camisa viene hacia nostros pero antes de que venga y buscando el momento perfecto alzamos los brazos como podemos quitando la lanza del cuello de la camisa poniendola en el arco y por fin destruyendo el techo cayendo las rocas encima de la criatura.\r\n" + //
                                        "");
                finalHereje(player, dificultad);
            }
            //Profecia
            else
            {
                files.printCositas.textoEfectoEscritura("Al Salir corriendo de la camara entramos a una nueva sala a una pequeña subcámara rodeada de pinturas al analizarlo mas de cerca podemos observar que relatan los acontecimientos e historias más importantes del reinado de Yax-Balam también al mirar arriba podemos observar que el techo hay inscripciones y pinturas de su viaje al más allá tras su muerte pero lo que si te llama la atención es una pequeña inscripción con un acertijo dentro apenas se puede apreciar pero conseguimos leer : En el tiempo de los abuelos del maíz, cuando el jaguar duerme bajo el cielo sin fin, hay un canto de plumas que el viento no puede oír. Si encuentras el sendero donde tres sombras se tocan, hallarás el rostro de Kinich, guardado en un espejo de obsidiana. Un acertijo difícil pero no nos supone un gran reto ya que con un trozo de roca pintamos en el suelo algunas claves y conseguimos resolverlo el acertijo se refiere a un cenote( una poza subterránea sagrada) al mediodía.\r\n" + //
                                        "\r\n" + //
                                        "Tras resolver el acertijo inscrito en la subcámara, el aire parece cargarse de una vibración antigua. La sala se ilumina tenuemente con la luz que se filtra por las grietas en el techo, donde las sombras danzan sobre las paredes cubiertas con las historias de Yax-Balam. Mientras observas las pinturas que relatan la vida y muerte del gran rey, algo te llama la atención en la pared más alejada: una imagen del rey atravesando un umbral hacia el más allá, acompañado por un resplandor dorado. El acertijo ha sido resuelto, y en ese instante, comprendes que lo que has buscado ha estado a tu alcance todo el tiempo. El cenote, un lugar sagrado bajo la luz del sol del mediodía, es la clave que conecta los mundos, y es allí donde la verdadera revelación aguarda. Pero el templo tiene un poder extraño, y antes de que puedas hacer algún movimiento, el suelo comienza a temblar. Las rocas se mueven ligeramente, como si la propia estructura estuviera reaccionando a tu descubrimiento. El aire se hace denso, y una voz etérea parece surgir de las paredes, un eco de los antiguos guardianes. En el fondo de la sala, junto a una de las piedras donde descansan las reliquias del rey, una grieta comienza a abrirse, revelando una pequeña cámara oculta. La grieta se agranda poco a poco hasta permitirte el paso, y en su interior, el aire está impregnado con un aroma dulce y pesado, como si fuera el alma misma de la tierra. Dentro, en el centro de la cámara, encuentras una piedra pulida de obsidiana que refleja la luz débilmente. Al acercarte, notas que la superficie de la piedra tiene tallados más símbolos y una imagen de Kinich, el dios del sol, claramente representado. Es un espejo de obsidiana, exactamente como lo describía el acertijo, y está brillando suavemente con una luz que parece provenir de su interior.\r\n" + //
                                        "\r\n" + //
                                        "Sin dudarlo dos veces lo tocas llevándote dentro del espejo donde encuentras a alkukkan el dragon alado emplumado tienes dos opciones :");
                eleccion = files.Main.elegir("Luchar alkukulkan", "Huir del espejo", teclado);
                //Alkuku
                if (eleccion == 1)
                {
                    siguesVivo = files.combate.simularCombate(dificultad * 1, "Alkukulkan", player);
                    if (!siguesVivo)
                    {
                        return ;
                    }
                    files.printCositas.textoEfectoEscritura("Decides enfrentarte a él, armado solo con tu arco es una ardua batalla el dragón dorado alza sus alas y pone una posición dominante con un grito de ira al cielo luchas contra el lanzado tus mejores ataques pero los desvía uno tras otro vas fallando sin éxito de poder derrotarlo entonces tras esquivar los ataques de el dragón emplumado tu arco parece emitir un brillo coges una flecha y te dispones a disparar la flecha al dispararla coge mas y mas velocidad prendiendo una luz azul por toda la flecha que lo atraviesa cayendo el dragón como un árbol al suelo.\r\n" + //
                                                "");
                    eleccion = files.Main.elegir("Kakamora", "Boss Final", teclado);
                    //kakamora
                    if (eleccion == 1)
                    {
                        siguesVivo = kakamora(player, dificultad, siguesVivo);
                        if (!siguesVivo)
                        {
                            return ;
                        }
                        finalHereje(player, dificultad);
                    }
                    //Boss final
                    else
                    {
                        finalHereje(player, dificultad);
                    }
                }
                //huir del espejo
                else
                {
                    files.printCositas.textoEfectoEscritura("Al tocar el espejo, un remolino de energía te envuelve, y por un instante, todo se oscurece. Cuando abres los ojos, te encuentras cara a cara con el dragón emplumado, Alkukkan, cuya figura es aún más imponente bajo la tenue luz que se filtra desde las grietas del templo. Su mirada ardiente se clava en ti, y sus plumas brillan con un destello místico. Sientes el peso de su presencia, pero también notas que el espejo sigue detrás de ti, vibrando como si quisiera llamarte de regreso. Tienes una oportunidad. Sin pensarlo demasiado, retrocedes rápidamente hacia el espejo, tocándolo de nuevo con ambas manos. En un instante, la energía mágica del espejo te devuelve al templo exterior. Escuchas el rugido del dragón amortiguarse, como si quedara atrapado en ese otro mundo. El templo está en silencio, aunque aún puedes sentir la poderosa presencia de Alkukkan resonando en las piedras. Miras tus manos, todavía temblorosas, y te das cuenta de que la batalla no ha terminado; el dragón sigue vigilando desde el espejo.");
                    finalHereje(player, dificultad);
                }

            }
        }
    }   
}
