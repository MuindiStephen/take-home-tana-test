public class Question3_twoClosestMinimumDistanceTest {

    public static void main(String[] args) {
        //Given the following array [1,2,3,1,4,5,2]
        int[] arr = {1, 2, 3, 1, 4, 5, 2};

        // we have 1 and 1 as minimums and first 1 at index(0) and the other 1 at index(3)
        //Therefore minDistance will be 3-0=3
        System.out.println("Our Expected output shd be: 3");
        System.out.println("Distance between the two closest (nearest) minimums is : " + Question3_twoClosestMinimumDistance.distanceBetweenTwoClosestMinimums(arr));
    }
}
