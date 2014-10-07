package com.in2circle.edu.ifshallnotpass;

/**
 * @author Alexander Czar
 */
public class MessageC extends Message {
	public String priority;

	protected MessageC(String id, String priority) {
		super(id);
		this.priority = priority;
	}

	public String getPriority() {
		return priority;
	}

	public void process(MessageProcessor processor){
		processor.processMessage(this);
	}
}