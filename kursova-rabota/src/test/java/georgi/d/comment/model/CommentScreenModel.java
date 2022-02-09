package georgi.d.comment.model;

import georgi.d.comment.service.CommentService;


public class CommentScreenModel {
	
	private String contenta;
	private String contentb;
	private String message;

	public void setContentA(final String contenta) {
		this.contenta = contenta;
		
	}
	
	public void setContentB(final String contentb) {
		this.contentb = contentb;
		
	}
	
	public void pressCommentButton() {
		message = CommentService.topic(contenta, contentb);
		
	}
	
	public String getMessage() {
		return message;
	}

}
