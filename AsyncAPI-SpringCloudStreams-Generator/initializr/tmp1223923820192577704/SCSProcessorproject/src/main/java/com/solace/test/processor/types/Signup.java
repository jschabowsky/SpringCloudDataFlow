package com.solace.test.processor.types;

public class Signup implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	/** 
 * <p>Signup method</p>
 */
  public static enum Method
	{  EMAIL("email"),   FACEBOOK("facebook"),   TWITTER("twitter"),   GITHUB("github"),   GOOGLE("google");
	private final String value;

	private Method(  final String value){
    this.value=value;
  }

	public @Override String toString() {
		return this.value;
	}}

	/** 
	* Signup method
	*/
	private com.solace.test.processor.types.Signup.Method method;

	public void setMethod(final com.solace.test.processor.types.Signup.Method method) {
		this.method = method;
	}

	public com.solace.test.processor.types.Signup.Method getMethod() {
		return this.method;
	}
}
