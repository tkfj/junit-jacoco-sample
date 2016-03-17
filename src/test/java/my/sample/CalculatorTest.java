package my.sample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator sut;

    @Before
    public void setUp() throws Exception {
        sut = new Calculator();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void publicメソッドからprivateメソッドを呼び出す() throws Exception {

        int expected = 12;
        int actual = sut.callMultiply(3, 4);
        assertThat(actual, is(expected));

    }

    @Test
    public void privateメソッドをリフレクションでユニットテストする() throws Exception {

        Method method = Calculator.class.getDeclaredMethod("devide", int.class, int.class);
        method.setAccessible(true);

        int expected = 3;
        int actual = (int) method.invoke(sut, 12, 4);
        assertThat(actual, is(expected));

    }
}