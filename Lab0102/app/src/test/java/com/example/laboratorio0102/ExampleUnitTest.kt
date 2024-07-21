

import com.example.laboratorio0102.ElementType
import com.example.laboratorio0102.ItemData
import com.example.laboratorio0102.processList
import org.junit.Assert.*
import org.junit.Test

class LabTest {

    @Test
    fun `Given a list, when it has multiple elements, then result list should be correct`() {
        val result = processList(
            listOf(10, "Enero", null, true)
        )
        // Lo corremos SOLO en los casos donde sabemos que el response no es null
        // esto hace que cuando usemos result después de esta línea, se asuma que NO es null
        // y por ende, corra
        assertNotNull(result)
        assertTrue(result!!.size == 3)
        assertTrue(
            result[0].originalPos == 0
                    && result[0].originalValue == 10
                    && result[0].type == ElementType.ENTERO
                    && result[0].info.lowercase() == "m10"
        )

        assertTrue(
            result[1].originalPos == 1
                    && result[1].originalValue == "Enero"
                    && result[1].type == ElementType.CADENA
                    && result[1].info.lowercase() == "l5"
        )
        assertTrue(
            result[2].originalPos == 3
                    && result[2].originalValue == true
                    && result[2].type == ElementType.BOOLEANO
                    && result[2].info.lowercase() == "verdadero"
        )
    }

    @Test
    fun `#Given multiple ItemData object, then the toString method returns the expected string`() {
        val result = processList(
            listOf(10, "Enero", null, true, 5.5)
        )
        assertNotNull(result)
        println(result!![0].toString())
        assertTrue(result[0].toString().lowercase() == "el elemento '10' estaba en la posición 0, es de tipo entero e info es m10")
    }

}
