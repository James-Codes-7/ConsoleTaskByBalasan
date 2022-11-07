package hitapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class ReadJSONGetFromApi {
    public static void main(String[] args) {
        ReadJSONGetFromApi displayTheApiResponseInSwing = new ReadJSONGetFromApi();
        displayTheApiResponseInSwing.programPage();
    }
    private void programPage() {
        try {
            URL url = new URL("https://reqres.in/api/users?page=2%22);");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            int size = 0, i = 0;
            ObjectMapper objectMapper = new ObjectMapper();
            JSONObject jsonObject = new JSONObject(new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream())).readLine());
            JSONArray jsonArray = (JSONArray) jsonObject.get("data");
            size = jsonArray.length();
            ArrayList<Customer> arrayList = new ArrayList<>();
            for (i = 0; i < size; i++) {
                JSONObject jsObject = jsonArray.getJSONObject(i);
                Customer customer = objectMapper.readValue(jsObject.toString(), Customer.class);
                arrayList.add(customer);
                customer.display();
                System.out.println();
            }
            new ShowAPIResponseInSwing().swingView(arrayList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
