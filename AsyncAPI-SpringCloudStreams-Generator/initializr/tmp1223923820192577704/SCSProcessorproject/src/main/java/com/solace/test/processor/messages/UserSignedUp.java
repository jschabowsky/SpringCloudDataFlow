package com.solace.test.processor.messages;

/** 
 * A user has signed up.
 */
public class UserSignedUp {
	public static class Payload implements java.io.Serializable {
		private static final long serialVersionUID = 1L;
		private com.solace.test.processor.types.User user;

		public void setUser(final com.solace.test.processor.types.User user) {
			this.user = user;
		}

		public com.solace.test.processor.types.User getUser() {
			return this.user;
		}

		private com.solace.test.processor.types.Signup signup;

		public void setSignup(final com.solace.test.processor.types.Signup signup) {
			this.signup = signup;
		}

		public com.solace.test.processor.types.Signup getSignup() {
			return this.signup;
		}
	}

	/** 
	* Message payload
	*/
	private com.solace.test.processor.messages.UserSignedUp.Payload payload;

	public void setPayload(final com.solace.test.processor.messages.UserSignedUp.Payload payload) {
		this.payload = payload;
	}

	public com.solace.test.processor.messages.UserSignedUp.Payload getPayload() {
		return this.payload;
	}
}
