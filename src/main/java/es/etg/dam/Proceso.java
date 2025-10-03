package es.etg.dam;

public class Proceso {

    public static final String ERROR = "ERROR PARAMETRO NO NUMERICO";
    public static final String ERRORDOS = "ERROR DEBES METER DOS PARAMETROS";


    public static void main(String[] args) {
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            int minimo = Math.min(num1, num2);
            int maximo = Math.max(num1, num2);

            int sum = 0;

            for (int i = maximo; i >= minimo; i--) {
                sum = sum + i;
            }
            System.out.print(sum);
        } catch (NumberFormatException e) {
            System.out.println(ERROR);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(ERRORDOS);
        }
    }
}
