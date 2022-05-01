public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bmi = service.calculate(1.97F, 96);
        System.out.println(bmi);
    }
}
