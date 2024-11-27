package files;

public class bossfinal 
{
    int hp;
    int hpMax;
    int defensa;
    arma myArma;

    public bossfinal(int vida, int defense, arma myWeapon, int dificil)
    {
        hp = vida + (dificil * 10);
        hpMax = hp;
        defensa = defense + dificil;
        myArma = myWeapon;
    }

    public static bossfinal setBossfinal(int eleccion, int dificil)
    {
        bossfinal finalBoss;
        arma myArma = new arma(eleccion);

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
