// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

import javax.annotation.concurrent.Immutable;

@Immutable
public class Class9592
{
    private static String[] field41813;
    private final Class2113 field41814;
    private final float field41815;
    
    public Class9592(final Class2113 field41814, final long n, final long n2, final float n3) {
        this.field41814 = field41814;
        this.field41815 = this.method35976(field41814, n, n2, n3);
    }
    
    public Class2113 method35972() {
        return this.field41814;
    }
    
    public float method35973() {
        return this.field41815;
    }
    
    public boolean method35974(final float n) {
        return this.field41815 > n;
    }
    
    public float method35975() {
        if (this.field41815 >= 2.0f) {
            return (this.field41815 <= 4.0f) ? ((this.field41815 - 2.0f) / 2.0f) : 1.0f;
        }
        return 0.0f;
    }
    
    private float method35976(final Class2113 class2113, final long n, final long n2, final float n3) {
        if (class2113 != Class2113.field12290) {
            final boolean b = class2113 == Class2113.field12293;
            final float n4 = 0.75f;
            final float n5 = MathHelper.method35653((n - 72000.0f) / 1440000.0f, 0.0f, 1.0f) * 0.25f;
            final float n6 = n4 + n5;
            float n7 = 0.0f + MathHelper.method35653(n2 / 3600000.0f, 0.0f, 1.0f) * (b ? 1.0f : 0.75f) + MathHelper.method35653(n3 * 0.25f, 0.0f, n5);
            if (class2113 == Class2113.field12291) {
                n7 *= 0.5f;
            }
            return class2113.method8235() * (n6 + n7);
        }
        return 0.0f;
    }
}
