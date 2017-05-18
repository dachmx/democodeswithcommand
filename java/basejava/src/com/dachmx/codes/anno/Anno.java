package com.dachmx.codes.anno;

public class Anno{
	@FieldMeta(id=true, name="序号", order=1)
	private int id;

	@FieldMeta(name="姓名", order=3)
	private String name;

	@FieldMeta(name="年龄", order=2)
	private int age;

	@FieldMeta(name="描壕", order=4)
	public String desc(){
		return "Java Reflect Test Runtim owwww!"
	}

	public int getId() {
		return id;  
	}  
	public void setId(int id) {
		this.id = id;  
	}  
	public String getName() {
		return name;  
	}  
	public void setName(String name) {
		this.name = name;  
	}  
	public int getAge() {
		return age;  
	}  
	public void setAge(int age) {
		this.age = age;  
	}
}
