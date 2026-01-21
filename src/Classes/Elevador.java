package Classes;

public class Elevador {
    private int andarAtual = 0;
    private int totalAndares;
    private int capacidadeElevador;
    private int pessoasElevador = 0;

    public Elevador(int totalAndares, int capacidadeElevador) {
        this.totalAndares = totalAndares;
        this.capacidadeElevador = capacidadeElevador;
    }

    public void Inicializa(int capacidadeElevador, int totalAndares) {
        this.andarAtual = 0;
        this.pessoasElevador = 0;
        System.out.println("Elevador inicializado:");
        System.out.printf("Andar atual: %s", andarAtual);
        System.out.printf("Pessoas no elevador: %s", pessoasElevador);
    }
    public void Entra(int capacidadeElevador) {
        if (pessoasElevador < capacidadeElevador) {
            System.out.println("Entrou uma pessoa no elevador");
        }
    }
    public void Sai() {
        if (this.pessoasElevador < 0) {
            System.out.println("Não há pessoas no elevador");
        } else {
            this.pessoasElevador -= 1;
            System.out.printf("Saiu uma pessoa do elevador, atualmente tem %s pessoas no elevador", pessoasElevador);
        }

    }
    public void Sobe() {
        if (this.andarAtual < totalAndares) {
            System.out.println("Subiu um andar");
            System.out.printf("Andar atual: %s", andarAtual);
            System.out.printf("Quantidade de pessoas no elevador: %s", pessoasElevador);
            this.andarAtual++;
        } else if (this.andarAtual == this.totalAndares) {
            System.out.println("Você já está no último andar.");
        }
    }
    public void Desce() {
        if (andarAtual == 0) {
            System.out.println("Você já está no térreo");
        } else {
            System.out.println("Você desceu um andar");
            System.out.printf("Andar atual: %s", andarAtual);
            System.out.printf("Pessoas no elevador: %s", pessoasElevador);
        }
    }
}
