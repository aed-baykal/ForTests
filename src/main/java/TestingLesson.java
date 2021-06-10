public class TestingLesson {

//    private static final int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
////    private static final int[] input = {1, 4, 1, 4, 1, 1, 1, 4, 4, 4, 1};
//
//    public static void main(String[] args) {
//        System.out.println(Arrays.toString(copyAfterFour(input)));
//        System.out.println(arrayOfOneAndFour(input));
//    }


    public static int[] copyAfterFour(int[] inputArray) {
        int lastIndexOf = -1;
        int[] copy;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == 4) lastIndexOf = i + 1;
        }

        if ((inputArray.length - lastIndexOf) <= inputArray.length) {
            copy = new int[inputArray.length - lastIndexOf];
            System.arraycopy(inputArray, lastIndexOf, copy, 0, inputArray.length - lastIndexOf);
            return copy;
        } else {
            throw new RuntimeException("Массив не содержит '4' ");
        }
    }

     public static boolean arrayOfOneAndFour(int[] inputArray) {
        int lastOne = 0;
        int lastFour = 0;

         for (int i : inputArray) {
             switch (i) {
                 case 1 -> lastOne = 1;
                 case 4 -> lastFour = 4;
                 default -> throw new RuntimeException("Массив содержит не только '1' и '4'");
             }
         }
         if (lastOne != 1 || lastFour != 4) throw new RuntimeException("Массив не содержит '1' или '4'");
         else return true;
     }

}
