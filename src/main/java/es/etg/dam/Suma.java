package es.etg.dam;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Suma {

    public static final String ERROR = "ERROR PARAMETRO NO NUMERICO";
    public static final String ERRORDOS = "ERROR DEBES METER DOS PARAMETROS";


    public static void main(String[] args) throws Exception {
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

        File fichero = new File("Suma.txt");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fichero))){
            bw.write(String.valueOf(sum));
            bw.close();
        }
                
            
        } catch (NumberFormatException e) {
            System.out.println(ERROR);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(ERRORDOS);
        }
    }
}
