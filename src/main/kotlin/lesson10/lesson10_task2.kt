package org.example.lesson10

fun main() {

    println("Придумайте логин и пароль длиной не менее 4 символов каждый!")

    print("Введите логин: ")
    val login = readln()

    print("Введите пароль: ")
    val password = readln()

    checkingTheLength(login, password)
}

fun checkingTheLength(login: String, password: String) {
    if (login.length < 4 || password.length < 4) {
        println("Логин или пароль недостаточно длинные!")
    } else {
        println("Добро пожаловать!")
    }
}