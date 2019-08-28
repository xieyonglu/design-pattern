package filterchain.demo01;

public class MyRequest {

	StringBuffer content;

	public MyRequest() {
		content = new StringBuffer("request");
	}

	public MyRequest(String content) {
		this.content = new StringBuffer(content);
	}

	public StringBuffer getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = new StringBuffer(content);
	}

	public void append(String append) {
		this.content.append(append);
	}

}
