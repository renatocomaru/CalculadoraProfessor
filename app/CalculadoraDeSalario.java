public class CalculadoraDeSalario {
  
  public static double calcularSalario(Professor professor) {
    String regime = professor.getRegime();

    switch(regime) {
      case "CLT":
        return professor.getSalario();
      case "Horista":
        return professor.getHorasTrabalhadas() * professor.getValorHora();
      case "PJ":
        return professor.getValorContrato();
      default:
        return 0;
    }
  }
}
