// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.util.List;
import java.io.File;
import java.io.RandomAccessFile;

public class Class8921
{
    private static final String field37506 = "usage:\nnet.sourceforge.jaad.Main [-mp4] <infile> <outfile>\n\n\t-mp4\tinput file is in MP4 container format";
    
    public static void main(final String[] array) {
        try {
            if (array.length < 2) {
                method31451();
            }
            if (array[0].equals("-mp4")) {
                if (array.length < 3) {
                    method31451();
                }
                else {
                    method31452(array[1], array[2]);
                }
            }
            else {
                method31453(array[0], array[1]);
            }
        }
        catch (final Exception ex) {
            System.err.println("error while decoding: " + ex);
        }
    }
    
    private static void method31451() {
        System.out.println("usage:\nnet.sourceforge.jaad.Main [-mp4] <infile> <outfile>\n\n\t-mp4\tinput file is in MP4 container format");
        System.exit(1);
    }
    
    private static void method31452(final String pathname, final String pathname2) throws Exception {
        Class8242 class8242 = null;
        try {
            final List<Class6889> method19493 = new Class7828(new RandomAccessFile(pathname, "r")).method25294().method19493(Class2236.field13747);
            if (method19493.isEmpty()) {
                throw new Exception("movie does not contain any AAC track");
            }
            final Class6890 class8243 = method19493.get(0);
            class8242 = new Class8242(new File(pathname2), class8243.method21188(), class8243.method21187(), class8243.method21189());
            final Class4206 class8244 = new Class4206(class8243.method21178());
            final Class9157 class8245 = new Class9157();
            while (class8243.method21181()) {
                class8244.method12669(class8243.method21182().method7931(), class8245);
                class8242.method27295(class8245.method33417());
            }
        }
        finally {
            if (class8242 != null) {
                class8242.method27299();
            }
        }
    }
    
    private static void method31453(final String name, final String pathname) throws IOException {
        Class8242 class8242 = null;
        try {
            final Class8847 class8243 = new Class8847(new FileInputStream(name));
            final Class4206 class8244 = new Class4206(class8243.method30974());
            final Class9157 class8245 = new Class9157();
            while (true) {
                class8244.method12669(class8243.method30975(), class8245);
                if (class8242 == null) {
                    class8242 = new Class8242(new File(pathname), class8245.method33418(), class8245.method33419(), class8245.method33420());
                }
                class8242.method27295(class8245.method33417());
            }
        }
        finally {
            if (class8242 != null) {
                class8242.method27299();
            }
        }
    }
}
