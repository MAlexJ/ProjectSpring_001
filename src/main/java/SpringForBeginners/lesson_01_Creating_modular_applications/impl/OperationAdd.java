package SpringForBeginners.lesson_01_Creating_modular_applications.impl;


import SpringForBeginners.lesson_01_Creating_modular_applications.Operation;

public class OperationAdd implements Operation {
    public long operate(long op1, long op2) {
        return op1 + op2;
    }

    public String getOpsName() {
        return " plus ";
    }
}
