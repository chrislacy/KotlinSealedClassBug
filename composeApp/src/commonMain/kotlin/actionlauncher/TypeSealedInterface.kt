package actionlauncher

sealed interface TypeSealedInterface {

    val name: String

    data object First : TypeSealedInterface {
        override val name = "First"
    }

    data object Second : TypeSealedInterface {
        override val name = "Second"
    }

    companion object {
        val All = listOf(First, Second)

        fun fromName(name: String): TypeSealedInterface {
            val all = All
            return all.first { entry ->
                if (entry == null) {
                    println("entry is null?!")
                    requireNotNull(entry) { "entry is null?!" }
                }

                entry.name == name
            }
        }
    }
}
