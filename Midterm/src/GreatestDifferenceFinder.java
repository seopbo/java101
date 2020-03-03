public class GreatestDifferenceFinder {
    int greatestDifference(int[] intArray) {
        if (intArray.length < 2) {
            return 0;
        }
        int maxItem = intArray[0];
        int minItem = intArray[0];

        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] > maxItem) {
                maxItem = intArray[i];
            }
            if (intArray[i] < minItem) {
                minItem = intArray[i];
            }
        }
        return maxItem - minItem;
    }
}