package raphael.estudos.segundasemana;

/* Imprima	os	fatoriais	de	1	a	10. */

public class Atividade04 {
  public static void main(String[] args) {
    long fatorial = 1;
    for (int n = 1; n <= 20; n++) {
      fatorial = fatorial * n;
      System.out.println("fat(" + n + ")	=	" + fatorial);
    }
  }
}
