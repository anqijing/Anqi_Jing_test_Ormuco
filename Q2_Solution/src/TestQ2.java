public class TestQ2 {
    public static void main(String[] args) {

        // compare positive numbers
        String output1 = CompareStrings.compareInputs("2.9", "3.0");

        // compare negative numbers
        String output2 = CompareStrings.compareInputs("-3.9", "-3.0");

        // compare positive and negative numbers
        String output3 = CompareStrings.compareInputs("3.9", "-3.0");

        // equal case
        String output4 = CompareStrings.compareInputs("-3.0", "-3.0");

        // compare the strings started with 0 or space
        String output5 = CompareStrings.compareInputs("03.9", " 3.0");

        // compare the strings ended with 0 or space
        String output6 = CompareStrings.compareInputs("3.90", " 3.0 ");

        // illegal input
        String output7 = CompareStrings.compareInputs("ej", "3.0");
    }
}
