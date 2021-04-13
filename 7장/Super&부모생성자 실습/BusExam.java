public class BusExam {
    public static void main(String[] args) {
        Bus bus = new Bus("ppangppang", 3000, 1050);
        if (bus.name != "ppangppang") {
            System.out.println("bus name is different");
        } else if (bus.number != 3000) {
            System.out.println("bus number is different");
        } else if (bus.fee != 1050) {
            System.out.println("bus fee is different");
        } else {
            System.out.println("True");
        }
    }

}
