package es.etg.dam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

public static final String MSG_ERROR = "Se ha producido un error al ejecutar el comando";
    public static final String[] COMAND = {"java", "-cp", "target/classes", "es.etg.dam.Proceso", "8", "10" };

    public static void main(String[] args) {
		try {
			Process process = Runtime.getRuntime().exec(COMAND);
			StringBuilder output = new StringBuilder();

			BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String linea;
			while ((linea = br.readLine()) != null) {
				output.append(linea).append("\n");
			}

			int exitVal = process.waitFor();
			if (exitVal == 0) {
				System.out.println("Success!");
				System.out.println(output);
				System.exit(0);
			} else {
				System.out.println(MSG_ERROR);
				System.exit(1);
			}

		} catch (IOException | InterruptedException e) {
			System.exit(34);
		}
	}

}
