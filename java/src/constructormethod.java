public class constructormethod {
    public constructormethod() {
        System.out.println("this is constructor method");
    }

    public constructormethod(String param) {
        System.out.println("this is constructor method with " + param);
    }

    public void instance() {
        System.out.println("this is instance ");
    }
}
    class constructormethodexample {
    public static void main (String args[]) {
        constructormethod method1 = new constructormethod("constructor");
        method1.instance();
        }
    }

