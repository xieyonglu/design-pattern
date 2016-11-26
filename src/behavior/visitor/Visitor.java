package behavior.visitor;

public class Visitor implements IVisitor {

	@Override
	public void visit(ISubject subject) {
		System.out.println("==Visitor visit==");
		subject.operate();
	}

}
