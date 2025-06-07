
import java.io.PrintWriter;

public class PasswordServer extends SingleThreadTCPServer {
   
    public void handleMessage(String message, PrintWriter out) {
        out.println(message);
    }

    public static void main(String[] args) {

        new PasswordServer().startLoop(args);

    }

}