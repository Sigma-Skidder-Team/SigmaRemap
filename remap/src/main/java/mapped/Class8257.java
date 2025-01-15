// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class8257
{
    private static String[] field33906;
    
    public static float method27401(final float n, final float n2, final float n3) {
        return n * (1.0f - MathHelper.clamp(n2 - n / (2.0f + n3 / 4.0f), n2 * 0.2f, 20.0f) / 25.0f);
    }
    
    public static float method27402(final float n, final float n2) {
        return n * (1.0f - MathHelper.clamp(n2, 0.0f, 20.0f) / 25.0f);
    }
}
