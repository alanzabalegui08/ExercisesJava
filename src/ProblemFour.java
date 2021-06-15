import java.util.Arrays;

public class ProblemFour {

    public static int[] arrayDiff(int[] arrayA, int[] arrayB) {
        return Arrays.stream(arrayA)
                .filter(element -> Arrays.stream(arrayB)
                        .noneMatch(arrayBPrima -> element == arrayBPrima))
                .toArray();
    }

    public static void main(String[] args) {
        int[] testOne = ProblemFour.arrayDiff(new int[]{1, 2}, new int[]{1}); // output: 2
        int[] testTwo = ProblemFour.arrayDiff(new int[]{1, 2, 2}, new int[]{1}); // output: 2,2
        int[] testThree = ProblemFour.arrayDiff(new int [] {1,2,2}, new int[] {2}); // output: 1
        int[] testFour = ProblemFour.arrayDiff(new int [] {1,2,2}, new int[] {}); // output: 1,2,2

        /*for(int element: testOne){
            System.out.println(element);
        } */

        /*for(int element: testTwo){
            System.out.println(element);
        }*/

        /*for(int element: testThree){
            System.out.println(element);
        }*/

        for(int element: testFour){
            System.out.println(element);
        }
    }
}
