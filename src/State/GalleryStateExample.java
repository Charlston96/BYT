package State;

public class GalleryStateExample {

	public static void main(String[] args) {
		
		GalleryContext c = new GalleryContext(new GalleryNormalState());
		
		c.spacePressed();
		c.spacePressed();
		c.spacePressed();

	}

}
