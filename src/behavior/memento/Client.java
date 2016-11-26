package behavior.memento;

public class Client {

	public static void main(String[] args) {
		Original original = new Original();
		original.setValue("egg");
		
		Storage storage = new Storage(original.create());
		
		System.out.println(original.getValue());
		
		original.setValue("apple");
		System.out.println(original.getValue());
		
		original.restore(storage.getMemento());
		System.out.println(original.getValue());
	}

}
