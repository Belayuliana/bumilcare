package com.bela.pregnancycare.Repository;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class RestClient {
    protected static String address;

    private static final String BASE_URL = RestClientAddress.address;

    public static String [] getWeightGainForUnderWeight(String limit) throws JSONException {
        //initialise
        URL url = null;
        HttpURLConnection conn = null;
        String textResult = "";
        String [] resultArr = new String [40];
        //Making HTTP request
        try {
            url = new URL(BASE_URL);
            //open the connection
            conn = (HttpURLConnection) url.openConnection();
            //set the timeout
            conn.setReadTimeout(10000);
            conn.setConnectTimeout(15000);
            //set the connection method to GET
            conn.setRequestMethod("GET");
            //add http headers to set your response type to json
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Accept", "application/json");
            //Read the response

            Scanner inStream = new Scanner(conn.getInputStream());
            //read the input stream and store it as string
            while (inStream.hasNextLine()) {
                textResult += inStream.nextLine();
            }

            Log.i("error",new Integer(conn.getResponseCode()).toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.disconnect();
        }

        JSONArray arr = new JSONArray(textResult);


        if (limit == "max")
        {
            for(int i = 0;i<=39;i++)
            {
                String maxWeight = arr.getJSONObject(i).getString("max_weight_gain");
                resultArr[i] = maxWeight;
            }
        }
        else
        {
            for(int i = 0;i<=39;i++)
            {
                String minWeight = arr.getJSONObject(i).getString("min_weight_gain");
                resultArr[i] = minWeight;
            }
        }
        return resultArr;
    }

    public static String [] getWeightGainForNorWeight(String limit) throws JSONException {
        //initialise
        URL url = null;
        HttpURLConnection conn = null;
        String textResult = "";
        String [] resultArr = new String [40];
        //Making HTTP request
        try {
            url = new URL(BASE_URL);
            //open the connection
            conn = (HttpURLConnection) url.openConnection();
            //set the timeout
            conn.setReadTimeout(10000);
            conn.setConnectTimeout(15000);
            //set the connection method to GET
            conn.setRequestMethod("GET");
            //add http headers to set your response type to json
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Accept", "application/json");
            //Read the response

            Scanner inStream = new Scanner(conn.getInputStream());
            //read the input stream and store it as string
            while (inStream.hasNextLine()) {
                textResult += inStream.nextLine();
            }

            Log.i("error",new Integer(conn.getResponseCode()).toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.disconnect();
        }

        JSONArray arr = new JSONArray(textResult);


        if (limit == "max")
        {
            for(int i = 40;i<=79;i++)
            {
                String maxWeight = arr.getJSONObject(i).getString("max_weight_gain");
                resultArr[i-40] = maxWeight;
            }
        }
        else
        {
            for(int i = 40;i<=79;i++)
            {
                String minWeight = arr.getJSONObject(i).getString("min_weight_gain");
                resultArr[i-40] = minWeight;
            }
        }
        return resultArr;
    }

    public static String [] getWeightGainForOverWeight(String limit) throws JSONException {
        //initialise
        URL url = null;
        HttpURLConnection conn = null;
        String textResult = "";
        String [] resultArr = new String [40];
        //Making HTTP request
        try {
            url = new URL(BASE_URL);
            //open the connection
            conn = (HttpURLConnection) url.openConnection();
            //set the timeout
            conn.setReadTimeout(10000);
            conn.setConnectTimeout(15000);
            //set the connection method to GET
            conn.setRequestMethod("GET");
            //add http headers to set your response type to json
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Accept", "application/json");
            //Read the response

            Scanner inStream = new Scanner(conn.getInputStream());
            //read the input stream and store it as string
            while (inStream.hasNextLine()) {
                textResult += inStream.nextLine();
            }

            Log.i("error",new Integer(conn.getResponseCode()).toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.disconnect();
        }

        JSONArray arr = new JSONArray(textResult);


        if (limit == "max")
        {
            for(int i = 80;i<=119;i++)
            {
                String maxWeight = arr.getJSONObject(i).getString("max_weight_gain");
                resultArr[i-80] = maxWeight;
            }
        }
        else
        {
            for(int i = 80;i<=119;i++)
            {
                String minWeight = arr.getJSONObject(i).getString("min_weight_gain");
                resultArr[i-80] = minWeight;
            }
        }
        return resultArr;
    }

    public static String [] getWeightGainForObesity(String limit) throws JSONException {
        //initialise
        URL url = null;
        HttpURLConnection conn = null;
        String textResult = "";
        String [] resultArr = new String [40];
        //Making HTTP request
        try {
            url = new URL(BASE_URL);
            //open the connection
            conn = (HttpURLConnection) url.openConnection();
            //set the timeout
            conn.setReadTimeout(10000);
            conn.setConnectTimeout(15000);
            //set the connection method to GET
            conn.setRequestMethod("GET");
            //add http headers to set your response type to json
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Accept", "application/json");
            //Read the response

            Scanner inStream = new Scanner(conn.getInputStream());
            //read the input stream and store it as string
            while (inStream.hasNextLine()) {
                textResult += inStream.nextLine();
            }

            Log.i("error",new Integer(conn.getResponseCode()).toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.disconnect();
        }

        JSONArray arr = new JSONArray(textResult);


        if (limit == "max")
        {
            for(int i = 120;i<=159;i++)
            {
                String maxWeight = arr.getJSONObject(i).getString("max_weight_gain");
                resultArr[i-120] = maxWeight;
            }
        }
        else
        {
            for(int i = 120;i<=159;i++)
            {
                String minWeight = arr.getJSONObject(i).getString("min_weight_gain");
                resultArr[i-120] = minWeight;
            }
        }
        return resultArr;
    }

}
