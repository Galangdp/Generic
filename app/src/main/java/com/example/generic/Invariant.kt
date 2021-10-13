
/*secara default, saat kita membuat generic parameter type,
sifat parameter tersebut adalah invariant
TODO invariant = tidak boleh subtitusi subtype(child) atau supertype (parent)*/

class Invariant<T>(val data : T)

fun main() {
    val data1 : Invariant<String> = Invariant("Ocuu")
     /*Jadi misalnya dia udah string di awal jika ingin mengubahnya kembali di bawah /seterusnya
     maka tidak bisa . jika any maka any . Kecuali*/
}