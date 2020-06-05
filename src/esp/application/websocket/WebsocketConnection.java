package esp.application.websocket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class WebsocketConnection extends Observable implements Runnable
{
	int port;
	
	public WebsocketConnection(int port)
	{
		this.port = port;
	}

	@Override
	public void run()
	{
		try 
		{
			runServerSocket();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("deprecation")
	private void runServerSocket() throws IOException
	{
		ServerSocket listener = new ServerSocket(9090);
		
		try 
		{
			while(true)
			{
				Socket socket = listener.accept();
				socket.setKeepAlive(true);
				try 
				{
					BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					System.out.println("Response: " + in.readLine());
					
					this.notifyObservers(in.readLine());
					
					BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
					out.write("255");
					out.flush();
				}
				finally 
				{
					socket.close();
				}
			}
		}
		finally 
		{
			listener.close();
		}
		
	}
}
