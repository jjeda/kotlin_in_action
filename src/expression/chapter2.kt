package expression

import java.io.BufferedReader
import java.lang.NumberFormatException

fun max(a: Int, b: Int) : Int = if(a > b) a else b // expression


//자바와 비슷하게 사용
fun readNumber(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    }
    catch (e:NumberFormatException) {
        return null
    }
    finally {
        reader.close()
    }
}

// expression
fun readNumberExpression(reader: BufferedReader) {

    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null
    }
}