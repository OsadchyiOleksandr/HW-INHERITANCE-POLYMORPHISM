package tests;

public class TestCalculations {

    public static boolean checkResult(String baseOutput, String deliveryOutput) {
        String baseOutputExpected = "Product: abc, quota is 5 pcs., price is EUR 2.5.\n" +
                "Cost is EUR 12.5.";
        String deliveryOutputExpected = "Product: abc, quota is 5 pcs., price is EUR 2.5.\n" +
                "Cost is EUR 19.5.";
        return baseOutput.equals(baseOutputExpected) && deliveryOutput.equals(deliveryOutputExpected);
    }
}
