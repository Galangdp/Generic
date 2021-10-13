
/*
Terkadang kita ingin TODO membatasi data yang boleh digunakan di generic parameter type
kita bisa menambahkan constraint di generic parameter type  dengan menyebutkan tipe yang diperbolehkan
secara otomatis, type data yang bisa digunakan adalah type yang sudah kita sebutkan atau class class turunanya
secara default constraint type untuk generic parameter type adalah any, sehingga semua tipe data
bisa di gunakan
*/

// TODO Jadi Contoh misalnya ada data user 1 ,dia hanya bisa di panggil di user 1 tidak bisa di panggil di user 2
// TODO jatohnya si kaya misahin data si user 1 sama user 2

open class Employee

class Manager : Employee()

class VicePresident : Employee()

class Company<T : Employee>(val employee: T)

fun main() {
    val data1 = Company(Manager())
    val data2 = Company(VicePresident())
}