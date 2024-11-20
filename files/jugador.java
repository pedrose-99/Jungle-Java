package files;

public class jugador 
{
    int maxHp;
    int hp;
    int defensa;
    int defensaActual;
    inventario myInventario;
    arma myArma;

    public static void printStats(jugador player)
    {
        System.out.println("------------------------------------------");
        System.out.println("-------Aquí estan tus estadisticas--------");
        System.out.printf("Tienes %d/%d %n", player.hp, player.maxHp);
        System.out.printf("Tienes %d de defensa %n", player.defensaActual);
        System.out.printf("Tienes %d de ataque %n", player.myArma.dmgActual);
        System.out.println("------------------------------------------");
    }

    public jugador(int vida, int defense, inventario myInventary, arma myWeapon)
    {
        maxHp = vida;
        hp = vida;
        defensa = defense;
        defensaActual = defense;
        myInventario = myInventary;
        myArma = myWeapon;
    }

    public static jugador setJugador(int eleccion, inventario myInventario, arma myArma)
    {
        jugador player;

        switch (eleccion)
        {
            case 1:
                player = new jugador(80, 8, myInventario, myArma);
                break ;
            case 2:
                player = new jugador(100, 10, myInventario, myArma);
                break ;
            default:
                player = new jugador(70, 7, myInventario, myArma);
                break ;
        }
        return player;
    }

}
