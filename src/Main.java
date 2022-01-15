public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bodyMass = 50;
        double height = 1.62;
        double bmIndex = service.calculate(bodyMass, height);
        System.out.println(bmIndex);
    }
}