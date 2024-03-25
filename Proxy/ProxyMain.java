import java.util.*;

public class ProxyMain {
    public static void main(String[] arguments) {
        List<Image> photoAlbum = new ArrayList<>();

        photoAlbum.add(new ProxyImage("HiRes_10MB_Photo1"));
        photoAlbum.add(new ProxyImage("HiRes_10MB_Photo2"));
        photoAlbum.add(new ProxyImage("HiRes_10MB_Photo3"));

        System.out.println("Photo Album Contents:");
        for (Image image : photoAlbum) {
            image.showData();
        }

        System.out.println("\nBrowsing Photo Album:");
        for (Image image : photoAlbum) {
            image.displayImage();
        }
    }
}
