package filterchain.demo01;


public class Main {

	public static void main(String[] args) {
		MyRequest request = new MyRequest();
		MyResponse response = new MyResponse();
		
		FilterChain fc = new FilterChain();
		fc.addFilter(new FirstFilter());
		fc.addFilter(new SecondFilter());
		
		fc.doFilter(request, response);
		
		System.out.println(request.getContent());
		System.out.println(response.getContent());
	}

}
