import java.io.PrintWriter;

public class RepeatServer extends SingleThreadTCPServer {

    @Override
    public void handleMessage(String message, PrintWriter out) {
        String[] args = message.split("\\s+", 3); // Split en máximo 3 partes

        if (args.length < 2) {
            out.println("ERROR: You must provide at least 2 arguments: <text> <count> [delimiter]");
            return;
        }

        String text = args[0].trim();
        String countStr = args[1].trim();
        String delimiter = (args.length == 3) ? args[2] : " ";

        if (text.isEmpty()) {
            out.println("ERROR: The string to repeat cannot be empty.");
            return;
        }

        int count;
        try {
            count = Integer.parseInt(countStr);
            if (count <= 0) {
                out.println("ERROR: The repetition count must be a positive integer.");
                return;
            }
        } catch (NumberFormatException e) {
            out.println("ERROR: The repetition count must be a valid integer.");
            return;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);
            if (i < count - 1) {
                result.append(delimiter);
            }
        }

        out.println("Repeated string: " + result);
    }

    public static void main(String[] args) {
        RepeatServer server = new RepeatServer();
        server.startLoop(args);
    }
}
