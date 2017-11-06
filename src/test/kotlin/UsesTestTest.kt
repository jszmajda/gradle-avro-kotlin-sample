import org.junit.Test
import kotlin.test.assertEquals

class UsesTestTest {
  @Test
  fun testDoTheThing() {
    val tester = UsesTest()
    assertEquals(tester.doTheThing().value, "hello")
  }
}
