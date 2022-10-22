package com.journaldev.maven.classes;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World tommy!" );
        ObjectMapper objectMapper = new ObjectMapper();
        String s = "";
        try {

			URL url = new URL("https://api.coindesk.com/v1/bpi/currentprice.json");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				s+=output;
				System.out.println(output);
			}

			conn.disconnect();

		} catch (MalformedURLException e) {

			e.printStackTrace();

		  } catch (IOException e) {

			e.printStackTrace();

		  }
        //s="{\"time\":{\"updated\":\"Oct 22, 2022 04:42:00 UTC\",\"updatedISO\":\"2022-10-22T04:42:00+00:00\",\"updateduk\":\"Oct 22, 2022 at 05:42 BST\"},\"disclaimer\":\"This data was produced from the CoinDesk Bitcoin Price Index (USD). Non-USD currency data converted using hourly conversion rate from openexchangerates.org\",\"chartName\":\"Bitcoin\",\"bpi\":{\"usd\":{\"code\":\"USD\",\"symbol\":\"&#36;\",\"rate\":\"19,157.1697\",\"description\":\"United States Dollar\",\"rate_float\":19157.1697},\"gbp\":{\"code\":\"GBP\",\"symbol\":\"&pound;\",\"rate\":\"16,007.5778\",\"description\":\"British Pound Sterling\",\"rate_float\":16007.5778},\"eur\":{\"code\":\"EUR\",\"symbol\":\"&euro;\",\"rate\":\"18,661.8803\",\"description\":\"Euro\",\"rate_float\":18661.8803}}}";
        System.out.println(s);
        Codebeautify employee = objectMapper.readValue(s, new TypeReference<Codebeautify>(){});

        // Print information
        System.out.println(employee.getTime().getUpdated());
    }
}
