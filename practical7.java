import java.util.*;

public class CollectionExample {

    public static <T> int countElements(Collection<T> collection, String property) {
        int count = 0;

        for (T element : collection) {
            if (property.equals("even") && element instanceof Integer) {
                if ((Integer) element % 2 == 0) count++;
            } else if (property.equals("odd") && element instanceof Integer) {
                if ((Integer) element % 2 != 0) count++;
            } else if (property.equals("prime") && element instanceof Integer) {
                if (isPrime((Integer) element)) count++;
            } else if (property.equals("palindrome") && element instanceof String) {
                if (isPalindrome((String) element)) count++;
            }
        }

        return count;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    private static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        List<Object> collection = new ArrayList<>();
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.add(5);
        collection.add(7);
        collection.add("madam");
        collection.add("hello");
        collection.add(11);
        collection.add(121);

        System.out.println("Even numbers count: " + countElements(collection, "even"));
        System.out.println("Odd numbers count: " + countElements(collection, "odd"));
        System.out.println("Prime numbers count: " + countElements(collection, "prime"));
        System.out.println("Palindromes count: " + countElements(collection, "palindrome"));
    }
}
