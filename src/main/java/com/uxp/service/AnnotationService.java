package com.uxp.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestParam;

public interface AnnotationService {
	Object postAnnotation( String annotationTitle, String annotationText, String emoji,
		String pinType, String pinTypeColor, String pinTypeDescription,	String annotationContentType,
		String annotationType, String parentDomain, String specificUrl, String pinXCoordinate,
		String pinYCoordinate, String annotationMediaType, int annotationPageHeight, int annotationPageWidth,
		StringBuffer annotationMedia, String programId, long userId, String hashtag, HttpServletRequest request, HttpServletResponse response );
	
	String uploadToS3(String fileName, String fileLocation);
	String decodeBase64JPEG(StringBuffer mediaData);

}
