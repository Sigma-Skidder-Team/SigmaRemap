// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class9472
{
    private static String[] field40729;
    private final Minecraft field40730;
    private final Class8065 field40731;
    private float field40732;
    
    public Class9472(final Class8065 field40731) {
        this.field40731 = field40731;
        this.field40730 = Minecraft.getInstance();
    }
    
    public void method35257(final float n, final float n2) {
        this.field40732 += n;
        this.field40731.method26461(this.field40730, MathHelper.sin(this.field40732 * 0.001f) * 5.0f + 25.0f, -this.field40732 * 0.1f, n2);
    }
}
