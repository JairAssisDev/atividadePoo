package bytebank;

import java.util.ArrayList;
import java.util.List;

public class AppPrincipal {

    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();

        SistemaCadastro cadastro = new SistemaCadastro();
        
        Endereco endereco1 = new Endereco("343434", "palmares", "centro", 2323);
        Cliente c1 = new Cliente("jair", "1233453245", "programador", endereco1);
        Conta conta1 = new Conta(0312.3, 23230, 23230, c1);
        conta1.depositar(1233.0);

        
        Endereco endereco2 = new Endereco("787878", "recife", "avenida", 987);
        Cliente c2 = new Cliente("maria", "987654321", "engenheira", endereco2);
        Conta conta2 = new Conta(1233.2, 12323, 23213, c2);
        conta2.depositar(500.0);

        contas.add(conta1);
        contas.add(conta2);

        // Imprimir os dados de todas as contas
        for (Conta conta : contas) {
            System.out.println("Dados da Conta:");
            System.out.println("Número: " + conta.getNumero());
            System.out.println("Agência: " + conta.getAgencia());
            System.out.println("Saldo: " + conta.getSaldo());

            Cliente titular = conta.getTitular();
            System.out.println("\nDados do Titular:");
            System.out.println("Nome: " + titular.getNome());
            System.out.println("CPF: " + titular.getCpf());
            System.out.println("Profissão: " + titular.getProfissao());

            Endereco enderecoTitular = titular.getEndereco();
            System.out.println("\nEndereço do Titular:");
            System.out.println("CEP: " + enderecoTitular.getCep());
            System.out.println("Cidade/Estado: " + enderecoTitular.getCidade_estado());
            System.out.println("Rua: " + enderecoTitular.getRua());
            System.out.println("Número da Casa: " + enderecoTitular.getNumerodaCasa());
            System.out.println("---------------------------");
        }
        cadastro.executar();
    }
}
