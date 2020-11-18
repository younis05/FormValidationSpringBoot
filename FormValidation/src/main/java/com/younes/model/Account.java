package com.younes.model;

import java.util.Date;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;
import org.springframework.format.annotation.DateTimeFormat;

@SuppressWarnings("deprecation")
public class Account {

	@NotEmpty
	@Length(min = 3, max = 10)
	private String username;
     //@Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})") password:abcD123#
	@NotEmpty
	@Pattern(regexp = "((?=.*\\d)(?=.*[a-z]).{6,20})") //password:abc123
	private String password;

	@NotEmpty
	@Email
	private String email;
	
	@NotEmpty
	@Pattern(regexp = "([0]{1})([5-7]{1})([0-9]).{7}")
	private String phone;
	
	@NotNull
	@Min(18)
	@Max(120)
	private int age;

	@URL
	private String website;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@NotNull
	@Past
	private Date birthDay;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(@NotEmpty @Length(min = 3, max = 10) String username,
			@NotEmpty @Pattern(regexp = "((?=.*\\d)(?=.*[a-z]).{6,20})") String password, @NotEmpty @Email String email,
			@NotEmpty @Pattern(regexp = "([0]{1})([5-7]{1})([0-9]).{7})") String phone,
			@NotNull @Min(18) @Max(120) int age, @URL String website, @NotNull @Past Date birthDay) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.age = age;
		this.website = website;
		this.birthDay = birthDay;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	
	
	
}
	
	
	
	