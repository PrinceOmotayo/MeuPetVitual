class BichinhoVirtual(
    var nomePet: String) {
    var nivelDeFome: Int = 50
    var nivelFelicidade: Int = 50
    var vtdbanheiro: Int = 25
    var nivelvigor: Int = 100
    var idade: Int = 0
    var higiene: Int = 0
    var vidaPet = true

    fun main() {
        println("Bem-vindo ao Meu Animal de Estimação Virtual!")
        println("Digite o nome do seu animal de estimação:")
        val nome = readln()
        val pet = BichinhoVirtual(nomePet = nome) //Criei um objeto da classe para manipular dentro da função

        while (true) {
            println("\nEscolha uma ação:")
            println("1. Alimentar ${pet.nomePet}")
            println("2. Brincar com ${pet.nomePet}")
            println("3. Verificar o status de ${pet.nomePet}")
            println("4. Descansar $pet.")

            val escolha = readln().toInt()

            when (escolha) {
                1 -> pet.alimentar()
                2 -> pet.brincar()
                3 -> pet.verificarStatus()
                4 -> pet.descansar()
                5 -> {
                    println("Saindo do Simulador de Animal de Estimação Virtual. Adeus!")
                    return
                }

                else -> println("Escolha inválida. Tente novamente.")
            }

            passarTempo() // Simula o tempo que passa após cada ação
        }
    }

    fun alimentar() {
        nivelDeFome =(nivelDeFome + 10).coerceIn(0, 100)
        vtdbanheiro = (vtdbanheiro +15).coerceIn(0, 100)
        println("$nomePet foi alimentado. O nível de fome diminuiu.")
    }

    fun brincar() {
        nivelFelicidade =(nivelFelicidade+ 10).coerceIn(0, 100)
        higiene = (higiene - 15).coerceIn(0, 100)
        nivelvigor = (nivelvigor - 8).coerceIn(0, 100)
        println("$nomePet brincou e esta mais feliz.")
        if (nivelFelicidade == 100) {
            println("$nomePet está radiando alegria!")
        }
        if (higiene <= 15) {
            println("$nomePet precisa de um banho urgente!")
        }
    }

    fun verificarStatus() {
        println("Status atual de $nomePet:")
        println("Idade: $idade anos")
        println("Nível de fome: $nivelDeFome")
        println("Nível de felicidade: $nivelFelicidade")
        println("Nível de higiene: $higiene")
        println("Fazer necessidades: $vtdbanheiro ")
        println("Nível de vigor: $nivelvigor")
    }

    fun passarTempo() {
        nivelDeFome = (nivelDeFome + 4).coerceIn(0, 100)
        idade = (idade+ 1).coerceIn(0, 50)
        nivelFelicidade =(nivelFelicidade - 3).coerceIn(0, 100)
        nivelvigor =(nivelvigor -  10).coerceIn(0, 100)
        println("$nomePet completou mais um ano!.")
        if (idade > 30) {
            println("$nomePet está já não está mais tão jovem.")
            nivelvigor =(nivelvigor - 11).coerceIn(0, 100)
            nivelFelicidade = (nivelFelicidade- 4).coerceIn(0, 100)
        }
        if (idade >= 40) {
            println("$nomePet está ficando mais velho.")
            nivelvigor = (nivelvigor-12).coerceIn(0, 100)
            nivelFelicidade = (nivelvigor - 6).coerceIn(0, 100)
        }
    }

    fun descansar() {
        println("$nomePet vai dormir por quantas horas?(1-8)")
        var descanso = readln().toIntOrNull()?.coerceAtMost(8)
        while(descanso == null || descanso <= 0){
            println("Digite somente um número válido entre(1-8):")
            descanso = readln().toIntOrNull()?.coerceAtMost(8)
        }
        when(descanso){
            1 -> nivelvigor += descanso * 100 / 8
            2 -> nivelvigor += descanso * 100 / 8
            3 -> nivelvigor += descanso * 100 / 8
            4 -> nivelvigor += descanso * 100 / 8
            5 -> nivelvigor += descanso * 100 / 8
            6 -> nivelvigor += descanso * 100 / 8
            7 -> nivelvigor += descanso * 100 / 8
            8 -> nivelvigor += descanso * 100 / 8
        }
    println("$nomePet descansou por $descanso horas.")
    }

    fun derrota() {
 if (nivelvigor == 0 || nivelDeFome == 100 || nivelFelicidade == 0 || higiene == 0 ){
     vidaPet = false
     println("$nomePet partiu dessa para a melhor.\n" +
             "Você perdeu!.")
 }
    }
}