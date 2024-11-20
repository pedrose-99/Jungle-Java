package files;

public class jugador 
{
    int maxHp;
    int hp;
    int defensa;
    int defensaActual;
    inventario myInventario;
    arma myArma;

    public jugador(int vida, int defense, inventario myInventary, arma myWeapon)
    {
        maxHp = vida;
        hp = vida;
        defensa = defense;
        defensaActual = defense;
        myInventario = myInventary;
        myArma = myWeapon;
    }

}
