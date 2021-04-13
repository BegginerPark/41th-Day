public class Car {
    String name;
    int number;

    public Car(String name) {
        this.name = name;
    }

    public Car() { // 인수가 아무거도 없은 생성자
        // this.name = "No name";
        // this.number = 0;
        this("No name", 0); // 생성자 호출
        // CarExam3 에서 불러 내면 여기서 다시 밑의 생성자로 보낸다.
        //
    }

    public Car(String name, int number) {
        this.name = name;
        this.number = number;
    }
}
