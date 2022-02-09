package georgi.d.topic.service;

import georgi.d.models.User;

public class TopicService {
	
	public static String cretaeTopic(final User user, final String topicName) {
		final String result;
		boolean isAdmin = user.getRoles().stream().anyMatch(r -> "admin".equals(r.getRoleCode()));
		if (isAdmin) {
			if (null == topicName || topicName.isBlank()) {
				result = "Въведете име на тема!";
			} else {
				result = "Успешно създадохте тема!";
			}
		} else {
			result = "Нямате права да създавате тема!";
		}
		return result;
	}

}
