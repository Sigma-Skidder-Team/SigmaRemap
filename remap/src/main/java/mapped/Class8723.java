// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class8723 extends Class8724
{
    private final double field36642;
    private final double field36643;
    private String field36644;
    
    public Class8723(final Class8725 class8725, final String s, final double n, final double field36642, final double field36643) {
        super(class8725, s, n);
        this.field36642 = field36642;
        this.field36643 = field36643;
        if (field36642 > field36643) {
            throw new IllegalArgumentException("Minimum value cannot be bigger than maximum value!");
        }
        if (n < field36642) {
            throw new IllegalArgumentException("Default value cannot be lower than minimum value!");
        }
        if (n <= field36643) {
            return;
        }
        throw new IllegalArgumentException("Default value cannot be bigger than maximum value!");
    }
    
    public Class8723 method29975(final String field36644) {
        this.field36644 = field36644;
        return this;
    }
    
    public String method29976() {
        return this.field36644;
    }
    
    @Override
    public double method29977(double method35654) {
        method35654 = MathHelper.clamp(method35654, this.field36642, this.field36643);
        return method35654;
    }
}
