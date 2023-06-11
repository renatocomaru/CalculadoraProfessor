import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
          System.out.printf("Digite o nome do professor: ");
          String nome = scanner.nextLine();

          System.out.printf("Digite o regime de pagamento do professor (CLT, Horista, PJ):");
          String regime = scanner.nextLine();

          Professor professor = new Professor(nome, regime);

          switch(regime) {
            case "CLT":
              System.out.printf("Digite o salario mensal do professor:");
              professor.setSalario(scanner.nextDouble());
              break;
            case "Horista":
              System.out.printf("Digite o número de horas trabalhadas pelo professor:");
              professor.setHorasTrabalhadas(scanner.nextInt());
              System.out.printf("Digite o valor da hora do professor:");
              professor.setValorHora(scanner.nextDouble());
              break;
            case "PJ":
              System.out.printf("Digite o valor do contrato do professor:");
              professor.setValorContrato(scanner.nextDouble());
              break;
          }

          double valorAReceber = CalculadoraDeSalario.calcularSalario(professor);

          System.out.println("O professor " + professor.getNome() + " vai receber: R$" + valorAReceber);
        }
    }
}
