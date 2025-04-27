// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.InputStream;
import java.io.FileInputStream;
import java.util.List;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioFormat;
import java.io.RandomAccessFile;

public class Class8857
{
    private static final String field37239 = "usage:\nnet.sourceforge.jaad.Play [-mp4] <infile>\n\n\t-mp4\tinput file is in MP4 container format";
    
    public static void main(final String[] array) {
        try {
            if (array.length < 1) {
                method31010();
            }
            if (array[0].equals("-mp4")) {
                if (array.length < 2) {
                    method31010();
                }
                else {
                    method31011(array[1]);
                }
            }
            else {
                method31012(array[0]);
            }
        }
        catch (final Exception ex) {
            ex.printStackTrace();
            System.err.println("error while decoding: " + ex);
        }
    }
    
    private static void method31010() {
        System.out.println("usage:\nnet.sourceforge.jaad.Play [-mp4] <infile>\n\n\t-mp4\tinput file is in MP4 container format");
        System.exit(1);
    }
    
    private static void method31011(final String pathname) throws Exception {
        SourceDataLine sourceDataLine = null;
        try {
            final List<Class6889> method19493 = new Class7828(new RandomAccessFile(pathname, "r")).method25294().method19493(Class2236.field13747);
            if (method19493.isEmpty()) {
                throw new Exception("movie does not contain any AAC track");
            }
            final Class6890 class6890 = method19493.get(0);
            sourceDataLine = AudioSystem.getSourceDataLine(new AudioFormat((float)class6890.method21188(), class6890.method21189(), class6890.method21187(), true, true));
            sourceDataLine.open();
            sourceDataLine.start();
            final Class4206 class6891 = new Class4206(class6890.method21178());
            final Class9157 class6892 = new Class9157();
            while (class6890.method21181()) {
                final Class1950 method19494 = class6890.method21182();
                try {
                    class6891.method12669(method19494.method7931(), class6892);
                    final byte[] method19495 = class6892.method33417();
                    sourceDataLine.write(method19495, 0, method19495.length);
                }
                catch (final Class2348 class6893) {
                    class6893.printStackTrace();
                }
            }
        }
        finally {
            if (sourceDataLine != null) {
                sourceDataLine.stop();
                sourceDataLine.close();
            }
        }
    }
    
    private static void method31012(final String name) throws Exception {
        SourceDataLine sourceDataLine = null;
        try {
            final Class8847 class8847 = new Class8847(new FileInputStream(name));
            final Class4206 class8848 = new Class4206(class8847.method30974());
            final Class9157 class8849 = new Class9157();
            while (true) {
                class8848.method12669(class8847.method30975(), class8849);
                if (sourceDataLine == null) {
                    sourceDataLine = AudioSystem.getSourceDataLine(new AudioFormat((float)class8849.method33418(), class8849.method33420(), class8849.method33419(), true, true));
                    sourceDataLine.open();
                    sourceDataLine.start();
                }
                final byte[] method33417 = class8849.method33417();
                sourceDataLine.write(method33417, 0, method33417.length);
            }
        }
        finally {
            if (sourceDataLine != null) {
                sourceDataLine.stop();
                sourceDataLine.close();
            }
        }
    }
}
