import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
public class Webpage {


    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }
    public static void main(String[] args) {

        System.out.println(urlToString("http://erdani.com/tdpl/hamlet.txt"));
        int index = -1;
        int count = 0;
        String source ="http://erdani.com/tdpl/hamlet.txt ";
        for(int i=0; i< source.length();i++)
            {if (" ".equals(source.charAt(i))) {
                count++;
            }
            // END OF IF
            }//END OF FOR
        System.out.println(count);
    }// END OF MAIN
}// END OF CLASS
