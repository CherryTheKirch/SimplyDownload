import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadMenager {

    private String url;
    private String fileName;

    DownloadMenager(){
        // Default file name
        fileName = "myFile";
    }

    void download(){

        try{
            BufferedInputStream input = new BufferedInputStream(new URL(this.url).openStream());
        }
        try{
            
        }
    }


    // Set and get
    void setUrl(String Url){
        this.Url = Url;
    }

    String getUrl(){
        return Url;
    }
}
