package com.solace.test.processor.messages;

/** 
 * Email sent to user.
 * <p>A message notifying an email has been sent.</p>
 */
public class EmailSent {
	public static class Payload implements java.io.Serializable {
		private static final long serialVersionUID = 1L;
		private com.solace.test.processor.types.User user;

		public void setUser(final com.solace.test.processor.types.User user) {
			this.user = user;
		}

		public com.solace.test.processor.types.User getUser() {
			return this.user;
		}

		private java.lang.String content;

		public void setContent(final java.lang.String content) {
			this.content = content;
		}

		public java.lang.String getContent() {
			return this.content;
		}
	}

	/** 
	* Message payload
	*/
	private com.solace.test.processor.messages.EmailSent.Payload payload;

	public void setPayload(final com.solace.test.processor.messages.EmailSent.Payload payload) {
		this.payload = payload;
	}

	public com.solace.test.processor.messages.EmailSent.Payload getPayload() {
		return this.payload;
	}
}
