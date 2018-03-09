package sequence

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

/**
 * Created by Bogumil Zebek on 09.03.18.
 */
class FibonacciTest {

    @Test
    fun `it should calculate fibonacci sequence for given number`() {
        assertThat(calculate(0)).isEqualTo(0)
        assertThat(calculate(1)).isEqualTo(1)
        assertThat(calculate(2)).isEqualTo(1)
        assertThat(calculate(3)).isEqualTo(2)
        assertThat(calculate(4)).isEqualTo(3)
        assertThat(calculate(5)).isEqualTo(5)
        assertThat(calculate(18)).isEqualTo(2584)
        assertThat(calculate(19)).isEqualTo(4181)
    }

}