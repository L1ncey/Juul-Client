package juul.event;

public class EventKey extends Event<EventKey> {

	public int code;

	public EventKey(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
}
