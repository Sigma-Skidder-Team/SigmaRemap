// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ConcurrentHashMap;
import io.netty.buffer.ByteBuf;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Class9282
{
    private static final Map<String, Integer> field39818;
    
    public static void method34264(final List<Class74> list, final Class6108 class6108) {
        for (final Class74 obj : list) {
            try {
                if (!obj.method418("id")) {
                    throw new Exception("NBT tag not handled because the id key is missing");
                }
                final String str = (String)obj.method419("id").method374();
                if (!Class9282.field39818.containsKey(str)) {
                    throw new Exception("Not handled id: " + str);
                }
                final int intValue = Class9282.field39818.get(str);
                if (intValue == -1) {
                    continue;
                }
                method34265(new Class8322((long)(int)obj.method419("x").method374(), (long)(int)obj.method419("y").method374(), (long)(int)obj.method419("z").method374()), (short)intValue, obj, class6108);
            }
            catch (final Exception ex) {
                if (!Class8563.method28794().method33559()) {
                    continue;
                }
                Class8563.method28793().method34742().warning("Block Entity: " + ex.getMessage() + ": " + obj);
            }
        }
    }
    
    private static void method34265(final Class8322 class8322, final short s, final Class74 class8323, final Class6108 class8324) throws Exception {
        final Class8699 class8325 = new Class8699(9, null, class8324);
        class8325.method29823(Class5260.field22318, class8322);
        class8325.method29823(Class5260.field22292, s);
        class8325.method29823(Class5260.field22322, class8323);
        class8325.method29830(Class5230.class, false);
    }
    
    public static Map<String, Integer> method34266() {
        return Class9282.field39818;
    }
    
    static {
        (field39818 = new ConcurrentHashMap<String, Integer>()).put("MobSpawner", 1);
        Class9282.field39818.put("Control", 2);
        Class9282.field39818.put("Beacon", 3);
        Class9282.field39818.put("Skull", 4);
        Class9282.field39818.put("FlowerPot", 5);
        Class9282.field39818.put("Banner", 6);
        Class9282.field39818.put("UNKNOWN", 7);
        Class9282.field39818.put("EndGateway", 8);
        Class9282.field39818.put("Sign", 9);
    }
}
