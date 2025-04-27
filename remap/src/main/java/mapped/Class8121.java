// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.StringReader;
import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class Class8121
{
    public static InputStream method26733(final InputStream inputStream, final String s) throws IOException {
        String str = Config.method28960(inputStream, "ASCII");
        final String method26735 = method26735(str);
        if (!method26735.isEmpty()) {
            final String string = method26735 + str;
            if (Class9216.field39370) {
                Class9216.method33771(s.replace(':', '/') + ".pre", string);
            }
            str = method26734(string);
        }
        if (Class9216.field39370) {
            Class9216.method33771(s.replace(':', '/'), str);
        }
        return new ByteArrayInputStream(str.getBytes(StandardCharsets.US_ASCII));
    }
    
    public static String method26734(final String s) throws IOException {
        final BufferedReader bufferedReader = new BufferedReader(new StringReader(s));
        final Class7986 class7986 = new Class7986();
        final StringBuilder sb = new StringBuilder();
        while (true) {
            final String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            if (!class7986.method26049(line)) {
                continue;
            }
            if (Class7986.method26050(line)) {
                continue;
            }
            sb.append(line);
            sb.append("\n");
        }
        return sb.toString();
    }
    
    private static String method26735(final String s) throws IOException {
        final StringBuilder sb = new StringBuilder();
        List list = null;
        final BufferedReader bufferedReader = new BufferedReader(new StringReader(s));
        while (true) {
            final String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            if (!Class7986.method26050(line)) {
                continue;
            }
            if (sb.length() == 0) {
                sb.append(Class7677.method24372());
            }
            if (list == null) {
                list = new ArrayList(Arrays.asList(Class7677.method24371()));
            }
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                final Class8573 class8573 = (Class8573)iterator.next();
                if (!line.contains(class8573.method29024())) {
                    continue;
                }
                sb.append(class8573.method29026());
                sb.append("\n");
                iterator.remove();
            }
        }
        return sb.toString();
    }
    
    private static List<Class5601> method26736() {
        final ArrayList list = new ArrayList();
        final Class5601[] method33727 = Class9216.method33727();
        for (int i = 0; i < method33727.length; ++i) {
            final Class5601 class5601 = method33727[i];
            final String method33728 = class5601.method16883();
            if (method33728 != null) {
                if (method33728.startsWith("#")) {
                    list.add(class5601);
                }
            }
        }
        return list;
    }
}
