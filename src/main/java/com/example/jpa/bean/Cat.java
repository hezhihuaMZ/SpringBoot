package com.example.jpa.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *  使用@Entity 进行实体类的实体化操作，当JPA检测到实体类中有
 *  @Entity 注解时，会在数据库中生成对应的表结构信息
 *  
 * 如何指定主键及主键生成策略，在字段上放加入@Id 指定主键 
 * 使用代码@GeneratedValue(strategy=GenerationType.AUTO)
 * 指定主键生成策略，mysql默认自增长。
 * @author Lenovo
 *
 */
@Entity
public class Cat {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id ;
	private String Name;
	private int age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
