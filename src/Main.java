import Classes.Pessoa;
import Classes.JogadorFutebol;
import Classes.Elevador;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
                    System.out.println("Saindo da classe Pessoa...");
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
                    System.out.println("Saindo da classe Jogador de Futebol...");
                    break;
                case "3":
                    System.out.println("Digite o total de andares do elevador:");
                    int totalAndares = sc.nextInt();

                    System.out.println("Digite a capacidade total de pessoas que o elevador suporta:");
                    int capacidadeElevador = sc.nextInt();
                    sc.nextLine(); // limpar newline pendente
                    Elevador elevador = new Elevador(totalAndares, capacidadeElevador);

                    boolean elevadorInicializado = false;
                    boolean inElevatorMenu = true;
                    while (inElevatorMenu) {
                        System.out.printf("-".repeat(30) + "\n");
                        System.out.println("Menu do Elevador - escolha uma opção:");
                        System.out.println("1 - Inicializa");
                        System.out.println("2 - Entra");
                        System.out.println("3 - Sai");
                        System.out.println("4 - Sobe");
                        System.out.println("5 - Desce");
                        System.out.println("6 - Sair da classe");
                        System.out.printf("-".repeat(30) + "\n");

                        String opcElev = sc.nextLine();
                        switch (opcElev) {
                            case "1":
                                if (!elevadorInicializado) {
                                    elevador.Inicializa(capacidadeElevador, totalAndares);
                                    elevadorInicializado = true;
                                } else {
                                    System.out.println("Elevador já inicializado.");
                                }
                                break;
                            case "2":
                                if (!elevadorInicializado) {
                                    System.out.println("Elevador não inicializado. Escolha 1 para inicializar o elevador.");
                                } else {
                                    elevador.Entra(capacidadeElevador);
                                }
                                break;
                            case "3":
                                if (!elevadorInicializado) {
                                    System.out.println("Elevador não inicializado. Escolha 1 para inicializar o elevador.");
                                } else {
                                    elevador.Sai();
                                }
                                break;
                            case "4":
                                if (!elevadorInicializado) {
                                    System.out.println("Elevador não inicializado. Escolha 1 para inicializar o elevador.");
                                } else {
                                    elevador.Sobe();
                                }
                                break;
                            case "5":
                                if (!elevadorInicializado) {
                                    System.out.println("Elevador não inicializado. Escolha 1 para inicializar o elevador.");
                                } else {
                                    elevador.Desce();
                                }
                                break;
                            case "6":
                                System.out.println("Saindo da classe Elevador...");
                                inElevatorMenu = false;
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                                break;
                        }
                    }

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