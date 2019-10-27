
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor{
	public static void main(String[] args) throws IOException{
		
		//Paso 1: Crear objeto serversocket
		ServerSocket ss=new ServerSocket(9999);
		System.out.println("Esperando Conexión en el puerto 9999");	

		//Paso 2: Esperar conexión
		Socket s=ss.accept();
		System.out.println("Conexión establecida desde: "+s.getInetAddress());

		//Paso 3: Obtener flujos de E/S del socket
		String str="";
		//Recibir el flujo de entrada del cliente
		BufferedReader br =new BufferedReader(new InputStreamReader(s.getInputStream()));
		//Recibir el flujo de entrada del tecaldo
		BufferedReader teclado= new BufferedReader(new InputStreamReader(System.in));
		//Enviar el flujo de salida al cliente
		PrintStream ps = new PrintStream(s.getOutputStream());

		//Paso 4: Realizar el procesamiento
		while(!str.equals("bye")){
			ps.println(teclado.readLine());
			ps.flush();
			str=br.readLine();
			System.out.println(str);
		}

		//Paso 5: Cerrar la conexión
		s.close();
		ss.close();
		br.close();
		ps.close();
		teclado.close();
	}
}