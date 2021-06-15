public class ProblemTwo {

    public static int persistence(long number) {
        int turns = 0;
        while(number > 9) {
            int multiplier = 1;
            for(char digit : String.valueOf(number).toCharArray()){
                multiplier *= Integer.parseInt(String.valueOf(digit));
            }
            number = multiplier;
            turns ++;
        }
        return turns;
    }

    public static void main(String[] args) {
        System.out.println(ProblemTwo.persistence(39));
        System.out.println(ProblemTwo.persistence(4));
        System.out.println(ProblemTwo.persistence(25));
        System.out.println(ProblemTwo.persistence(999));
    }

}
