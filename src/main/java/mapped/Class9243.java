// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.InputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;

public class Class9243
{
    private static Class9099 field39640;
    private static final Random field39641;
    
    public static Class9099 method34078() {
        return Class9243.field39640;
    }
    
    public static void method34079() {
        Class9243.field39640 = null;
        final String[] method34080 = method34080();
        if (method34080.length > 1) {
            final Properties[] method34081 = method34081(method34080);
            final int method34082 = method34083(method34082(method34081));
            final String s = method34080[method34082];
            Properties properties = method34081[method34082];
            if (properties == null) {
                properties = method34081[0];
            }
            if (properties == null) {
                properties = new Class27();
            }
            Class9243.field39640 = new Class9099(s, properties);
        }
    }
    
    private static String[] method34080() {
        final ArrayList list = new ArrayList();
        list.add("textures/gui/title/background");
        for (int i = 0; i < 100; ++i) {
            final String string = "optifine/gui/background" + i;
            if (Class8571.method28900(new Class1932(string + "/panorama_0.png"))) {
                list.add(string);
            }
        }
        return (String[])list.toArray(new String[list.size()]);
    }
    
    private static Properties[] method34081(final String[] array) {
        final Properties[] array2 = new Properties[array.length];
        for (int i = 0; i < array.length; ++i) {
            String s = array[i];
            if (i == 0) {
                s = "optifine/gui";
            }
            else {
                Class8571.method28847("CustomPanorama: " + s);
            }
            final Class1932 class1932 = new Class1932(s + "/background.properties");
            try {
                final InputStream method28897 = Class8571.method28897(class1932);
                if (method28897 != null) {
                    final Class27 class1933 = new Class27();
                    class1933.load(method28897);
                    Class8571.method28847("CustomPanorama: " + class1932.method7797());
                    array2[i] = class1933;
                    method28897.close();
                }
            }
            catch (final IOException ex) {}
        }
        return array2;
    }
    
    private static int[] method34082(final Properties[] array) {
        final int[] array2 = new int[array.length];
        for (int i = 0; i < array2.length; ++i) {
            Properties properties = array[i];
            if (properties == null) {
                properties = array[0];
            }
            if (properties != null) {
                array2[i] = Class8571.method28933(properties.getProperty("weight", null), 1);
            }
            else {
                array2[i] = 1;
            }
        }
        return array2;
    }
    
    private static int method34083(final int[] array) {
        final int nextInt = Class9243.field39641.nextInt(Class8500.method28404(array));
        int n = 0;
        for (int i = 0; i < array.length; ++i) {
            n += array[i];
            if (n > nextInt) {
                return i;
            }
        }
        return array.length - 1;
    }
    
    static {
        Class9243.field39640 = null;
        field39641 = new Random();
    }
}
