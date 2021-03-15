fun main(){

	val n1:Float? = 2.1f
    val n2:Float? = 1.1f
	
	//Para teste de um valor null:
	//val n2:Float? = null
	val operacao:Int = (0..4).random()
	
    
	

	if(n1 === null || n2 === null){
		println("Existe um valor nulo. Não posso calcular.")
	} else {
		when(operacao){
			1 -> println(n1 + n2)
	
			2 -> println(n1 - n2)
	
			3 -> println(n1 * n2)
	
			4 -> println(n1 / n2)
	
			else -> println("Operação inexistente.")
		}
	}

}


