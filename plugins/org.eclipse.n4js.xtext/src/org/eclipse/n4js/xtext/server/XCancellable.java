package org.eclipse.n4js.xtext.server;

/**
 * A functional interface that indicates something that can be cancelled.
 */
public interface XCancellable {
	/**
	 * Attempt to cancel.
	 */
	void cancel();
}