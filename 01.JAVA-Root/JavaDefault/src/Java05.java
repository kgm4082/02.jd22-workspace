// Java05. 자바 배열
public class Java05 {
    public static void main(String[] args) {
        // [자바 배열]

        // 배열은 각 값에 대해 별도의 변수를 선언하는 대신
        // 단일 변수에 여러 값을 저장하는 데 사용됨

        // 1. 배열의 선언
        // - 대괄호 로 변수 유형을 정의
        // 변수형[] 변수명
        // 변수형 변수명[]
        // 예) String[] cars;

        // 2. 배열의 할당
        // 예컨데 문자열 배열 변수를 선언함
        // 여기에 값을 삽입하려면 중괄호 안에 쉼표로 구분된 목록에 값을 배치한다!
        // 예)
        // String[] cars = {"볼보", "벤츠", "현대", "기아"};
        // int[] myNum = {10, 20, 30, 40};
        // -> 주의: JS에서는 대괄호를 사용했지만 자바는 중괄호다!!!!

        // 3.배열의 값읽기
        // 인덱스 번호를 참조하여 배열 값을 읽는다
        // 배열순번은 0부터 셈
        // 예)
        String[] cars = { "볼보", "벤츠", "현대", "기아" };
        System.out.println(cars[0]);
        // // "볼포" 출력

        // 4. 배열 요소 변경
        // 특정 요소의 값을 변경하려면 색인 번호를 넣고 할당한다
        // 예)
        cars[0] = "렉서스";
        System.out.println(cars[0]); // "렉서스" 출력

        // 5. 배열 길이 : 배열변수.length
        System.out.println("cars배열 개수: " + cars.length);

        // 6. 배열을 통한 루프
        // 루프를 사용하여 배열 요소를 for문으로 반복하고
        // length 속성을 사용하여 루프를 실행해야 하는 횟수를 지정한다.
        // 예)
        String[] cars2 = { "볼보", "벤츠", "현대", "기아" };
        for (int i = 0; i < cars2.length; i++) {
            System.out.print(cars2[i] + " ");
        }
        // // 결과: 볼보 벤츠 현대 기아

        // 7. For-Each를 사용하여 배열 순환
        // 배열의 길이만큼 자동으로 순환하는 for-Each문을 사용할 수 있음
        // for (타입 변수 : 배열변수) {
        // 실행코드
        // }
        // 예)
        System.out.println();

        String[] cars3 = { "렉서스", "현대", "벤츠", "기아" };
        for (String i : cars3) {
            System.out.print(i + " ");
        }
        // // 결과: 볼보 벤츠 현대 기아

        // 8. 다차원 배열
        // (1) 다차원 배열은 배열의 배열
        // 2차원 배열을 만들려면 고유한 중괄호 세트 안에 각 배열을 추가
        // 예)
        // int[][] arrNums = { {1, 2, 3, 4}, {5, 6, 7} };

        // arrNums 는 두 개의 배열을 요소로 포함하는 배열이다.

        // (2) 배열값에 액세스 -> 두 개의 인덱스를 지정
        // 하나는 배열용이고 다른 하나는 해당 배열 내부값용
        // 배열변수[][]

        // 예)
        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        int x = myNumbers[1][2];
        System.out.println(x); // Outputs 7

        // (3) for문을 활용한 2차원배열 순회
        // - 2중 for문을 사용하여 2차원배열을 값에 접근한다.
        // 예)
        String[][] sounds = { { "멍멍", "야옹", "컹컹", "썁썁" }, { "호이", "보이", "소이" } };
        for (int i = 0; i < sounds.length; ++i) {
            for (int j = 0; j < sounds[i].length; ++j) {
                System.out.println(sounds[i][j]);
            }
        }

    }
}