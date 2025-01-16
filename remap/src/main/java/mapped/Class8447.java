// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

import java.util.Set;
import java.util.LinkedHashMap;
import java.util.Map;

public class Class8447
{
    private static Map<String, Class5509> field34703;
    
    private static Map<String, Class5509> method28187() {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        method28188(linkedHashMap, new Class5544());
        method28188(linkedHashMap, new Class5568());
        method28188(linkedHashMap, new Class5575());
        method28188(linkedHashMap, new Class5537());
        method28188(linkedHashMap, new Class5572());
        method28188(linkedHashMap, new Class5534());
        method28188(linkedHashMap, new Class5518());
        method28188(linkedHashMap, new Class5510());
        method28188(linkedHashMap, new Class5578());
        method28188(linkedHashMap, new Class5535());
        method28188(linkedHashMap, new Class5558());
        method28188(linkedHashMap, new Class5525());
        method28188(linkedHashMap, new Class5551());
        method28188(linkedHashMap, new Class5552());
        method28188(linkedHashMap, new Class5580());
        method28188(linkedHashMap, new Class5541());
        method28188(linkedHashMap, new Class5566());
        method28188(linkedHashMap, new Class5514());
        method28188(linkedHashMap, new Class5564());
        method28188(linkedHashMap, new Class5550());
        method28188(linkedHashMap, new Class5511());
        method28188(linkedHashMap, new Class5556());
        method28188(linkedHashMap, new Class5548());
        method28188(linkedHashMap, new Class5539());
        method28188(linkedHashMap, new Class5589());
        method28188(linkedHashMap, new Class5582());
        method28188(linkedHashMap, new Class5563());
        method28188(linkedHashMap, new Class5571());
        method28188(linkedHashMap, new Class5528());
        method28188(linkedHashMap, new Class5529());
        method28188(linkedHashMap, new Class5530());
        method28188(linkedHashMap, new Class5521());
        method28188(linkedHashMap, new Class5557());
        method28188(linkedHashMap, new Class5533());
        method28188(linkedHashMap, new Class5516());
        method28188(linkedHashMap, new Class5513());
        method28188(linkedHashMap, new Class5565());
        method28188(linkedHashMap, new Class5517());
        method28188(linkedHashMap, new Class5555());
        method28188(linkedHashMap, new Class5519());
        method28188(linkedHashMap, new Class5542());
        method28188(linkedHashMap, new Class5573());
        method28188(linkedHashMap, new Class5527());
        method28188(linkedHashMap, new Class5581());
        method28188(linkedHashMap, new Class5590());
        method28188(linkedHashMap, new Class5577());
        method28188(linkedHashMap, new Class5569());
        method28188(linkedHashMap, new Class5523());
        method28188(linkedHashMap, new Class5562());
        method28188(linkedHashMap, new Class5561());
        method28188(linkedHashMap, new Class5570());
        method28188(linkedHashMap, new Class5547());
        method28188(linkedHashMap, new Class5560());
        method28188(linkedHashMap, new Class5586());
        method28188(linkedHashMap, new Class5512());
        method28188(linkedHashMap, new Class5536());
        method28188(linkedHashMap, new Class5531());
        method28188(linkedHashMap, new Class5553());
        method28188(linkedHashMap, new Class5567());
        method28188(linkedHashMap, new Class5574());
        method28188(linkedHashMap, new Class5520());
        method28188(linkedHashMap, new Class5546());
        method28188(linkedHashMap, new Class5584());
        method28188(linkedHashMap, new Class5540());
        method28188(linkedHashMap, new Class5585());
        method28188(linkedHashMap, new Class5591());
        method28188(linkedHashMap, new Class5545());
        method28188(linkedHashMap, new Class5508());
        method28188(linkedHashMap, new Class5587());
        method28188(linkedHashMap, new Class5549());
        method28188(linkedHashMap, new Class5559());
        method28188(linkedHashMap, new Class5554());
        method28188(linkedHashMap, new Class5522());
        method28188(linkedHashMap, new Class5579());
        method28188(linkedHashMap, new Class5526());
        method28188(linkedHashMap, new Class5532());
        method28188(linkedHashMap, new Class5576());
        method28188(linkedHashMap, new Class5588());
        method28188(linkedHashMap, new Class5524());
        return linkedHashMap;
    }
    
    private static void method28188(final Map<String, Class5509> map, final Class5509 class5509) {
        method28189(map, class5509, class5509.method16816());
        final String[] method16817 = class5509.method16817();
        if (method16817 != null) {
            for (int i = 0; i < method16817.length; ++i) {
                method28189(map, class5509, method16817[i]);
            }
        }
        final Class5901 method16818 = class5509.method16811();
        final String[] method16819 = class5509.method16813();
        for (int j = 0; j < method16819.length; ++j) {
            final String str = method16819[j];
            if (class5509.method16812(method16818, str) == null) {
                Config.warn("Model renderer not found, model: " + class5509.method16816() + ", name: " + str);
            }
        }
    }
    
    private static void method28189(final Map<String, Class5509> map, final Class5509 class5509, final String str) {
        if (map.containsKey(str)) {
            String str2 = "?";
            final Class8651<EntityType, Class5412> method16815 = class5509.method16815();
            if (method16815.method29436().isPresent()) {
                str2 = method16815.method29436().get().method23366();
            }
            if (method16815.method29437().isPresent()) {
                str2 = "" + Class5412.method16520(method16815.method29437().get());
            }
            Config.warn("Model adapter already registered for id: " + str + ", type: " + str2);
        }
        map.put(str, class5509);
    }
    
    public static Class5509 method28190(final String s) {
        return Class8447.field34703.get(s);
    }
    
    public static String[] method28191() {
        final Set<String> keySet = Class8447.field34703.keySet();
        return keySet.toArray(new String[keySet.size()]);
    }
    
    static {
        Class8447.field34703 = method28187();
    }
}
