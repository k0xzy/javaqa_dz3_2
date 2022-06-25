public class Main {
    public static void main(String[] args) {
        InMassBody service = new InMassBody();
        int weight = 80;
        int growth = 180;
        double imt = service.calculate(weight, growth);
        System.out.println(imt);
    }
}