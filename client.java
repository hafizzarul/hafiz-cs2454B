import java.io.*;
import java.net.*;

class client
{
	public static void main(String[]args)
	{
		try
		{
			Socket s = new Socket("192.168.209.130",1201);
			DataInputStream din = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String msgin = "", msgout = "";

			while(!msgin.equals("end"))
			{
				msgout = br.readLine();
				dout.writeUTF(msgout);
				msgin = din.readUTF();
				System.out.println(msgin);
			}
		}
		catch(Exception e)
		{
		}
	}
}
