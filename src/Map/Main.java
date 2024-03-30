package Map;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyMap<Object, Object> myMap = new MyMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Put");
            System.out.println("2. Get");
            System.out.println("3. Remove");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character after nextInt()

            switch (choice) {
                case 1:
                    System.out.print("Enter key: ");
                    Object key = scanner.nextLine();
                    System.out.print("Enter value: ");
                    Object value = scanner.nextLine();
                    myMap.put(key, value);
                    System.out.println("Key-value pair added successfully.");
                    break;
                case 2:
                    System.out.print("Enter key: ");
                    Object getKey = scanner.nextLine();
                    Object retrievedValue = myMap.get(getKey);
                    if (retrievedValue != null) {
                        System.out.println("Value for key '" + getKey + "': " + retrievedValue);
                    } else {
                        System.out.println("No value found for key '" + getKey + "'");
                    }
                    break;
                case 3:
                    System.out.print("Enter key to remove: ");
                    Object removeKey = scanner.nextLine();
                    Object removedValue = myMap.remove(removeKey);
                    if (removedValue != null) {
                        System.out.println("Removed value for key '" + removeKey + "': " + removedValue);
                    } else {
                        System.out.println("Key '" + removeKey + "' not found in the map");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
