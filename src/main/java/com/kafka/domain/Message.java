package com.kafka.domain;

public class Message {
	
	private String url;
	private String source;
	private String transcriptURL;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getTranscriptURL() {
		return transcriptURL;
	}
	public void setTranscriptURL(String transcriptURL) {
		this.transcriptURL = transcriptURL;
	}
	
}
