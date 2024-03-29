package com.in2circle.edu.ifshallnotpass;

public abstract class Message {
	public final String id;

	protected Message(String id) {
		this.id = id;
	}

	/**
	 * @return this message's unique identifier.
	 */
	public String getId() {
		return id;
	}

	/**
	 * Marks this message as processed. Current implementation is not of practical use except for illustration.
	 */
	public void markAsProcessed() {
		System.out.format("Message with id '%s' has been marked as processed.\n", id);
	}
	
	abstract void process(MessageProcessor processor);
}
