package hexlet;


public class PairsChallenge {

    //BEGIN

    /*
    Здесь приведено базовое решение через примитивы.
    Даже с типом long пары будут работать только для небольших `a` и `b`.
    Такой подход выбран для понятности и, чтобы не использовать дополнительнные классы.
    Попробуйте реализовать так, чтобы всё работало и на больших `a` и `b`.
    Например, car(cons(150, 70)) == 150.
     */

    private static final int FIRST_BASE = 2;
    private static final int SECOND_BASE = 3;

    public static long cons(long a, long b) {
        return getPower(FIRST_BASE, a) * getPower(SECOND_BASE, b);
    }

    public static long car(long pair) {
        return findPower(pair, FIRST_BASE);
    }

    public static long cdr(long pair) {
        return findPower(pair, SECOND_BASE);
    }

    private static long getPower(long base, long power) {
        long result = 1;
        for (int i = 0; i < power; i++) {
            result *= base;
        }
        return result;
    }

    private static long findPower(long pair, long base) {
        long result = 0;
        while (pair % base == 0 && pair != 0) {
            pair /= base;
            result++;
        }
        return result;
    }
    //END

}
