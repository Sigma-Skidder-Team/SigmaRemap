// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public final class Class9434
{
    public static String method35057(final Class1948 class1948, final float n) {
        if (!class1948.method7921()) {
            return Class8272.method27498(MathHelper.method35642(class1948.method7907() * n));
        }
        return "**:**";
    }
    
    public static boolean method35058(final Class511 class511) {
        return class511.method2653(Class9439.field40476) || class511.method2653(Class9439.field40502);
    }
    
    public static int method35059(final Class511 class511) {
        int method7908 = 0;
        int method7909 = 0;
        if (class511.method2653(Class9439.field40476)) {
            method7908 = class511.method2654(Class9439.field40476).method7908();
        }
        if (class511.method2653(Class9439.field40502)) {
            method7909 = class511.method2654(Class9439.field40502).method7908();
        }
        return Math.max(method7908, method7909);
    }
    
    public static boolean method35060(final Class511 class511) {
        return class511.method2653(Class9439.field40486) || class511.method2653(Class9439.field40502);
    }
}
