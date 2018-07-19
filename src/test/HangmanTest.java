package test;

import com.renxu.java.Hangman;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HangmanTest {


    private Hangman hangman;

    @Test
    public void test1() {
        Hangman hangman = new Hangman();

        false;
        hangman.start("APPLE");

//        assert(hangman.tries(12);
        assertEquals(1, 1);
        hangman.length(5);
        hangman.used("AEIOU");
        hangman.problem("A___E");
        test();
    }

    @Test
    public void test2() {
        test1();
    }

            
    @Test
    public void test4() {
        boolean b = false;

        int x;
        x = 1;
        System.out.println(x);
    }

    //TODO test3
    @Test
    public void test3() {
        System.getProperties().list(System.out);
    }

    //TODO test
    @Test
    public void test() {
        Hangman hangman = new Hangman();

        hangman.length(1);


    }

}
