package files;

public class enemigoFinal 
{
    int hp;
    int hpMax;
    int defensa;
    arma myArma;
    //Función para crear el enemigo final
    public enemigoFinal(int vida, int defense, arma myWeapon, int dificil)
    {
        hp = vida + (dificil * 10);
        hpMax = hp;
        defensa = defense + dificil;
        myArma = myWeapon;
    }
    //Función para construir el enemigo final
    public static enemigoFinal setenemigoFinal(int eleccion, int dificil)
    {
        enemigoFinal finalBoss;
        arma myArma = new arma(eleccion);

        switch (eleccion)
        {
            case 1:
                finalBoss = new enemigoFinal(80, 8,  myArma, dificil);
                break ;
            case 2:
                finalBoss = new enemigoFinal(100, 10, myArma, dificil);
                break ;
            default:
                finalBoss = new enemigoFinal(70, 7,  myArma, dificil);
                break ;
        }
        return finalBoss;
    }
}
