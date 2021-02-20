public class Main {

    public static void main(String[] args) {
        Majitel majitel = new Majitel("Peter", "muž", 35);
        Auto auto = new Auto("Mazda", 112, majitel);

        System.out.println(auto.toString());
    }
}
