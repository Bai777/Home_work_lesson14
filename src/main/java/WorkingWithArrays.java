import java.util.Arrays;

public class WorkingWithArrays {
    private static int[] arrOne;
    private static int[] arrTwo;


    public static void main(String[] args) {


        arrOne = new int[]{1, 4, 5, 4, 7};
        System.out.println(Arrays.toString(arrayCheckOneArr(arrOne)));

        arrTwo = new int[]{1, 2, 4, 1, 4};
        System.out.println(arrayCheckTwoArr(arrTwo));
    }

    public static int[] arrayCheckOneArr(int[] arrOne) {
        int x = 0;
        int [] result = null;
        for (int i = 0; i < arrOne.length; i++) {
            if (arrOne[i] == 4) {
                x = arrOne[i];
                result = new int[arrOne.length - i - 1];
                for (int j = i + 1, k = 0; j < arrOne.length; j++, k++) {
                    if (arrOne[j] == 4) continue;
                    result[k] = arrOne[j];
                }
            }
        }
        try{
            x = 1 / x;
        } catch(ArithmeticException e){
            throw new RuntimeException();
        }
        return result;


        }



    public static boolean arrayCheckTwoArr(int[] arrTwo) {
        for (int i = 0; i < arrTwo.length; i++) {
            if (arrTwo[i] != 1 && arrTwo[i] != 4) return false;
        }
        return true;
    }

}
