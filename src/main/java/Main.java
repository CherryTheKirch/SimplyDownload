import java.util.Scanner;

public class Main {
    public static void main(String []args){
        String url;
        System.out.print("Type file url: ");
        Scanner in = new Scanner(System.in);
        url = in.nextLine();
        System.out.println(url);
        System.out.println();

        DownloadMenager dm = new DownloadMenager(url);
        dm.download();
    }
}
