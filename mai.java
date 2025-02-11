import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws InterruptedException {
        List<String> inputByLine = new ArrayList<String>();
        try {
            // Get the object of DataInputStream
            InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String line = "";
            while ((line = br.readLine()) != null) {
                inputByLine.add(line.toString());
            }
            for (String line2 : inputByLine) {
                // Convert binary string to decimal
                int decimal = Integer.parseInt(line2, 2);
                System.out.println(decimal);
            }
            isr.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}