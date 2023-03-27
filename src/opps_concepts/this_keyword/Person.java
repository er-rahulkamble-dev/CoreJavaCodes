package opps_concepts.this_keyword;

public class Person {
	
	String name;
	int age;
	Person(String name){
		this.name = name;
		System.out.println(name);
	}
	Person(int age){
		this("Soheb");
		this.age = age;
		System.out.println(age);
	}

}
