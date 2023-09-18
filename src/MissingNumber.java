public class MissingNumber {

    public static int missingNumber(int[] array, int max_num) {
        int[] allNumbers = new int[max_num];
        boolean found = false;
        for (int i = 1; i < max_num + 1; i++) {
            allNumbers[i - 1] = i;
        }
        for (int num : allNumbers) {
            for (int i : array) {
                if (i == num) {
                    found = true;
                    break;
                }
            }
            if (found == false) {
                return num;
            }
        }
        return 0;
    }
}
// The first solution code I believe has the same idea as me, creating a new object or array and seeing if it contains it or not. Mine took longer as I had to use 2 loops to loop through each array where you were able to loop though 1 at a time

// The second solution saves more space, instead of using two arrays or objects, it just loops through one and uses a for loop as something to compare to instead of another array

// The third solution made me mad with how simple it is. Especially as a math teacher, instead of the traditional "put it into an array" it just took the sum, compared to what the sum should be and found the difference. Saving time and space.


