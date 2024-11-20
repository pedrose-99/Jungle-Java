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

    public static void imprimirEnemigo(enemigo myEnemy)
    {
        System.out.println("------------------------------------------");
        System.out.println("Enemigo "+ myEnemy.nombre+" ha aparecido.");
        System.out.println("Tiene " + myEnemy.hp + " de vida.");
        System.out.println("------------------------------------------");
    }
}
