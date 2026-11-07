class BichinhoVirtual(
    var nomePet: String) {
    var nivelDeFome: Int = 50
        set(value) {field = value.coerceIn(0,100)}
    var nivelFelicidade: Int = 50
        set(value) {field = value.coerceIn(0,100)}
    var vtdbanheiro: Int = 25
        set(value) {field = value.coerceIn(0,100)}
    var nivelvigor: Int = 100
        set(value) {field = value.coerceIn(0,100)}
    var idade: Int = 0
        set(value) {field = value.coerceAtMost(50)}
    var higiene: Int = 100
        set(value) {field = value.coerceIn(0,100)}

//funções
    fun alimentar() {
        nivelDeFome -= 10
        vtdbanheiro += 15
        println("$nomePet foi alimentado. O nível de fome diminuiu.")
    }

    fun brincar() {
        nivelFelicidade += 10
        higiene -= 15
        nivelvigor -= 10
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
        nivelDeFome += 4
        idade ++
        nivelFelicidade -= 3
        nivelvigor -= 10
        println("$nomePet completou mais um ano!.")
        if (idade > 30) {
            println("$nomePet está já não está mais tão jovem.")
            nivelvigor  -= 11
            nivelFelicidade -= 4
        }
        if (idade >= 40) {
            println("$nomePet está ficando mais velho.")
            nivelvigor -= 12
            nivelFelicidade -= 6
        }
    }

    fun descansar() {
        println("$nomePet vai dormir por quantas horas?(1-8)")
        var descanso = readln().toIntOrNull()
        while (descanso == null || descanso <= 0) {
            println("Digite somente um número válido entre(1-8):")
            descanso = readln().toIntOrNull()
        }
        nivelvigor += descanso * 100/8
        println("$nomePet descansou por $descanso horas.")
    }

    fun darbanho(){
        println("$nomePet tomou banho!")
        higiene += 65
    }

    fun aliviar(){
        println("$nomePet fez suas necessidades.")
        vtdbanheiro -= 50
    }
    fun verificarderrota(): Boolean {
        if (nivelvigor == 0 || nivelDeFome == 100 || nivelFelicidade == 0 || higiene == 0) {
            return true
        }
        return false
        }

    fun vericarvitoria(): Boolean {
        if (idade == 50) {
            return true
        }
        return false
    }
}

