import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Euler6Test {

    @Test
    public void shouldDiffForMaxNumber0() {
        Euler6 euler6 = new Euler6();

        //given
        int maxNumber = 0;
        //when
        int result = euler6.diffSumSquarAndSquarSum(maxNumber);
        //then
        assertThat(result, is(0));
    }

    @Test
    public void shouldDiffForMaxNumber1() {
        Euler6 euler6 = new Euler6();

        //given
        int maxNumber = 1;
        //when
        int result = euler6.diffSumSquarAndSquarSum(maxNumber);
        //then
        assertThat(result, is(0));
    }

    @Test
    public void shouldDiffForMaxNumber4() {
        Euler6 euler6 = new Euler6();

        //given
        int maxNumber = 4;
        //when
        int result = euler6.diffSumSquarAndSquarSum(maxNumber);
        //then
        assertThat(result, is(70));
    }

    @Test
    public void shouldDiffForMaxNumber10() {
        Euler6 euler6 = new Euler6();

        //given
        int maxNumber = 10;
        //when
        int result = euler6.diffSumSquarAndSquarSum(maxNumber);
        //then
        assertThat(result, is(2640));
    }

}
