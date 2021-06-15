import java.util.Arrays;

public class ProblemFive {

    public static boolean comp(int[] arrayA, int[] arrayB) {
        if(arrayA != null && arrayB != null && arrayA.length == arrayB.length){
            for(int element: arrayA ){
                int square = element * element;
                boolean squareFound = Arrays.stream(arrayB).filter( x -> x == square).findFirst().isPresent();
                if(squareFound != true) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arrayA = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] arrayB = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};

        System.out.println(ProblemFive.comp(arrayA, arrayB));
    }
}
