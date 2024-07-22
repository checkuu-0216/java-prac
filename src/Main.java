
public class Main {
    public static void main(String[] args) {
        // 우리의 공간
        // boolean 변수 선언
        //타입이름 = 값;

//        정수형 (byte, short, int, long)

        byte bytenumber = 127; // -128 ~127(1byte) 표현범위 넘어가는 숫자를 입력하면 오류난다 ex)300
        //        카멜 케이스
        short shortnumber = 32767; // -32,768 ~ 32,767
        int intnumber = 2147483647;
        long longnumber = 2147483647L;

        System.out.println(bytenumber);
        System.out.println(shortnumber);
        System.out.println(intnumber);
        System.out.println(longnumber);
    }
}