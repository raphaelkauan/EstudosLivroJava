package raphael.estudos.primeriasemana;

public class SomaDeGastos {
  public static void main(String[] args) {
    double gastoJaneiro = 15000.00;
    double gastoFevereiro = 23000.00;
    double gastoMarco = 17000.00;

    double somaDeGastos = gastoJaneiro + gastoFevereiro + gastoMarco;
    double mediaDeGastos = + somaDeGastos / 3;
    System.out.println("Sua Soma do gasto é = " +  "R$ " + somaDeGastos + " E sua média de gastos é " + mediaDeGastos);
  }
}
