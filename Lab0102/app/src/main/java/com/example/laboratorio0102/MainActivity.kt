//Sebastian Garcia Bustamante 22291
// Primer y segundo laboratorio
//Realizado el 18/07/2024


package com.example.laboratorio0102

// Enum ElementType
enum class ElementType {
    ENTERO,
    CADENA,
    BOOLEANO
}


data class ItemData(
    val originalPos: Int,
    val originalValue: Any?,
    val type: ElementType,
    val info: String
) {
    override fun toString(): String {
        return "El elemento '$originalValue' estaba en la posición $originalPos, es de tipo $type e info es $info"
    }
}



// Función processList
fun processList(input: List<Any?>?): List<ItemData>? {
    if (input == null) return null

    return input.mapIndexedNotNull { index, element ->
        when (element) {
            is Int -> ItemData(
                originalPos = index,
                originalValue = element,
                type = ElementType.ENTERO,
                info = when {
                    element % 10 == 0 -> "M10"
                    element % 5 == 0 -> "M5"
                    element % 2 == 0 -> "M2"
                    else -> "-"
                }
            )
            is String -> ItemData(
                originalPos = index,
                originalValue = element,
                type = ElementType.CADENA,
                info = "L${element.length}"
            )
            is Boolean -> ItemData(
                originalPos = index,
                originalValue = element,
                type = ElementType.BOOLEANO,
                info = if (element) "verdadero" else "falso"
            )
            else -> null
        }
    }
}


fun main() {
    val inputList: List<Any?> = listOf(null, null, 5, "Hola", 20, true, false, 15, "PC", null)
    val resultList = processList(inputList)

    resultList?.forEach { println(it) }
}