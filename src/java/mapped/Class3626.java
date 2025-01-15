// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;

public class Class3626<T extends Class763 & Class768> extends Class3446
{
    private static String[] field16845;
    private final T field16846;
    private final double field16847;
    private int field16848;
    private final float field16849;
    private int field16850;
    private int field16851;
    private boolean field16852;
    private boolean field16853;
    private int field16854;
    
    public Class3626(final T field16846, final double field16847, final int field16848, final float n) {
        this.field16850 = -1;
        this.field16854 = -1;
        this.field16846 = field16846;
        this.field16847 = field16847;
        this.field16848 = field16848;
        this.field16849 = n * n;
        this.method11019(EnumSet.of(Class2139.field12580, Class2139.field12581));
    }
    
    public void method11163(final int field16848) {
        this.field16848 = field16848;
    }
    
    @Override
    public boolean method11013() {
        return this.field16846.method4152() != null && this.method11164();
    }
    
    public boolean method11164() {
        return this.field16846.method4218(Class7739.field31279);
    }
    
    @Override
    public boolean method11017() {
        if (this.method11013() || !this.field16846.method4150().method24731()) {
            if (this.method11164()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void method11015() {
        super.method11015();
        this.field16846.method4213(true);
    }
    
    @Override
    public void method11018() {
        super.method11018();
        this.field16846.method4213(false);
        this.field16851 = 0;
        this.field16850 = -1;
        this.field16846.method2770();
    }
    
    @Override
    public void method11016() {
        final Class511 method4152 = this.field16846.method4152();
        if (method4152 != null) {
            final double method4153 = this.field16846.method1733(method4152.method1938(), method4152.method1941(), method4152.method1945());
            final boolean method4154 = this.field16846.method4151().method34143(method4152);
            if (method4154 != this.field16851 > 0) {
                this.field16851 = 0;
            }
            if (!method4154) {
                --this.field16851;
            }
            else {
                ++this.field16851;
            }
            if (method4153 <= this.field16849 && this.field16851 >= 20) {
                this.field16846.method4150().method24733();
                ++this.field16854;
            }
            else {
                this.field16846.method4150().method24725(method4152, this.field16847);
                this.field16854 = -1;
            }
            if (this.field16854 >= 20) {
                if (this.field16846.method2633().nextFloat() < 0.3) {
                    this.field16852 = !this.field16852;
                }
                if (this.field16846.method2633().nextFloat() < 0.3) {
                    this.field16853 = !this.field16853;
                }
                this.field16854 = 0;
            }
            if (this.field16854 <= -1) {
                this.field16846.method4147().method24667(method4152, 30.0f, 30.0f);
            }
            else {
                if (method4153 <= this.field16849 * 0.75f) {
                    if (method4153 < this.field16849 * 0.25f) {
                        this.field16853 = true;
                    }
                }
                else {
                    this.field16853 = false;
                }
                this.field16846.method4148().method19908(this.field16853 ? -0.5f : 0.5f, this.field16852 ? 0.5f : -0.5f);
                this.field16846.method4176(method4152, 30.0f, 30.0f);
            }
            if (!this.field16846.method2756()) {
                if (--this.field16850 <= 0) {
                    if (this.field16851 >= -60) {
                        this.field16846.method2762(Class7476.method23100(this.field16846, Class7739.field31279));
                    }
                }
            }
            else if (!method4154 && this.field16851 < -60) {
                this.field16846.method2770();
            }
            else if (method4154) {
                final int method4155 = this.field16846.method2768();
                if (method4155 >= 20) {
                    this.field16846.method2770();
                    this.field16846.method4252(method4152, Class4087.method12318(method4155));
                    this.field16850 = this.field16848;
                }
            }
        }
    }
}
