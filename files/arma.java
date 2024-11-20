package files;

public class arma 
{
    int tipo;
    int dmg;
    int dmgActual;
    int AtaqueEspecial;

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

    public static void imprimirEstadisticas(arma myArma)
    {
        switch (myArma.tipo) {
            case 1:
                System.out.println("------------------------------------------");
                System.out.println("------------------Mago--------------------");
                break;
            case 2:
                System.out.println("------------------------------------------");
                System.out.println("-----------------Guerrero------------------");
                break;
            default:
                System.out.println("------------------------------------------");
                System.out.println("-----------------Arquero------------------");
                break;
        }
        System.out.println("- Daño base: " + myArma.dmg);
        System.out.println("- Ataque especial: "+ myArma.AtaqueEspecial);
        System.out.println("------------------------------------------");
    }
}

