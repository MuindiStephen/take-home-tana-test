import java.util.HashMap;
import java.util.Map;

/**
 * Question 2
 * @author MuindiStephen
 * @email stephenmuindi241@gmail.com
 * Created: 21/09/2025 19:44
 */
public class Question2_firstUniqueProduct {

    public static void main(String[] args) {
        String[] products = {"Apple", "Computer", "Apple", "Bag"};

        String result = findFirstUniqueProduct(products);

        System.out.println("The first unique product found is: " + result);
    }

    public static String findFirstUniqueProduct(String[] products) {

        // I used hashmap to store key-value pairs for the product string and its corresponding  number of occurrences
        HashMap<String, Integer> countMap = new HashMap<>();

        // Used a for loop to count the number of occurrences of a product string value
        for (String product : products) {
            countMap.put(product, countMap.getOrDefault(product, 0) + 1);
        }

        // Used this for loop to find the first unique product string
        for (String product : products) {
            if (countMap.get(product) == 1) {
                return product;
            }
        }

        return null; // return null value if no product string has been found unique
    }
}
