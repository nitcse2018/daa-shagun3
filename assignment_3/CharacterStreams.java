import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreams {
	public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try 
           {
            inputStream = new FileReader("E:/assignment_3/Input-Output/input_file.txt");
            outputStream = new FileWriter("E:/assignment_3/Input-Output/output_CharacterStreams.txt");

            int r;
            while ((r = inputStream.read()) != -1) 
              {
                outputStream.write(r);
              }
           } 
       
        finally 
           {
             if (inputStream != null) 
              {
                inputStream.close();
              }
             if (outputStream != null)
              {
                outputStream.close();
              }
          }
    }
}