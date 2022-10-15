import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args){
        int num = readNum();
        checkNum(num);

        String numberSign = checkSign(num);

        String numberParity = checkParity(num);

        String numberLength = checkLength(num);

        String answer = solvAns(numberSign, numberParity, numberLength);

        ansWrite(answer);
    }

    private static int readNum(){ // обработка помещенного числа
        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }

    private static void checkNum(int num){
        if (num >= 1000 || num <= -1000){
            System.out.println("Number may be from -999 to 999");
            System.exit(0);
        }
    }

    private static String checkSign(int num){
        if (num < 0){
            return "Negative";
        }
        else if (num == 0) {
            return "Zero";
        }
        else {
            return "Positive";
        }
    }

    private static String checkParity(int num) {
        if (num % 2 == 0) {
            return "even";
        }
        else {
            return "odd";
        }
    }

    private static String checkLength(int num) {
        int len = 0;
        num = Math.abs(num);

        while (num != 0) {
            len++;
            num /= 10;
        }


        if (len == 1) {
            return "single-digit";
        }
        else if (len == 2) {
            return "two-digit";
        }
        else if (len == 3) {
            return "three-digit";
        }
        else {
            return "zero";
        }
    }

    private static String solvAns(String sign, String parity, String length) {
        if (sign == "zero") {
            return "zero number";
        }
        else {
            return sign + " " + parity + " " + length + " " + "number";
        }
    }

    private static void ansWrite(String ans) { // выводим в консоль этот текст
        System.out.println(ans);
    }
}