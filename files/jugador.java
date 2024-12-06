package files;

public class jugador 
{
    int maxHp;
    int hp;
    int defensa;
    int defensaActual;
    inventario myInventario;
    arma myArma;

    //Función para crear al jugador
    public jugador(int vida, int defense, inventario myInventary, arma myWeapon)
    {
        maxHp = vida;
        hp = vida;
        defensa = defense;
        defensaActual = defense;
        myInventario = myInventary;
        myArma = myWeapon;
    }
    //Función para construir el jugador
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
