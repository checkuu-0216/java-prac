
public class Main {

    public static void main(String[] args) {
//       변수 타입별 크기 순서
//        byte(1) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8)

        byte byteNumber = 10;
        int intNumber = byteNumber;
        System.out.println(intNumber);

        char charAlphabet = 'A';
        intNumber = charAlphabet;
        System.out.println(intNumber);

        intNumber = 100;
        long longNumber = intNumber;
        System.out.println(longNumber);

        intNumber = 200;
        double doubleNumber = intNumber;
        System.out.println(doubleNumber);
    }

}