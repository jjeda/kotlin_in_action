package expression

import java.lang.StringBuilder

fun <T> joinToString(
    collection: Collection<T>,
    separator: CharSequence = ", ",
    prefix: CharSequence = "",
    postfix: CharSequence = ""
): String {
  val result = StringBuilder(prefix)
  for( (index, element) in collection.withIndex()) {
    if (index > 0) {
      result.append(separator)
    }
    result.append(element)
  }
  result.append(postfix)
  return result.toString()
}

fun <T> Collection<T>.joinToString(
    collection: Collection<T>,
    separator: CharSequence = ", ",
    prefix: CharSequence = "",
    postfix: CharSequence = ""
): String {
  val result = StringBuilder(prefix)
  for( (index, element) in collection.withIndex()) {
    if (index > 0) {
      result.append(separator)
    }
    result.append(element)
  }
  result.append(postfix)
  return result.toString()
}

fun main() {
  val numbers = listOf(1, 2, 3, 4, 5, 6)
  println(joinToString(numbers))
  println(joinToString(collection = numbers, prefix = "[", postfix = "]"))
  println(joinToString(collection = numbers, prefix = "<", postfix = ">", separator = "•"))

  println(numbers.joinToString())
  println(numbers.joinToString(prefix = "[", postfix = "]"))
  println(numbers.joinToString(prefix = "<", postfix = ">", separator = "•"))


}

