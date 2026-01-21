import Classes.Pessoa;
import Classes.JogadorFutebol;
import Classes.Elevador;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        while(running) {
            System.out.printf("=".repeat(40) + "\n");
            System.out.println("Escolha qual classe deseja criar:");
            System.out.println("1 - Pessoa");
            System.out.println("2 - Jogador de futebol");
            System.out.println("3 - Elevador");
            System.out.println("4 - Sair da aplicação");
            System.out.printf("=".repeat(40) + "\n");
            String escolha = sc.nextLine();

            switch (escolha) {
                case "1":
                    System.out.println("Digite seu nome:");
                    String nomePessoa = sc.nextLine();

                    LocalDate dataNascimentoPessoa = null;
                    while (dataNascimentoPessoa == null) {
                        System.out.println("Digite sua data de nascimento no formato dd/MM/yyyy:");
                        String dataString = sc.nextLine();
                        try {
                            dataNascimentoPessoa = LocalDate.parse(dataString, fmt);
                        } catch (DateTimeParseException e) {
                            System.out.println("Data em formato inválido. Tente novamente.");
                        }
                    }

                    System.out.println("Digite sua altura:");
                    double alturaPessoa = sc.nextDouble();


                    Pessoa p = new Pessoa(nomePessoa, dataNascimentoPessoa, alturaPessoa);
                    p.imprimirDados();
                    sc.nextLine();
                    System.out.println();
                    break;
                case "2":
                    System.out.println("Digite seu nome:");
                    String nomeJogador = sc.nextLine();


                    String posicaoJogador = null;
                    while (posicaoJogador == null) {
                        System.out.println("Escolha a posição:");
                        System.out.println("1 - Defesa");
                        System.out.println("2 - Meio-campo");
                        System.out.println("3 - Atacante");
                        String opc = sc.nextLine();

                        switch (opc) {
                            case "1":
                                posicaoJogador = "defesa";
                                break;
                            case "2":
                                posicaoJogador = "meio-campo";
                                break;
                            case "3":
                                posicaoJogador = "atacante";
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                                break;
                        }
                    }
                    LocalDate dataNascimentoJogador = null;
                    while (dataNascimentoJogador == null) {
                        System.out.println("Digite sua data de nascimento no formato dd/MM/yyyy:");
                        String dataString = sc.nextLine();
                        try {
                            dataNascimentoJogador = LocalDate.parse(dataString, fmt);
                        } catch (DateTimeParseException e) {
                            System.out.println("Data em formato inválido. Tente novamente.");
                        }
                    }
                    System.out.println("Digite sua nacionalidade:");
                    String nacionalidadeJogador = sc.nextLine();

                    System.out.println("Digite sua altura:");
                    double alturaJogador = sc.nextDouble();

                    System.out.println("Digite seu peso:");
                    double pesoJogador = sc.nextDouble();

                    JogadorFutebol jogadorFutebol = new JogadorFutebol(nomeJogador, posicaoJogador, dataNascimentoJogador, nacionalidadeJogador, alturaJogador, pesoJogador);
                    jogadorFutebol.imprimirDados();
                    sc.nextLine();
                    break;
                case "3":
                    System.out.println("Digite o total de andares do elevador");
                    int totalAndar = sc.nextInt();

                    System.out.println("Digite a capacidade total de pessoas por andar");
                    int capacidade
                    Elevador elevador = new Elevador()
                    break;
                case "4":
                    System.out.println("Saindo da aplicação...");
                    running = false;
                    break;
                default:
                    System.out.println("Escolha invalida.");
            }
        }


    }
}