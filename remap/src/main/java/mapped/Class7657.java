// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.InputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Class7657
{
    private static Class9497[] field30395;
    
    public static void method24258() {
        Class7657.field30395 = new Class9497[0];
        if (Class8571.method28950()) {
            final String str = "optifine/natural.properties";
            try {
                final Class1932 class1932 = new Class1932(str);
                if (!Class8571.method28900(class1932)) {
                    Class8571.method28847("NaturalTextures: configuration \"" + str + "\" not found");
                    return;
                }
                final boolean method28906 = Class8571.method28906(class1932);
                final InputStream method28907 = Class8571.method28897(class1932);
                final ArrayList list = new ArrayList(256);
                final String method28908 = Class8571.method28959(method28907);
                method28907.close();
                final String[] method28909 = Class8571.method28937(method28908, "\n\r");
                if (method28906) {
                    Class8571.method28847("Natural Textures: Parsing default configuration \"" + str + "\"");
                    Class8571.method28847("Natural Textures: Valid only for textures from default resource pack");
                }
                else {
                    Class8571.method28847("Natural Textures: Parsing configuration \"" + str + "\"");
                }
                int i = 0;
                final Class1774 method28910 = Class8969.method31825();
                for (int j = 0; j < method28909.length; ++j) {
                    final String trim = method28909[j].trim();
                    if (!trim.startsWith("#")) {
                        final String[] method28911 = Class8571.method28937(trim, "=");
                        if (method28911.length != 2) {
                            Class8571.method28848("Natural Textures: Invalid \"" + str + "\" line: " + trim);
                        }
                        else {
                            final String trim2 = method28911[0].trim();
                            final String trim3 = method28911[1].trim();
                            final Class1912 method28912 = method28910.method6346("minecraft:block/" + trim2);
                            if (method28912 == null) {
                                Class8571.method28848("Natural Textures: Texture not found: \"" + str + "\" line: " + trim);
                            }
                            else {
                                final int method28913 = method28912.method7513();
                                if (method28913 < 0) {
                                    Class8571.method28848("Natural Textures: Invalid \"" + str + "\" line: " + trim);
                                }
                                else {
                                    if (method28906 && !Class8571.method28906(new Class1932("textures/block/" + trim2 + ".png"))) {
                                        return;
                                    }
                                    final Class9497 element = new Class9497(trim3);
                                    if (element.method35356()) {
                                        while (list.size() <= method28913) {
                                            list.add(null);
                                        }
                                        list.set(method28913, element);
                                        ++i;
                                    }
                                }
                            }
                        }
                    }
                }
                Class7657.field30395 = list.toArray(new Class9497[list.size()]);
                if (i > 0) {
                    Class8571.method28847("NaturalTextures: " + i);
                }
            }
            catch (final FileNotFoundException ex) {
                Class8571.method28848("NaturalTextures: configuration \"" + str + "\" not found");
            }
            catch (final Exception ex2) {
                ex2.printStackTrace();
            }
        }
    }
    
    public static Class8754 method24259(final BlockPos class354, final Class8754 class355) {
        final Class1912 method30295 = class355.method30295();
        if (method30295 == null) {
            return class355;
        }
        final Class9497 method30296 = method24260(method30295);
        if (method30296 != null) {
            final int method30297 = Class8571.method28968(class354, Class7970.method25840(class355.method30294()));
            int n = 0;
            boolean b = false;
            if (method30296.field40850 > 1) {
                n = (method30297 & 0x3);
            }
            if (method30296.field40850 == 2) {
                n = n / 2 * 2;
            }
            if (method30296.field40851) {
                b = ((method30297 & 0x4) != 0x0);
            }
            return method30296.method35357(class355, n, b);
        }
        return class355;
    }
    
    public static Class9497 method24260(final Class1912 class1912) {
        if (!(class1912 instanceof Class1912)) {
            return null;
        }
        final int method7513 = class1912.method7513();
        if (method7513 >= 0 && method7513 < Class7657.field30395.length) {
            return Class7657.field30395[method7513];
        }
        return null;
    }
    
    static {
        Class7657.field30395 = new Class9497[0];
    }
}
