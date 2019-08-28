package filterchain.demo01;

public class SecondFilter implements Filter {

	@Override
	public void doFilter(MyRequest request, MyResponse response, FilterChain chain) {
		request.append("second filter || ");
		chain.doFilter(request, response);
		response.append("second filter || ");
	}

}
