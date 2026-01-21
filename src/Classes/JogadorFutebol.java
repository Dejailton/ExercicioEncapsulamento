package Classes;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class JogadorFutebol {
    private String nome;
    String posicao;
    LocalDate dataNascimento;
    String nacionalidade;
    double altura;
    double peso;

    public JogadorFutebol(String nome, String posicao, LocalDate dataNascimento, String nacionalidade, double altura, double peso) {
        this.nome = nome;
        this.posicao = posicao;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int calcularIdade() {
        if (this.dataNascimento == null) {
            return 0;
        }
        return Period.between(this.dataNascimento, LocalDate.now()).getYears();
    }

    public void imprimirDados() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        int idade = calcularIdade();
        int tempoRestante = calcularTempoApos();
        System.out.printf("Dados do jogador de futebol %s:\n", this.nome);
        System.out.printf("Nome: %s\n", this.nome);
        System.out.printf("Posicao: %s \n", this.posicao);
        System.out.printf("Data de nascimento: %s\n", this.dataNascimento.format(fmt));
        System.out.printf("Nacionalidade: %s \n", this.nacionalidade);
        System.out.printf("Altura: %,.2f \n", this.altura);
        System.out.printf("Peso: %s \n", this.peso);
        System.out.printf("Sua idade é: %s \n", idade);
        if (tempoRestante < 0) {
            System.out.printf("Já pode se aposentar (passou %d ano(s) do limite).%n \n", Math.abs(tempoRestante));
        } else if (tempoRestante == 0) {
            System.out.println("Se aposenta este ano.");
        } else {
            System.out.printf("Tempo para se aposentar: %d ano(s).%n \n", tempoRestante);
        }
    }

    public int calcularTempoApos() {
        int idade = calcularIdade();
        int limite = 0;
        if (this.posicao.equals("defesa")) {
            limite = 40;
        } else if (this.posicao.equals("meio-campo")) {
            limite = 38;
        } else {
            limite = 35;
        }
        int idadeRestante = limite - idade;
        return idadeRestante;
    }
}
