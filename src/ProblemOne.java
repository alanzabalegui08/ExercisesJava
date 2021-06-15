
public class ProblemOne {

    public static boolean validatePIN(String pin){
        return pin.matches("\\d{4}|\\d{6}");
    }

    public static void main(String[] args) {

        Boolean test1 = ProblemOne.validatePIN("12345x");
        Boolean test2 = ProblemOne.validatePIN("12345");
        Boolean test3 = ProblemOne.validatePIN("1234");
        Boolean test4 = ProblemOne.validatePIN("123456");
        Boolean test5 = ProblemOne.validatePIN(".567");
        Boolean test6 = ProblemOne.validatePIN("");

        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
        System.out.println(test5);
        System.out.println(test6);
    }
}
