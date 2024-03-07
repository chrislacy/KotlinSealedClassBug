package actionlauncher

import kotlin.test.Test
import kotlin.test.assertEquals

class Test {

    @Test fun `TypeSealedClass fromName`() {
        assertEquals(TypeSealedClass.Second, TypeSealedClass.fromName("Second"))
    }

    @Test fun `TypeSealedInterface fromName`() {
        assertEquals(TypeSealedInterface.Second, TypeSealedInterface.fromName("Second"))
    }

    @Test fun `TypeEnum fromName`() {
        assertEquals(TypeEnum.Second, TypeEnum.fromName("Second"))
    }
}
