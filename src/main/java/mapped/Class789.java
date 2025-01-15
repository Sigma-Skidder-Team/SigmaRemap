// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.Random;
import java.util.UUID;

public abstract class Class789 extends Class788
{
    private int field4202;
    private UUID field4203;
    
    public Class789(final Class7499<? extends Class789> class7499, final Class1847 class7500) {
        super(class7499, class7500);
    }
    
    @Override
    public void method4172() {
        if (this.method4351() != 0) {
            this.field4202 = 0;
        }
        super.method4172();
    }
    
    @Override
    public void method2736() {
        super.method2736();
        if (this.method4351() != 0) {
            this.field4202 = 0;
        }
        if (this.field4202 > 0) {
            --this.field4202;
            if (this.field4202 % 10 == 0) {
                this.field2391.method6709(Class8432.field34627, this.method1940(1.0), this.method1943() + 0.5, this.method1947(1.0), this.field2423.nextGaussian() * 0.02, this.field2423.nextGaussian() * 0.02, this.field2423.nextGaussian() * 0.02);
            }
        }
    }
    
    @Override
    public boolean method1740(final Class7929 class7929, final float n) {
        if (!this.method1849(class7929)) {
            this.field4202 = 0;
            return super.method1740(class7929, n);
        }
        return false;
    }
    
    @Override
    public float method4228(final Class354 class354, final Class1852 class355) {
        return (class355.method6701(class354.method1139()).method21696() != Class7521.field29155) ? (class355.method6963(class354) - 0.5f) : 10.0f;
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        class51.method298("InLove", this.field4202);
        if (this.field4203 != null) {
            class51.method300("LoveCause", this.field4203);
        }
    }
    
    @Override
    public double method1776() {
        return 0.14;
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        this.field4202 = class51.method319("InLove");
        this.field4203 = (class51.method302("LoveCause") ? class51.method301("LoveCause") : null);
    }
    
    public static boolean method4356(final Class7499<? extends Class789> class7499, final Class1851 class7500, final Class2101 class7501, final Class354 class7502, final Random random) {
        return class7500.method6701(class7502.method1139()).method21696() == Class7521.field29155 && class7500.method6993(class7502, 0) > 8;
    }
    
    @Override
    public int method4155() {
        return 120;
    }
    
    @Override
    public boolean method4168(final double n) {
        return false;
    }
    
    @Override
    public int method2631(final Class512 class512) {
        return 1 + this.field2391.field10062.nextInt(3);
    }
    
    public boolean method4357(final Class8321 class8321) {
        return class8321.method27622() == Class7739.field31315;
    }
    
    @Override
    public boolean method4195(final Class512 class512, final Class316 class513) {
        final Class8321 method2715 = class512.method2715(class513);
        if (this.method4357(method2715)) {
            if (!this.field2391.field10067) {
                if (this.method4351() == 0) {
                    if (this.method4359()) {
                        this.method4358(class512, method2715);
                        this.method4360(class512);
                        class512.method2708(class513, true);
                        return true;
                    }
                }
            }
            if (this.method2625()) {
                this.method4358(class512, method2715);
                this.method4352((int)(-this.method4351() / 20 * 0.1f), true);
                return true;
            }
        }
        return super.method4195(class512, class513);
    }
    
    public void method4358(final Class512 class512, final Class8321 class513) {
        if (!class512.field3025.field27304) {
            class513.method27693(1);
        }
    }
    
    public boolean method4359() {
        return this.field4202 <= 0;
    }
    
    public void method4360(final Class512 class512) {
        this.field4202 = 600;
        if (class512 != null) {
            this.field4203 = class512.method1865();
        }
        this.field2391.method6761(this, (byte)18);
    }
    
    public void method4361(final int field4202) {
        this.field4202 = field4202;
    }
    
    @Nullable
    public Class513 method4362() {
        if (this.field4203 != null) {
            final Class512 method7143 = this.field2391.method7143(this.field4203);
            return (method7143 instanceof Class513) ? ((Class513)method7143) : null;
        }
        return null;
    }
    
    public boolean method4363() {
        return this.field4202 > 0;
    }
    
    public void method4364() {
        this.field4202 = 0;
    }
    
    public boolean method4365(final Class789 class789) {
        return class789 != this && class789.getClass() == this.getClass() && this.method4363() && class789.method4363();
    }
    
    @Override
    public void method1798(final byte b) {
        if (b != 18) {
            super.method1798(b);
        }
        else {
            for (int i = 0; i < 7; ++i) {
                this.field2391.method6709(Class8432.field34627, this.method1940(1.0), this.method1943() + 0.5, this.method1947(1.0), this.field2423.nextGaussian() * 0.02, this.field2423.nextGaussian() * 0.02, this.field2423.nextGaussian() * 0.02);
            }
        }
    }
}
