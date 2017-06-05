package io.tech.tool.tracer;

public class Method {
	protected Object target = null;
	protected Object[] args = null;
	protected boolean called = false;

	/**
	 * The instance running this method. Returns <code>null</code> if the method
	 * is a static one.
	 */
	public Object getInstance() {
		return target;
	}

	/**
	 * Gets the method arguments.
	 */
	public Object[] getArgs() {
		return args;
	}

	/**
	 * Returns true if the method has been called, false otherwise.
	 */
	public boolean wasCalled() {
		return called;
	}
}