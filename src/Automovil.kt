class Automovil (mar: String,col: String,pre: Int){

    // caracteristicas

    var marca: String =mar
    var color: String = col
    var precio: Int = pre

    // funciones y metodos

    fun encender(){
        println("El carros marca "+ marca +" de color " + color +" encendio")
    }
    fun frenar(){
        println("El carro marca "+ marca +" de color "+ color +" freno")
    }
    fun apagar(){
        println("El carro marca "+ marca +" de coloresgit add "+ color +"se apago")
    }
}