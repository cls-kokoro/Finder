public class Finder {
    public static Integer findMax(int[] intArray) {
        if (intArray == null || intArray.length == 0) {
            return null;
        }
        int temp = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > temp) {
                temp = intArray[i];
            }
        }
        return temp;
    }
    public static Integer findMin(int[] intArray) {
        if (intArray == null || intArray.length == 0) {
            return null;
        }
        int temp = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < temp) {
                temp = intArray[i];
            }
            }
        return temp;
    }
}

