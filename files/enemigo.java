package files;

public class enemigo 
{
    String nombre;
    int hp;
    int defensa;
    int dmg;

    public enemigo(String name, int vida, int defense, int dano)
    {
        nombre = name;
        hp = vida;
        defensa = defense;
        dmg = dano;
    }

    public static enemigo[] generacionEnemigos(int numEnemigos, String nombre)
    {
        enemigo[] enemigos = new enemigo[numEnemigos];
        for(int i = 0; i < numEnemigos; i++)
        {
            enemigos[i] = setEnemigo(nombre);
        }
        return (enemigos);
    }

    public static enemigo setEnemigo(String nombre)
    {
        enemigo enemy;
        
        switch (nombre)
        {
            case "aveMadre":
                enemy = new enemigo(nombre, 40,9, 10);
                break ;
            case "aveCria":
                enemy = new enemigo(nombre, 20, 6, 5);
                break ;
            case "leon":
                enemy = new enemigo(nombre, 30, 10, 9);
                break ;
            case "babuino":
                enemy = new enemigo(nombre, 25, 6, 12);
                break ;
            case "gorila":
                enemy = new enemigo(nombre, 35, 10, 10);
                break ;
            case "serpiente":
                enemy = new enemigo(nombre, 20, 9, 13);
                break ;
            case "oso":
                enemy = new enemigo(nombre, 40, 10, 11);
                break ;
            default:
                enemy = new enemigo(nombre, 30, 7, 9);
                break ;
        }
        return enemy;
    }

}
