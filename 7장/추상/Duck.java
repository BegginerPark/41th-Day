public class Duck extends Bird { // Bird를 상속받는다.

    @Override // annotation 덮어쓴다.
    public void sing() {
        System.out.println("DUCKDUCK");
    }
}
