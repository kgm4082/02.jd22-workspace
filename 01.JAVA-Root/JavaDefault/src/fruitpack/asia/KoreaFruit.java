package fruitpack.asia;

import fruitpack.america.south.PeruFruit;

// import fruitpack.america.south.PeruFruit;

public class KoreaFruit extends PeruFruit {
    // extends 상속 키워드임!
    // extends PeruFuit -> 페루가 수퍼클래스가됨, 한국은 서브클래스됨!
    // 수퍼클래스 == 부모클래스 , 서브클래스 == 자식클래스
    public void koreaFn(){
     
        System.out.println("한국산 과일은 제주밀감입니다!");

        // 페루의 protected 메서드를 호출할 수 있나? X
        // PeruFruit peru = new PeruFruit();
        // peru.peruFn(); -> 프로텍티드 메서드 보이지도 않음!

        // 페루의 자식클래스가 됐을때 페루의 protected 메서드 호출가능!
        // 부모클래스는 super 키워드로 부를 수 있다!
        System.out.println("***한국은 페루의 서브클래스가 되어 페루호출!");
        super.peruFnProtected();
    }
}
