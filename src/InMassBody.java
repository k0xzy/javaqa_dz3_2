public class InMassBody {

    public double calculate(int weight, int growth) {
        double a = growth * growth / 100;
        double imt = weight * 100 / a;
        return imt;
        }

    }
