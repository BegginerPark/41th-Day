public class AccessObj {
    public int p = 3;
    protected int p2 = 4; // 같은 패키지 내에서만 접근 허용한다. 단, 다른 패키지라도 상속받은 경우 허용
    private int i = 1; // 자기 자신만 접근이 가능하다(클래스 내 허용)
    int k = 2; // 패키지 내에서 접근 허용
}
