import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        // Creating a LinkedList of Strings
        LinkedList<String> names = new LinkedList<>(); // ✅ Correct

        // Adding elements to LinkedList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.addFirst("First"); // Adds at the beginning
        names.addLast("Last"); // Adds at the end

        // Displaying LinkedList elements
        System.out.println("LinkedList: " + names);

        // Accessing elements
        System.out.println("First element: " + names.getFirst());
        System.out.println("Last element: " + names.getLast());

        // Removing elements
        names.remove("Charlie");
        names.removeFirst(); // Removes first element
        names.removeLast(); // Removes last element

        // Displaying updated LinkedList
        System.out.println("Updated LinkedList: " + names);

        // Iterating through the LinkedList
        System.out.println("Iterating over LinkedList:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
