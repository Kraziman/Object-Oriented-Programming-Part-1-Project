import java.io.File;
import java.util.ArrayList;

public abstract class Image {
    public String directory = null;
    public int[][] imageSize;
    public String magicNumber;
    public ArrayList<String> imageComments;
    public String imageDimensions;
    public String RGBValue;
    public Image imageHistory;
    public File file;

    public Image(String directory, String magicNumber, String RGBValue){
        this.directory = directory;
        this.imageSize = imageSize(directory);
    }

    public int[][] imageSize(String directory){
        int x = 0;
        int y = 0;

        //TODO: Add logic for getting the image size(TIP - first row is 'magic number' and
        // then every row that starts with '#' is a comment and should be skipped and maybe
        // saved somewhere so they can be rewritten back into the image file)

        return new int[x][y];
    }

    public ImageType getImageType(){
        return null;
    }

    public void readImageData(){

    }

    //TODO: Add functionality to change the type of the image(either add it as a general
    // function of the program or just so it makes collages with different image types easier to make

    public void rotate(){
        //TODO: make it so it gets its direction directly from the ImageEditor's parameters
    }

    public void negative(){

    }

    public void grayscale(){

    }

    public void monochrome(){

    }

    public static String checkImageType(String imagePath) throws InvalidPathException {

        String imageExtension;

        int SlashIndex1 = imagePath.lastIndexOf("/");
        int SlashIndex2 = imagePath.lastIndexOf("\\");
        int lastSlashIndex = Math.max(SlashIndex1,SlashIndex2);
        int dotIndex;
        String temp;

        if (lastSlashIndex != -1){
            temp = imagePath.substring(lastSlashIndex);
            dotIndex = temp.lastIndexOf(".");
        }
        else{
            temp = imagePath;
            dotIndex = temp.lastIndexOf(".");
        }

        if (dotIndex != -1 && dotIndex < imagePath.length() ){
            return imageExtension = temp.substring(dotIndex + 1).toUpperCase();
        }
        else{
            throw new InvalidPathException("Invalid path: \"" + imagePath + "\", or file does not exist.");
        }

    }

}
