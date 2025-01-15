// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class7995
{
    private static String[] field32933;
    private double field32934;
    private double field32935;
    private double field32936;
    
    public double method26160(final double n, final double n2) {
        this.field32934 += n;
        double d = this.field32934 - this.field32935;
        final double method35701 = MathHelper.method35701(0.5, this.field32936, d);
        final double signum = Math.signum(d);
        if (signum * d > signum * this.field32936) {
            d = method35701;
        }
        this.field32936 = method35701;
        this.field32935 += d * n2;
        return d * n2;
    }
    
    public void method26161() {
        this.field32934 = 0.0;
        this.field32935 = 0.0;
        this.field32936 = 0.0;
    }
}
