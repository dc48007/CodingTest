package Practise;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONAware;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class TestRestApiProgram {



    public static HttpGet doGet(String uri) throws URISyntaxException {
        return new HttpGet(new URI(uri));
    }

    public static  <T extends JSONAware> T getJSONFromHttpResponse(HttpResponse httpResponse) throws IOException, ParseException {
        if(httpResponse.getStatusLine().getStatusCode()==200) {
            String responseString = EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
            return (T) (new JSONParser()).parse(responseString);
        }
        throw new RuntimeException("Didn't get expected Response: "+ httpResponse.getStatusLine().getStatusCode());
    }


    public static HttpPost doPost(String uri) throws URISyntaxException {
        return new HttpPost(new URI(uri));
    }


    public void hitPostRequest() throws URISyntaxException, IOException {
        String postUri = "https://example.com/api/endpoint";
        String jsonBody= "{\"key1\":\"value1\",\"key2\":\"value2\"}";
        HttpPost httpPost = doPost(postUri);
        httpPost.setHeader("Content-Type", "application/json");
        StringEntity stringEntity = new StringEntity(jsonBody,  ContentType.APPLICATION_JSON);
        httpPost.setEntity(stringEntity);
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpResponse httpResponse = httpClient.execute(httpPost);
    }


    public static void main(String[] args) throws URISyntaxException, IOException, ParseException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = doGet("https://reqres.in/api/users?page=2");
        HttpResponse response = httpClient.execute(httpGet);
        JSONObject responseObject = getJSONFromHttpResponse(response);
        System.out.println("Response: " + responseObject);
        JSONArray dataNodeArray = (JSONArray) responseObject.get("data");
        System.out.println("Length of Data node : " + dataNodeArray.size());
        List<String> emailList = new ArrayList<>();
        for (Object obj : dataNodeArray) {
            if(obj instanceof JSONObject){
               emailList.add(((JSONObject) obj).get("email").toString());
            }
        }
        System.out.println("Email List :" + emailList);
    }



}
