import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        ArrayList<String> items = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            items.add(scanner.next());
        }
        
        String searchItem = scanner.next();
        
        Collections.sort(items);
        
        System.out.println("Sorted Items: " + items);
        
        if (items.contains(searchItem)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
        
        scanner.close();
    }
}
