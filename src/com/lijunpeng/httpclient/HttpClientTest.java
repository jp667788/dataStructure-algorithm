package com.lijunpeng.httpclient;
/**
 * 2018年8月13日
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class HttpClientTest {
	
	private static HttpClient httpClient;
	
	private static HttpClient getHttpClient() {
		if (httpClient == null) {
			ConnectionConfig config = ConnectionConfig.DEFAULT;
			
			RequestConfig requestConfig = RequestConfig.custom()
											.setConnectTimeout(3000)
											.setSocketTimeout(2000)
											.setConnectionRequestTimeout(1000)
											.build();
			return HttpClients.custom()
								.setMaxConnPerRoute(64)
								.setMaxConnTotal(512)
								.setDefaultRequestConfig(requestConfig)
								.setDefaultConnectionConfig(config)
								.build();
		}
		return httpClient;
	}
	
	
	public static void httpClientTest(String url,List<NameValuePair> params) {
		httpClient = getHttpClient();
		HttpPost httpPost = new HttpPost(url);
		InputStream in = null;
		try {
			httpPost.setEntity(new UrlEncodedFormEntity(params,"UTF-8"));
			HttpResponse response = httpClient.execute(httpPost);
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				in = entity.getContent();
				System.out.println(EntityUtils.toString(entity));
			}
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		String url = "http://mc.zhiziyun.com/api-service/api/mediaSegment/getAllMediaSegmentId";
		String token = "0Vvo8vEYZZkJB772wClTSQ==";
		List<NameValuePair> params = new ArrayList<>();
		params.add(new BasicNameValuePair("agentid", "1"));
		params.add(new BasicNameValuePair("token", token));
		httpClientTest(url, params);
	}
	
}
