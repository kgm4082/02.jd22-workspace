// Java03. 연산자와 문자형과 수학함수
public class Java03 {
    public static void main(String[] args) {
        /* [ 자바 연산자 ] 
        : 변수와 값에 대한 연산을 수행하는데 사용됨

        [1.산술 연산자] : 일반적인 수학 연산을 수행하는 데 사용

            +	더하기	x + y	
            -	빼기	x - y	
            *	곱하기	x * y	
            /	나누기	x / y	
            %	나머지	x % y	
            ++	1씩증가	++x	
            --	1씩감소	--x
        */
        System.out.println("[1.산술 연산자]");
        System.out.println("사칙연산:");
        System.out.println("3+7*9/20-5="+(3+7*9/20-5));
        System.out.println("나머지연산자:");
        System.out.println("500을 7로나눈 나머지는? "+(500%7));

        System.out.println("증감연산자:");
        int worldNum = 78;
        System.out.println("현재 세계인구는 "+worldNum+
        "억이다. \n5년뒤 10억명이 더 늘어난다고 한다. \n현재인구에서 1억명만 더 늘려봐라!"+
        (worldNum++)+"억명");
        // (++worldNum)+"억명");

        // ++이 뒤에 있으면 출력이 먼저되고 증가
        // ++이 앞에 있으면 먼저 증가되고 출력!
        System.out.println("worldNum변수값:"+worldNum);

        // [2. 할당연산자] : = 오른쪽의 값을 왼쪽에 할당함!

        // [3. 대입연산자] : 기존값에 연산을 중첩함
        // -> += , -=, *=, /=, %=

        System.out.println("현재인구수 조정:"+(--worldNum));

        System.out.println();
        System.out.println("[3. 대입연산자]");
        System.out.println("5년뒤 인구는 몇명인가? "+
        (worldNum+=10)+"억명");


        // [4. 비교연산자] : >,<,==,!=,>=,<=
        // -> 조건문에 값을 비교하여 true / false의 결과가 나옴
        System.out.println();
        System.out.println("[4. 비교연산자]");
        int broAge = 17;
        int myAge = 18;
        System.out.println("내가 알던 형은 형인가? "+
        (broAge>myAge));
        System.out.println("내가 알던 형은 형인가? "+
        (broAge>myAge?"응, 형맞아!":"아니, 동생이었어!헉;;;"));

        // [5. 논리연산자] : 
        // &&(논리곱) -> 모두 true이면 true
        // ||(논리합) -> 하나만 true이면 true
        // !(논리부정) -> true / false 결과 반대로 출력!
        System.out.println();
        System.out.println("[5. 논리연산자]");
        String man = "여자";
        int age = 20;

        // 논리곱
        System.out.println("\n한 사람의 성별과 나이가 각각 남자이고 20세 이상이면 회원자격을 준다. 이 사람은 회원인가?"+
        (man=="남자"&&age>=20));

        // 논리합
        System.out.println("\n한 사람의 성별과 나이가 각각 남자이거나 20세 이상이면 회원자격을 준다. 이 사람은 회원인가?"+(man=="남자"||age>=20));
    
        boolean mem = false;
        // 논리부정
        // false의 결과를 true로
        // 처리해야할때 사용한다!
        System.out.println("\n회원이 아니면 나가세요! 라고 말한다!아니면 어서오세요!라고 말한다. 결과는? "+(!mem?"나가세요!":"어서오세요!"));

        //////////////////////////////////////
        // [자바 문자열 : String형]
        System.out.println();
        System.out.println("[자바 문자열 : String형]");
        // 1. 문자열은 텍스트를 저장하는 데 사용
        String myFace = "I Am Very Handsome!";
        // 2. String변수에는 큰따옴표로 묶인 문자열임!
        System.out.println("myFace출력: " + myFace);
        System.out.println("문자열길이는? " + myFace.length());

        // 3. 문자열 길이
        //     length()메소드
        // 4.문자열 메서드
        // toUpperCase() - 모두 대문자 변환
        System.out.println("myFace모두대문자 : " + myFace.toUpperCase());
        // toLowerCase() - 모두 소문자 변환
        System.out.println("myFace모두소문자 : " + myFace.toLowerCase());

        // 5. 문자열 시작순번 : 
        // indexOf()메서드 
        // - 문자열(공백 포함)에서 지정된 텍스트가 처음 나타나는 인덱스순번 숫자리턴
        // 대소문자를 구분, 찾는문자열 없으면 -1리턴, 0부터셈
        System.out.println("myFace문자열시작위치 : " + myFace.indexOf("Handsome"));
        System.out.println("myFace문자열시작위치 : " + myFace.indexOf("handsome")); // 없으면 -1

        // 6. 문자열 일부가져오기
        // substring(시작순번,끝순번의다음순번)
        System.out.println("Hand만 잘라서 가져와봐! " + myFace.substring(10, 14));

        // 7. 문자열 일부변경하기
        // replace(바꿀문자열, 바뀔문자열)
        System.out.println("Handsome을 Smart로 변경 : " + myFace.replace("Handsome", "Smart"));

        // 8. 문자열 반복하기
        // repeat(반봇횟수)
        var nayana = "나야나!";
        // var로 선언하면 왼쪽의 데이터 형에 따라
        // 자동으로 형을 정해주는 선언방법(Java10부터 도입)
        // 자바에서 주로사용되지는 않으니 참고로 알아두자!
        System.out.println("나야나! 열번반복하기 : " + nayana.repeat(10));

        // 9. 문자열 연결
        // + 연산자를 문자열 사이에 사용하여 결합

        // 10. 문자열 연결 메서드 : concat()
        // 하나의 문자열에 이어서 문자열을 연결하는 메서드
        // ex) 
        String name = "유";
        String name2 = "룡";
        String familyName = "공";
        System.out.println(familyName.concat("문자열연결 : " + name)); // "공유"
        System.out.println(familyName.concat("공유의동생이름은? " + name2)); // "공룡"

        // 11. 특수문자 이스케이프 하기 (앞에 역슬래쉬사용!)
        // \'	'	홑따옴표
        // \"	"	쌍따옴표
        // \\	\	역슬래쉬
        System.out.println("쌍따옴표안에 \"쌍따옴표\"쓰기");
        System.out.println("홑따옴표 특수문자처리 : It\'s mine!");
        System.out.println("역슬래쉬\\이렇게");
        // 뒤에 공백을 없앰!
        
        // 참고) 기타 이스케이프 시퀀스
        // \n	개행	
        // \r	엔터
        // \t	탭	
        // \b	백스페이스	
        System.out.println("개행은 \n이렇게!");
        System.out.println("엔터는 \r이렇게! 엔터는 여기서 다시 실행함!");
        System.out.println("엔터는 \r이렇게! 엔터는 여기서 다시 실행함!");
        System.out.println("백스페이스는\b 이렇게!");
        

        // [ 수학 메서드 ] - Math 클래스 (정적객체)

        // 1.Math.max( x,y ) - x 와 y 중 최대값
        // : 다음 형들 중 같은 것 끼리 비교함
        // int, long, float, double
        System.out.println("10.1과 10.11 중 큰것은? " + Math.max(10.1,10.11));
        // 2.Math.min( x,y ) -  x 와 y 중 최소값
        System.out.println("10001과 10002 중 작은것은? " + Math.min(10001,10002));
        // 3. Math.sqrt( x ) - 제곱근값
        System.out.println("2의 제곱근값은? " + Math.sqrt(2));
        // 4. Math.abs(x) - 절대값
        System.out.println("나는 1000원이 있는데 10000원을 썻다. 순수차액은 얼마? " + Math.abs(1000-10000) + "원");
        // 5. Math.random() - 0.0(포함)과 1.0(제외) 사이의 난수
        // ceil() 올림, floor() 내림, round() 반올림
        System.out.println("1~5 사이의 난수는? " + Math.random()*5);
    }
}