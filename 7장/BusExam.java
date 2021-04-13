public class BusExam {
    public static void main(String[] args) {
        Bus bus = new Bus(); // 상속받은 Bus 사용
        bus.run(); // run -> Bus -> Car
        bus.ppangppang();

        Car car = new Car();
        car.run();
        // car.ppangppang(); / 부모 클래스는 자식 클래스를 상속할 수 없다
    }
}
