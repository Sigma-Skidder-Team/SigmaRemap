// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.util.UUID;

public class Class8876
{
    private static String[] field37312;
    
    public static Class1849 method31206() {
        final Class869 method28894 = Class8571.method28894();
        final Class1848 field4683 = method28894.field4683;
        if (field4683 == null) {
            return null;
        }
        if (!method28894.method5283()) {
            return null;
        }
        final Class1655 method28895 = method28894.method5285();
        if (method28895 == null) {
            return null;
        }
        final Class6737 field4684 = field4683.field10063;
        if (field4684 == null) {
            return null;
        }
        final Class383 method28896 = field4684.method20487();
        try {
            return method28895.method1481(method28896);
        }
        catch (final NullPointerException ex) {
            return null;
        }
    }
    
    public static Entity method31207(final UUID uuid) {
        final Class1849 method31206 = method31206();
        if (method31206 != null) {
            return method31206.method6914(uuid);
        }
        return null;
    }
    
    public static Class436 method31208(final BlockPos class354) {
        final Class1849 method31206 = method31206();
        if (method31206 == null) {
            return null;
        }
        final Class1860 method31207 = method31206.method6904().method7402(class354.getX() >> 4, class354.getZ() >> 4, Class9312.field39989, false);
        if (method31207 != null) {
            return method31207.method6727(class354);
        }
        return null;
    }
}
