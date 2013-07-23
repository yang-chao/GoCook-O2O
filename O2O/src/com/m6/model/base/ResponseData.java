package com.m6.model.base;

import org.json.JSONException;
import org.json.JSONObject;

import android.text.TextUtils;

public class ResponseData {

	private int flag;
	
	private String msg;
	
	private String data;
	

	public ResponseData(String response) {
		resolve(response);
	}
	
	private void resolve(String response) {
		if (TextUtils.isEmpty(response)) {
			return;
		}
		
		try {
			JSONObject responseJson = new JSONObject(response);
			flag = responseJson.optInt("flag");
			msg = responseJson.optString("msg");
			data = responseJson.optString("data");
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
	
	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
}