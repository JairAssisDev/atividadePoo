package bytebank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaCadastro {

    private List<Conta> contas;
    private Scanner scanner;

    public SistemaCadastro() {
        contas = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void executar() {
        int opcao = -1;

        while (opcao != 0) {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                	cadastrarConta();
                    break;
                case 2:
                    listarContas();
                    break;
                case 0:
                    System.out.println("Sistema encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

            System.out.println();
        }
    }

    private void exibirMenu() {
        System.out.println("==== Sistema de Cadastro ====");
        System.out.println("1. Cadastrar Conta");
        System.out.println("2. Listar Contas");
        System.out.println("0. Sair");
        System.out.print("Digite a opção desejada: ");
    }

    private Cliente cadastrarCliente() {
        System.out.println("==== Cadastro de Cliente ====");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Profissão: ");
        String profissao = scanner.nextLine();
        Cliente cliente = new Cliente(nome, cpf, profissao, cadastrarEndereco());
        

        System.out.println("Cliente cadastrado com sucesso!");
        return cliente;
    }

    private Endereco cadastrarEndereco() {
        System.out.println("==== Cadastro de Endereço ====");
        System.out.print("CEP: ");
        String cep = scanner.nextLine();
        System.out.print("Cidade/Estado: ");
        String cidadeEstado = scanner.nextLine();
        System.out.print("Rua: ");
        String rua = scanner.nextLine();
        System.out.print("Número da Casa: ");
        int numeroCasa = scanner.nextInt();
        scanner.nextLine(); 

        Endereco endereco = new Endereco(cep, cidadeEstado, rua, numeroCasa);
        
        

        return endereco;
       
    }


    private void cadastrarConta() {
        System.out.println("==== Cadastro de Conta ====");
        System.out.print("Número: ");
        int numero = scanner.nextInt();
        System.out.print("Agência: ");
        int agencia = scanner.nextInt();
        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); 

        Cliente titular = cadastrarCliente();
        Conta conta = new Conta(saldo, agencia, numero, titular);
        contas.add(conta);

        System.out.println("Conta cadastrada com sucesso!");
    }


    private void listarContas() {
        System.out.println("==== Lista de Contas ====");
        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
        } else {
            for (Conta conta : contas) {
                System.out.println("Número: " + conta.getNumero());
                System.out.println("Agência: " + conta.getAgencia());
                System.out.println("Saldo: " + conta.getSaldo());
                System.out.println("Titular: " + conta.getTitular().getNome());
                System.out.println("---------------------------");
            }
        }
    }

    public static void main(String[] args) {
        SistemaCadastro sistema = new SistemaCadastro();
        sistema.executar();
    }
}
