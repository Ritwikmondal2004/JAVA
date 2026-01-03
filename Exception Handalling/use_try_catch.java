import java.util.*;

public class use_try_catch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); // 0
        list.add(20); // 1
        list.add(30); // 2
        try {
            System.out.println("Elements in the list: " + list.get(5));
        } catch (Exception e) {
            System.out.println("Element not found at this index" + e.getMessage());
        }
    }
}
