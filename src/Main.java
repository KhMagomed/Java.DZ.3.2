public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float meters = 1.87F;
        int kilograms = 98;

        int result = service.calculate(meters, kilograms);
        System.out.println(result);
    }
}