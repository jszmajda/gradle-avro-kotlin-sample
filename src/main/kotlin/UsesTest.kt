import com.company.place.Test

class UsesTest {
  fun doTheThing() : Test {
    val thing = Test.newBuilder()
      .setValue("hello")
      .build()

    System.out.println("Thing's value: ${thing.value}")
    return thing
  }
}
