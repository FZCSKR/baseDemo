package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());
    }
    @Test
    public void testSum(){
        int firstNumber= 1;
        int secondNumber=2;
        BaseDemo baseDemo = new BaseDemo();
        System.out.println(baseDemo.sum(firstNumber,secondNumber));
    }
    @Test
    public void testSum1(){
        int firstNumber= 5;
        int secondNumber=2;
        BaseDemo baseDemo = new BaseDemo();
        System.out.println(baseDemo.sum(firstNumber,secondNumber));
    }
}
