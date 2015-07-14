package np.com.ea.fuber.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.swing.text.StyledEditorKit.BoldAction;

/**
 * 
 * @author Amul
 * user 
 */
@Entity(name="users")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "middle_name")
	private String middleName;

	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "username")
	private String userName;
	
	@Column(name = "password")
	private String password;
	
	@Transient
	private String rePassword;
	
//	@Enumerated(EnumType.STRING)
//	private Role role;
	
	private boolean enabled=true;

	public User() {

	}

//	public User(String firstName, String lastName, String userName,
//			String password, String rePassword) {
//		super();
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.password = password;
//		this.userName = userName;
//		this.rePassword = rePassword;
//
//	}
//
//	public User(String firstName, String middleName, String lastName,
//			String userName, String password, String rePassword) {
//		this(firstName, lastName, userName, password, rePassword);
//		this.middleName = middleName;
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRePassword() {
		return rePassword;
	}

	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}

//	public Role getRole() {
//		return role;
//	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

//	public void setRole(Role role) {
//		this.role = role;
//	}
//	
//	public enum Role{
//		ROLE_HUNGRY, ROLE_FEEDER, ROLE_ADMIN
//	}

}
