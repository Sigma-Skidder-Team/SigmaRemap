// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

import java.util.Random;

public class Class8086
{
    private static String[] field33306;
    private final Random field33307;
    private final Class869 field33308;
    private Class6834 field33309;
    private int field33310;
    
    public Class8086(final Class869 field33308) {
        this.field33307 = new Random();
        this.field33310 = 100;
        this.field33308 = field33308;
    }
    
    public void method26545() {
        final Class264 method5300 = this.field33308.method5300();
        if (this.field33309 != null) {
            if (!method5300.method904().method25124().equals(this.field33309.method20920())) {
                this.field33308.method5299().method6431(this.field33309);
                this.field33310 = MathHelper.method35658(this.field33307, 0, method5300.method905() / 2);
            }
            if (!this.field33308.method5299().method6432(this.field33309)) {
                this.field33309 = null;
                this.field33310 = Math.min(MathHelper.method35658(this.field33307, method5300.method905(), method5300.method906()), this.field33310);
            }
        }
        this.field33310 = Math.min(this.field33310, method5300.method906());
        if (this.field33309 == null) {
            if (this.field33310-- <= 0) {
                this.method26546(method5300);
            }
        }
    }
    
    public void method26546(final Class264 class264) {
        this.field33309 = Class6836.method20935(class264.method904());
        this.field33308.method5299().method6422(this.field33309);
        this.field33310 = Integer.MAX_VALUE;
    }
    
    public void method26547() {
        if (this.field33309 != null) {
            this.field33308.method5299().method6431(this.field33309);
            this.field33309 = null;
            this.field33310 = 0;
        }
    }
    
    public boolean method26548(final Class264 class264) {
        return this.field33309 != null && class264.method904().method25124().equals(this.field33309.method20920());
    }
}
