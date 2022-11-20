// Java07. 클래스와 객체 그리고 속성과 메서드
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


     ****************************************************/
    public static void main(String[] args) {
        /* 
         * [ 클래스란? ]
         * - 객체를 만들기 위한 템플릿이다
         * -> 반대로 보면 객체는 클래스의 실물이다(인스턴스다!)
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