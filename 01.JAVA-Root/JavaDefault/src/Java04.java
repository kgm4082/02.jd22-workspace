import java.util.Scanner;

public class Java04 {
    public static void main(String[] args) {
        // [Java 조건 및 If 문]

        // 1. Java는 수학의 일반적인 논리 조건사용

        // (1) 미만: a < b
        // (2) 이하: a <= b
        // (3) 초과: a > b
        // (4) 이상: a >= b
        // (5) 같음: a == b
        // (6) 다름: a != b

        // [ Scanner 를 사용하여 입력데이터 받기! ]
        // java.util.Scanner를 import하여 사용함!
        // 자동import 단축키: alt+shift+O (알쉬오~~~!)
        // 스캐너 생성시 값으로 System.in을 설정하여
        // 입력라인이 생성되게 한다!
        Scanner myObj = new Scanner(System.in);
        System.out.println("배우의 이름을 입력하시오!");
        // 아래쪽에 입력라인이 생김
        // 입력후 입력 데이터를 변수에 할당한다!
        // nextLine() 메서드로 입력 라인 전체를 가져옴
        // next() 메서드는 단어하나를 가져옴(띄어쓰기 맨앞단어만)
        String actor = myObj.nextLine();
        System.out.println("배우이름: "+actor);


        /////////////////////////////////////
        // 2. if문 
        // : 조건이 true일때 실행할 코드를 제어함

        // if (조건문) {
        //     // 실행코드
        // } else if (조건문) {
        //     // 실행코드
        // } else {
        //     // 실행코드
        // }

        // if : 지정된 조건이 true인 경우 실행할 코드
        // else if : 상단 조건이 false인 경우 새로운 조건 추가
        // else : 모든 조건에 해당없을 경우 실행할 코드

        // 3. 삼항연산자(짧은 if문)
        // 변수 = (조건문) ? true시 실행문 :  false시 실행문;


        // 4. switch 문

        // : 단일조건을 분류하여 실행코드를 나눔

        // switch(변수) {
        //     case x:
        //     // 실행코드
        //     break;
        //     case y:
        //     // 실행코드
        //     break;
        //     default:
        //     // 실행코드
        // }

        // 5. while문
        // - 조건이 true인 동안 반복실행 코드를 제어함

        // while (조건문) {
        //     // 실행코드
        // }

        // 6. Do/While문
        // - 먼저 코드를 실행후 반복실행 여부를 제어함

        // do {
        //     // 실행코드
        // }
        // while (조건문);

        // 7. for문
        // - 지정된 횟수 만큼 코드를 반복실행하여 제어함

        // for (시작값; 한계값; 증감) {
        //     // 실행코드
        // }

        // (1) 시작값 : 변수선언과 시작값 할당
        // (2) 한계값 : 변수의 한계값 설정
        // (3) 증감 : 변수의 증가 / 감소

        // 8. for-each 문
        // - 배열값 만큼 자동으로 변수에 할당하면 실행코드 반복 제어함

        // for (타입선언변수 : 배열변수명) {
        //     // 실행코드
        // }

        // 9. for문 중단,계속 옵션 키워드
        // (1) continue 빼고 계속
        // (2) break 중단
    }
}