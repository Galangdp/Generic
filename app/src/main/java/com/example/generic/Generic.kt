package com.example.generic

class Building2<T, U>(val data :T, val seccondData : U){
    fun printData(){
        return println("Data is $data $seccondData")
    }
}

// T Ini Generic sama dengan Any tapi bedanya tapi lebih mudah menggunakan nya
//dengan hanya menambahkan <> . dan dia bisa di isi dengan apa saja contoh Todo <isisendiri>

// generic bisa di isi semua TODO (TIPE DATA)

// Tipe data = String, Int, Boolean dan lain lain


// TODO  Bisa 2 Generic dalam satu Class

fun main() {

    val dataString = Building2("Pertamina", 4)

    val dataInt = Building2(10, "PLN")

    val dataBoolean = Building2(true, 4.2)

    dataString.printData()

    dataInt.printData()

    dataBoolean.printData()

}