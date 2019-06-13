package code.challenges.MultiBracketValidation;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidatorTest {

    @Test
    public void test_validate() {
        MultiBracketValidator testVal = new MultiBracketValidator();
        String s = "{}";
        assertTrue(testVal.validate(s));
    }

    @Test
    public void test_validate2() {
        MultiBracketValidator testVal = new MultiBracketValidator();
        String s = "{}(){}";
        assertTrue(testVal.validate(s));
    }

    @Test
    public void test_validate_with_chars() {
        MultiBracketValidator testVal = new MultiBracketValidator();
        String s = "()[[Extra Characters]]";
        assertTrue(testVal.validate(s));
    }

    @Test
    public void test_validate3() {
        MultiBracketValidator testVal = new MultiBracketValidator();
        String s = "(){}[[]]";
        assertTrue(testVal.validate(s));
    }

    @Test
    public void test_validate4() {
        MultiBracketValidator testVal = new MultiBracketValidator();
        String s = "(.)(.)";
        assertTrue(testVal.validate(s));
    }

    @Test
    public void test_validate5() {
        MultiBracketValidator testVal = new MultiBracketValidator();
        String s = "{}{Code}[Fellows](())";
        assertTrue(testVal.validate(s));
    }

    @Test
    public void test_validate6() {
        MultiBracketValidator testVal = new MultiBracketValidator();
        String s = "[({}]";
        assertFalse(testVal.validate(s));
    }

    @Test
    public void test_validate7() {
        MultiBracketValidator testVal = new MultiBracketValidator();
        String s = "(](";
        assertFalse(testVal.validate(s));
    }

    @Test
    public void test_validate8() {
        MultiBracketValidator testVal = new MultiBracketValidator();
        String s = "{(})";
        assertFalse(testVal.validate(s));
    }

    @Test
    public void test_validate_single_open() {
        MultiBracketValidator testVal = new MultiBracketValidator();
        String s = "{";
        assertFalse(testVal.validate(s));
    }

    @Test
    public void test_validate_single_close() {
        MultiBracketValidator testVal = new MultiBracketValidator();
        String s = ")";
        assertFalse(testVal.validate(s));
    }
}