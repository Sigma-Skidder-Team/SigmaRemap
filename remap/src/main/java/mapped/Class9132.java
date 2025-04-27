// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

import java.io.InputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Class9132
{
    private static Class6741[][] field38704;
    
    public static void method33152() {
        Class9132.field38704 = null;
    }
    
    public static void method33153() {
        method33152();
        if (Config.method28946()) {
            Class9132.field38704 = method33154("optifine");
            if (Class9132.field38704 == null) {
                Class9132.field38704 = method33154("mcpatcher");
            }
        }
    }
    
    private static Class6741[][] method33154(final String str) {
        final Class6741[][] array = new Class6741[10][0];
        final String string = str + "/sky/world";
        int n = -1;
        for (int i = 0; i < array.length; ++i) {
            final String string2 = string + i;
            final ArrayList list = new ArrayList();
            for (int j = 0; j < 1000; ++j) {
                final String string3 = string2 + "/sky" + j + ".properties";
                int n2 = 0;
                try {
                    final InputStream method28897 = Config.method28897(new ResourceLocation(string3));
                    if (method28897 == null && ++n2 > 10) {
                        break;
                    }
                    final Class27 class27 = new Class27();
                    class27.load(method28897);
                    method28897.close();
                    Config.method28847("CustomSky properties: " + string3);
                    final Class6741 class28 = new Class6741(class27, j + ".png");
                    if (class28.method20517(string3)) {
                        final ResourceLocation obj = new ResourceLocation(Class9518.method35529(class28.field26502, ".png"));
                        final Class1666 method28898 = Class8969.method31823(obj);
                        if (method28898 == null) {
                            Config.method28852("CustomSky: Texture not found: " + obj);
                        }
                        else {
                            class28.field26520 = method28898.method5869();
                            list.add(class28);
                            method28897.close();
                        }
                    }
                }
                catch (final FileNotFoundException ex) {
                    if (++n2 > 10) {
                        break;
                    }
                    goto Label_0352;
                }
                catch (final IOException ex2) {
                    ex2.printStackTrace();
                }
            }
            if (list.size() > 0) {
                array[i] = (Class6741[])list.toArray(new Class6741[list.size()]);
                n = i;
            }
        }
        if (n < 0) {
            return null;
        }
        final Class6741[][] array2 = new Class6741[n + 1][0];
        System.arraycopy(array, 0, array2, 0, array2.length);
        return array2;
    }
    
    public static void method33155(final World class1847, final Class1663 class1848, final MatrixStack class1849, final float n) {
        if (Class9132.field38704 != null) {
            final int method1270 = class1847.dimension.getType().method1270();
            if (method1270 >= 0) {
                if (method1270 < Class9132.field38704.length) {
                    final Class6741[] array = Class9132.field38704[method1270];
                    if (array != null) {
                        final int n2 = (int)(class1847.method6755() % 24000L);
                        final float method1271 = class1847.method6952(n);
                        final float method1272 = class1847.method6768(n);
                        float method1273 = class1847.method6766(n);
                        if (method1272 > 0.0f) {
                            method1273 /= method1272;
                        }
                        for (int i = 0; i < array.length; ++i) {
                            final Class6741 class1850 = array[i];
                            if (class1850.method20525(class1847, n2)) {
                                class1850.method20519(class1847, class1849, n2, method1271, method1272, method1273);
                            }
                        }
                        Class9540.method35617(1.0f - method1272);
                    }
                }
            }
        }
    }
    
    public static boolean method33156(final World class1847) {
        if (Class9132.field38704 == null) {
            return false;
        }
        final int method1270 = class1847.dimension.getType().method1270();
        if (method1270 >= 0 && method1270 < Class9132.field38704.length) {
            final Class6741[] array = Class9132.field38704[method1270];
            return array != null && array.length > 0;
        }
        return false;
    }
    
    static {
        Class9132.field38704 = null;
    }
}
