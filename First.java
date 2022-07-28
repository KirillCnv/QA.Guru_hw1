package guru.qa;

public class First {
    public static void main(String[] args) {
        Train train = new Train("Москва2020", 2020, true, "Россия", "81775");
        train.nameTrain();
        train.numberModel();
        train.dateRelease();
        train.presenceAirСonditioner();
    }
}
