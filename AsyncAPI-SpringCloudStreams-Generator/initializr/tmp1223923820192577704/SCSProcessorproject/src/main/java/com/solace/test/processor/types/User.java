package com.solace.test.processor.types;

public class User implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	/** 
	* User Id
	*/
	private java.lang.String id;

	public void setId(final java.lang.String id) {
		this.id = id;
	}

	public java.lang.String getId() {
		return this.id;
	}

	/** 
	* User's full name
	*/
	private java.lang.String fullName;

	public void setFullName(final java.lang.String fullName) {
		this.fullName = fullName;
	}

	public java.lang.String getFullName() {
		return this.fullName;
	}

	private java.lang.String username;

	public void setUsername(final java.lang.String username) {
		this.username = username;
	}

	public java.lang.String getUsername() {
		return this.username;
	}
}
