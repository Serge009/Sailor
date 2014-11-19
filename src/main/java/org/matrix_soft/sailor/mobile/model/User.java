package org.matrix_soft.sailor.mobile.model;

import com.google.gson.annotations.SerializedName;

import java.lang.*;

public class User {
	@SerializedName("error")    private java.lang.Error error;
	@SerializedName("data")     private DataFetch data;
	
	public User() {
		//constructor
	}
	
	public java.lang.Error getError() {
		return error;
	}

	public void setError(java.lang.Error error) {
		this.error = error;
	}

	public DataFetch getData() {
		return data;
	}

	public void setData(DataFetch data) {
		this.data = data;
	}

	public String toString () {
		String str;
		str = ""+ error + data;
		return str;
	}

//	public String toJson() {
//		Gson gson = new Gson();
//		String json = gson.toJson(this);
//		return json;
//	}
}
