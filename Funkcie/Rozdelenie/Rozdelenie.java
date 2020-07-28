public class Rozdelenie {
    public Rozdelenie() {
    }

    public static void vypis() {
        for(int i = 0; i <= 20; ++i) {
            System.out.print("-");
        }

        System.out.println();
    }

    public static void vypis(int kolko) {
        for(int i = 0; i <= kolko; ++i) {
            System.out.print("-");
        }

        System.out.println();
    }

    public static void vypis(char znak) {
        for(int i = 0; i <= 20; ++i) {
            System.out.print(znak);
        }

        System.out.println();
    }

    public static void vypis(int kolko, char znak) {
        for(int i = 0; i <= kolko; ++i) {
            System.out.print(znak);
        }

        System.out.println();
    }
}
