package create.builder;

import java.util.LinkedList;
import java.util.List;

public class Builder implements IBuilder {

	private List<ISender> senders;

	@Override
	public List<ISender> buildSmsSender(int num) {
		senders = new LinkedList<>();
		for (int i = 0; i < num; i++) {
			senders.add(new SmsSender());
		}
		return senders;
	}

	@Override
	public List<ISender> buildEmailSender(int num) {
		senders = new LinkedList<>();
		for (int i = 0; i < num; i++) {
			senders.add(new EmailSender());
		}
		return senders;
	}

}
