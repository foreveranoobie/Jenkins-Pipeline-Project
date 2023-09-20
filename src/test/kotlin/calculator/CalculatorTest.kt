package calculator

import org.junit.jupiter.api.Test

class CalculatorTest {
    private val calculator = Calculator()

    @Test
    fun `should add two numbers`() {
        assert(calculator.add(1, 1) == 2)
    }

    @Test
    fun `should subtract two numbers`(){
        assert(calculator.subtract(2, 1) == 1)
    }

    @Test
    fun `should multiply two numbers`() {
        assert(calculator.multiply(2, 2) == 4)
    }

    @Test
    fun `should divide two numbers`(){
        assert(calculator.divide(4, 2) == 2)
    }
}