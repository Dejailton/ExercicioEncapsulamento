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
        System.out.println("Elevador inicializado");
        imprimirStatus();
    }
    public void Entra(int capacidadeElevador) {
        if (pessoasElevador < capacidadeElevador) {
            pessoasElevador++;
            System.out.println("Entrou uma pessoa no elevador");
            imprimirStatus();
        } else {
            System.out.println("Elevador atingiu a capacidade máxima");
        }
    }
    public void Sai() {
        if (this.pessoasElevador > 0) {
            this.pessoasElevador--;
            System.out.println("Saiu uma pessoa do elevador");
            imprimirStatus();
        } else {
            System.out.println("Não há pessoas no elevador");
        }
    }
    public void Sobe() {
        if (this.andarAtual < totalAndares) {
            this.andarAtual++;
            System.out.println("O elevador subiu um andar");
            imprimirStatus();
        } else if (this.andarAtual == this.totalAndares) {
            System.out.println("Você está no último andar, não é possível subir um andar.");
        }
    }
    public void Desce() {
        if (andarAtual == 0) {
            System.out.println("Você está no térreo, não é possível descer um andar.");
        } else {
            this.andarAtual--;
            System.out.println("Você desceu um andar");
            imprimirStatus();
        }
    }
    public void imprimirStatus() {
        System.out.printf("Andar atual: %s \n", andarAtual == 0 ? "térreo" : andarAtual);
        System.out.printf("Pessoas no elevador: %s \n", pessoasElevador);
    }
}
