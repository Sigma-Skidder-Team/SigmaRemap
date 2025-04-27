// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioFormat;
import java.io.InputStream;
import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.URI;

public class Class8655
{
    private static final String field36330 = "usage:\nnet.sourceforge.jaad.Radio <url>";
    
    public static void main(final String[] array) {
        try {
            if (array.length < 1) {
                method29525();
            }
            else {
                method29526(array[0]);
            }
        }
        catch (final Exception ex) {
            ex.printStackTrace();
            System.err.println("error while decoding: " + ex);
        }
    }
    
    private static void method29525() {
        System.out.println("usage:\nnet.sourceforge.jaad.Radio <url>");
        System.exit(1);
    }
    
    private static void method29526(final String str) throws Exception {
        final Class9157 class9157 = new Class9157();
        SourceDataLine sourceDataLine = null;
        try {
            final URI uri = new URI(str);
            final Socket socket = new Socket(uri.getHost(), (uri.getPort() > 0) ? uri.getPort() : 80);
            final PrintStream printStream = new PrintStream(socket.getOutputStream());
            String s = uri.getPath();
            if (s == null || s.equals("")) {
                s = "/";
            }
            if (uri.getQuery() != null) {
                s = s + "?" + uri.getQuery();
            }
            printStream.println("GET " + s + " HTTP/1.1");
            printStream.println("Host: " + uri.getHost());
            printStream.println();
            final DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            String line;
            do {
                line = dataInputStream.readLine();
            } while (line != null && !line.trim().equals(""));
            final Class8847 class9158 = new Class8847(dataInputStream);
            AudioFormat format = new AudioFormat((float)class9158.method30977(), 16, class9158.method30978(), true, true);
            final Class4206 class9159 = new Class4206(class9158.method30974());
            while (true) {
                class9159.method12669(class9158.method30975(), class9157);
                if (sourceDataLine != null && method29527(sourceDataLine.getFormat(), class9157)) {
                    sourceDataLine.stop();
                    sourceDataLine.close();
                    sourceDataLine = null;
                    format = new AudioFormat((float)class9157.method33418(), class9157.method33420(), class9157.method33419(), true, true);
                }
                if (sourceDataLine == null) {
                    sourceDataLine = AudioSystem.getSourceDataLine(format);
                    sourceDataLine.open();
                    sourceDataLine.start();
                }
                final byte[] method33417 = class9157.method33417();
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
    
    private static boolean method29527(final AudioFormat audioFormat, final Class9157 class9157) {
        if (audioFormat.getSampleRate() == class9157.method33418()) {
            if (audioFormat.getChannels() == class9157.method33419()) {
                if (audioFormat.getSampleSizeInBits() == class9157.method33420()) {
                    return audioFormat.isBigEndian() != class9157.method33424();
                }
            }
        }
        return true;
    }
}
