package raphael.estudos.segundasemana;

/* Imprima	a	soma	de	1	até	1000. */

public class Atividade02 {
  public static void main(String[] args) {
    int soma = 0;
    int i = 1;

    while (i <= 1000) {
      soma = soma + i;
      i++;

      System.out.println(i);
    }
  }
}
