package create.prototype;

public class Prototype implements Cloneable {

	@Override
	public Object clone() throws CloneNotSupportedException {
		return Prototype.super.clone();
	}
	
}
