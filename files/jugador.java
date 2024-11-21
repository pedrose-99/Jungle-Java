package files;

public class jugador 
{
    int maxHp;
    int hp;
    int defensa;
    int defensaActual;
    inventario myInventario;
    arma myArma;
    int dificultad;

    public jugador(int vida, int defense, inventario myInventary, arma myWeapon, int dificil)
    {
        maxHp = vida;
        hp = vida;
        defensa = defense;
        defensaActual = defense;
        myInventario = myInventary;
        myArma = myWeapon;
        dificultad = dificil;
    }

    public static jugador setJugador(int eleccion, inventario myInventario, arma myArma, int dificil)
    {
        jugador player;

        switch (eleccion)
        {
            case 1:
                player = new jugador(80, 8, myInventario, myArma, dificil);
                break ;
            case 2:
                player = new jugador(100, 10, myInventario, myArma, dificil);
                break ;
            default:
                player = new jugador(70, 7, myInventario, myArma, dificil);
                break ;
        }
        return player;
    }

}
