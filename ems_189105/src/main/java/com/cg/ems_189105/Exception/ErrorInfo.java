package com.cg.ems_189105.Exception;

public class ErrorInfo {
	// Error Info class
	private String url;
	private String message;

	public ErrorInfo(String url, String message) {
		super();
		this.url = url;
		this.message = message;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ErrorInfo [url=" + url + ", message=" + message + "]";
	}
}
