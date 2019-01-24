public class CompareStrings {
    private static double num1, num2;

    public static String compareInputs(String input1, String input2) {
        try {
            num1 = Double.parseDouble(input1);
            num2 = Double.parseDouble(input2);
        } catch (Exception e) {
            throw new IllegalArgumentException("Inputs must be numbers.");
        }

        String output = compare();
        System.out.println(output);
        return output;
    }

    private static String compare() {
        if (num1 == num2)
            return num1 + " is equal to " + num2 + ".";
        else if (num1 < num2)
            return num1 + " is less than " + num2 + ".";
        else
            return num1 + " is greater than " + num2 + ".";
    }
}
