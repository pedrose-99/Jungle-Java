package files;

public class arma 
{
    int tipo;
    int dmg;
    int dmgActual;
    int AtaqueEspecial;

    //Función para crear un arma
    public arma(int eleccion)
    {
        switch (eleccion)
        {
            case 1:
                tipo = eleccion;
                dmg = 12;
                dmgActual = 12;
                AtaqueEspecial = 18;
                break;
            case 2:
                tipo = eleccion;
                dmg = 10;
                dmgActual = 10;
                AtaqueEspecial = 15;
                break;
            default:
                tipo = eleccion;
                dmg = 15;
                dmgActual = 15;
                AtaqueEspecial = 20;
                break;
        }                
    }
    static public arma setArma(int eleccion)
    {
        arma myArma = new arma(eleccion);
        return myArma;
    }
}

