public class Variance {
    
    public static void main(String[] args) {
        double[] sales2021 = {100.0, 100.0, 75.0};
        double[] sales2022 = {120.0, 110.0, 100.0};
        double mean2021 = calcMean(sales2021);
        double mean2022 = calcMean(sales2022);
        
        double variance2021 = calcVariance(sales2021, mean2021);

        double variance2022 = calcVariance(sales2022, mean2022);

        double variancePct = (variance2022 - variance2021) / variance2021 * 100.0;
        
        System.out.printf("2021 Variance: %.2f\n", variance2021);
        System.out.printf("2022 Variance: %.2f\n", variance2022);
        System.out.printf("Variance Pct: %.2f%%\n", variancePct);
    }
    

    public static double calcMean(double[] data) {
        double sum = 0.0;
        for (double d : data) {
            sum += d;
        }
        return sum / data.length;
    }
    
    public static double calcVariance(double[] data, double mean) {
        double sumSquares = 0.0;
        for (double d : data) {
            sumSquares += (d - mean) * (d - mean);
        }
        return sumSquares / (data.length - 1);
    }
}