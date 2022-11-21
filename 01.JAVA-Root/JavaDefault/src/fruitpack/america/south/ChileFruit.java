package fruitpack.america.south;

public class ChileFruit {
    public void chileFn(){
        System.out.println("칠레산 과일은 블루베리 입니다!");

        // 페루를 생성하여 호출테스트
        PeruFruit peru = new PeruFruit();
        System.out.println("***칠레에서 페루호출");
        peru.peruFnProtected();

    }
}
