// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.InputStream;
import java.util.Map;
import java.io.IOException;
import java.io.File;
import com.sapher.youtubedl.YoutubeDLException;
import java.util.ArrayList;

public class Class8050
{
    public static String field33127;
    
    public static String[] method26396(final String s) {
        final ArrayList list = new ArrayList();
        list.add(Class8050.field33127);
        final String[] split = s.split(" ");
        for (int length = split.length, i = 0; i < length; ++i) {
            list.add(split[i]);
        }
        return (String[])list.toArray(new String[0]);
    }
    
    public static Class9362 method26397(final Class6462 class6462) throws YoutubeDLException {
        return method26398(class6462, null);
    }
    
    public static Class9362 method26398(final Class6462 class6462, final Class8413 class6463) throws YoutubeDLException {
        final String[] method26396 = method26396(class6462.method19336());
        final String method26397 = class6462.method19328();
        final Map<String, String> method26398 = class6462.method19332();
        final StringBuffer sb = new StringBuffer();
        final StringBuffer sb2 = new StringBuffer();
        final long nanoTime = System.nanoTime();
        final ProcessBuilder processBuilder = new ProcessBuilder(method26396);
        if (method26397 != null) {
            processBuilder.directory(new File(method26397));
        }
        Process start;
        try {
            start = processBuilder.start();
        }
        catch (final IOException ex) {
            throw new Class2333(ex);
        }
        final InputStream inputStream = start.getInputStream();
        final InputStream errorStream = start.getErrorStream();
        final Class918 class6464 = new Class918(sb, inputStream, class6463);
        final Class901 class6465 = new Class901(sb2, errorStream);
        int wait;
        try {
            class6464.join();
            class6465.join();
            wait = start.waitFor();
        }
        catch (final InterruptedException ex2) {
            throw new Class2333(ex2);
        }
        final String string = sb.toString();
        final String string2 = sb2.toString();
        if (wait > 0) {
            throw new Class2333(string2);
        }
        final Class9362 class6466 = new Class9362(method26396.toString(), method26398, method26397, wait, (int)((System.nanoTime() - nanoTime) / 1000000L), string, string2);
        start.destroy();
        return class6466;
    }
    
    public static String method26399() throws YoutubeDLException {
        final Class6462 class6462 = new Class6462();
        class6462.method19333("version");
        return method26397(class6462).method34721();
    }
    
    public static String method26400() {
        return Class8050.field33127;
    }
    
    public static void method26401(final String field33127) {
        Class8050.field33127 = field33127;
    }
    
    static {
        Class8050.field33127 = "youtube-dl";
    }
}
