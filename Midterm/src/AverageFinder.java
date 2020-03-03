public class AverageFinder {
    double computeAverage(int[] intArray){
        int sumOfInteger = 0;


        for (int item: intArray) {
            sumOfInteger += item;
        }

        return (double) sumOfInteger / intArray.length;
    }
}
