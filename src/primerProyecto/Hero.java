package primerProyecto;

public class Hero extends Person {
	String power; 
	public Hero(String name, int age, String power) {
		// TODO Auto-generated constructor stub
		/*this.name = name;
		this.age = age;*/
		super(name, age);
		this.power = power;
	}
	
	public String toString(){
		return super.toString()+this.power;
	}
}
