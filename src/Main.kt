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
        println("4. Descansar ${pet.nomePet}")
        println("5. Dar banho em ${pet.nomePet}")
        println("6. Aliviar ${pet.nomePet}")
        println("7. Sair")
        val escolha = readln().toIntOrNull()?: 0

        when (escolha) {
            1 -> {
                pet.alimentar()
                pet.passarTempo()
            }

            2 -> {
                pet.brincar()
                pet.passarTempo()
            }

            3 -> {
                pet.verificarStatus()
                pet.passarTempo()
            }

            4 -> {
                pet.descansar()
                pet.passarTempo()
            }

            5 -> {
                pet.darbanho()
                pet.passarTempo()
            }

            6 -> {
                pet.aliviar()
                pet.passarTempo()
            }

            7 -> {
                println("Saindo do Simulador de Animal de Estimação Virtual. Adeus!")
                return
            }

            else -> println("Escolha inválida. Tente novamente.")
        }

        if (pet.vericarvitoria()) {
            println(
                "${pet.nomePet} alcançou a sabedoria maxima.\n" +
                        "Você venceu!\n"
            )
            pet.verificarStatus()
            break
        }
        if (pet.verificarderrota()) {
            println(
                "${pet.nomePet} partiu dessa para um lugar melhor.\n" +
                        "Você perdeu!"
            )
            pet.verificarStatus()
            break

        }
    }
}