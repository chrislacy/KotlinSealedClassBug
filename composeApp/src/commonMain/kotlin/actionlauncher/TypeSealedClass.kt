package actionlauncher

sealed class TypeSealedClass {

    abstract val name: String

    data object First : TypeSealedClass() {
        override val name = "First"
    }

    data object Second : TypeSealedClass() {
        override val name = "Second"
    }

    companion object {
        val All = listOf(First, Second)

        fun fromName(name: String): TypeSealedClass {
            val all = All
            return all.first { entry ->
                if (entry == null) {
                    println("entry is null?!")
//                    requireNotNull(entry) { "entry is null?!" }
                }

                entry.name == name
            }
        }
    }
}
