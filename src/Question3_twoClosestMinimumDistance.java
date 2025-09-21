public class Question3_twoClosestMinimumDistance {

    public static void main(String[] args) {
        //Given the following array [1,2,3,1,4,5,2]
        int[] arr = {1, 2, 3, 1, 4, 5, 2};
        System.out.println("Distance between the two closest (nearest) minimums is : " + distanceBetweenTwoClosestMinimums(arr));
    }

    private static Integer distanceBetweenTwoClosestMinimums(int[] arr) {
        int n = arr.length;

        // A for loop to find the minimum int value in the array
        int minVal = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < minVal) {
                minVal = num;
            }
        }

        // Now we find the minimum distance between the
        // two minimum by finding difference between their indexes in the array
        // That is in this array { 1, 2, 3, 1, 4, 5, 2 }
        // 1 - index 0 and 1 index 3, therefore 3-0 = 3 which is the min distance
        int prevIndex = -1;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] == minVal) {
                if (prevIndex != -1) {
                    minDistance = Math.min(minDistance, i - prevIndex);
                }
                prevIndex = i;
            }
        }

        return minDistance;
    }

}

