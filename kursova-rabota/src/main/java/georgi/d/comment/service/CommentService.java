package georgi.d.comment.service;

import java.util.Collections;
import java.util.List;

import georgi.d.models.Comment;
import georgi.d.models.Topic;

public class CommentService {
	
	private static List<Topic> topicName = Collections.singletonList(new Topic("Мотори"));
	private static List<Comment> commentContent = Collections.singletonList(new Comment("123321"));
	
	
	public static String topic(final String contenta, final String contentb){
		
		final boolean isTopicExisting = topicName.stream().anyMatch(u->u.getContent().equals(contenta));
		final boolean isCommentContent = commentContent.stream().anyMatch(u->u.getContent().equals(contentb));
		if(isTopicExisting == true && isCommentContent == true) {
			return "Успешно създадохте коментар!";
		}else if(isTopicExisting == true && isCommentContent == false){
			return "Липсва съдържание на коментара!"; 
		}else if (isTopicExisting == false && isCommentContent == true) {
			return "Няма такава тема!";
		}
		return "aaaa";
		
	}

}
