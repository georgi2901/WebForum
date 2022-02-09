package georgi.d.models;
import java.util.*;

/**
 * 
 */
public class User {
	
    private String username;

    private String password;

    private String email;

    private Set<Role> roles;

    private Set<Comment> comments;

    /**
     * Default constructor
     */
    public User() {
    }


    public User(final String username, final String password) {
    	this.username = username;
    	this.password = password;
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
    	this.email =email;
    }
    
    public Set<Role> getRoles() {
    	if (roles == null) {
			roles = new HashSet<>();
		}
		return roles;
    }

    public void setRoles(Set<Role> roles) {
    	if (roles != null) {
			this.roles = roles;
		} else {
			this.roles.clear();
		}
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
    	this.comments = comments;
    }
 

}