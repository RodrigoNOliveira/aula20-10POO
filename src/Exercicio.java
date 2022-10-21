import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();
        Funcionario F;
        boolean verifica = false; 
        System.out.print("Digite a quantidade de funcionarios a serem adicionados: ");
        int n = scanner.nextInt();
        System.out.println();
        for (int i = 0; i < n; i++) {

            System.out.print("Insira o id do funcionario: ");
            int id = scanner.nextInt();
            System.out.println();
            scanner.nextLine();

            System.out.print("Digite o nome do funcionario: ");
            String nome = scanner.nextLine();
            System.out.println();

            System.out.print("Digite o salario do funcionario: ");
            double salario = scanner.nextDouble();
            System.out.println();

            F = new Funcionario(id, nome, salario);
            for (int j = 0; j < funcionarios.size(); j++) {
                if (funcionarios.get(j).getId() == id) {
                    verifica = true;
                } else {
                    verifica = false;
                }
            }
            if (verifica == true) {
                System.out.println();
                System.out.println("ID INVALIDO, NÃO FOI POSSIVEL INSERIR, TENTE NOVAMENTE");
                System.out.println();
                i = i - 1;
            } else {
                funcionarios.add(F);
            }

            System.out.println();
            System.out.println();
        }
        System.out.println("Lista de funcionarios: \n" + funcionarios);
        System.out.println();


        System.out.print("Digite o id do funcionario que deseja aumentar o salario: ");
        int id = scanner.nextInt(); 
        boolean temID = false;
        for (int j = 0; j < funcionarios.size(); j++) {
            
            if (funcionarios.get(j).getId() == id) {
                System.out.println();
                System.out.print("Insira a porcentagem do aumento do salario(Coloque apenas o numero): ");
                Double aumento = scanner.nextDouble();
                funcionarios.get(j).aumentaSalario(aumento/100);
                temID = true;
            } 
        }
            if (temID == false){
                
                System.out.println("ID NÃO ENCONTRADO");
            }

            System.out.println();
            System.out.println(funcionarios);
        scanner.close();
    }
}
