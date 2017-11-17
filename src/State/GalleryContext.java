package State;

public class GalleryContext {
	
	

	public GalleryContext(GalleryState initial) {
		this.state = initial;
	}

	private GalleryState state;
	
	public void spacePressed() {
		state = state.spacePressed();
	}
	
	
}
