package clazz

// Inti Block
@Service
class AccountService(
    _accountRepository: AccountRepository,
    _passwordEncoder: PasswordEncoder
) {
  val accountRepository: AccountRepository
  val passwordEncoder: PasswordEncoder

  init {
    accountRepository = _accountRepository
    passwordEncoder = _passwordEncoder
  }
}

// Companion Object
class User private constructor(
    val username: String,
    val email: String
) {
  companion object {
    fun of(username: String, email: String): User {
      return User(username, email)
    }
  }
}

class Student(val name: String): Person {
  override fun enter() {
    ...
  }
  override fun leave() {
    ...
  }
}

interface Person {
  fun enter()
  fun leave()
}

class HelloStudentWithoutDelegation (
    val targetStudent: Person = Student("jjeda")
) : Person {
  override fun enter() {
    println("Hello $targetStudent.name !")
    targetStudent.enter()
  }

  override fun leave() {
    targetStudent.leave()
  }
}


// Class Delegation
class HelloStudent (
    val targetStudent: Person = Student("jjeda")
) : Person by targetStudent {
  override fun enter() {
    println("Hello $targetStudent.name !")
    targetStudent.enter()
  }
}

fun main() {
  User("jjeda","jjeda@naver.com") // X
  User.of(username = "jjeda", email = "jjeda@naver.com") // O
}