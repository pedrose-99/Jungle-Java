package files;
import java.util.Scanner;

public class caminoDestruccion
{  
    public static void FinalDestruccion(jugador player, int dificultad, boolean finalAlternativo)
    {
        //combate
         files.printCositas.textoEfectoEscritura("Yax-Balam se abalanza contra ti portando su mítica vestimenta de guerra y su reliquia, el Bastón de las Fieras. Consigue alcanzarte con su arma, pero te revuelves y consigues zafarte. El rey manda a sus esbirros a atacarte, son una representación de ambos dioses Chaac y Kauil. Luchas contra ellos y tras una ardua batalla consigues eliminarlos y enfrentarte cara a cara con el gran rey maya.\r\n" + //
                          "\r\n" + //
                          "Tras la batalla consigues hacer caer a Yax-Balam, tu arma está quebrada y la única salida que tienes es portar su bastón y golpear su cabeza mientras intenta reincorporarse a la batalla.\r\n" + //
                          "\r\n" + //
                          "Empuñas el arma, notas como poco a poco se va cargando de una energía poderosa, lanzas un ataque descendente provocando que el daño de tu bastón sea mayor. Golpeas al gran Yax-Balam, ahora inconsciente en el suelo del campo de batalla. Rápidamente, recoges la reliquia con la que has atacado al rey y ante ti se abren unas escaleras que te llevan a la superficie");
        
        if (finalAlternativo)
        {
            files.printCositas.textoEfectoEscritura("Te ves en la jungla sin nada a tu alrededor, solo ves árboles, un río y monos. Decides seguir el río y encuentras un poblado en el que te cuentan la historia completa del antiguo rey. A pesar de todas las dificultades que has tenido, has conseguido no una, sino dos reliquias. Miras el bastón y el medallón que conseguiste, no puedes esperar a investigarlos. Los nativos destacan una información que te llama la atención. Parece ser que hay otras dos reliquias pertenecientes a este rey, las cuales se encuentran en las otras dos rutas que dejaste atrás en tu aventura. Pasas la noche en el pueblo y, a la mañana siguiente, partes hacia tu hogar. Han pasado dos meses y tus descubrimientos se han puesto en museos, los libros hablan de ti y eres considerado uno de los exploradores más importantes de tu época. Felicidades, Peter. Aún así, pasas tus noches pensando qué había en el resto de los caminos. Solo hay una manera de saberlo...");
        }
        else
        {
            files.printCositas.textoEfectoEscritura("Te ves en la jungla sin nada a tu alrededor, solo ves árboles, un río y monos. Decides seguir el río y encuentras un poblado en el que te cuentan la historia completa del antiguo rey. Los nativos destacan una información que te llama la atención. Parece ser que hay otras dos reliquias pertenecientes a este rey, las cuales se encuentran en las otras dos rutas que dejaste atrás en tu aventura. Pasas la noche en el pueblo, cuestionándote qué podrían ser esas otras dos reliquias. De todas formas, solo hay una manera de saberlo…");
        }
    }
    public static void Destruccion(jugador player, int dificultad)
    {
        int eleccion;
        Scanner teclado= new Scanner(System.in);
        files.printCositas.textoEfectoEscritura("Eliges el camino del centro, tras una larga sesión de evitar arbustos, serpientes, ramas y más apareces en lo que se asimila a un antiguo escenario de batalla en ruinas.\r\n" + //
                        "\r\n" + //
                        "En el centro del monumento se encuentra un mandoble clavado en el suelo, con sorprendente facilidad lo sacas del lugar donde descansaba, como si estuviera ahí especialmente para ti.\r\n" + //
                        "\r\n" + //
                        "Este mandoble es realmente pesado y afilado,incluso podrías herirte al usarlo, sin embargo, te servirá de defensa personal. Al lado encuentras una moneda roja con la letra “C” detrás.\r\n" + //
                        "\r\n" + //
                        "Hay dos puertas inmensas de piedra a los lados, ambas tienen grabados dibujos de antiguos dioses de la cultura maya. Conoces esos dibujos: a tu derecha, Chaac, el Dios del agua,los relámpagos y la lluvia; a tu izquierda, Kauil, el Dios del fuego");

        eleccion = files.Main.elegir("Chaac", "Kauil", teclado);
           //chaac
            if(eleccion == 1)
            {
                files.printCositas.textoEfectoEscritura("Encuentras grabado un acertijo escrito en lengua Maya, por suerte, ya aprendiste este idioma en tus años como estudiante de arqueología. Tras traducir el texto entiendes que te están planteando un enigma que enuncia: “¿Qué es aquello tan frágil que cuando se dice su nombre lo rompe?”\r\n" + //
                                        "\r\n" + //
                                        "A la derecha del enunciado hay una superficie saliente con arena, y encima de esta lo que parece un grifo. Confundido, sigues buscando textos en la pesada puerta. Tras largos minutos de búsqueda desvelas un escrito tras unas ramas: “Traza en la arena, desvela el mensaje. Por cada respuesta se borrará el lienzo”.\r\n" + //
                                        "\r\n" + //
                                        "Habiendo leído esta información comienzas a trazar la respuesta al acertijo en la arena: ”S”,”I”,”L”,”E”.... Cada letra que escribes se acompaña de un chorro de arena cayendo sobre ella. Finalmente escribes “silencio”. Esta vez el grifo ha escupido otra moneda, esta es blanca y tiene la letra “S” grabada.\r\n" + //
                                        "\r\n" + //
                                        "La puerta se abre ante ti y ves unas escaleras que parecen conducir hacia una mazmorra.");
                files.printCositas.textoEfectoEscritura("Una vez dentro encuentras un cofre en el centro de la sala, desconfiado te acercas y, sorprendentemente, lo abres sin dificultad.\r\n" + //
                                        "\r\n" + //
                                        "Contiene una especie de poción de un color rojizo, en la base del envase hay una moneda de color amarillo con la letra “K” grabada. Pero no podía ser tan fácil. De pronto se abre un agujero en el techo de la mazmorra y comienza a caer una abundante cascada de agua.\r\n" + //
                                        "\r\n" + //
                                        "La sala es pequeña y no tardará en inundarse. Hay una puerta ya bloqueada por el agua por la que no estás seguro si cabes y otra en el techo que parece tener un cerrojo.");
                        eleccion = files.Main.elegir("Puerta suelo", "Puerta techo", teclado);
                        //puerta suelo
                        if(eleccion == 1)
                        {
                            files.printCositas.textoEfectoEscritura("Te apresuras hacia la pequeña puerta en la esquina de la sala, consigues entrar en ella pero no puedes cerrarla del todo. En consecuencia, el agua está entrando por la ranura y debes aguantar la respiración.\r\n" + //
                                                                "\r\n" + //
                                                                "Parece que el estrecho pasadizo está llegando a su fin, caes junto a una fuerte masa de agua y consigues cerrar la puerta de tal modo que esta sala no se inunde como la anterior. Una vez eres capaz de inspeccionar tus alrededores ves un jaguar mirando hacia tu posición. Lleva un medallón alrededor del cuello.\r\n" + //
                                                                "\r\n");
                            files.combate.simularCombate(1*dificultad, "jaguar", player);
                            files.printCositas.textoEfectoEscritura("Luchas contra él y consigues la victoria. Coges el medallón de su cuello, es una moneda como las anteriores, negra, con la letra “E” grabada en ella.\r\n" + //
                                                                "\r\n" + //
                                                                "Detrás del jaguar ya derrotado visualizas un extraño nido, hay aves durmiendo y parecen inofensivas. A tu otro lado hay un panel con agujeros circulares.");
                            eleccion = files.Main.elegir("nido", "tablero", teclado);
                            //nido
                            if(eleccion == 1)
                            {
                                files.printCositas.textoEfectoEscritura("Te aproximas al nido donde descansan las aves y las analizas. Nunca habías visto una criatura similar, pero antes de plantearte pasar por la otra puerta comienzan a correr hacia ti. Son crías y tienen hambre, su madre no parece estar por los alrededores.\r\n" + //
                                                                        "\r\n" + //
                                                                        "Aunque parezcan inofensivas, te suponen un obstáculo y sus quejas son lo suficientemente fuertes para que su madre las oiga, no te queda otro remedio que luchar contra ellas.");
                                                                        files.combate.simularCombate(2*dificultad, "aveCria", player);
                                files.printCositas.textoEfectoEscritura("Sigues avanzando y reconoces un sonido, es una criatura piando, está furiosa. Antes de poder localizar de dónde viene el sonido, un ave de un tamaño similar a un buitre se aproxima hacia tu posición. Es la madre de las pequeñas crías hambrientas.");                                
                                files.combate.simularCombate(1*dificultad, "aveMadre", player);   
                                files.printCositas.textoEfectoEscritura("Tras la dura lucha con el ave continúas tu camino.\r\n" + //
                                                                        "\r\n" + //
                                                                        "Las monedas que conseguiste son un misterio para ti. No puedes esperar para poder investigarlas, piensas que quizás pertenecen al singular panel que había cerca del nido, pero ahora no tienes tiempo para volver. Debes seguir con tu aventura.");                                          
                                FinalDestruccion(player, dificultad, false);
                                                                       
                            }
                            //acertijo moneda
                            else
                            {
                                files.printCositas.textoEfectoEscritura("Hay 12 ranuras en posición de cuadrado y con forma circular. Los primeros 4 espacios (en horizontal) tienen la palabra “colores” rodeándolos, los 4 últimos, la palabra “criatura”; pero la palabra que rodea a los 4 del medio es ilegible.\r\n" + //
                                                                        "\r\n" + //
                                                                        "Has visualizado miles de paneles parecidos en museos, por desgracia, ninguno tenía este conjunto de palabras por lo que no puedes saber qué está escrito alrededor de las ranuras en posición central.\r\n" + //
                                                                        "\r\n" + //
                                                                        "Recuerdas haber visto las formas que describen las ranuras recientemente. Sacas las monedas que habías recogido anteriormente en los cofres y compruebas, efectivamente, pertenecen a las ranuras. Sin embargo, solo posees 4 monedas y no son suficientes para abrir la puerta, además, no sabes qué relación pueden tener con la ranura. Te preguntas si pertenecen al grupo de “colores” pero las letras no tendrían sentido en ese caso. De todas formas, aún debes encontrar las monedas restantes, te faltan 8.\r\n" + //
                                                                        "\r\n" + //
                                                                        "Intuyes que las monedas que necesitas están en la sala contigo. Decides mirar entre los escombros. Tras una larga búsqueda encuentras 4 monedas con las palabras “negro”, “blanco”, “amarillo” y “rojo” en ellas y otras 4 monedas con las palabras “cuervo”, “paloma”, “águila” y “faisán”. Por primera vez estás completamente perdido ante un acertijo. Miras de nuevo las monedas que habías cogido anteriormente a lo largo de tu recorrido y buscas pistas. Al mirar el costado de las monedas consigues leer “Xib” escrito solo en las que aparece una sola letra grabada.");
                                files.printCositas.textoEfectoEscritura("Está claro que las monedas de “cuervo”, “paloma”, “águila” y “faisán” pertenecen al grupo de criaturas, por eso, las introduces cada una en uno de los espacios de abajo. Intuyes a su vez que las ranuras del grupo de “colores” deben ser las que contienen las palabras “negro”, “blanco”, “amarillo” y “rojo”. Solo faltan las misteriosas monedas con letras.\r\n" + //
                                                                        "\r\n" + //
                                                                        "\r\n" + //
                                                                        "Las posicionas de modo que la moneda negra esté entre “negro” y “cuervo\", la blanca entre “blanco” y “paloma”, la amarilla entre “amarillo” y “águila” y la roja entre “rojo” y “faisán”. Sin embargo, aún no sabes el orden correcto. Inspeccionas el pedestal y encuentras un mensaje:\r\n" + //
                                                                        "\r\n" + //
                                                                        "\"Se juntaron los dos primeros, se compenetran perfectamente, viven en armonía e indiferencia. Sin embargo, algo debe destacar, es desnatural tal entendimiento y normalidad en este lugar. Vino el cuarto, destacando sobre los demás, ambos primero y segundo están ahora opacados por su esplendor y belleza. Por último, llegó el tercero. No era tan llamativo como el cuarto, de hecho, era realmente parecido a los dos primeros, pero su gran tamaño creó una necesidad de poder sobre él. Este era imponente y sometió a los demás de manera no tan sofisticada y pacífica como el cuarto. Devoró al segundo como muestra de poder y creó de este lugar un sitio injusto\".");
                                    files.Ahorcado.acertijoMonedas();
                                files.printCositas.textoEfectoEscritura("Has resuelto el acertijo pero…¿Qué quieren decir las letras?. El tablero se da la vuelta mostrando el siguiente mensaje: “Chaac, cuatro colores le representan, los cuatro puntos cardinales simbolizan cada uno. Ek Xib, de color negro, representado por un cuervo; Sac Xib, de color blanco, simbolizado por la paloma; Kan Xib, amarillo, encarnado por el águila; Y, por último, Chac Xib, de color rojo, personificado por el faisán. Tomas notas de la información fascinado. La puerta se ha abierto y ahora puedes seguir avanzando por el sendero.");
                                FinalDestruccion(player, dificultad, false);
                            }
                        }
                        //puerta techo
                        else
                        {
                            files.printCositas
                        }
            }
            //kauil
            else
            {

            }
            }
}