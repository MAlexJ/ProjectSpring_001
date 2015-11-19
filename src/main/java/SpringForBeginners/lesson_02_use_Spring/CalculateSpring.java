package SpringForBeginners.lesson_02_use_Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalculateSpring {

    private Operation operation;
    private ResultWriter writer;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public void setWriter(ResultWriter writer) {
        this.writer = writer;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        CalculateSpring calc = (CalculateSpring) context.getBean("calc");
        calc.execute(10, 2);
    }

    public void execute(long op1, long op2) {
        writer.showResult("The result of " + op1 + operation.getOpsName() + op2 + " is " + operation.operate(op1, op2) + "!");
    }
}
