// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Class1854 implements Class1855, Class1853
{
    private static String[] field10104;
    public final int field10105;
    public final int field10106;
    public final Class1860[][] field10107;
    public boolean field10108;
    public final World field10109;
    
    public Class1854(final World field10109, final BlockPos class354, final BlockPos class355) {
        this.field10109 = field10109;
        this.field10105 = class354.getX() >> 4;
        this.field10106 = class354.getZ() >> 4;
        final int n = class355.getX() >> 4;
        final int n2 = class355.getZ() >> 4;
        this.field10107 = new Class1860[n - this.field10105 + 1][n2 - this.field10106 + 1];
        final Class1906 method6762 = field10109.method6762();
        this.field10108 = true;
        for (int i = this.field10105; i <= n; ++i) {
            for (int j = this.field10106; j <= n2; ++j) {
                this.field10107[i - this.field10105][j - this.field10106] = method6762.method7399(i, j);
            }
        }
        for (int k = class354.getX() >> 4; k <= class355.getX() >> 4; ++k) {
            for (int l = class354.getZ() >> 4; l <= class355.getZ() >> 4; ++l) {
                final Class1860 class356 = this.field10107[k - this.field10105][l - this.field10106];
                if (class356 != null && !class356.method7023(class354.getY(), class355.getY())) {
                    this.field10108 = false;
                    return;
                }
            }
        }
    }
    
    private Class1860 method6982(final BlockPos class354) {
        return this.method6983(class354.getX() >> 4, class354.getZ() >> 4);
    }
    
    private Class1860 method6983(final int n, final int n2) {
        final int n3 = n - this.field10105;
        final int n4 = n2 - this.field10106;
        if (n3 >= 0) {
            if (n3 < this.field10107.length) {
                if (n4 >= 0) {
                    if (n4 < this.field10107[n3].length) {
                        final Class1860 class1860 = this.field10107[n3][n4];
                        return (class1860 == null) ? new Class1864(this.field10109, new Class7859(n, n2)) : class1860;
                    }
                }
            }
        }
        return new Class1864(this.field10109, new Class7859(n, n2));
    }
    
    @Override
    public Class9375 method6787() {
        return this.field10109.method6787();
    }
    
    @Override
    public Class1855 method6736(final int n, final int n2) {
        return this.method6983(n, n2);
    }
    
    @Nullable
    @Override
    public Class436 method6727(final BlockPos class354) {
        return this.method6982(class354).method6727(class354);
    }
    
    @Override
    public Class7096 method6701(final BlockPos class354) {
        if (!World.method6683(class354)) {
            return this.method6982(class354).method6701(class354);
        }
        return Class7521.field29147.method11878();
    }
    
    @Override
    public Class7099 method6702(final BlockPos class354) {
        if (!World.method6683(class354)) {
            return this.method6982(class354).method6702(class354);
        }
        return Class7558.field29974.method22148();
    }
}
