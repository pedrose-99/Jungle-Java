package files;
import java.util.Scanner;

public class caminoMagia
{

    public static void finalMagia(jugador player, int dificultad)
    {
        files.printCositas.textoEfectoEscritura("Te encuentras ante el mayor templo subterráneo que has visto en tus cientos de exploraciones, pero hay algo raro en el ambiente, sientes que te cuesta respirar y empiezas a oír voces, no hay nadie más en la mazmorra. Ante ti se erige una estatua oxidada y llena de enredaderas, a los pies de la estatua lees un texto que reza:");
        files.printCositas.textoEfectoEscritura("“Aquí yacen los restos del primer rey de los mayas Yax-Balam” Seguido de un acertijo ");
        files.printCositas.textoEfectoEscritura("Si me tienes, me quieres compartir. Si me compartes, ya no me tienes. ¿Qué soy?");
        files.Ahorcado.ahorcado("UnSecreto", player);
        files.printCositas.textoEfectoEscritura("Sabes perfectamente la respuesta y sin pensártelo la dices en alto… Un secreto. \r\n" + //
                        "Todo empieza a temblar y a llenarse de una niebla densa que no te deja ver, para tu sorpresa la vieja estatua se ha volatilizado y ante ti se alza el fantasma del rey Yax-Balam. \r\n" + //
                        "");
        
        files.printCositas.textoEfectoEscritura("Se abalanza contra ti portando su mítica vestimenta de guerra, consigue alcanzarte con uno de sus hechizos pero te revuelves y consigues zafarte, el rey manda a dos gorilas de sus esbirros que han salido de la nada a atacarte.\r\n" + //
                        "");
        files.combate.simularCombate(2*dificultad, "gorila",player); 
        files.printCositas.textoEfectoEscritura("Luchas contra ellos y tras una ardua batalla consigues eliminarlos y enfrentarte cara a cara con el gran rey maya.");
        //combate contra el boss final simularcombateFinal()
        files.printCositas.textoEfectoEscritura("Durante batalla consigues hacer caer a Yax-Balam, tu arma está quebrada y la única salida que tienes es portar su anillo y lanzar un hechizo que le haga descansar en paz. Coges el anillo y te lo pones, notas como poco a poco se va cargando de una energía mística, lanzas un hechizo de volatilización provocando un torbellino de polvo que se desvanece, dejando en el suelo el anillo de las bestias de Yax-Balam. Recoges la reliquia y ante ti se abren unas escaleras que te llevan a la superficie.");   
        files.printCositas.textoEfectoEscritura("Te ves en la jungla sin nada a tu alrededor, solo ves árboles, un río y monos. Decides seguir el río y encuentras un poblado en el que te cuentan la historia de Yax-Balam. Los nativos destacan una información que te llama la atención. Parece ser que hay otras dos reliquias perdidas de este rey, las cuales se encuentran en las otras dos rutas que dejaste atrás en tu aventura.");
        files.printCositas.textoEfectoEscritura("Pasas la noche en el pueblo y, a la mañana siguiente, partes hacia tu hogar. Han pasado dos meses y tus descubrimientos se han puesto en museos, los libros hablan de ti y eres considerado uno de los exploradores más importantes de tu época. Felicidades, Peter. Aún así, pasas tus noches pensando qué había en el resto de los caminos. Solo hay una manera de saberlo…");
        files.printCositas.textoEfectoEscritura("Completa el resto de caminos y de sendas para conseguir todas las reliquias y completar la historia de Peter Hill.¡Gracias por jugar!");
    }

    public static void caminoMago(jugador player, int dificultad)
    {
        int eleccion;
        Scanner teclado;
        
        teclado = new Scanner(System.in);
        files.printCositas.textoEfectoEscritura(" Apareces en una mazmorra en la jungla, no ves nada pero consigues encender un mechero que llevabas encima. Al mirar detenidamente ves sobre un pedestal una varita, al tocarla empiezas a notar una extraña sensación, aún así decides guardarla.\r\n" + //
                        "\r\n" + //
                        "Crees que te has vuelto loco ya que ves dos túneles idénticos, piensas que uno de ellos puede ser tu salida para poder proseguir con la búsqueda de la reliquia perdida de Yax-Balam, pero antes de poder tomar una decisión aparece un babuino y nos indica que debemos tomar uno de los caminos o nos enfrentaremos a una muerte segura.");
        eleccion= files.Main.elegir("Camino izquierda", "Camino derecha", teclado);
        //camino izquierda
        if (eleccion == 1)
        {
            files.printCositas.textoEfectoEscritura("Andas por el camino hasta llegar a una sala con estatuas de animales salvaje. Mientras investigas las estatuas, una de ellas comienza a moverse. Te das cuenta de que es un gorila salvaje. Te bates en duelo con tan aberrante criatura");
            files.combate.simularCombate(1*dificultad, "gorila",player);
            files.printCositas.textoEfectoEscritura("Tras una ardua batalla consigues deshacerte de la vil criatura. Notas que tus movimientos son más lentos, estás empezando a tener hipotermia, le quitas la piel al gorila para hacerte un abrigo. Miras a tu alrededor y ves que ante ti se han abierto dos escaleras tras las estatuas, una que sube, y la otra que baja.");
            //Subir defensa + cofre aleatorio(Crear esta funcion) + subir de nivel.
            
            eleccion = files.Main.elegir("Escalera que sube", "Escalera que baja", teclado);
            //Escalera que sube
            if (eleccion == 1)
            {
                files.printCositas.textoEfectoEscritura("Subes la escalera mientras una atmósfera densa y misteriosa te envuelve. Atraviesas un pequeño sendero que da a una sala lúgubre, las paredes, cubiertas de antiguos relieves, parecen susurrar secretos olvidados. \r\n" + //
                                        "En el centro, un altar de piedra se alza rodeado por una niebla espesa. De entre las sombras, un jaguar aparece, sus ojos dorados brillan como antorchas en la penumbra. Se detiene, mirándote con una amenaza palpable, y sus garras resuenan al rozar el suelo de piedra.\r\n" + //
                                        "Sostienes tu varita, que vibra levemente en tus manos.");
                files.combate.simularCombate(1*dificultad, "jaguar",player);
                //Subir nivel etc
                files.printCositas.textoEfectoEscritura("Tras sufrir varios ataques del jaguar consigues derrotarlo, este llevaba al cuello una llave dorada, es probable que esa llave haya parado varios de tus hechizos, la recoges y empiezas a buscar una puerta en la que puedas encajarla, bajas las escaleras corriendo e intentas buscar una cerradura.\r\n" + //
                                        "En una de las estatuas visualizas un agujero donde podría encajar, pero cuando vas a meter la llave se abre una grieta en la pared.");
                eleccion = files.Main.elegir("Grieta en la pared", "Cerradura", teclado);
                //Grieta en la pared
                if (eleccion == 1)
                {
                    files.printCositas.textoEfectoEscritura("Optas por entrar por la grieta que se ha abierto en la pared. Te deslizas por el estrecho pasaje y llegas a una caverna oscura y fría. De repente, un rugido ensordecedor resuena en la caverna.\r\n" + //
                                                "     \r\n" + //
                                                "Un tigre de las cavernas emerge de las sombras, sus colmillos brillan bajo la tenue luz. Con tu varita en mano, te preparas para la batalla.");
                    files.combate.simularCombate(1*dificultad, "tigre", player);
                    //subir nivel etc
                    files.printCositas.textoEfectoEscritura("El tigre ataca con ferocidad, pero logras esquivar sus embestidas y contraatacar con hechizos de fuego y hielo. Tras una intensa lucha, consigues derrotar al tigre.\r\n" + //
                                                "Exhausto pero victorioso, encuentras una salida al otro lado de la caverna, entras en ella sabiendo que cada batalla te hace más fuerte y sabio.");
                    //PASAR AL FINAL
                    finalMagia(player, dificultad);
                }
                //Cerradura
                else
                {
                    files.printCositas.textoEfectoEscritura("Decides girar la llave dorada en la cerradura de la estatua. Con un chasquido, la cerradura se abre y la estatua se desplaza lentamente, revelando una pequeña cámara oculta. En el centro de la cámara, un cofre antiguo descansa sobre un pedestal.\r\n" + //
                                                "Te acercas con cautela y abres el cofre, encontrando en su interior una gema brillante. Al tocarla, \r\n" + //
                                                "sientes una energía poderosa fluir hacia tu varita, mejorando su capacidad para canalizar hechizos.\r\n" + //
                                                "Ahora, tu varita puede lanzar hechizos con mayor precisión y potencia. Con esta nueva mejora, te sientes más preparado para enfrentar los desafíos que te esperan. Al fondo de la caverna ves una puerta, en el suelo hay un texto escrito:\r\n" + //
                                                "");
                    files.printCositas.textoEfectoEscritura("Canta sin tener voz, puede volar sin alas, sin tener dientes muerde y sin boca puede hablar.");
                    Ahorcado.ahorcado("ElViento", player);
                    //SUBIR ATAQUE
                    files.printCositas.textoEfectoEscritura("El viento suspiras... Te sientes preparado la puerta se abre ante ti sin hacer ningún tipo de ruido, entras sin pensarlo.");
                    //PASAR a la final
                    finalMagia(player, dificultad);
                }
            }
            //escalera que baja
            else
            {
                files.printCositas.textoEfectoEscritura("Mientras bajas las escaleras sientes una sensación de paz, tu cuerpo se relaja mientras piensas en lo que te ha llevado hasta ese momento. Ya llevas un rato bajando esas escaleras interminables y empiezas a pensar si has llegado a avanzar algo, esa sensación de paz abandona tu cuerpo de golpe, ahora estás en tensión, esta maldita cueva te está volviendo loco y necesitas salir.\r\n" + //
                                        "Comienzas a correr subiendo las escaleras pero para tu sorpresa lo que antes estaba abierto ahora es una puerta, esta puerta tiene un texto escrito que dice lo siguiente:\r\n");
                files.printCositas.textoEfectoEscritura("Dame comida y viviré. Dame agua y moriré. ¿Qué soy?");
                files.Ahorcado.ahorcado("ElFuego", player);
                                        //subes nivel etc
                files.printCositas.textoEfectoEscritura("Das tu respuesta sin pensarlo dos veces: ¡El fuego! y entras por la puerta, al fondo ves un cofre, lo abres y consigues una mejora para tu varita.            \r\n" + //
                                        "Vuelves a estar en la sala anterior, pero las estatuas están comenzando a flotar ya que la sala ha empezado a inundarse una vez has entrado.\r\n" + //
                                        "");
                eleccion = files.Main.elegir("Buceo", "Nadar", teclado);
                //buceo
                if (eleccion == 1)
                {
                    files.printCositas.textoEfectoEscritura("Sabes que necesitas salir de allí, así que sin pensarlo dos veces empiezas a bucear buscando una salida, bajo una de las estatuas había un pasadizo que sigues, está inundado y te estás quedando sin oxígeno.\r\n" + //
                                            "\r\n" + //
                                            "Te sumerges raudamente mientras notas como el agua inunda tus pulmones, comienzas a ver una luz, llegas a una sala que desprende una luz radiante, desde el interior escuchas una voz:");
                    files.printCositas.textoEfectoEscritura("Puede devorar todas las cosas: plantas, bestias, flores y aves. Roe el hierro y muerde acero, mata reyes, arruina ciudades y puede derribar las altas montañas");
                    Ahorcado.ahorcado("ElTiempo", player);
                    //Subir nivel
                    files.printCositas.textoEfectoEscritura("Comienzas a pensar que los ángeles te reclaman para darte muerte, respondes suspirando: “El tiempo”. \r\n" + //
                                            "La luz desaparece dejando ante ti un altar, un mango de hueso está posado sobre este, al lado, una nota que decides leer:");
                    files.printCositas.textoEfectoEscritura("“Lucha por nosotros, salva nuestras almas, queremos descansar y que la pesadilla acabe”. \r\n" + //
                                            "Ante ti, una puerta de piedra antigua se ilumina, estás decidido, vas a lograr tu meta, cruzas la puerta.");
                    //Pasar al FINAL
                    finalMagia(player, dificultad);
                }
                //Nadar
                else
                {
                    files.printCositas.textoEfectoEscritura("El nivel del agua no deja de subir, sabes que tarde o temprano llegará el momento en el que no podrás coger más oxígeno, el agua te tiene abrumado, la sala está completamente inundada. En el techo parece que hay una cúpula, lo ves y comienzas a golpearla, la cúpula se rompe y el agua te arrastra a presión por el agujero, caes por un precipicio.\r\n" + //
                                                "Por suerte, te quedas enganchado en un árbol cercano. Miras a tu alrededor y ves que bajo tus pies hay 3 leones esperando para comerte, sin pensarlo dos veces saltas y te bates en duelo");
                    files.combate.simularCombate(3*dificultad, "leon", player);
                    files.printCositas.textoEfectoEscritura("Te bates en duelo con ellos, es una batalla dura, te superan en número y están muy coordinados, te fijas en que uno de ellos es el macho alfa, si le das muerte los otros dos sucumbirán.\r\n" + //
                                                "Consigues lanzarle un hechizo de fuego y el león alfa cae, los otros dos huyen despavoridos ante tal muestra de fuerza.\r\n" + //
                                                "Estás hambriento bebes la sangre del león y consumes su carne, te encuentras recuperado y listo para seguir tu aventura. Al fondo de la sala ves una antigua puerta de piedra que se ilumina, tras todo lo que has pasado sin dudarlo te adentras en ella.\r\n" + //
                                                "");
                    //PASAR AL FINAL
                    finalMagia(player,dificultad);
                }
            }
        }
        else
        {
            files.printCositas.textoEfectoEscritura("Tras caminar durante un buen rato accedes a una caverna en la que encuentras un cofre maldito, debes resolver un acertijo para acceder al contenido del mismo, el acertijo reza:");
            files.printCositas.textoEfectoEscritura("Las raíces no se pueden ver y son más altas que un árbol. Arriba, muy arriba sube; sin embargo, nunca crece."            );
            files.Ahorcado.ahorcado("LaMontana", player);
            files.printCositas.textoEfectoEscritura("El cofre se abre solo y arroja su contenido, encuentras una empuñadura para tu varita, una poción de vida y 200 monedas de oro. Tras recoger las recompensas continúas por el pasadizo ayudándote del mechero para ver en la oscuridad, de pronto notas un temblor en el suelo y al echar la vista atrás ves una marabunta de serpientes que reptan hacia ti. Sales corriendo y no ves el acantilado delante tuya que da a una poza subterránea , caes inevitablemente…. \r\n" + //
                                "Tras subir a la superficie del agua te das cuenta de que no hay una salida fácil.");
            eleccion = files.Main.elegir("Agarrarte", "Bucear", teclado);
            //Agarrarte
            if (eleccion == 1)
            {
                files.printCositas.textoEfectoEscritura("Te agarras por las paredes intentando salir pero no hay forma, de pronto cae una cuerda al agua, sin pensártelo dos veces te agarras al extremo y comienzas a subir. Al llegar a la parte de arriba te das cuenta de que no hay nadie, esa cuerda no ha podido caer sola y tú lo sabes.\r\n" + //
                                        "\r\n" + //
                                        "En el suelo encuentras una antorcha apagada e intentas encenderla con tu mechero, pero al haber caído al agua, el mechero se ha mojado y ya no enciende, recitas varias veces un conjuro para hacer luz y tras varios intentos lo consigues, al hacerse la luz ves un enjambre de serpientes, el mismo que había provocado que cayeras a la poza.\r\n" + //
                                        "Necesitas buscar una solución.\r\n" + //
                                        "");
            eleccion = files.Main.elegir("Luchar", "Trepar", teclado);                            
                if (eleccion == 1)
                {
                    files.printCositas.textoEfectoEscritura("Empuñas tu varita y te decides a lanzar un hechizo de fuego para deshacerte de las serpientes, a simple vista cuentas miles de ellas, lanzas tu hechizo y consigues acabar con bastantes, pero no es suficiente. \r\n" + //
                                            "\r\n" + //
                                            "Comienzas a pensar que no va a ser posible eliminarlas a todas, pero recuerdas que en el libro que leíste antes de viajar en busca de las reliquias había un antiguo hechizo, rezaba algo como “en la peor de las situaciones solo el coraje te puede guiar”. Empiezas a pensar en todo lo que has pasado para llegar a ese momento y te cargas de una energía vibrante, antes nunca habías sentido ese poder, cargas tu hechizo y ,¡boom!, lo lanzas.\r\n" + //
                                            "");
                    files.combate.simularCombate(10*dificultad, "serpiente", player);
                    files.printCositas.textoEfectoEscritura("Has conseguido acabar con todas las serpientes, pero esto ha provocado un derrumbe. Ante ti se abre una grieta en la pared, mientras caminas por la grieta, encuentras unas escaleras, bajas y ante ti...");
                    //Pasar al FINAL
                    finalMagia(player,dificultad);
                }
                else
                {
                    files.printCositas.textoEfectoEscritura("Te ves abrumado ante la cantidad de serpientes que hay y decides subirte a unas rocas que hay en las paredes, mientras trepas te resbalas y te golpeas en la cabeza, te has hecho bastante daño pero no te queda otra más que seguir intentando escalar.\r\n" + //
                                            "\r\n" + //
                                            "Consigues subir a las piedras y comienzas a recordar todo lo que te ha llevado hasta ese momento, justo cuando estás perdiendo la esperanza ves un texto en la pared que reza:");
                    files.printCositas.textoEfectoEscritura("¿Qué va arriba y abajo pero nunca, nunca se mueve?");
                    files.Ahorcado.ahorcado("UnaEscalera", player);
                    files.printCositas.textoEfectoEscritura("Comienzas a darle vueltas al acertijo, “una escalera”, gritas, ¿esto en que me va a ayudar?, te dices a ti mismo, estás frustrado, pero ante ti se abren unos escalones de piedra que decides seguir, estás emocionado. \r\n" + //
                                        "Has conseguido salir de ese embrollo.");
                                    //Pasar al FINAL
                    finalMagia(player,dificultad);
                }
            }
            //Bucear
            else
            {
                files.printCositas.textoEfectoEscritura("Buceas para buscar una salida, pero a falta de aire debes salir a respirar continuamente. Te sumerges de nuevo en el agua. En esta segunda inmersión encuentras un pasadizo bajo el agua. \r\n" + //
                                        "Sigues el pasadizo hasta que te empieza a faltar el aire, encuentras un lugar de descanso para poder seguir tu camino. Al avanzar comienzas a visualizar luz, sigues tu recorrido a toda prisa y consigues salir a la superficie, ante ti, encuentras una sala llena de vegetación, escuchas pájaros y piensas que has llegado a la cámara secreta de Yax-Balam. Sin embargo, de pronto aparecen dos babuinos que buscan acabar contigo y así evitar que continúes tu búsqueda.");
                files.combate.simularCombate(2*dificultad, "babuino", player);
                files.printCositas.textoEfectoEscritura("Una vez muertos ambos babuinos necesitas recuperar fuerzas e hidratarte, encuentras unas bayas que crecen de un arbusto y al fondo visualizas una especie de jabalí.");
                eleccion = files.Main.elegir("Luchar", "Trepar", teclado);
                if (eleccion == 1)
                {
                    files.printCositas.textoEfectoEscritura("Necesitas plantear bien tu estrategia ya que estás cansado, decides pelear contra el jabalí. Le llamas desde la distancia y carga contra ti, el jabalí pasa cerca de ti pero no impacta, es el momento de que lances tu ataque, consigues herirle y os metéis en una lucha encarnizada.");
                    files.combate.simularCombate(1*dificultad, "jabali", player);
                    files.printCositas.textoEfectoEscritura("Acabas con la vida del jabalí y procedes a comerte su carne, es dura y sabe mal, pero necesitas alimentarte. Tras descansar un poco ves que tu pelea con el jabalí ha hecho una grieta en la pared por la que entra un haz de luz, decides atravesar la grieta.");
                    // Subir Vida
                    // Pasar al Final
                    finalMagia(player,dificultad);
                }
                else
                {
                    files.printCositas.textoEfectoEscritura("Estás tan cansado que necesitas consumir un alimento fácil que no te suponga hacer un gran esfuerzo, te tomas las bayas sin dejar ni una en el arbusto. Tras descansar un poco ves una puerta que se ilumina con los rayos de luz solar que se cuelan por la grieta natural que hay en el techo. Al fijarte en la puerta descubres que un texto reposa sobre el marco de la misma:");
                    files.printCositas.textoEfectoEscritura("No se puede ver ni se puede sentir, este ocupa todos los espacios vacíos. No se puede oler ni se puede oír, está detrás de los astros, y está al pie de las colinas, llega primero y se queda; mata risas y acaba vidas.");
                    files.Ahorcado.ahorcado("LaOscuridad", player);
                    files.printCositas.textoEfectoEscritura("Tras razonarlo te das cuenta de que es un acertijo y crees saber la respuesta, la oscuridad respondes titubeando");
                    files.printCositas.textoEfectoEscritura("La puerta se abre ante ti, cruzas la puerta...");
                        // Pasar al Final
                        finalMagia(player,dificultad);
                }

            }


        }

    }
}