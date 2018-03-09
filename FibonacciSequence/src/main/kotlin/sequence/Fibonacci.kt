package sequence

/**
 * Created by Bogumil Zebek on 09.03.18.
 */
fun calculate(num: Int): Int {
    if (num <= 1) {
        return num
    }

    return calculate(num - 1) + calculate(num - 2)
}