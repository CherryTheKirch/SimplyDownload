import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

public class DownloadMenager {

    private URL url;
    private String fileName;


    DownloadMenager(String url){
        try{
            this.url = new URL(url);
            fileName = "MyFile.txt";
        } catch(MalformedURLException e){
            this.url = null;
            e.printStackTrace();
        }
    }


    void download(){
        try{
            BufferedReader input = new BufferedReader(new InputStreamReader(this.url.openStream()));
            FileWriter fw= new FileWriter(this.fileName);
            BufferedWriter output = new BufferedWriter(fw);
            String inputLine;

            while((inputLine = input.readLine()) != null){
                output.write(inputLine + "\n");
            }

        } catch(IOException e){
            e.printStackTrace();
        }

    }
}
