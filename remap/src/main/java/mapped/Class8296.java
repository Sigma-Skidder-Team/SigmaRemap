// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

import java.util.Random;

public class Class8296
{
    private static String[] field34100;
    private double field34101;
    private double field34102;
    
    public double method27565(final Class8296 class8296) {
        final double n = this.field34101 - class8296.field34101;
        final double n2 = this.field34102 - class8296.field34102;
        return Math.sqrt(n * n + n2 * n2);
    }
    
    public void method27566() {
        final double n = this.method27567();
        this.field34101 /= n;
        this.field34102 /= n;
    }
    
    public float method27567() {
        return MathHelper.sqrt(this.field34101 * this.field34101 + this.field34102 * this.field34102);
    }
    
    public void method27568(final Class8296 class8296) {
        this.field34101 -= class8296.field34101;
        this.field34102 -= class8296.field34102;
    }
    
    public boolean method27569(final double field34101, final double field34102, final double field34103, final double field34104) {
        boolean b = false;
        if (this.field34101 >= field34101) {
            if (this.field34101 > field34103) {
                this.field34101 = field34103;
                b = true;
            }
        }
        else {
            this.field34101 = field34101;
            b = true;
        }
        if (this.field34102 >= field34102) {
            if (this.field34102 > field34104) {
                this.field34102 = field34104;
                b = true;
            }
        }
        else {
            this.field34102 = field34102;
            b = true;
        }
        return b;
    }
    
    public int method27570(final Class1855 class1855) {
        BlockPos method1139 = new BlockPos(this.field34101, 256.0, this.field34102);
        while (method1139.getY() > 0) {
            method1139 = method1139.method1139();
            if (class1855.method6701(method1139).method21706()) {
                continue;
            }
            return method1139.getY() + 1;
        }
        return 257;
    }
    
    public boolean method27571(final Class1855 class1855) {
        BlockPos method1139 = new BlockPos(this.field34101, 256.0, this.field34102);
        while (method1139.getY() > 0) {
            method1139 = method1139.method1139();
            final Class7096 method1140 = class1855.method6701(method1139);
            if (method1140.method21706()) {
                continue;
            }
            final Class8059 method1141 = method1140.method21697();
            return !method1141.method26438() && method1141 != Class8059.field33165;
        }
        return false;
    }
    
    public void method27572(final Random random, final double n, final double n2, final double n3, final double n4) {
        this.field34101 = MathHelper.method35660(random, n, n3);
        this.field34102 = MathHelper.method35660(random, n2, n4);
    }
}
