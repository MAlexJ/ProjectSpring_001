package SpringForBeginners.lesson_01_Creating_modular_applications;

import SpringForBeginners.lesson_01_Creating_modular_applications.impl.OperationAdd;

public class CalculateScreen {
    private Operation oper = new OperationAdd();

    public static void main(String[] args) {
        CalculateScreen screen = new CalculateScreen();
        screen.execute(10, 2);
    }

    public void execute(long opt1, long opt2) {
        long result = oper.operate(opt1, opt2);
        System.out.println(opt1 + " " + oper.getOpsName() + " " + opt2 + " = " + result);
    }
}
