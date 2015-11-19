package SpringForBeginners.lesson_02_use_Spring.impl;


import SpringForBeginners.lesson_02_use_Spring.Operation;

public class OperationMultiply implements Operation {
    public long operate(long op1, long op2) {
        return op1 * op2;
    }

    public String getOpsName() {
        return " mult ";
    }
}
