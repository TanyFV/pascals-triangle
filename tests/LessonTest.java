import static hexlet.PairsChallenge.car;
import static hexlet.PairsChallenge.cdr;
import static hexlet.PairsChallenge.cons;

import org.junit.Assert;
import org.junit.Test;

public class LessonTest {

    @Test
    public void testPairs() {
        var a = 50;
        var b = 3;
        var pair = cons(a, b);

        Assert.assertEquals(a, car(pair));
        Assert.assertEquals(b, cdr(pair));
    }

}
