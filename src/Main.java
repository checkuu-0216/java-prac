
//import = 수입하다. / 외부에서 제공하는 것들을 가져올때 쓴다
// 문자 -> 숫자

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char letter = sc.nextLine().charAt(0); // 첫번째 글자만 받아오기위해 charAt(0) 메서드를 사용합니다.
        int asciiNumber = (int)letter; // 숫자로 형변환을 해주면 저장되어있던 아스키 숫자값으로 표현됩니다.

        System.out.println(asciiNumber);
    }

}