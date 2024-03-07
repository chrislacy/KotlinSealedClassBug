package actionlauncher

enum class TypeEnum(val code: String) {

    First("First"),
    Second("Second");

    companion object {
        val All = listOf(First, Second)

        fun fromName(name: String): TypeEnum {
            val all = All
            return all.first { entry ->
                if (entry == null) {
                    println("entry is null?!")
                    requireNotNull(entry) { "entry is null?!" }
                }

                entry.code == name
            }
        }
    }
}
