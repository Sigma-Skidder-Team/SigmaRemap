// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Set;
import java.io.InputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Map;

public class Class8880
{
    private static String field37349;
    private static String field37350;
    private static boolean field37351;
    private static boolean field37352;
    private static boolean field37353;
    private static boolean field37354;
    private static float field37355;
    private static float field37356;
    private static final String field37357 = ".png";
    private static final ResourceLocation field37358;
    
    public static boolean method31235() {
        return Class8880.field37351;
    }
    
    public static String method31236() {
        return Class8880.field37349;
    }
    
    public static void method31237() {
        Class8880.field37352 = true;
        Class8880.field37353 = false;
    }
    
    public static Class1666 method31238(final Class1666 class1666, final Map<ResourceLocation, Class1666> map) {
        if (!Class8880.field37352) {
            return class1666;
        }
        if (!(class1666 instanceof Class1767)) {
            return class1666;
        }
        ResourceLocation class1667 = ((Class1767)class1666).field9832;
        if (Class8880.field37354) {
            if (class1667 == null) {
                class1667 = Class8880.field37358;
            }
            Class1666 class1668 = map.get(class1667);
            if (class1668 == null) {
                class1668 = new Class1767(class1667);
                Config.method28895().method5851(class1667, class1668);
            }
            return class1668;
        }
        if (class1667 != null) {
            Class8880.field37353 = true;
        }
        return class1666;
    }
    
    public static boolean method31239() {
        return Class8880.field37353;
    }
    
    public static void method31240() {
        Class8880.field37355 = Class8933.field37574;
        Class8933.method31566(33986, 240.0f, Class8880.field37356 = Class8933.field37575);
        Class8880.field37354 = true;
    }
    
    public static void method31241() {
        Class8880.field37354 = false;
        Class8933.method31566(33986, Class8880.field37355, Class8880.field37356);
    }
    
    public static void method31242() {
        Class8880.field37352 = false;
        Class8880.field37353 = false;
    }
    
    public static void method31243() {
        Class8880.field37351 = false;
        Class8880.field37349 = null;
        Class8880.field37350 = null;
        if (Config.method28951()) {
            try {
                final String str = "optifine/emissive.properties";
                final InputStream method28897 = Config.method28897(new ResourceLocation(str));
                if (method28897 == null) {
                    return;
                }
                method31246("Loading " + str);
                final Class27 class27 = new Class27();
                class27.load(method28897);
                method28897.close();
                Class8880.field37349 = class27.getProperty("suffix.emissive");
                if (Class8880.field37349 != null) {
                    Class8880.field37350 = Class8880.field37349 + ".png";
                }
                Class8880.field37351 = (Class8880.field37349 != null);
            }
            catch (final FileNotFoundException ex) {}
            catch (final IOException ex2) {
                ex2.printStackTrace();
            }
        }
    }
    
    public static void method31244(final Class1774 class1774, final Set<ResourceLocation> set) {
        if (Class8880.field37351) {
            final Iterator<ResourceLocation> iterator = set.iterator();
            while (iterator.hasNext()) {
                method31245(class1774, iterator.next());
            }
        }
    }
    
    private static void method31245(final Class1774 class1774, final ResourceLocation class1775) {
        final String method31236 = method31236();
        if (method31236 != null) {
            if (!class1775.method7797().endsWith(method31236)) {
                final ResourceLocation class1776 = new ResourceLocation(class1775.method7798(), class1775.method7797() + method31236);
                if (Config.method28900(class1774.method6336(class1776))) {
                    final Class1912 method31237 = class1774.method6359(class1775);
                    final Class1912 method31238 = class1774.method6359(class1776);
                    method31238.field10395 = true;
                    method31237.field10394 = method31238;
                }
            }
        }
    }
    
    private static void method31246(final String str) {
        Config.method28847("EmissiveTextures: " + str);
    }
    
    private static void method31247(final String str) {
        Config.warn("EmissiveTextures: " + str);
    }
    
    public static boolean method31248(final ResourceLocation class1932) {
        return Class8880.field37350 != null && class1932.method7797().endsWith(Class8880.field37350);
    }
    
    public static void method31249(final ResourceLocation class1932, final Class1767 class1933) {
        if (class1932 != null) {
            if (class1933 != null) {
                class1933.field9833 = false;
                class1933.field9832 = null;
                if (Class8880.field37350 != null) {
                    final String method7797 = class1932.method7797();
                    if (method7797.endsWith(".png")) {
                        if (!method7797.endsWith(Class8880.field37350)) {
                            final ResourceLocation field9832 = new ResourceLocation(class1932.method7798(), method7797.substring(0, method7797.length() - ".png".length()) + Class8880.field37350);
                            if (Config.method28900(field9832)) {
                                class1933.field9832 = field9832;
                            }
                        }
                        else {
                            class1933.field9833 = true;
                        }
                    }
                }
            }
        }
    }
    
    static {
        Class8880.field37349 = null;
        Class8880.field37350 = null;
        Class8880.field37351 = false;
        Class8880.field37352 = false;
        Class8880.field37353 = false;
        Class8880.field37354 = false;
        field37358 = new ResourceLocation("optifine/ctm/default/empty.png");
    }
}
