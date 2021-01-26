package net.badbird5907.redstonecalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class UpdateChecker {
    public static String updateCheck(){
        try {
            String githubversion = getText("https://raw.githubusercontent.com/Badbird-5907/RedstoneCalculator/master/version.txt");
            System.out.println("Github version: " + githubversion);
            return githubversion;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static String changeLog(){
        try {
            String changelog = getText("https://raw.githubusercontent.com/Badbird-5907/RedstoneCalculator/master/changelog.txt").split("-").toString();
            System.out.println("Changelog: " + changelog);
            return changelog;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
    private static String getText(String url) throws IOException {
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        //add headers to the connection, or check the status if desired..

        // handle error response code it occurs
        int responseCode = connection.getResponseCode();
        InputStream inputStream;
        if (200 <= responseCode && responseCode <= 299) {
            inputStream = connection.getInputStream();
        } else {
            inputStream = connection.getErrorStream();
        }

        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        inputStream));

        StringBuilder response = new StringBuilder();
        String currentLine;

        while ((currentLine = in.readLine()) != null)
            response.append(currentLine);
        in.close();
        return response.toString();
    }
}
