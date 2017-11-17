package State;

public class GallerySlideshowState extends GalleryState{

	@Override
	public GalleryState spacePressed() {
		System.out.println("closing slideshow, returning to normal state...");
		return new GalleryNormalState();
	}

}
