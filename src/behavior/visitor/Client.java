package behavior.visitor;

public class Client {

	public static void main(String[] args) {
		IVisitor visitor = new Visitor();
		ISubject subject = new Subject();
		
		subject.accept(visitor);
	}

}
