import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DosyaYönetimi {

    public static void createFile(String ogrNum) throws IOException {
        File f = new File("C:\\Medipol\\" + ogrNum + ".txt");

        if (f.exists()) {
            f.delete();

        } else {
            f.getParentFile().mkdirs();
            f.createNewFile();
        }

    }

    public static void updateFile(String ogrNum) throws IOException {
        File f = new File("C:\\Medipol\\" + ogrNum + ".txt");
        FileOutputStream fos = null;

        fos = new FileOutputStream(f);
        String yazi = ogrNum + " için bu klasor oluşturulmuştur.";

        fos.write(yazi.getBytes());
        fos.flush();
        fos.close();
    }

    public static void deleteFile(String ogrNum) throws FileNotFoundException {
        File f = new File("C:\\Medipol\\" + ogrNum + ".txt");

        if (f.exists()) {
            f.delete();
        } else {
            throw new FileNotFoundException(ogrNum);
        }

    }

    public static void main(String[] args) throws FileNotFoundException, IOException  {
        final String ogrNum = "H5200076";

        createFile(ogrNum);
        updateFile(ogrNum);
        //deleteFile(ogrNum);

    }
}