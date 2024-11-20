package files;

public class inventario 
{
    int pociones_curativas;
    int pociones_ataque;
    int pociones_defensa;

    public inventario(int atack_potion, int defense_potion, int heal_potion)
    {
        pociones_ataque = atack_potion;
        pociones_defensa = defense_potion;
        pociones_curativas = heal_potion;
    }

    public static void actualizaInventario(inventario myInventario,int atack_potion, int defense_potion, int heal_potion)
    {
        myInventario.pociones_ataque = atack_potion;
        myInventario.pociones_defensa = defense_potion;
        myInventario.pociones_curativas = heal_potion;
    }

    public static void printInventario(inventario myInventario)
    {
        System.out.println("------------------------------------------");
        System.out.println("---------Aquí esta tu inventario----------");
        System.out.printf("Tienes %d pociones curativas %n", myInventario.pociones_curativas);
        System.out.printf("Tienes %d pociones de ataque %n", myInventario.pociones_ataque);
        System.out.printf("Tienes %d pociones defensivas %n", myInventario.pociones_defensa);
        System.out.println("------------------------------------------");
    }
}
