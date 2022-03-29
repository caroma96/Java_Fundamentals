package primerProyecto;

import java.util.Scanner;
import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.Random;

public class PrimeraClase {
	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		int a = 5;
		int b = 6;

		int c = a + b;
		System.out.println(c);

		// Escape sequence \n : new line, \t : tab , \"
		System.out.print("\t This is a tab in a \"new line\" \n");
		System.out.print("Hey new \\ line");
		/*
		 * Multiline comment this is a comment
		 * 
		 */

		// shortcut -> sysout ctrl+space, even sout ctrl+space works as well
		System.out.println();

		// In windows -> preferences: you can change the theme in "general"
		// You can change the font color in run/debug -> console
		// crtl+f -> to change some text in the program for another one
		// shortcut zoom in and out + or - in the main keyboard

		/*
		 * Primitive vs references 8 types | unlimited store data | stores an
		 * address can only hold one value | could hold more than one value less
		 * memory | more memory fast | slower
		 * 
		 */

		/*
		 * Next, there are several methods that explain basics about Java
		 * 
		 */

		// variables();
		// swap();
		// imprimir();
		// expresiones();
		// guiIntro();
		// mathClass();
		/*
		 * PrimeraClase laPrimera = new PrimeraClase();
		 * laPrimera.randomNumbers();
		 */
		// ifStatement();
		// switches();
		// logicalOperators();
		// whileLoop();
		// forLoop();
		// nestedFor();
		// arrays();
		// arrayMulti();
		// stringMethods();
		// wrapperClasses();
		// arrayList();
		// arrayList2D();
		// forEachLoop();
		// methods();
		//overloadedMethods();
		//printfMethod();
		//finalKeword();
		/// POO
		//poo();
		//constructores();
		//variableScope();
		//overloadedConstructors();
		//toStringMethod();
		//arrayOfObjects();
		//objectPassing();
		//staticKeyword();
		//inHeritance();
		//methodOverriding();
		superKeyword();
		
		

	}

	public static void variables() {
		// Variables
		int x; // declaration
		x = 123; // assignment
		int xx = 123; // initialization

		/**
		 * Long for extremely large numbers with L at the end of the number byte
		 * for numbers between -128 and 127 As a recommendation it's better not
		 * to use Long or byte, else int if you are a beginner float has 4 bytes
		 * in the memory, with f at the end of the number double has 8 memory
		 * spaces and don't need anything at the end of the number
		 * 
		 */
		float f = 4.52f;
		double d = 4.25;
		boolean t = true;
		char ch = '@';
		System.out.println("This is my number " + xx + " and this is my other number: " + x);
		System.out.println(f);
		System.out.println(d);
		System.out.println(t);
		System.out.println(ch);
		String name = "Carlos";
		System.out.println("This is my name: " + name);
	}

	public static void swap() {
		String x = "Hello";
		String y = "World";
		String temp;
		temp = x;
		x = y;
		y = temp;
		System.out.println(x);
		System.out.println(y);
	}

	public static void imprimir() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What's youre name? ");
		String name = scanner.nextLine();
		System.out.println("HOw old are you? ");
		int age = scanner.nextInt();
		// nextInt only read the number in the command line, so the \n from the
		// enter key left the command line dirty
		// It's necessary to clear the command line with the next commando:
		scanner.nextLine();
		System.out.println("What's your favorite food?");
		String food = scanner.nextLine();
		System.out.println("Hello " + name);
		System.out.println("You are " + age + " years old");
		System.out.println("You like " + food);
		scanner.close();
	}

	public static void expresiones() {
		// Expressions = operands & operators
		// operators = +,-,*,/, %
		// operands = values, variables, numbers, quantity

		int friends = 10;
		// double friends = 10;
		// friends = friends + 1;
		// friends = friends * 2;
		// friends = friends / 2;
		// friends = friends % 2;
		// friends = (double) friends / 3; // casting of a variable
		// friends++;
		friends--;

		System.out.println(friends);

	}

	public static void guiIntro() {
		String name = JOptionPane.showInputDialog("Enter your name, please");
		JOptionPane.showMessageDialog(null, "Hello " + name);
		int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
		JOptionPane.showMessageDialog(null, "You are " + age + " years old");
		double height = Double.parseDouble(JOptionPane.showInputDialog("What's your height?"));
		JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");

	}

	public static void mathClass() {

		/* Basic methods */
		// double x = 3.14;
		// double y = -10;
		// double z = Math.max(x, y);
		// double z = Math.min(x, y);
		// double z = Math.abs(y);
		// double z = Math.sqrt(x);
		// double z = Math.round(x);
		// double z = Math.ceil(x);
		// double z = Math.floor(x);
		// system.out.println(z);

		/* Hypotenuse */
		double x;
		double y;
		double z;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		System.out.println("Enter side y: ");
		y = scanner.nextDouble();
		z = Math.sqrt((x * x) + (y * y));
		System.out.println("The hypotunuse is : " + z);
		scanner.close();

	}

	public void randomNumbers() {
		// System.out.println("Hello, how are you? ... you look the same , ");
		Random random = new Random();
		// int x = random.nextInt(6) + 1; // from 0 to (6-1), to solve this
		// issue we can add +1
		// double y = random.nextDouble(); // from 0 to 1
		boolean z = random.nextBoolean();
		// System.out.println(x);
		// System.out.println(y);
		System.out.println(z);
	}

	public static void ifStatement() {
		// if statement = performs a block of code if its condition evaluates to
		// be true
		// When a condition is true, the algorithm enters to the block of code,
		// and the rest of the code is ignored
		int age = 19;
		// if (age == 75) {
		if (age >= 75) {
			System.out.println("Ok Boomer!");
		} else if (age >= 18) {
			System.out.println("You're an adult!");
		} else if (age >= 13) {
			System.out.println("You are an teenager!");
		} else {
			System.out.println("You are not an adult!");
		}

	}

	public static void switches() {
		// switch : statement that allows a variable to be tested for equality
		// against a list of values
		String day = "Mon";

		switch (day) {
		case "Sunday":
			System.out.println("It is Sunday");
			break;
		case "Monday":
			System.out.println("It is Monday");
			break;
		case "Tuesday":
			System.out.println("It is Tuesday");
			break;
		case "Wednesday":
			System.out.println("It is Wednesday");
			break;
		case "Thursay":
			System.out.println("It is Thursay");
			break;
		case "Friday":
			System.out.println("It is Friday");
			break;
		case "Saturday":
			System.out.println("It is Saturday");
			break;
		default:
			System.out.println("That is not a day!");
			break;
		}

	}

	public static void logicalOperators() {
		/*
		 * Logical Operators : used to connect two or more expressions && =
		 * (AND) both conditions must be true || = (OR) one of the condition
		 * must be true ! = (NOT) reverse boolean value of condition
		 */

		// AND
		// int temp = 25;
		// if (temp >30){
		// System.out.println("It is hot outside");
		// }
		// else if (temp >= 20 && temp <= 30) System.out.println("It is warm
		// outside");
		// else {
		// System.out.println("It is cold outside");
		// }

		// OR
		Scanner scanner = new Scanner(System.in);
		System.out.println("You are playing a game! Press q or Q to quit");
		String response = scanner.next();

		if (response.equals("q") || response.equals("Q"))
			System.out.println("You quit the game");
		else
			System.out.println("You are still playing the game \" pew pew \" ");

		// NOT
		if (!response.equals("q") && !response.equals("Q"))
			System.out.println("You are still playing the game \" pew pew \" ");
		else
			System.out.println("You quit the game");

		scanner.close();
	}

	public static void whileLoop() {

		// while loop : executes a block of code as long as a its condition
		// remains true
		Scanner scaner = new Scanner(System.in);
		// System.out.println("Enter your number to count");
		// int numero = scaner.nextInt();
		// System.out.println();
		// int counter = 0;
		// while (counter <= numero){
		// System.out.println("The number is : " + counter);
		// counter += 1;
		// }
		// System.out.println("OK, we've already finished to count");

		String name = "";
		while (name.isEmpty()) {
			System.out.println("Enter your name: ");
			name = scaner.nextLine();

		}
		// do {
		// System.out.print("Enter your name: ");
		// name = scaner.nextLine();
		// }while (name.isEmpty());
		System.out.println("Hello " + name);

		scaner.close();
	}

	public static void forLoop() {
		// for loop = executes a block of code a limited amount of times
		// for (int i = 0; i<=10; i++){
		// System.out.println(i);
		// }
		// for (int i = 10; i >=0 ; i--) {
		// System.out.println(i);
		// }
		for (int i = 10; i >= 0; i -= 2) {
			System.out.println(i);
		}
		System.out.println("Happy new year!!");
	}

	public static void nestedFor() {
		// nested loops = a loop inside of a loop
		Scanner scan = new Scanner(System.in);
		int rows;
		int col;
		String symbol = "";
		System.out.println("Enter # of rows : ");
		rows = scan.nextInt();
		System.out.println("Enter # of cols : ");
		col = scan.nextInt();
		System.out.println("Enter symbol to use: ");
		symbol = scan.next();

		for (int i = 1; i <= rows; i++) {
			System.out.println();
			for (int j = 1; j <= col; j++) {
				System.out.print(symbol);
			}

		}

		scan.close();
	}

	public static void arrays() {
		// array : used to store multiple values in a single variable
		String[] cars = { "Camaro", "corvette", "tesla" };
		cars[0] = "Mustang";
		System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		// If you try to get a index that doesn't exit --> error
		// The value you add to a array must be consistent with the datatype the
		// array

		// Other way to create a array
		String[] cars1 = new String[3];

		cars1[0] = "Camaro";
		cars1[1] = "Corvette";
		cars1[2] = "Tesla";

		for (int i = 0; i < cars1.length; i++) {
			System.out.println(cars[i]);
		}
	}

	public static void arrayMulti() {
		// 2D array = an array of arrays
		// rows * columns
		String[][] cars = new String[3][3];
		cars[0][0] = "Camaro";
		cars[0][1] = "Corvette";
		cars[0][2] = "Silverado";
		cars[1][0] = "Mustang";
		cars[1][1] = "Ranger";
		cars[1][2] = "F-150";
		cars[2][0] = "Ferrari";
		cars[2][1] = "Lambo";
		cars[2][2] = "Tesla";

		for (int i = 0; i < cars.length; i++) { // throught the rows
			System.out.println();
			for (int j = 0; j < cars[i].length; j++) { // throught the cols
				System.out.print(cars[i][j] + " ");
			}
		}

		String[][] cars1 = { { "Camaro", "Corvette", "Silverado" }, { "Mustang", "Ranger", "F-150" },
				{ "Ferrari", "Lambo", "Tesla" } };

		for (int i = 0; i < cars1.length; i++) { // throught the rows
			System.out.println();
			for (int j = 0; j < cars1[i].length; j++) { // throught the cols
				System.out.print(cars1[i][j] + " ");
			}
		}
	}

	public static void stringMethods() {
		// String = a reference data type that can store one or more characters
		// reference data types have access to useful methods
		// String name = "Carlos";
		String name = "    Carlos    "; // to trim method
		// boolean result = name.equals("carlos"); // false
		// boolean result = name.equalsIgnoreCase("carlos"); // true
		// int result = name.length(); // 6
		// char result = name.charAt(0); // index -> C
		// int result = name.indexOf("o"); // 4
		// boolean result = name.isEmpty(); // false because my name is not
		// empty
		// String result = name.toUpperCase(); // All of the characters become
		// in capital letters
		// String result = name.toLowerCase(); // All of the characters become
		// in lower letters
		// String result = name.trim(); // delete the blank spaces at first and
		// end
		String result = name.replace("o", "0"); // exchange the first character
												// for the second character
		result = result.replace("a", "4");
		System.out.println(result);
	}

	public static void wrapperClasses() {
		// wrapper class : provides a way to use primitive data types as
		// reference data types
		// reference data types contain useful methods
		// can be used with collections (ex. Arrraylist)

		// primitive | wrapper
		// ----------------------
		// boolean | Boolean
		// char | char
		// int | Integer
		// double | Double

		// autoboxing : the automatic conversion that the java compiler makes
		// between the primitve data types and their corresponding object
		// wrapper classes
		// unboxing : the reverse of autoboxing. Autimatic conversion of wrapper
		// class to primitive

		// Next, automatically primitive values are assigned to reference,
		// autoboxing
		Boolean a = true;
		Character b = '@';
		Integer c = 123;
		Double d = 3.14;
		String e = "Carlos";
		// An example of unboxing
		if (a == true) {
			System.out.println("This is true");
		}

	}

	public static void arrayList() {
		// ArrayList = a resizable array.
		// Elements can be added and removed after compilation phase
		// store reference data type

		// ArraList<Integer>
		ArrayList<String> food = new ArrayList<String>();
		food.add("pizza");
		food.add("hamburger");
		food.add("hotdog");

		// methods
		food.set(0, "sushi");
		food.remove(2);
		food.clear();

		for (int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i)); // get
		}

	}

	public static void arrayList2D() {
		// 2D ArrayList = a dynamic list of list
		// You can change the size of this list during runtime

		// the next line was added at the end
		ArrayList<ArrayList<String>> groceryList = new ArrayList();

		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");

		System.out.println(bakeryList);
		ArrayList<String> productList = new ArrayList();
		productList.add("tomatoes");
		productList.add("zucchini");
		productList.add("peppers");

		ArrayList<String> drinktList = new ArrayList();
		drinktList.add("soda");
		drinktList.add("coffee");
		System.out.println(productList);
		System.out.println(drinktList);

		groceryList.add(bakeryList);
		groceryList.add(productList);
		groceryList.add(drinktList);
		System.out.println(groceryList);
		System.out.println(groceryList.get(2).get(1));
	}

	public static void forEachLoop() {
		// for-each = traversing to iterate through the elements in an
		// array/collection
		// less steps, more readable
		// less flexible
		// String[] animals = {"cat", "dog", "rat","bird"};

		// With ArrayList
		ArrayList<String> animals = new ArrayList<String>();

		animals.add("car");
		animals.add("dog");
		animals.add("rat");
		animals.add("bird");

		for (String i : animals) {
			System.out.println(i);
		}
	}

	public static void methods() {
		// method= a block of code that is executed whenever it is called upon
		String name = "Carlos";
		int age = 25;
		hello(name, age);// one attribute

		// another example
		int x = 3;
		int y = 4;
		// int z = add(x,y);
		// System.out.println(z);
		System.out.println(add(x, y));
	}

	static void hello(String name, int age) {
		//
		System.out.println("Hello " + name + ", you are " + age);

	}

	static int add(int x, int y) {
		// int z = x + y;
		return x + y;
	}

	public static void overloadedMethods() {
		// overloaded methods = methods that share the same name but have
		// different parameters
		// method name + parameters = method signature

		int x = addO(1, 2, 3, 4);
		System.out.println(x);
		double y = addO(1.0, 2.0,3.0,4.0);
		System.out.println(y);
	}

	static int addO(int a, int b) {
		System.out.println("This is ovberloaded method #1");
		return a + b;
	}

	static int addO(int a, int b, int c) {
		System.out.println("This is ovberloaded method #2");
		return a + b + c;
	}

	static int addO(int a, int b, int c, int d) {
		System.out.println("This is ovberloaded method #3");
		return a + b + c + d;
	}

	static double addO(double a, double b) {
		System.out.println("This is ovberloaded method #4");
		return a + b;
	}

	static double addO(double a, double b, double c) {
		System.out.println("This is ovberloaded method #5");
		return a + b + c;
	}

	static double addO(double a, double b, double c, double d) {
		System.out.println("This is ovberloaded method #6");
		return a + b + c + d;
	}
	
	public static void printfMethod(){
		// printf() = an optional method to control, format, and display text to the console window
		//			  two arguments = format string + (object/variable/value) 
		//			  % [flags] [precision] [width] [conversion-character]
		
		//System.out.printf("%d This is a format str%dng with this %d number", 123,1,12);
		
		
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Carlos";
		int myInt = 50;
		double myDouble = 1000;
		
		// conversion-character
		System.out.printf("%b", myBoolean);System.out.println();
		System.out.printf("%c", myChar);System.out.println();
		System.out.printf("%s", myString);System.out.println();
		System.out.printf("%d", myInt);System.out.println();
		System.out.printf("%f", myDouble);System.out.println();
		
		// width
		// minimum number of characters to be written as output
		System.out.printf("Hello %10s", myString);System.out.println();
		
		// precision
		// sets number of digits of precision when outputting floating-point values
		System.out.printf("You have this much money %.2f",myDouble); // default -> 6 digits of precision
		System.out.println();
		// flags
		// adds an effect to output based on the flag added to format specifier
		// - : left-justify
		// + : output a plus ( + ) or minus ( - ) sign for a numeric value 
		// 0 :  numeric values are zero-padded
		// , : comma grouping separator if numbers > 1000 
		System.out.printf("You have this much money %20f",myDouble);System.out.println();
		System.out.printf("You have this much money %-20f",myDouble);System.out.println();
		System.out.printf("You have this much money %+f",myDouble);System.out.println();
		System.out.printf("You have this much money %020f",myDouble);System.out.println();
		System.out.printf("You have this much money %,f",myDouble);
		
	}
	
	
	public static void  finalKeword(){
		// With final we can not change any variable that is p
		final double PI = 3.1215;
		
		//pi = 4;
		System.out.println(PI);
	}
	
	public static void poo(){
		// Object = an instance of a class that may contain attributes and methods 
		// example : (phone, desk, computer, coffee cup )
		
		// an object may can be a coffee (or a cup of coffee) with color, empty, temperature as attributes
		// and methods like drink() or spill() with messages like "you drink the coffee" and "you spill the coffee"
		
		
		Car myCar1 = new Car();
		Car myCar2 = new Car();
		System.out.println(myCar1.make);
		System.out.println(myCar1.model);
		System.out.println(myCar2.make);
		System.out.println(myCar2.model);
		myCar1.drive();
		myCar1.brake();
		
		
	}
	
	public static void constructores(){
		// constructor = special method that is called when an object is instantiated (created)
		Human human1 = new Human("Rick", 65, 70);
		Human human2 = new Human("Morty", 16, 50);
		System.out.println(human1.name);
		System.out.println(human2.name);
		
		human1.eat();
		human2.drink();
	}
	
	public static void variableScope(){
		// local = 	declared inside a method
		//		   	visible only to that method
		
		// global = declared outside a method, but within a class 
		//			visible to all parts of a class
		
		DiceRoller diceRoller = new DiceRoller();
	}
	
	public static void overloadedConstructors(){
		// overloaded constructors =	multiple constructors within a class with the same name, 
		//								but have different parameters
		//								name + parameters = signature
		
		//Pizza pizza = new Pizza("thicc crust", "tomato", "mozzarrella", "pepperoni");
		//Pizza pizza = new Pizza("thicc crust", "tomato", "mozzarrella");
		//Pizza pizza = new Pizza("thicc crust", "tomato");
		//Pizza pizza = new Pizza("thicc crust");
		Pizza pizza = new Pizza();
		System.out.println("Here are the ingredients of your pizza: ");
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);
		
	}
	
	public static void toStringMethod(){
		// toString() = special method that all objects inherit,
		//				that returns a string that "textually represents" an object.
		//				can be used both implicitly and explicitly 
		//
		
		Car1 car = new Car1();
//		System.out.println(car.make);
//		System.out.println(car.model);
//		System.out.println(car.color);
//		System.out.println(car.year);
		System.out.println(car); // implicitly
		System.out.println(car.toString()); // explicitly
	}
	
	public static void arrayOfObjects(){
		int[] numbers = new int[3];
		char[] characters = new char[4];
		String[] strings = new String[5];
		
		//Food[] refrigerator = new Food[3];
		Food food1 = new Food("pizza");
		Food food2 = new Food("Hamburguer");
		Food food3 = new Food("hotdog");
		Food[] refrigerator = {food1, food2, food3};
//		refrigerator[0] = food1;
//		refrigerator[1] = food2;
//		refrigerator[2] = food3;
		
		System.out.println(refrigerator[0].name);
		System.out.println(refrigerator[1].name);
		System.out.println(refrigerator[2].name);
		
		
	}
	
	public static void objectPassing(){
		Garage garage = new Garage(); 
		Car2 car = new Car2("BMW");
		Car2 car1 = new Car2("Tesla");
		garage.park(car);
		garage.park(car1);
		
	}
	
	public static void staticKeyword(){
		// static = modifier. A single copy of a variable/method is created and shared.
		//			The class "owns" the static member
		Friend friend1 = new Friend("SpongeBob");
		Friend friend2 = new Friend("Patrick");
		Friend friend3 = new Friend("Squidward");
		Friend friend4 = new Friend("Sandy");
		
		//System.out.println(Friend.numberOfFriends);
		Friend.displayFriends();
	
	}
	
	public static void inHeritance(){
		// inheritance = the process where one class acquires,
		//				 the attributes and methods of another
		Car3 car = new Car3();
		car.go();
		Bicycle bici = new Bicycle();
		bici.stop();
		System.out.println(car.speed);
		System.out.println(bici.speed);
		System.out.println(car.doors);
		System.out.println(bici.pedals);
	}
	
	public static void methodOverriding(){
		/* Method overriding =	Declaring a method in sub class, 
		 * 						which is already present in parent class.
		 * 						done so what a child class can give its own implementation
		 * */
		Animal animal = new Animal();
		Dog dog = new Dog();
		dog.speak();
		animal.speak();
	}
	public static void superKeyword(){
		// super = keyword refers to the superclass  (parent) of an object 
		//		   very similar to the "this" keyword 
		
		Hero hero1 = new Hero("Batman", 42, "$$$");
		Hero hero2 = new Hero("Superman", 43, "everything");
//		System.out.println(hero1.name);
//		System.out.println(hero1.age);
//		System.out.println(hero1.power);
		
		System.out.println(hero1.toString());
		System.out.println(hero2.toString());
		
	}
}
