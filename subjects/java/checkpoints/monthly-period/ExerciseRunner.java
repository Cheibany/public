public class ExerciseRunner {
    public static void main(String[] args) {
        MonthlyPeriod MonthlyPeriod = new MonthlyPeriod();

        // Test case 1
        String startDate1 = "2020-01-01";
        String endDate1 = "2023-06-15";
        System.out.println("Period: " + MonthlyPeriod.calculatePeriod(startDate1, endDate1));

        // Test case 2
        String startDate2 = "2015-05-20";
        String endDate2 = "2015-10-20";
        System.out.println("Period: " + MonthlyPeriod.calculatePeriod(startDate2, endDate2));

        // Test case 3
        String startDate3 = "2018-12-25";
        String endDate3 = "2021-12-25";
        System.out.println("Period: " + MonthlyPeriod.calculatePeriod(startDate3, endDate3));
    }
}