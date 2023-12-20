package CompDecomp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class Decompressor {
    public static void method(File file) throws IOException {
        String fileDirctory=file.getParent();

        FileInputStream fis= new FileInputStream(file);
        GZIPInputStream gzip= new GZIPInputStream(fis);
        FileOutputStream fos= new FileOutputStream(fileDirctory+"DecompressedFile");

        byte[] buffer= new byte[1024];

        int len;

        while((len=gzip.read(buffer))!=-1){
            fos.write(buffer,0,len);
        }

        fis.close();
        fos.close();
        gzip.close();




    }
    public static void main(String[] args) throws IOException {
        File path= new File("Desktop\\Acciojob_projects\\CompressorDecompressor\\CcompressedFile.gz");
        method(path);
    }
}
