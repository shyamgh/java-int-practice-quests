package tests;

public class SingletonClass {

    private static SingletonClass s; // single object

    private SingletonClass() {}

    public static SingletonClass getObj() {
        if (s == null) { // initialize only if null
            s = new SingletonClass();
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(getObj().hashCode());
        System.out.println(getObj().hashCode());
    }

}
