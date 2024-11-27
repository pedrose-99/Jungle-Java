package files;
import java.util.Scanner;
import javax.annotation.processing.Filer;

public class caminoDestruccion
{  
    public static void FinalDestruccion(jugador player, int dificultad, boolean finalAlternativo)
    {
        //combate
         files.printCositas.textoEfectoEscritura("Te encuentras ante el mayor templo subterráneo que has visto en tus cientos de exploraciones, pero hay algo raro en el ambiente, sientes que te cuesta respirar y empiezas a oír voces, no hay nadie más en la mazmorra.\r\n" + //
                          "\r\n" + //
                          "Ante ti se erige una estatua oxidada y llena de enredaderas, a los pies de la estatua lees un texto que reza, “aquí yacen los restos del primer rey de los mayas Yax-Balam” seguido de un acertijo “ Si me tienes, me quieres compartir. Si me compartes, ya no me tienes. ¿Qué soy?”. Sabes perfectamente la respuesta y sin pensártelo la dices en alto… Un secreto.\r\n" + //
                          "\r\n" + //
                          "Todo empieza a temblar y a llenarse de una niebla densa que no te deja ver, Para tu sorpresa, la vieja estatua se ha volatilizado y ante ti se alza un guerrero, representa al rey Yax-Balam y su espíritu. Yax-Balam se abalanza contra ti portando su mítica vestimenta de guerra y su reliquia, el Bastón de las Fieras. Consigue alcanzarte con su arma, pero te revuelves y consigues zafarte. El rey manda a sus esbirros a atacarte, son una representación de ambos dioses Chaac y Kauil. Luchas contra ellos y tras una ardua batalla consigues eliminarlos y enfrentarte cara a cara con el gran rey maya.\r\n" + //
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
            if (eleccion == 1)
            {
                files.printCositas.textoEfectoEscritura("Encuentras grabado un acertijo escrito en lengua Maya, por suerte, ya aprendiste este idioma en tus años como estudiante de arqueología. Tras traducir el texto entiendes que te están planteando un enigma que enuncia: “¿Qué es aquello tan frágil que cuando se dice su nombre lo rompe?”\r\n" + //
                                        "\r\n" + //
                                        "A la derecha del enunciado hay una superficie saliente con arena, y encima de esta lo que parece un grifo. Confundido, sigues buscando textos en la pesada puerta. Tras largos minutos de búsqueda desvelas un escrito tras unas ramas: “Traza en la arena, desvela el mensaje. Por cada respuesta se borrará el lienzo”.\r\n");
                files.Ahorcado.ahorcado("silencio");
                                        
                                       files.printCositas.textoEfectoEscritura("Habiendo leído esta información comienzas a trazar la respuesta al acertijo en la arena: ”S”,”I”,”L”,”E”.... Cada letra que escribes se acompaña de un chorro de arena cayendo sobre ella. Finalmente escribes “silencio”. Esta vez el grifo ha escupido otra moneda, esta es blanca y tiene la letra “S” grabada.\r\n" + //
                                        "\r\n" + //
                                        "La puerta se abre ante ti y ves unas escaleras que parecen conducir hacia una mazmorra.");
                files.printCositas.textoEfectoEscritura("Una vez dentro encuentras un cofre en el centro de la sala, desconfiado te acercas y, sorprendentemente, lo abres sin dificultad.\r\n" + //
                                        "\r\n" + //
                                        "Contiene una especie de poción de un color rojizo, en la base del envase hay una moneda de color amarillo con la letra “K” grabada. Pero no podía ser tan fácil. De pronto se abre un agujero en el techo de la mazmorra y comienza a caer una abundante cascada de agua.\r\n" + //
                                        "\r\n" + //
                                        "La sala es pequeña y no tardará en inundarse. Hay una puerta ya bloqueada por el agua por la que no estás seguro si cabes y otra en el techo que parece tener un cerrojo.");
                        eleccion = files.Main.elegir("Puerta suelo", "Puerta techo", teclado);
                        //puerta suelo
                        if (eleccion == 1)
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
                            if (eleccion == 1)
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
                            files.printCositas.textoEfectoEscritura("No crees poder pasar por la pequeña puerta en la esquina, por lo que comienzas una búsqueda exhaustiva de la llave del cerrojo. Nadas sin cesar, buceas, el agua sube. Con la vista borrosa debajo del agua consigues ver un objeto con un brillo singular. Haces un último esfuerzo desesperado y nadas hacia allí.\r\n" + //
                                                                "\r\n" + //
                                                                "Una vez alcanzas el brillo no cabe duda de que es una pequeña llave. Te impulsas hacia la puerta en el techo ya cubierto de agua. Consigues abrir la puerta y sales disparado junto a todo el agua a presión. Caes al suelo y observas tu entorno: dos salas a tus lados, una a la derecha, que desprende un olor a vegetación y otra a tu izquierda, que está muy oscura como para ver algo.");
                            eleccion = files.Main.elegir("Sala vegetacion", "Sala oscura", teclado);
                            //vegetacion
                            if (eleccion == 1)
                            {
                                files.printCositas.textoEfectoEscritura("Esta vez te encuentras en una inmensa sala repleta de vegetación por las paredes y el techo. La vegetación es variada y colorida pero puedes distinguir miles de insectos entre la flora. Intentas avanzar con cuidado en caso de que supongan una amenaza pero no tiene efecto, en un abrir y cerrar de ojos, incontables insectos de distintos tipos corren, vuelan y reptan hacia ti.\r\n" + //
                                                                        "\r\n" + //
                                                                        "Aprovechando el tamaño de la sala comienzas a correr sin rumbo intentando pisar a todos los que puedas. Visualizas un pasadizo tras unas enredaderas.");
                                eleccion = files.Main.elegir("Huir por el pasadizo", "Acabar con los insectos", teclado);
                                //Huir
                                if (eleccion == 1)
                                {
                                    files.printCositas.textoEfectoEscritura("Corres hacia el pasadizo huyendo de tantos insectos como puedes, el pasadizo es oscuro pero tropiezas con un objeto pesado. Enciendes el mechero que llevas en el bolsillo y examinas el objeto. Se trata de un cofre un tanto extraño, tiene unas formas curvas que crean un relieve parecido a unos tentáculos y tiene un color entre verdoso y morado, tampoco presenta ningún reflejo o brillo.\r\n" + //
                                                                                "\r\n" + //
                                                                                "Al abrirlo solo ves una tela vieja de color rojo con un estampado de triángulos. Sigues por el pasadizo y tropiezas con otros tres cofres, cada uno más extraño que el anterior. Un pendiente común y oxidado, un diente de oro viejo…una...uña? Guardas todo lo encontrado en caso de que te sea de utilidad más tarde.");
                                    files.Ahorcado.acertijoEstatua();
                                    FinalDestruccion(player, dificultad, false);
                                }  
                                //Insectos
                                else
                                {
                                    files.printCositas.textoEfectoEscritura("Te aterran los insectos, es algo en lo que no puedes evitar pensar cada vez que vas a explorar. Esta vez realmente estás en un apuro por lo que comienzas a pisotear y aplastar con el mango de tu mandoble todo ser que se acerque a ti. ");
                                    files.combate.simularCombate(5*dificultad, "bicho", player);
                                    files.printCositas.textoEfectoEscritura("Tras unos cuantos, o podría decirse bastantes escalofríos, consigues acabar con la mayoría de insectos a tu alrededor.\r\n" + //
                                                                                "\r\n" + //
                                                                                "Queda algún que otro gusano o araña por la sala. Ves un escarabajo a lo lejos y, cuando te acercas a pisarlo, cae detrás tuya una cajita de madera con un medallón realmente pesado que parece muy valioso. No ves otra salida que no sea el pasadizo cubierto de enredaderas, entonces, te adentras en él.\r\n" + //
                                                                                "\r\n" + //
                                                                                "El pasadizo es oscuro pero tropiezas con un objeto pesado. Enciendes el mechero que llevas en el bolsillo y examinas el objeto. Se trata de un cofre un tanto extraño, tiene unas formas curvas que crean un relieve parecido a unos tentáculos y tiene un color entre verdoso y morado, tampoco presenta ningún reflejo o brillo. Al abrirlo solo ves una tela vieja de color rojo con un estampado de triángulos. Sigues por el pasadizo y tropiezas con otros tres cofres, cada uno más extraño que el anterior. Un pendiente común y oxidado, un diente de oro viejo…una...uña? Guardas todo lo encontrado en caso de que te sea de utilidad más tarde.");
                                    files.Ahorcado.acertijoEstatua();
                                    FinalDestruccion(player, dificultad, true);
                                }                                     
                            }
                            //Sala oscura
                            else
                            {
                                files.printCositas.textoEfectoEscritura("Llegas a una sala totalmente oscura y oyes un rugido, intentas buscar tu linterna pero está al fondo de tu mochila. Algo se abalanza hacia ti rápidamente. Debes luchar.");
                                files.combate.simularCombate(1*dificultad, "jaguar", player);
                                files.printCositas.textoEfectoEscritura("Empuñas tu mandoble y cierras los ojos, el enemigo es rápido pero muy ruidoso. De esta forma sabrás dónde atacar. Notas tocar varias veces al objetivo con tu arma. De pronto, se deja de oír ruido. Lo has derrotado. Una luz tenue sale de un agujero de tu tamaño. Es una puerta.");
                                FinalDestruccion(player, dificultad, false);
                            }                                    
                        }
            }
            //kauil
            else
            {
                files.printCositas.textoEfectoEscritura("Te acercas a la puerta de Kauil y aparecen dos leones que debes derrotar. Una vez acabas con ellos, la puerta de Kauil se abre. Hay una rampa por la que debes deslizarte.\r\n" + //
                                        "\r\n" + //
                                        "Te has deslizado por la rampa y has llegado a una sala con dos agujeros en el suelo, uno desprende una luz cegadora, el otro es un agujero corriente.");
                eleccion = files.Main.elegir("Agujero brillante", "Agujero corriente", teclado);
                //brillante
                if (eleccion == 1)
                {
                    files.printCositas.textoEfectoEscritura("Entras por el agujero que desprende una luz radiante, una vez dentro te encuentras en una sala con un enorme agujero por donde entra la luz del sol. Es extraño, jurarías que antes de bajar por la rampa el cielo no estaba tan claro.\r\n" + //
                                                "\r\n" + //
                                                "Ignoras ese hecho y continúas investigando la sala. Pero da igual lo mucho que intentes pasarlo por alto, hay algo raro. Te dispones entonces a mirar tu reloj. Las 10:30 de la mañana. El agujero no tiene ningún tipo de ángulo y el sol se ve claramente encima de este. Tienes un mal presentimiento, por eso, buscas una salida cuanto antes.\r\n" + //
                                                "\r\n" + //
                                                "Ves dos puertas a los lados del gran agujero, te aproximas a una de ellas y comienza a hacer mucho calor. Te giras a mirar el sospechoso agujero de luz cegadora, y antes de que puedas enfocar la vista comienza a dispararse todo el fuego que pudiera caber en aquel boquete. Corres hacia la esquina de la sala, debes entrar por una de las dos puertas antes de que te pueda el calor del lugar. Evitando las llamas vas a la puerta de la izquierda, que parece, de cierto modo, apartar el fuego de ella.\r\n" + //
                                                "\r\n" + //
                                                "Tocas el pomo y sientes una ligera brisa, sin pensarlo entras por la puerta. Es un pasadizo donde corre un aire fuerte como si de una enorme turbina se tratase. Lentamente, sigues avanzando y a tus lados ves dos espacios, por uno de ellos ves tu reflejo, por el otro solo ves rocas.");
                    eleccion = files.Main.elegir("Sala espejos", "Sala rocas", teclado);
                    //espejos
                    if (eleccion == 1)
                    {
                        files.printCositas.textoEfectoEscritura("Apareces en una sala repleta de espejos, ni siquiera puedes saber dónde acaba o de qué tamaño es. Tardarás en buscar una salida. Llevas un rato inspeccionando la sala y has descubierto que algunos de los espejos se giran. Uno de estos será la puerta, los demás son sin salida.\r\n" + //
                                                        "\r\n" + //
                                                        "En uno de tus intentos de dar con la salida sale de detrás del espejo una masa de lagartos, son rápidos y peligrosos, pero pequeños.");
                        files.combate.simularCombate(4*dificultad, "lagarto", player);
                        files.printCositas.textoEfectoEscritura("Coges tu mandoble y comienzas a atacar de lado a lado pero pierdes la orientación debido a los espejos, que dificultan la batalla. Procuras saltar por encima de las amenazas ya que es un movimiento que no pueden realizar fácilmente. Una vez acabas con ellos, inspeccionas el agujero y encuentras la salida.");
                        FinalDestruccion(player, dificultad, false);
                    }
                    //rocas
                    else
                    {
                        files.printCositas.textoEfectoEscritura("Estás en una sala corriente bajo tierra, pero algo te llama la atención. Avistas una mesa donde está escrito en maya: “fundir y cubrir”. Tocas la mesa, está caliente. Debes fundir un objeto sobre esta. Te será más fácil cubrirla con metal fundido, pero,¿cómo?, el calor de la mesa no es suficiente para fundir un objeto, necesitas calentarlo más.\r\n" + //
                                                        "\r\n" + //
                                                        "Buscando pistas descubres una puerta tras la mesa. La abres y ves un abundante fuego que te hace retroceder instantáneamente. La sala donde te encuentras está conectada a la anterior habitación invadida por las llamas. Esto te ayuda a resolver el acertijo. Sin embargo, debes fundir un objeto metálico que tengas en propiedad. La mesa tiene una forma circular y el objeto tiene que ser suficientemente grande para cubrirla de metal fundido.");
                        files.printCositas.textoEfectoEscritura("¿Qué objeto pondrás sobre la mesa?");
                        files.Ahorcado.ahorcado("moneda");
                        files.printCositas.textoEfectoEscritura("Dudoso, coges la moneda que recogiste junto a tu mandoble, ahora necesitas acercarlo al fuego sin quemarte la mano. Avistas a tu lado unos huesos apilados, coges uno de ellos y pones la moneda en él. Con precaución, lo acercas al fuego. Pones la moneda caliente en la mesa y en cuestión de minutos ves la moneda totalmente fundida. Te preguntas si la moneda realmente servía para eso, pero otra puerta se ha abierto ante ti, debes continuar. Mientras caminas te preguntas qué relación puede tener la moneda con la prueba superada, finalmente, recuerdas el diseño de la moneda y miras detrás tuya. Encima de la puerta está escrito “calcinar”, la moneda tenía la letra “C” en ella, lo que disipa tus dudas. Continúas tu camino tranquilamente.");
                        FinalDestruccion(player, dificultad, false);
                    }
                }
                //corriente
                else
                {
                    files.printCositas.textoEfectoEscritura("Te adentras en el agujero corriente, te mata la curiosidad sobre qué es lo que brilla en el interior del otro, pero sientes que este es más seguro. Caes por una rampa y acabas en una sala de temperatura muy fría. Debes estar mucho más bajo tierra de lo que estabas antes.\r\n" + //
                                                "\r\n" + //
                                                "En frente tuya hay una pila de piedras que debes apartar, son realmente pesadas. A tu izquierda, una sala que desprende un calor sofocante pero puedes ver su interior. No supone ninguna amenaza y puedes ver la salida.");
                    
                    eleccion = files.Main.elegir("Apartar las piedras", "Izquierda", teclado);
                    //pila de piedras
                    if (eleccion == 1)
                    {
                        files.printCositas.textoEfectoEscritura("Apareces en una sala rocosa con cinco grandes pilares, en frente tuya se encuentran cinco rocas con una letra grabada cada una. En los pilares que tienes delante, 5 espacios.");
                        files.Ahorcado.acertijoPilares();
                        files.printCositas.textoEfectoEscritura("Ordenas las letras en tu mente y, sin pensarlo, las introduces de forma que en la pared se vea “KAUIL”, el nombre del Dios en el que esta ruta está basada.\r\n" + //
                                                        "La puerta se abre ante ti y continuas tu camino.");
                        FinalDestruccion(player, dificultad, false);
                    }
                    //Izquierda
                    else 
                    {
                        files.printCositas.textoEfectoEscritura("Entras en la sala aparentemente inofensiva. El techo tiene una estructura extraña, está dividido en diferentes paneles con barras verticales, como si de una celda se tratase. La puerta por la que has entrado se cierra, pero la de salida está abierta.\r\n" + //
                                                        "\r\n" + //
                                                        "Tienes un mal presentimiento y corres hacia la salida, pero un instante antes de salir de la sala cae un panel del techo detrás tuya y se cierra la puerta. Te giras y aparece una enorme mamba negra, es increíblemente rápida y viene hacia ti. Parece fácil cortarte el cuello con tu arma, pero hay un obstáculo.\r\n" + //
                                                        "Los paneles comienzan a calentarse, llegando a flamear. Las placas comienzan a caer mientras luchas contra la serpiente");
                        files.combate.simularCombate(1*dificultad, "mambaNegra", player);
                        files.printCositas.textoEfectoEscritura(" Tras numerosos esquivos y amagos, consigues cortar a la mamba en dos. Dejan de caer las placas y, cansado, te aproximas a la puerta, ya abierta.");
                        FinalDestruccion(player, dificultad, false);
                    }
                }
            }
            }
}