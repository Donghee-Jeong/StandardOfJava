package variable;

public class Literal {
    public static void main(String[] args) {
        // 실수형에서는 double이 기본 자료형이라서 접미사 'd'는 생략 가능하다.
        double rate = 1.618;

        // 접미사를 붙이지 않으면 float타입 리터럴이 아니라 double타입 리터럴로 간주되어 float타입 변수에 저장할 수 없다.
//        float pi = 3.14;
        float pi = 3.14f; // 컴파일 에러를 피하려면 접미사 'f'를 붙여야한다.

        // 문자열 리터럴은 "" 안에 아무런 문자도 넣지 않는 것을 허용하고, 이를 빈 문자열이라고 한다.
        String str = "";

        // 그러나 문자 리터럴은 반드시 '' 안에 하나의 문자가 있어야한다.
//        char ch = '';
        char ch = ' '; // 공백문자로 초기화
    }
}
