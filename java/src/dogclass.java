public class dogclass {
    public static void main (String args[]) {
        nameofdog("max");
        bark();
        sleep();
    }
    public static void nameofdog(String name) {
        System.out.println("name is " + name);
    }
    public static void bark() {
        System.out.println("barking");
    }
    public static void sleep() {
        System.out.println("sleeping");
    }
}
