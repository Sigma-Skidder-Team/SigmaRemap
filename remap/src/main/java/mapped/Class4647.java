// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import com.google.common.collect.Iterables;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.Charsets;
import java.io.InputStream;
import java.io.IOException;
import java.util.Map;
import java.util.ArrayList;
import java.util.regex.Pattern;
import com.google.common.base.Splitter;

public class Class4647
{
    private static final Splitter field20117;
    private static final Pattern field20118;
    
    public static void method13873() {
        final Map method30775 = Class8822.method30775();
        final ArrayList list = new ArrayList();
        final String s = "optifine/lang/";
        final String s2 = "en_us";
        final String s3 = ".lang";
        list.add(s + s2 + s3);
        if (!Class8571.method28962().field23476.equals(s2)) {
            list.add(s + Class8571.method28962().field23476 + s3);
        }
        final String[] array = (String[])list.toArray(new String[list.size()]);
        method13874(Class8571.method28905(), array, method30775);
        final Class1727[] method30776 = Class8571.method28903();
        for (int i = 0; i < method30776.length; ++i) {
            method13874(method30776[i], array, method30775);
        }
    }
    
    private static void method13874(final Class1727 class1727, final String[] array, final Map map) {
        try {
            for (int i = 0; i < array.length; ++i) {
                final Class1932 class1728 = new Class1932(array[i]);
                if (class1727.method6099(Class346.field2137, class1728)) {
                    final InputStream method6097 = class1727.method6097(Class346.field2137, class1728);
                    if (method6097 != null) {
                        method13875(method6097, map);
                    }
                }
            }
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void method13875(final InputStream inputStream, final Map map) throws IOException {
        for (final String s : IOUtils.readLines(inputStream, Charsets.UTF_8)) {
            if (s.isEmpty()) {
                continue;
            }
            if (s.charAt(0) == '#') {
                continue;
            }
            final String[] array = (String[])Iterables.toArray(Class4647.field20117.split((CharSequence)s), (Class)String.class);
            if (array == null) {
                continue;
            }
            if (array.length != 2) {
                continue;
            }
            map.put(array[0], Class4647.field20118.matcher(array[1]).replaceAll("%$1s"));
        }
    }
    
    public static String method13876(final String s) {
        return Class8822.method30773(s, new Object[0]);
    }
    
    public static String method13877(final String anObject, final String s) {
        final String method30773 = Class8822.method30773(anObject, new Object[0]);
        return (method30773 != null && !method30773.equals(anObject)) ? method30773 : s;
    }
    
    public static String method13878() {
        return Class8822.method30773("options.on", new Object[0]);
    }
    
    public static String method13879() {
        return Class8822.method30773("options.off", new Object[0]);
    }
    
    public static String method13880() {
        return Class8822.method30773("options.graphics.fast", new Object[0]);
    }
    
    public static String method13881() {
        return Class8822.method30773("options.graphics.fancy", new Object[0]);
    }
    
    public static String method13882() {
        return Class8822.method30773("generator.default", new Object[0]);
    }
    
    static {
        field20117 = Splitter.on('=').limit(2);
        field20118 = Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]");
    }
}
