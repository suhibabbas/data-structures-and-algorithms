/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package MultiBracket;

import MultiBracket.stucture.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    Stack stack;

    @BeforeEach
    void setUp(){
        stack = new Stack();
    }
    @Test void  VBTest(){
        String test1 ="{}(){}";
        String test2 = "{}{Code}[Fellows](())";
        String test3 = "[({}]";
        String test4 = "{";

        boolean actual1 = stack.ValidateBrackets(test1);
        assertTrue(actual1);
        boolean actual2 = stack.ValidateBrackets(test2);
        assertTrue(actual2);
        boolean actual3 = stack.ValidateBrackets(test3);
        assertFalse(actual3);
        boolean actual4 = stack.ValidateBrackets(test4);
        assertFalse(actual4);
    }

}
