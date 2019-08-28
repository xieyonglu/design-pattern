package filterchain.demo01;

public interface Filter {

	void doFilter(MyRequest request, MyResponse response, FilterChain chain);

}
