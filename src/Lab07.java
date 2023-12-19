public class Lab07 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Adding elements
        set.add("hello");
        set.add("world");
        set.add("261200");

        // Testing contains
        System.out.println("Contains hello: " + set.contains("hello")); // true
        System.out.println("Contains ant: " + set.contains("ant")); // false

        // Testing size
        System.out.println("Set size: " + set.size()); // 3

        // Testing iterator
        System.out.println("Set elements: " + set);

        // Testing remove
        set.remove("hello");
        System.out.println("After removing hello: " + set);
        System.out.println("Set size: " + set.size()); // 2

        // Testing clear
        set.clear();
        System.out.println("After clearing set: " + set);
        System.out.println("Set size: " + set.size()); // 0
    }
}