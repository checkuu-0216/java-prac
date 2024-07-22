
public class Main {

    public static void main(String[] args) {
//       작은 크기의 타입이 큰 크기의 타입과 계산될때,
//        자동으로 큰크기의 타입으로 형변환 한다.

        int intNUmber = 10;
        double doubleNumber = 5.5;
        double result = intNUmber + doubleNumber;

        System.out.println(result);

        int iResult = intNUmber / 4;

        double dResult = intNUmber / 4.0;

        System.out.println(iResult +" / "+ dResult);
    }

}