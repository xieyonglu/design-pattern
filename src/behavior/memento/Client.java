package behavior.memento;

public class Client {

	public static void main(String[] args) {
		Context context = new Context();
		context.setValue("egg");
		
		Memento memento = new Memento();
		context.setMemento(memento);
		
		System.out.println(context.getValue());
		context.setValue("apple");
		System.out.println(context.getValue());
		context.restore();
		System.out.println(context.getValue());
	}

}
