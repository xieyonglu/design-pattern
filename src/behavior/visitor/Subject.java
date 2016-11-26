package behavior.visitor;

public class Subject implements ISubject {

	@Override
	public void accept(IVisitor visitor) {
		System.out.println("==Subject accept==");
		visitor.visit(this);
	}

	@Override
	public void operate() {
		System.out.println("==Subject operate==");
	}

}
