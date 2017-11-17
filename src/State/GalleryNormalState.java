package State;

public class GalleryNormalState extends GalleryState{
	
	@Override
	public GalleryState spacePressed() {
		System.out.println("opening slideshow...");
		return new GallerySlideshowState();
	}

}
