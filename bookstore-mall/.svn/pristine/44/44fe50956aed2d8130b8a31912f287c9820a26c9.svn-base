package com.bs.mall.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class NetVisit {
	public static String getNetInfo(String path){
		StringBuffer reslut = new StringBuffer();
		try {
			URL url = new URL(path);
			HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			int responseCode = connection.getResponseCode();
			if(responseCode==HttpURLConnection.HTTP_OK){
				InputStream is = connection.getInputStream();
				InputStreamReader ir = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(ir);
				String str = null;
				if((str=br.readLine())!=null){
					reslut.append(str);
				}
				br.close();
			}else{
				return new StringBuffer("网络访问失败！").toString();
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return reslut.toString();
	}
}
