import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class _9_isPalindromeTest {

    _9_isPalindrome testclass = new _9_isPalindrome();

    @ParameterizedTest
    @CsvSource({"111,true", "2,true", "123,false","12321,true","-121,false"})
    void isPalindrome(int param,boolean expected) {
        assertEquals(expected,testclass.isPalindrome(param));
    }
    @ParameterizedTest
    @CsvSource({"111,true", "2,true", "123,false","12321,true","-121,false"})
    void isPalindrome2(int param,boolean expected) {
        assertEquals(expected,testclass.isPalindrome2(param));
    }

    @ParameterizedTest
    @CsvSource({"123,123", "222,222"})
    void num2String(int param,String expected) {
        assertEquals(expected,testclass.num2String(param));
    }

    @ParameterizedTest
    @CsvSource({"123,false", "111,true", "fas,false",",false","'',true"})
    void testIsPalindrome(String param,boolean expected) {
        assertEquals(expected,testclass.isPalindrome(param));
    }
}