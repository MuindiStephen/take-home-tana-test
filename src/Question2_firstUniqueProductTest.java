/**
 * Question 2 test
 * @author MuindiStephen
 * @email stephenmuindi241@gmail.com
 */
public class Question2_firstUniqueProductTest {

    public static void main(String[] args) {
        String[] products = {"Apple", "Computer", "Apple", "Bag"};
        //Apple occurs 2 times and common - not unique
        //Computer occurs 1 times - unique
        //Bag occurs 1 times - unique

        //Therefore Apple is not unique and is common
        // Computer is unique and it appears the first

        String result = Question2_firstUniqueProduct.findFirstUniqueProduct(products);

        System.out.println("Our expected output for first unique product should be: Computer ");

        System.out.println("The first unique product found is: " + result);
    }
}
