package georgi.d.models;
import java.util.*;

/**
 * 
 */
public class Comment {
	
    private String content;
    private User owner;

    private Set<Comment> children;

    private Comment parent;

    private Topic topic;

    /**
     * Default constructor
     */
    public Comment() {
    }
    
    public Comment(final String content) {
    	this.content = content;
    }

    public String getContent() {
        return content;
    }


    public void setContent(String content) {
    	this.content = content;
    }


    public Comment getParent() {
        return parent;
    }


    public void setParent(Comment parent) {
    	this.parent = parent;
    }


    public Set<Comment> getChildren() {
        return children;
    }

 
    public void setChildren(Set<Comment> children) {
    	this.children = children;
    }


    public Topic getTopic() {
        return topic;
    }


    public void setTopic(Topic topic) {
    	this.topic = topic;
    }


    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
    	this.owner = owner;
    }

}