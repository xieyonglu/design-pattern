package filterchain.demo01;

public class MyResponse {

	private StringBuffer content;

	public MyResponse() {
		content = new StringBuffer("response");
	}

	public MyResponse(String content) {
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
