// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Properties;
import java.util.List;
import java.util.ArrayList;

public class Class8929
{
    private static Class6332[] field37531;
    public static boolean field37532;
    
    public static Class6332 method31486(final Class1855 class1855, final Class7096 class1856, final BlockPos class1857) {
        if (Class8929.field37531 == null) {
            return null;
        }
        if (!class1856.method21722(class1855, class1857)) {
            final int method21691 = class1856.method21691();
            return (method21691 > 0 && method21691 < Class8929.field37531.length) ? Class8929.field37531[method21691] : null;
        }
        return null;
    }
    
    public static void method31487() {
        Class8929.field37531 = null;
        Class8929.field37532 = false;
        final ArrayList list = new ArrayList();
        final String s = "optifine/block.properties";
        final Properties method32784 = Class9084.method32784(s, "CustomBlockLayers");
        if (method32784 != null) {
            method31488(s, method32784, list);
        }
        if (Config.method28955()) {
            final Class27 method32785 = Class3660.method11285();
            if (method32785 != null) {
                method31488("shaders/block.properties", method32785, list);
            }
        }
        if (!list.isEmpty()) {
            Class8929.field37531 = (Class6332[])list.toArray(new Class6332[list.size()]);
            Class8929.field37532 = true;
        }
    }
    
    private static void method31488(final String str, final Properties properties, final List<Class6332> list) {
        Config.method28847("CustomBlockLayers: " + str);
        method31489("solid", Class9484.field40759, properties, list);
        method31489("cutout", Class9484.field40761, properties, list);
        method31489("cutout_mipped", Class9484.field40760, properties, list);
        method31489("translucent", Class9484.field40762, properties, list);
    }
    
    private static void method31489(final String s, final Class6332 class6332, final Properties properties, final List<Class6332> list) {
        final String property = properties.getProperty("layer." + s);
        if (property != null) {
            final Class8802[] method29442 = new Class8652("CustomBlockLayers").method29442(property);
            if (method29442 != null) {
                for (int i = 0; i < method29442.length; ++i) {
                    final int method29443 = method29442[i].method30709();
                    if (method29443 > 0) {
                        while (list.size() < method29443 + 1) {
                            list.add(null);
                        }
                        if (list.get(method29443) != null) {
                            Config.warn("CustomBlockLayers: Block layer is already set, block: " + method29443 + ", layer: " + s);
                        }
                        list.set(method29443, class6332);
                    }
                }
            }
        }
    }
    
    public static boolean method31490() {
        return Class8929.field37532;
    }
    
    static {
        Class8929.field37531 = null;
        Class8929.field37532 = false;
    }
}
