import java.text.DecimalFormat;
import java.util.Scanner;

// Java04. 자바 제어문(if,switch,while,for문), 배열
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

        // 스캐너는 메모리 영역을 try문으로 감싸서 관리한다!
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("배우의 이름을 입력하시오!");
            // 아래쪽에 입력라인이 생김
            // 입력후 입력 데이터를 변수에 할당한다!
            // nextLine() 메서드로 입력 라인 전체를 가져옴
            // next() 메서드는 단어하나를 가져옴(띄어쓰기 맨앞단어만)
            // nextInt() -> 숫자를 입력받는 스캐너 메서드(형별로 다 있음)
            String actor = myObj.nextLine();
            System.out.println();
            System.out.println("배우이름: " + actor);

            System.out.println();
            System.out.println("이 배우의 성별을 입력하시오.(남자/여자)");
            String gender = myObj.nextLine();
            System.out.println();
            System.out.println("성별: " + gender);
            System.out.println();

            // 입력창으로 받은 데이터는 엔터기호등 다른
            // 데이터가 포함되어 있어서 == 비교연산자로 하지말고
            // 변수.equals(내용) 메서드로 비교하면
            // 정확히 입력된 데이터만 비교한다!!!

            // 배우 이름에 해당하는 대표작으로 표시하는 if문
            // if(actor=="공유"){ // 데이터때문에 비교못함
            if (actor.equals("공유") &&
                    gender.equals("남자")) {
                System.out.println("대표작: 도깨비");
            } /////// if ///////////
            else if (actor.equals("김수현") &&
                    gender.equals("남자")) {
                System.out.println("대표작: 해품달");
            } /////// else if ///////
            else if (actor.equals("김수현") &&
                    gender.equals("여자")) {
                System.out.println("대표작: 어벤져스 - 에이지 오브 울트론");
            } /////// else if ///////
            else {
                System.out.println("넌 누구냐?");
            } /////// else /////////

            System.out.println();

            /////////////////////////////////////
            // 2. if문
            // : 조건이 true일때 실행할 코드를 제어함

            // if (조건문) {
            // // 실행코드
            // } else if (조건문) {
            // // 실행코드
            // } else {
            // // 실행코드
            // }

            // if : 지정된 조건이 true인 경우 실행할 코드
            // else if : 상단 조건이 false인 경우 새로운 조건 추가
            // else : 모든 조건에 해당없을 경우 실행할 코드

            System.out.println("오늘은 당신의 생일인가요?(예/아니오)");
            String birth = myObj.nextLine();
            System.out.println();
            System.out.println(
                    birth.equals("예") ? "생일축하해요!" : "오늘도행복하세요!");

            // 3. 삼항연산자(짧은 if문)
            // 변수 = (조건문) ? true시 실행문 : false시 실행문;
            // 비?집:놀이동산

            System.out.println();
            System.out.println("오늘 점심메뉴를 선택하세요!");
            System.out.println("1.마라탕");
            System.out.println("2.감자탕");
            System.out.println("3.돈까스");
            System.out.println("4.비빔밥");
            System.out.println("5.기타");

            System.out.println("#메뉴선택번호: ");
            int menu = myObj.nextInt();
            System.out.println();

            /// 선택 메뉴 번호에 따라 switch문으로 출력문을 다르게함!
            switch (menu) {
                case 1:
                    System.out.println("마라마라마라탕탕탕!!!");
                    break;
                case 2:
                    System.out.println("감자돌이,감자순이!!!");
                    break;
                case 3:
                    System.out.println("돈내고돈까스머거!!!");
                    break;
                case 4:
                    System.out.println("마구마구비벼머거!!!");
                    break;
                default:
                    System.out.println("아무거나머거머거!!!");

            } //////////// switch ////////////////

            // 4. switch 문

            // : 단일조건을 분류하여 실행코드를 나눔

            // switch(변수) {
            // case x:
            // // 실행코드
            // break;
            // case y:
            // // 실행코드
            // break;
            // default:
            // // 실행코드
            // }

            System.out.println();
            System.out.println(
                    "지금 빵을 몇개 먹고 싶은가? \n개수를 숫자로 써라! 그럼 빵줄께!^^");
            System.out.println("#빵개수: ");
            int bread = myObj.nextInt();
            System.out.println();

            // 숫자증가변수
            int bnum = 0;
            while (bnum < bread) {
                bnum++; // 1씩증가
                System.out.print("빵 ");
            } /////// while문 //////////

            System.out.println("\n");

            // 5. while문
            // - 조건이 true인 동안 반복실행 코드를 제어함

            // while (조건문) {
            // // 실행코드
            // }

            // [세자리마다 콤마찍기 방법:]
            // DecimalFormat 클래스
            // 생성: DecimalFormat 변수 = new DecimalFormat(형식)
            // 사용: 변수.format(사용할변수)
            DecimalFormat df = new DecimalFormat("###,###");
            // ###,### -> 샾은 숫자자리를 의미, 3자리마다 콤마형식

            // 자신의 월급을 쓰고 몇번 월급 받고 싶은지 써서
            // 월급의 총액을 알아보자!
            System.out.println("당신의 월급은 얼마입니까?");
            int myPay = myObj.nextInt();
            System.out.println("월급: " +
                    df.format(myPay) + "원");
            System.out.println();

            System.out.println("당신은 당신의 회사에서 몇번이나 월급을 받고 싶나요?");
            int payNum = myObj.nextInt();
            System.out.println("월급횟수: " + payNum);
            System.out.println();

            // 월급횟수 증가변수
            int payCycle = 1;

            // 일단 월급은 한번받고 시작한다!!!
            do {
                System.out.println("월급 " +
                        df.format(myPay) + "원 *" +
                        payCycle + "번 받고 \n총액:" +
                        df.format(myPay * payCycle) + "원");

                // 증감필수!!!
                payCycle++;
            } while (payCycle <= payNum); // 세미콜론 필수!!!

            System.out.println();

            // 6. Do/While문
            // - 먼저 코드를 실행후 반복실행 여부를 제어함

            // do {
            // // 실행코드
            // }
            // while (조건문);

            // 무지개색을 배열변수에 넣고 for문 돌리기
            String[] rainbow = {
                    "빨강", "주황", "노랑", "초록", "파랑", "남", "보라" };
            // 미션:
            System.out.print("#무지개색 종류는 순서대로 ");
            // for문 //////
            for (int i = 0; i < rainbow.length; i++) {
                System.out.print(rainbow[i] + "색");
                // 마지막 배열일때
                if (i == rainbow.length - 1) {
                    System.out.print(" 입니다!\n\n");
                } /////// if //////
                  // 나머지 배열일때
                else {
                    System.out.print(", ");
                } ////// else ///////

                // 출력내용:
                // 빨강색, 주황색, 노랑색, 초록색, 파랑색, 남색, 보라색 입니다!
            } ////////////// for /////////////

            // 7. for문
            // - 지정된 횟수 만큼 코드를 반복실행하여 제어함

            // for (시작값; 한계값; 증감) {
            // // 실행코드
            // }

            // (1) 시작값 : 변수선언과 시작값 할당
            // (2) 한계값 : 변수의 한계값 설정
            // (3) 증감 : 변수의 증가 / 감소

            // ### 배열의 전체 축구선수 명단 중
            // 올림픽경기에 나갈 선수만 표시하기(continue)
            // 예비선수는 제외함(break)
            String player[] = {
                    "김기춘", "홍서범", "하준상", "이종학",
                    "예비:이병준", "예비:서이룡"
            };

            System.out.println(
                    "#축구 한국 대표팀 선수 전체명단:");
            // for-each문
            for (String mem : player) {
                System.out.println(mem);
            } ////////// for-each ////////////

            System.out.println();

            // "하준상"은 제외, "예비:이병준"부터 출력안함!
            System.out.println(
                "#올림픽 경기에 참가할 축구선수 명단:");
            /// for-each
            for(String mem : player){
                // "하준상" 거르기 -> continue
                if(mem=="하준상") continue;
                // "예비:이병준" 부터 빠져나감! -> break
                if(mem=="예비:이병준") break;
                System.out.println(mem);
            } /////////// for-each ////////////

            // 8. for-each 문
            // - 배열값 만큼 자동으로 변수에 할당하면 실행코드 반복 제어함

            // for (타입선언변수 : 배열변수명) {
            // // 실행코드
            // }

            // 9. for문 중단,계속 옵션 키워드
            // (1) continue 빼고 계속
            // (2) break 중단

        } ///////////////// try문 (스캐너) /////////////////////
          // catch문 (에러발생시 처리 구역)
        catch (Exception e) {
            // e.getMessage() -> 기본 에러메시지
            // System.out.println(e.getMessage());
            // 결과: null -> 내용이 없는 데이터!

            // 사용자가 보여주는 메시지
            System.out.println(
                    "꼭 숫자로 입력바랍니다!\n다시갑니다!\n");
        } ////////////////// catch문 ///////////////////////

    } //// main메서드 ////
} ///// class /////