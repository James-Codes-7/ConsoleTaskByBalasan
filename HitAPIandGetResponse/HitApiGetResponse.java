package hitapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HitApiGetResponse {

    public static void main(String[] args) {

        HitApiGetResponse hitApiGetResponse = new HitApiGetResponse();
        hitApiGetResponse.httpURLConnection();

    }
    private void httpURLConnection() {
        try {
            URL urlObject = new URL("https://reqres.in/api/users?page=2%22);");
            HttpURLConnection httpURLConnection = (HttpURLConnection) urlObject.openConnection();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            System.out.println(bufferedReader.readLine() + "\n");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
