// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

import java.util.EnumSet;

public class Class3595<T extends Class763 & Class768 & Class774> extends Class3446
{
    private static String[] field16744;
    private final T field16745;
    private Class1977 field16746;
    private final double field16747;
    private final float field16748;
    private int field16749;
    private int field16750;
    
    public Class3595(final T field16745, final double field16746, final float n) {
        this.field16746 = Class1977.field10959;
        this.field16745 = field16745;
        this.field16747 = field16746;
        this.field16748 = n * n;
        this.method11019(EnumSet.of(Class2139.field12580, Class2139.field12581));
    }
    
    @Override
    public boolean method11013() {
        return this.method11125() && this.method11124();
    }
    
    private boolean method11124() {
        return this.field16745.method4218(Items.field31611);
    }
    
    @Override
    public boolean method11017() {
        if (this.method11125()) {
            if (this.method11013() || !this.field16745.method4150().method24731()) {
                if (this.method11124()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean method11125() {
        return this.field16745.method4152() != null && this.field16745.method4152().isAlive();
    }
    
    @Override
    public void method11018() {
        super.method11018();
        this.field16745.method4213(false);
        this.field16745.method4153(null);
        this.field16749 = 0;
        if (this.field16745.method2756()) {
            this.field16745.method2770();
            this.field16745.method4280(false);
            Class4086.method12297(this.field16745.method2766(), false);
        }
    }
    
    @Override
    public void method11016() {
        final LivingEntity method4152 = this.field16745.method4152();
        if (method4152 != null) {
            final boolean method4153 = this.field16745.method4151().method34143(method4152);
            if (method4153 != this.field16749 > 0) {
                this.field16749 = 0;
            }
            if (!method4153) {
                --this.field16749;
            }
            else {
                ++this.field16749;
            }
            boolean b = false;
            Label_0137: {
                if (this.field16745.method1734(method4152) > this.field16748 || this.field16749 < 5) {
                    if (this.field16750 == 0) {
                        b = true;
                        break Label_0137;
                    }
                }
                b = false;
            }
            final boolean b2 = b;
            if (!b2) {
                this.field16745.method4150().method24733();
            }
            else {
                this.field16745.method4150().method24725(method4152, this.method11126() ? this.field16747 : (this.field16747 * 0.5));
            }
            this.field16745.method4147().method24667(method4152, 30.0f, 30.0f);
            if (this.field16746 != Class1977.field10959) {
                if (this.field16746 != Class1977.field10960) {
                    if (this.field16746 != Class1977.field10961) {
                        if (this.field16746 == Class1977.field10962) {
                            if (method4153) {
                                this.field16745.method4252(method4152, 1.0f);
                                Class4086.method12297(this.field16745.method2715(Class7476.method23100(this.field16745, Items.field31611)), false);
                                this.field16746 = Class1977.field10959;
                            }
                        }
                    }
                    else {
                        --this.field16750;
                        if (this.field16750 == 0) {
                            this.field16746 = Class1977.field10962;
                        }
                    }
                }
                else {
                    if (!this.field16745.method2756()) {
                        this.field16746 = Class1977.field10959;
                    }
                    if (this.field16745.method2768() >= Class4086.method12308(this.field16745.method2766())) {
                        this.field16745.method2769();
                        this.field16746 = Class1977.field10961;
                        this.field16750 = 20 + this.field16745.method2633().nextInt(20);
                        this.field16745.method4280(false);
                    }
                }
            }
            else if (!b2) {
                this.field16745.method2762(Class7476.method23100(this.field16745, Items.field31611));
                this.field16746 = Class1977.field10960;
                this.field16745.method4280(true);
            }
        }
    }
    
    private boolean method11126() {
        return this.field16746 == Class1977.field10959;
    }
}
