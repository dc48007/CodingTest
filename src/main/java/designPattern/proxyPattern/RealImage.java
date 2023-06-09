package designPattern.proxyPattern;
public class RealImage implements Image{
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    public RealImage(ImageProxy imageProxy){
        System.out.println("Image proxy elements initialised: "+ imageProxy);
    }

    private void loadFromDisk() {
        System.out.println("Loading image from disk: " + filename);
        // Perform actual loading from disk
    }

    /**
     *
     */
    @Override public void display() {
        System.out.println("Displaying image: " + filename);
    }
}
