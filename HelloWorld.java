public class HelloWorld{
	private int id = 0;
	private String name;
	
	HelloWorld(){
		this.id = ++id;
		this.name = "ダミー";
	}
	HelloWorld(String name){
		this.id = ++id;
		this.name = name;
	}
}
