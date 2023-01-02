package com.example.j_retrofit_demo;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponsePost{

	@SerializedName("ResponsePost")
	private List<ResponsePostItem> responsePost;

	public void setResponsePost(List<ResponsePostItem> responsePost){
		this.responsePost = responsePost;
	}

	public List<ResponsePostItem> getResponsePost(){
		return responsePost;
	}

	@Override
 	public String toString(){
		return 
			"ResponsePost{" + 
			"responsePost = '" + responsePost + '\'' + 
			"}";
		}
}