public class Professor {
  private String nome;
  private String regime;
  private double salario;
  private double horasTrabalhadas;
  private double valorHora;
  private double valorContrato;

  public Professor(String nome, String regime) {
    this.nome = nome;
    this.regime = regime;
  }

  //Gets e Sets

  public String getNome() {
    return nome;
  }

  public String getRegime() {
    return regime;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public double getHorasTrabalhadas() {
    return horasTrabalhadas;
  }

  public void setHorasTrabalhadas(double horasTrabalhadas) {
    this.horasTrabalhadas = horasTrabalhadas;
  }

  public double getValorHora() {
    return valorHora;
  }

  public void setValorHora(double valorHora) {
    this.valorHora = valorHora;
  }

  public double getValorContrato() {
    return valorContrato;
  }

  public void setValorContrato(double valorContrato) {
    this.valorContrato = valorContrato;
  }  
}
