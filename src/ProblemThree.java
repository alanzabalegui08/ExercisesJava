public class ProblemThree {

    public static char findMissingLetter(char[] array) {
        for (int index=1; index < array.length; index++) {
            int a = array[index] - array[index-1];
            if ( a != 1) {
                char x = (char)(array[index]-1); // convert char code to char
                return x;
            }
        }
        return '?';
    }

    public static void main(String[] args) {
        char[] array1 = new char[] { 'a','b','c','d','f' };
        System.out.println(ProblemThree.findMissingLetter(array1));
    }
}
