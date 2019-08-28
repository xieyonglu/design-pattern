package filterchain.demo01;

import java.util.LinkedList;
import java.util.List;

public class FilterChain {
	
	private List<Filter> filters;
	
	int pos = 0;

	public FilterChain() {
		filters = new LinkedList<>();
	}

	public void addFilter(Filter filter) {
		filters.add(filter);
	}

	public void doFilter(MyRequest request, MyResponse response) {
		if (pos < filters.size()) {
			filters.get(pos++).doFilter(request, response, this);
		}
	}

}