import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Cliente{
	public static void main(String[] args) throws IOException{
        //Paso 1: crear un Socket para conectar al ServerSocket
        InetAddress addr= InetAddress.getByName(null); //que tome mi local host
		Socket s= new Socket("localhost",9999);
		String str="";
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

		//Paso 2: Obtener los flujos de E/S del Socket
		
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		PrintStream ps=new PrintStream(s.getOutputStream());
		
		//Paso 3: Realizar el procesamiento
		
		while(!str.equals("bye")){
			str=br.readLine();
			System.out.println(str);
			str=teclado.readLine();
			System.out.println(str);
		}
		
		//Paso 4: Cerrar la conexión
		
		s.close();
		br.close();
		ps.close();
		teclado.close();
	}
}
