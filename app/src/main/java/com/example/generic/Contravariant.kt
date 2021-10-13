
/*
Contravariant artinya kita bisa melakukan subtitusi supertype dengan Subtype
tidak semua jenis class generic yang mendukung contravariant, hanya kelas generic yang
menggunakan generic parameter function
*/


class Contravariant<in T>  {

    fun sayHello(name :T){
        return print("Hello $name")
    }
}

fun main() {
    val data1 : Contravariant<Any> = Contravariant()
    val data2 : Contravariant<String> = data1
}