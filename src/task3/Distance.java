package task3;

public class Distance {

    double distance;

    public void print () {
        System.out.println("Distance");
    }

    public static class Converter {

        public double m_to_km (double m) {
            return m / 1000;
        }

        public double km_to_ml (double km) {
            return (km / 1.6);
        }
    }

}
