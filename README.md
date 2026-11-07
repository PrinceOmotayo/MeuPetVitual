# 🐾 Meu Animal de Estimação Virtual — Kotlin

Um jogo de simulação desenvolvido em **Kotlin**, no qual o jogador cuida de um animal de estimação virtual, administra suas necessidades e acompanha seu crescimento ao longo do tempo.

O objetivo é cuidar do bichinho, manter seus atributos equilibrados e ajudá-lo a alcançar a idade de 50 anos. Mas atenção: suas escolhas influenciam diretamente a sobrevivência e a felicidade do seu pet!

---

 🎮 Sobre o projeto

O **Meu Animal de Estimação Virtual** é um projeto desenvolvido para praticar os fundamentos da programação com Kotlin, utilizando programação orientada a objetos.

Durante o jogo, o jogador pode alimentar, brincar, dar banho, descansar e acompanhar o estado do animal.

Cada ação pode alterar seus atributos. O desafio é encontrar o equilíbrio entre as necessidades do bichinho para evitar que ele perca todas as suas condições de sobrevivência.

🕹️ Como jogar

Ao iniciar o programa, você deverá informar o nome do seu animal de estimação.

Em seguida, o menu principal apresentará as opções disponíveis:

| Tecla | Ação | O que acontece |
|---|---|---|
| 1 | Alimentar | Diminui a fome e aumenta a necessidade de ir ao banheiro. |
| 2 | Brincar | Aumenta a felicidade, mas reduz o vigor e a higiene. |
| 3 | Verificar status | Exibe os atributos atuais do pet. |
| 4 | Descansar | Recupera o vigor de acordo com as horas de descanso. |
| 5 | Dar banho | Aumenta o nível de higiene. |
| 6 | Aliviar | Diminui a necessidade de ir ao banheiro. |
| 7 | Sair | Encerra o jogo. |

📊 Entenda os atributos

O animal possui seis atributos principais:

- **Fome:** aumenta com a passagem do tempo. Quanto maior o valor, mais fome o pet sente.
- **Felicidade:** aumenta ao brincar e diminui com a passagem do tempo.
- **Higiene:** diminui ao brincar e aumenta ao tomar banho.
- **Necessidades:** aumenta ao alimentar e diminui ao aliviar.
- **Vigor:** diminui com o tempo e ao brincar. Pode ser recuperado descansando.
- **Idade:** aumenta conforme o tempo passa.

A maioria dos atributos varia entre 0 e 100. O código utiliza *setters* personalizados para limitar automaticamente esses valores.

🏆 Como vencer?

Seu objetivo é manter o bichinho vivo até ele completar **50 anos**.

💀 Como perder?

O jogo termina quando uma das seguintes condições é atingida:

- Vigor chega a 0.
- Fome chega a 100.
- Felicidade chega a 0.
- Higiene chega a 0.

**Dica:** não cuide apenas de um atributo! Todas as necessidades precisam de atenção.

---

⚙️ Tecnologias e requisitos

| Tecnologia | Finalidade |
|---|---|
| Kotlin | Linguagem de programação utilizada. |
| JDK 17 ou superior | Ambiente Java para compilar e executar o projeto. |
| IntelliJ IDEA | IDE recomendada para abrir, editar e executar o código. |
| Git | Controle de versão do projeto. |
| GitHub | Hospedagem e compartilhamento do código. |

Observação: o projeto utiliza recursos básicos da linguagem Kotlin e não apresenta dependências externas no código compartilhado. O JDK 17 ou superior é uma recomendação de ambiente; a versão efetivamente configurada deve ser conferida nas configurações do projeto.

---

📥 Como clonar o projeto

Para obter uma cópia do projeto em sua máquina, siga os passos:

1. Verifique os requisitos

Instale:

- [JDK](https://www.oracle.com/java/technologies/downloads/)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/)
- [Git](https://git-scm.com/downloads)
2. Clone o repositório

Abra o CMD ou terminal e execute:

```bash
git clone <URL_DO_REPOSITORIO>
```

Substitua `<URL_DO_REPOSITORIO>` pelo endereço HTTPS do repositório no GitHub.

3. Entre na pasta do projeto

```bash
cd MeuPetVirtualKotlin
```

4. Abra no IntelliJ IDEA

1. Abra o IntelliJ IDEA.
2. Clique em **Open**.
3. Selecione a pasta do projeto.
4. Aguarde o carregamento e a configuração do Kotlin e do JDK.
5. Abra o arquivo que contém a função `main()`.
6. Clique no botão de execução para iniciar o jogo.

---

▶️ Executando pelo terminal

Caso tenha o compilador Kotlin instalado e configurado no PATH, também é possível executar o programa pelo terminal.

Considerando que o código esteja em `src/Main.kt`:

Compilar:

```bash
kotlinc src/Main.kt -include-runtime -d MeuPetVirtual.jar
```

Executar:

```bash
java -jar MeuPetVirtual.jar
```

Se o arquivo estiver em outro caminho ou tiver outro nome, ajuste o comando de compilação.


🗂️ Estrutura do projeto

Estrutura simplificada sugerida para o repositório:

```text
MeuPetVirtualKotlin/
│
├── src/
│   └── Main.kt
│       ├── fun main()
│       └── class BichinhoVirtual
│
├── .gitignore
├── MeuPetVirtualKotlin.iml
└── README.md
```

### Organização do código

`main()`

Responsável pela interação com o jogador:

- Apresenta o jogo.
- Solicita o nome do animal.
- Exibe o menu de ações.
- Recebe as escolhas.
- Controla as condições de vitória e derrota.

`class BichinhoVirtual`

Responsável pelo comportamento e pelos atributos do animal:

- Armazena as características do pet.
- Controla a alimentação e as necessidades.
- Gerencia a felicidade, higiene e vigor.
- Atualiza a idade e a passagem do tempo.
- Verifica as condições de vitória e derrota.

---

 🧠 Conceitos de Kotlin aplicados

Este projeto foi desenvolvido para colocar em prática conceitos fundamentais da linguagem:

| Conceito | Aplicação no projeto |
|---|---|
| Variáveis (`var` e `val`) | Armazenamento de dados e atributos. |
| Classes e objetos | Criação e manipulação do animal virtual. |
| Construtores | Inicialização do objeto com o nome do pet. |
| Funções | Organização das ações do jogo. |
| Encapsulamento | Controle dos atributos por meio de setters personalizados. |
| `while` | Repetição do menu principal. |
| `when` | Seleção das ações do jogador. |
| `if` e `else` | Verificação das condições do jogo. |
| `Boolean` | Retorno das verificações de vitória e derrota. |
| `toIntOrNull()` | Conversão de entradas sem provocar erro imediato quando o valor não é numérico. |
| `coerceIn()` | Limitação dos valores dos atributos. |
| Interpolação de strings | Exibição de mensagens personalizadas com o nome do pet. |

### Um detalhe técnico: setters personalizados

Os atributos utilizam setters para impedir que determinados valores ultrapassem seus limites.

Exemplo:

```kotlin
var nivelDeFome: Int = 50
    set(value) {
        field = value.coerceIn(0, 100)
    }
```

Dessa forma, mesmo que uma operação tente atribuir um valor maior que 100 ou menor que 0, o atributo permanecerá dentro do intervalo permitido.

---

🚀 Objetivo de aprendizagem

O projeto tem como objetivo fortalecer o raciocínio lógico e a compreensão da programação orientada a objetos, utilizando Kotlin.

Mais do que desenvolver um jogo, a proposta é transformar conceitos estudados em funcionalidades práticas, trabalhando com lógica condicional, estruturas de repetição, organização de código e manipulação de objetos.

👨‍💻 Autor
Prince Omotayo
Desenvolvido como projeto de aprendizagem em Kotlin.

Tecnologia principal: Kotlin  
Projeto: Meu Animal de Estimação Virtual

⭐ Se gostou do projeto, deixe uma estrela no repositório!
