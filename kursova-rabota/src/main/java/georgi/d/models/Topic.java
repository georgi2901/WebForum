package georgi.d.models;
import java.util.*;

/**
 * 
 */
public class Topic {
	
    private String content;

    private Set<Topic> subtopic;

    private Topic parent;

    private Set<Comment> comments;

    /**
     * Default constructor
     * @param string 
     */
    public Topic() {
    }
    
    public Topic(final String content) {
    	this.content = content;
    }


    public String getContent() {
        return content;
    }


    public void setContent(String content) {
    	this.content = content;
    }


    public Topic getParent() {
        return parent;
    }


    public void setParent(Topic parent) {
    	this.parent = parent;
    }


    public Set<Topic> getSubtopic() {
        return subtopic;
    }


    public void setSubtopic(Set<Topic> subtopic) {
    	this.subtopic = subtopic;
    }


    public Set<Comment> getComments() {
        return comments;
    }


    public void setComments(Set<Comment> comments) {
    	this.comments = comments;
    }

}