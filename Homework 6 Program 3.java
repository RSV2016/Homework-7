public class Human {
	String name;
	 String surname;
	 int age;
	
	
	 public void printinfo(){
		name="Semen";
		System.out.println("Èìÿ:"+name);
		surname="Nazarenko";
		System.out.println("Ôàìèëèÿ:"+surname);
		age=20;
		System.out.println("Êîëè÷åñòâî ëåò:"+age);
	}
	
	public static void main(String[] args) {
		Human human=new Human();
		human.printinfo();

	}

}
