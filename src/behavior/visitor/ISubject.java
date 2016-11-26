package behavior.visitor;

public interface ISubject {

	public void accept(IVisitor visitor);
	
	public void operate();
	
}
