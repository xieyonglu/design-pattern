package create.builder;

import java.util.List;

public interface IBuilder {

	public List<ISender> buildSmsSender(int num);
	
	public List<ISender> buildEmailSender(int num);
	
}
