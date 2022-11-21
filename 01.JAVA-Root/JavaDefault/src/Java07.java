import fruitpack.america.north.UsaFruit;
import fruitpack.america.south.ChileFruit;
import fruitpack.america.south.PeruFruit;
import fruitpack.asia.JapanFruit;
import fruitpack.asia.KoreaFruit;

// Java07. 클래스와 객체 그리고 속성과 메서드
// + 접근한정자(Modifier) + 캡슐화 + 팩키지
public class Java07 {
    // public Java07(){} 
    // -> 안만들어도 클래스와 같은 이름의 메서드 -> 생성자가 만들어짐!!

    /****************************************************
        클래스명과 동일한 이름의 파일에는 
        단 하나의 public 클래스를 가질 수 있다!
        
        그래서 하나의 java파일안에는 다른 클래스를 만들 수 있다!
        단, 다른 추가클래스는 public 접근한정자를 쓸 수 없다!
        접근한정자(Modifier)를 안쓰면 default라고 부른다

        -> bin폴더에 생성된 class파일은 class단위로
        개별적으로 생성된다!(꼭 확인해 볼것!)
        _____________________________________________

        [ 클래스에서 사용하는 접근한정자(Modifier) ]
        -> public을 쓰거나 안쓰거나 둘 중 하나!
        1. public -> 모든 다른 클래스에서 접근허용
        2. default : 앞에 아무것도 안쓴 경우!
                  -> 같은 팩키지 안에서만 접근 가능
                    (팩키지는 폴더라고 생각하면 됨!)
        ______________________________________________

        [ 클래스의 구성요소를 위한 접근한정자 ]
        -> 속성과 메서드!!!를 위한 접근한정자

        1. public -> 다른 클래스에서 접근가능
        2. private(프라이빗-> 어떤느낌?) -> 다른클래스에서 접근불가
          -> 선언된 클래스안에서만 접근됨!
          -> 프라이빗 속성일 경우 Getter/Setter를 통해 접근한다!
          이런방법을 캡슐화라고 한다!
        3. protected(프로텍티드->어떤느낌?) -> 다른클래스에서 접근불가
          -> 하위클래스(상속받은클래스)에서 접근됨!
          -> 같은 패키지 안에서도 접근가능!
        4. default -> 아무것도 안쓴경우
          -> 같은 패키지(같은폴더)안에서만 접근가능함!
        ___________________________________________

        [ 캡슐화란? ]
        -> 클래스의 속성을 private으로 만들고 메서드를 통하여
        값을 넣거나 가져오는 방법
        -> 겟터와 셋터를 생성한다.

        {캡슐화를 하는 이유}
        1. 클래스 속성과 메서드의 제어 향상
        2. 클래스 속성은 읽기전용(Getter)와 쓰기전용(Setter)로 만들 수 있고
           이를 통해 내부적인 데이터 흐름의 효율성을 높일 수 있다!
        3. 다른 코드에 영향을 주지않고 한 부분만 변경하는 
           유연성을 가질 수 있다
        4. 데이터에 대한 보안이 강화된다!
        5. 자바 웹을 구현할때 캡슐화는 선택이 아닌 필수!
        -> 겟터와 셋터가 형식이 일정한데 속성(변수)이 많아지면
        이것을 만들기 귀찮음....자동생성을 툴에서 지원한다!
        _______________________________________________

        [♣ 이클립스의 겟터/셋터 자동생성하기]
        마우스 우클릭 > Source 
        > Generate Getters and Setters... 메뉴 선택

        [♣ VSCODE의 겟터/셋터 자동생성하기]
        -> 확장프로그램 설치 : getter-setter-generator
        -> 설치 후 F1 -> 입력창에 get입력후 
        -> Generate get and set methods 선택함
        -> 겟터/셋터 자동생성됨!

        __________________________________________

        [ 자바의 패키지 ]
        ->> 패키지명은 소문자로만 작성이 원칙이다!

        1. 패키지는 자바의 클래스를 그룹화하는 방법이다
        2. 파일의 디렉토와 같이 폴더를 생성하여 묶어준다.
        3. 패키지의 장점
            1) 클래스의 내용별 분류 및 체계화가 된다!
            2) 동일한 이름의 클래스를 분류별로 보유할 수 있다!
        4. 패지지의 종류
            1) 내장 패키지 (Java API) : 자바가 가지고 있는 기능별 클래스묶음
            -> https://docs.oracle.com/javase/8/docs/api/
            2) 사용자 정의 패키지 : 자신만의 패키지를 생성한다!
            -> src하위에 폴더를 만들고 거기에 java파일 생성

        5. 패키지 불러오는 방법
            1) import 패키지명.폴더명.클래스명 
                -> 클래스하나만 가져옴
            2) import 패키지명.폴더명.*
                -> 폴더하위의 모든 클래스를 가져옴
        
        6. 패키지에 생성한 java파일 상단에는 
           자신이 속한 패키지가 표시된다.

            표시형식:
            package 패키지명.폴더명;


     ****************************************************/
    public static void main(String[] args) {
        /* 
         * [ 클래스란? ]
         * - 객체를 만들기 위한 템플릿이다
         * -> 반대로 보면 객체는 클래스의 실물이다(인스턴스다!)
         * -> 컴파일시 하나의 java파일안에 여러개의 class를 만들어도
         * 별도의 class를 모두 따로 생성한다!(bin폴더확인!)
         * -> 클래스는 기본 모듈의 단위다!
         * 
         * [ 클래스의 구성 ]
         * - 속성과 메서드로 구성된다
         * 1. 속성 - 클래스내에 선언된 변수다
         * 2. 메서드 - 클래스내에 생성된 함수다
         * 
         * [ 객체지향프로그래밍 이란? ]
         * - OOP(Object-Oriented Programming)
         * -> 기능별로 구분하여 클래스를 만들고
         *    그 클래스는 객체를 생성하여 모듈별
         *    기능별로 나눠진 모듈화 프로그래밍 방식
         */

        // 1. 클래스 생성
        // 과일 클래스 생성 및 클래스 호출,속성변경하기!
        Fruits fruits = new Fruits("딸기", "빨간색", "상큼한향", 0.005);

        // 2. 메서드 호출
        // 과일의 정의를 찍는 메서드 호출!
        fruits.defineFruit();

        // 3. 속성값 변경
        fruits.name = "수박";
        fruits.flavor = "달달한향";
        fruits.weight = 1.8;

        // 프라이빗 속성(변수) 변경시도!
        // fruits.price = 2000;
        // 프라이빗 속성은 직접 변경이 불가!

        // 어떻게 셋팅하고 값을 불러오지?(겟터/셋터로!!!)

        // 가격설정하기 : setPrice(숫자)
        fruits.setPrice(12000);
        // 가격가져오기 : getPrice()
        System.out.println(fruits.name + "의 가격은 "+
        fruits.getPrice() + "원 입니다!");

        // 다시 과일 속성찍기 메서드 호출
        fruits.fruitsFn();


        // 과일정의 속성 변경하기
        // final 변수는 상수이므로 못바꾼다!
        // fruits.definition = "과일은 채소와 같다!";

        // 과일의 정의 찍기 메서드 호출
        // fruits.defineFruit();


        // 사과 클래스 메서드 호출하기 ////
        Apple apple = new Apple();
        apple.appleFn("빛나는");
        apple.appleFn("맛있는");

        // 바나나 클래스 메서드 호출하기 ///
        Banana banana = new Banana();
        banana.bananaFn("맛좋은");
        banana.bananaFn("커다란");

        // 패키지 메서드 호출하기 /////////////
        // -> 패키지 클래스를 선택하는 순간 VSCODE가 자동으로
        // 패키지를 클래스까지 정확히 import해 준다!(최상단에!)

        // 한국호출!
        KoreaFruit korea = new KoreaFruit();
        korea.koreaFn();

        // 일본호출!
        JapanFruit japan = new JapanFruit();
        japan.japanFn();

        // 미국호출!
        UsaFruit usa = new UsaFruit();
        usa.usaFn();

        // 칠레호출!
        ChileFruit chile = new ChileFruit();
        chile.chileFn();

        // 페루호출!
        PeruFruit peru = new PeruFruit();
        peru.peruFn();





    } /////// main 메서드 ///////
} ////////// Java07 클래스 //////////////////

/////////// 과일 클래스 /////////////////
class Fruits {
    // 속성 : 클래스안에 선언된 변수
    // 1. 과일이름
    String name;
    // 2. 과일색
    String color;
    // 3. 과일향기
    String flavor;
    // 4. 과일개당무게
    double weight;
    // 5. 과일에대한 정의 : 
    // -> 값을 못바꾸도록 상수화함! final
    final String definition = "나무 따위를 가꾸어 얻는, 사람이 먹을 수 있는 열매";

    // 6. 프라이빗 변수 만들기!!! : 과일가격속성
    private int price;
    /****************************************** 
     * [ 겟터(Getter)와 셋터(Setter) ]
     * ->  프라이빗 필드를 캡슐화하여 접근하는 방법
     * -> 장점은 속성을 직접 노출하지 않으며
     * 값을 넣고 읽는 메서드를 생성하여 속성에대한
     * 일관된 접근방법을 제시해준다!
     * 
     * {★ 겟터(Getter)}
     * 
     * 1. 필드값을 반환한다.
     * 2. 접근 제어 수식어 : public
     * 3. 겟터명 : get필드명
     *          (필드명의 첫글자는 대문자)
     * 4. 매개변수 없음
     * 5. 내용 : return 필드
     * 
     * {★ 셋터(Setter)}
     * 
     * 1. 필드값 초기화(셋팅)
     * 2. 접근 제어 수식어 : (대분분) public
     * 3. 셋터명 : set필드명
     *          (필드명의 첫글자는 대문자)
     * 4. 매개변수 : 필드와 동일
     * 5. 내용 : 생성자와 동일
     *          (this.필드명 = 매개변수명)
     * 
     ******************************************/
     // Getter
     public int getPrice(){
        return price;
     }
     // Setter
     public void setPrice(int price){
        this.price = price;
     }

    /*******************************************
     * [ 클래스 생성자(Constructor) ]
     * 1. 클래스명과 동일한 이름의 메서드
     * 2. 클래스가 처음 생성될때 반드시 실행됨
     * 3. 객체초기화 함수다!
     * 4. 안만들어도 기본 생성자가 만들어진다!
     * 5. 반환값(리턴값)을 가질 수 없다!!!
     *    (왜냐하면 일반호출을 하는 메서드가 아니므로!)
     * 6. 직접 생성자를 만드는 경우:
     *    초기값 셋팅 또는 처음에 실행이 필요한 코드 등
     *******************************************/
    // 이 클래스를 생성할 경우 
    // 초기값 셋팅이 필요하므로 생성자를 만든다!
    // 일반 메서드가 아니므로 이름이 클래스명과 동일함!
    // 보통 매개변수는 속성명과 동일한 이름으로 쓴 경우가 많다
    // 그래서 속성명과 매개변수를 구분하기 위해 
    // ->>> 속성명 앞에 this를 사용한다!
    // this.속성명 -> 클래스에 선언된 속성명임!
    public Fruits(String name,String color, String flavor,double weight){
        // 속성값 셋팅!
        this.name = name;
        this.color = color;
        this.flavor = flavor;
        this.weight = weight;

        // 값셋팅 후 내가만든 메서드 실행
        // 내가 호출하고 싶어서 여기에 씀!
        fruitsFn();

        // 생성자에서는 내가 처음에 실행코자하는
        // 코드를 넣으면 된다!!!^^

    } ///// Fruits 생성자 /////////

    // 메서드1 - 클래스 안에 정의된 함수
    public void fruitsFn(){
        System.out.println("나는"+name+"입니다! 색은 "+
        color + "이고 냄새는 "+ flavor + "입니다. 개당 무게는 "+
        weight + "kg 입니다.");
    } ////////// fruitsFn 메서드 ////////

    // 메서드2 - 과일의 정의를 찍는 메서드
    public void defineFruit() {
        System.out.println("과일의 정의는 "+ definition + "이다.");
    } ///////// defineFruit 메서드 ///////


} //////////// Fruits 클래스 /////////////


/////// 바나나 클래스 /////////////////////
class Banana {
    public void bananaFn(String word){
        System.out.println("나는 " + word + " 바나나입니다!");
    } //////// bananaFn 메서드 ///////

} ////////// Banana 클래스 //////////////


/////// 사과 클래스 /////////////////////
class Apple {
    public void appleFn(String word){
        System.out.println("나는 " + word + " 사과입니다!");
    } //////// appleFn 메서드 ///////

} ////////// Apple 클래스 //////////////