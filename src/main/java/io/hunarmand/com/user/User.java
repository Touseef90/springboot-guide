package io.hunarmand.com.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	private @Id @GeneratedValue Long id;
	private String name;
	private String phone;
	private String is_hunarmand;
	private String email;
	private String city;
	private String area;
	private String honesty_rank;

	public User() {}

	public User(Long id, String name, String phone, String is_hunarmand, String email, String city, String area,
			String honesty_rank) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.is_hunarmand = is_hunarmand;
		this.email = email;
		this.city = city;
		this.area = area;
		this.honesty_rank = honesty_rank;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getIs_hunarmand() {
		return is_hunarmand;
	}

	public void setIs_hunarmand(String is_hunarmand) {
		this.is_hunarmand = is_hunarmand;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getHonesty_rank() {
		return honesty_rank;
	}

	public void setHonesty_rank(String honesty_rank) {
		this.honesty_rank = honesty_rank;
	}

}
