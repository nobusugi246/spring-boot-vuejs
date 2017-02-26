package proto.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
public class User {

	@Id @GeneratedValue
	private	Long id;

	private String firstName;
	private String lastName;
	private String description;

	public User() {}
	
	public User(String firstName, String lastName, String desc) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.description = desc;
	}
}
