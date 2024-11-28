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
            case "bicho":
                enemy = new enemigo(nombre, 15, 6, 3);
                break ;
            case "gorila":
                enemy = new enemigo(nombre, 35, 10, 10);
                break ;
            case "serpiente":
                enemy = new enemigo(nombre, 20, 9, 13);
                break ;
            case "jaguar":
                enemy = new enemigo(nombre, 40, 10, 13);
                break ;
            case "jabali":
                enemy = new enemigo(nombre, 60, 14, 14);
                break ;
            case "Guarlock":
                enemy = new enemigo(nombre, 80, 12, 10);
                break;
            case "lagarto":
                enemy = new enemigo(nombre, 15, 6, 10);
                break;
            case "mambaNegra":
                enemy = new enemigo(nombre, 25, 12, 10);
                break;
            default:
                enemy = new enemigo(nombre, 30, 7, 9);
                break ;
        }
        return enemy;
    }

}
