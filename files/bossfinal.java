package files;

public class bossfinal 
{
    int hp;
    int defensa;
    arma myArma;

    public bossfinal(int vida, int defense, arma myWeapon, int dificil)
    {
        hp = vida + dificil;
        defensa = defense + dificil;
        myArma = myWeapon;
    }

    public static bossfinal setBossfinal(int eleccion,  arma myArma, int dificil)
    {
        bossfinal finalBoss;

        switch (eleccion)
        {
            case 1:
                finalBoss = new bossfinal(80, 8,  myArma, dificil);
                break ;
            case 2:
                finalBoss = new bossfinal(100, 10, myArma, dificil);
                break ;
            default:
                finalBoss = new bossfinal(70, 7,  myArma, dificil);
                break ;
        }
        return finalBoss;
    }

}
