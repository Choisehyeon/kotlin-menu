package menu

import menu.util.Validator
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class ValidTest {

    @Test
    fun `이름이 한글로 이루어지지 않은 경우`() {
        assertThrows<IllegalArgumentException> {
            Validator().checkNameValid("1하,")
        }
    }

    @ValueSource(strings=["제임스롤롤", "가나다라마바사", ""])
    @ParameterizedTest
    fun `이름이 최소 2글자 최대 4글자가 아닌 경우`(input : String){
        assertThrows<IllegalArgumentException> {
            Validator().checkNameSizeValid(input)
        }
    }
}