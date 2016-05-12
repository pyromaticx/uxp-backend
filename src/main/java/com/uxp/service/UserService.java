package com.uxp.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface UserService {
	public Object createUser(String userName, String userPassword, String userFirstName, 
		   String userLastName, String userPicURL, String userEmail, String userEmployer,
		   String userDesignation, String userCity, String userState, String programId, 
		   long updatedBy, String userExpertise, String userRoleDescription, String userPermissionCode,
		   String userPermissionDescription, HttpServletRequest request, HttpServletResponse response);

	public Object changeUserPass(long userId, String programId, String oldPass, String newPass,
			HttpServletResponse response,  HttpServletRequest request);
	
	public Object updateUserProfile(long userId, String userName, String userPassword,String userFirstName,
			String userLastName, String userPicURL, String userEmail, String userEmployer, String userDesignation,
			String userCity, String userState, String programId, HttpServletResponse response, 
			HttpServletRequest request);
}