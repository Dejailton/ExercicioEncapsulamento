# Elevador - Exercício de Encapsulamento

## Descrição
Projeto em Java para treinar encapsulamento usando três classes principais: `Pessoa`, `JogadorFutebol` e `Elevador`. A aplicação apresenta um menu para criar instâncias e, na instância do elevador, um submenu com operações (inicializar, entra, sai, sobe, desce).

## Estrutura do projeto
- `src\Main.java` - ponto de entrada e menus interativos.
- `src\Classes\Pessoa.java` - classe modelo para pessoa (encapsulamento de atributos).
- `src\Classes\JogadorFutebol.java` - extensão/variante de pessoa com atributos específicos.
- `src\Classes\Elevador.java` - lógica do elevador (capacidade, andar atual, operações).

## Como compilar e executar (Windows)
Usando IntelliJ IDEA:
- Abra o projeto em `IntelliJ IDEA 2024.1.4`.
- Execute a classe `Main`.

Via linha de comando (Prompt ou PowerShell):
1. Compile:
    - `javac -d out src\Classes\*.java src\Main.java`
2. Execute:
    - `java -cp out Main`

## Uso
Ao executar, escolha a classe desejada no menu principal:
- `1` Pessoa
- `2` Jogador de futebol
- `3` Elevador
- `4` Sair da aplicação

Menu do elevador (após escolher `3`):
- `1` Inicializa — deve ser usado apenas uma vez para configurar capacidade e total de andares; o programa impede re-inicializações.
- `2` Entra — adiciona pessoa se houver capacidade.
- `3` Sai — remove pessoa se houver alguém dentro.
- `4` Sobe — sobe um andar se não estiver no topo.
- `5` Desce — desce um andar se não estiver no térreo.
- `6` Sair da classe — volta ao menu principal.

Observação: o comportamento esperado é que a inicialização seja permitida apenas enquanto o elevador não estiver inicializado; o programa já valida tentativas repetidas.