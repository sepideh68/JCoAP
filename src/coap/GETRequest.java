package coap;

public class GETRequest extends Request {
	
	public GETRequest() {
		super(CodeRegistry.METHOD_GET, true);
	}
	
	@Override
	protected void dispatch(RequestHandler handler) {
		handler.performGET(this);
	}	
}
