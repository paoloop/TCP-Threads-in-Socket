import java.io.*;
import java.net.*;
  
private static class Main implements Runnable {
        private final Socket client;
  
   
        public Main(Socket socket)
        {

            this.client = socket;
        }
  
		
        public void run()
        {
		
            PrintWriter output = null;
            BufferedReader input = null;
            try {
                    
              input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                output = new PrintWriter(clientSocket.getOutputStream(), true);
                
  
				//Messaggo
                String messaggio;
                while ((messaggio = in.readLine()) != null) {
                    System.out.printf(" messaggio dal client: %s\n", messaggio);
                    out.println(messaggio);
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }

              // chiusura
            finally {
                try {
                    if (output != null) {
                        output.close();
                    }
                    if (input != null) {
                        input.close();
                        client.close();
                    }
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
