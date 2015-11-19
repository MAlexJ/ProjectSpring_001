package SpringForBeginners.lesson_01_Creating_modular_applications;

public class Calculate {

    public Calculate() {
    }

    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        calculate.execute(20, 10);
    }

    public void execute(long op1, long op2) {
        showResult("The result of " + op1 + getOpsName() + op2 + " is " + operate(op1, op2) + "!");
    }

    private void showResult(String result) {
        System.out.println(result);
    }

    private String getOpsName() {
        return " plus ";
    }

    private long operate(long op1, long op2) {
        return op1 + op2;
    }

}
