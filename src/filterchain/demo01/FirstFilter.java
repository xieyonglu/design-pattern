package filterchain.demo01;

public class FirstFilter implements Filter {

	@Override
	public void doFilter(MyRequest request, MyResponse response, FilterChain chain) {
		request.append(" firsrt Filter || ");
		chain.doFilter(request, response);
		response.append(" firsrt Filter || ");
	}

}
