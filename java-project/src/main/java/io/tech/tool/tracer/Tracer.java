package io.tech.tool.tracer;

import java.util.HashMap;
import java.util.Map;

/**
 * Tracer helps at tracing method calls (this includes methods from the Java
 * runtime and all jars declared in the application classpath). Example of use:
 *
 * <pre>
 * try {
 * 	// register a method to trace
 * 	Method m = Tracer.trace("void java.util.Arrays.sort(int[])");
 *
 * 	// an input test case
 * 	int[] test = { 3, 2, 1 };
 * 	Solution.sort(test);
 *
 * 	// checks Arrays.sort has been called with the right parameter : "test"
 * 	assert (m.wasCalled() && m.getArgs()[0] == test);
 * } finally {
 * 	Tracer.untrace(method);
 * }
 * </pre>
 */
public class Tracer {
	protected static Map<String, Method> map = new HashMap<String, Method>();

	/**
	 * Trace calls to this method.
	 * 
	 * @param signature
	 *            return_type|void package.class.method([param_type1,
	 *            param_type2])
	 * @return the Method call to trace.
	 */
	public static Method trace(String signature) {
		Method m = new Method();
		map.put(signature, m);
		return m;
	}

	public static Method getMethod(String signature) {
		return map.get(signature);
	}

	public static void untrace(String signature) {
		map.remove(signature);
	}

	public static void untraceAll() {
		map.clear();
	}
}