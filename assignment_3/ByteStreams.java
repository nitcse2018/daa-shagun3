import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class ByteStreams {
	 public static void main(String[] args) throws IOException {

	        FileInputStream in = null;
	        FileOutputStream out = null;

	        try {
	            in = new FileInputStream("E:/assignment_3/Input-Output/input_file.txt");
	            out = new FileOutputStream("E:/assignment_3/Input-Output/output_ByteStreams.txt");
	            int r;

	            while ((r = in.read()) != -1)
	              {
	                out.write(r);
	              }
	            } 

                finally {
	            if (in != null)
	              {
	                in.close();
	              }
	            if (out != null) 
	              {
	                out.close();
	              }
	        }
	    }
}