// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class7852
{
    private static String[] field32154;
    
    public static int method25388(final Class8974 class8974) {
        final Class8199[] method7014 = class8974.method31895().method7014();
        if (method7014 != null) {
            final Class8199 class8975 = method7014[class8974.method31873().getY() >> 4];
            return (class8975 != null) ? class8975.method27166() : 0;
        }
        return 0;
    }
    
    public static double method25389(final Class8974 class8974) {
        return method25390(method25388(class8974));
    }
    
    public static double method25390(final int n) {
        final double method35654 = MathHelper.method35654(n / 4096.0 * 0.995 * 2.0 - 1.0, -1.0, 1.0);
        return MathHelper.sqrt(1.0 - method35654 * method35654);
    }
}
