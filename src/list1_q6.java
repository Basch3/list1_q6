import java.util.Scanner;

public class list1_q6 
{
    public static void main(String[] args) throws Exception
    {
        double raio, area;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o raio: ");
        raio = teclado.nextDouble();


        area = Math.PI*Math.pow(raio, 2);
        System.out.print("A área do círculo é igual a: " +area);
        teclado.close();
    } 



}