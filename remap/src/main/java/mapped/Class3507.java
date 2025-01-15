// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;

public class Class3507 extends Class3446
{
    private final Class759 field16488;
    private final Class768 field16489;
    private Class511 field16490;
    private int field16491;
    private final double field16492;
    private int field16493;
    private final int field16494;
    private final int field16495;
    private final float field16496;
    private final float field16497;
    
    public Class3507(final Class768 class768, final double n, final int n2, final float n3) {
        this(class768, n, n2, n2, n3);
    }
    
    public Class3507(final Class768 field16489, final double field16490, final int field16491, final int field16492, final float field16493) {
        this.field16491 = -1;
        if (field16489 instanceof Class511) {
            this.field16489 = field16489;
            this.field16488 = (Class759)field16489;
            this.field16492 = field16490;
            this.field16494 = field16491;
            this.field16495 = field16492;
            this.field16496 = field16493;
            this.field16497 = field16493 * field16493;
            this.method11019(EnumSet.of(Class2139.field12580, Class2139.field12581));
            return;
        }
        throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
    }
    
    @Override
    public boolean method11013() {
        final Class511 method4152 = this.field16488.method4152();
        if (method4152 != null && method4152.method1768()) {
            this.field16490 = method4152;
            return true;
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        return this.method11013() || !this.field16488.method4150().method24731();
    }
    
    @Override
    public void method11018() {
        this.field16490 = null;
        this.field16493 = 0;
        this.field16491 = -1;
    }
    
    @Override
    public void method11016() {
        final double method1733 = this.field16488.method1733(this.field16490.method1938(), this.field16490.method1941(), this.field16490.method1945());
        final boolean method1734 = this.field16488.method4151().method34143(this.field16490);
        if (!method1734) {
            this.field16493 = 0;
        }
        else {
            ++this.field16493;
        }
        if (method1733 <= this.field16497 && this.field16493 >= 5) {
            this.field16488.method4150().method24733();
        }
        else {
            this.field16488.method4150().method24725(this.field16490, this.field16492);
        }
        this.field16488.method4147().method24667(this.field16490, 30.0f, 30.0f);
        final int field16491 = this.field16491 - 1;
        this.field16491 = field16491;
        if (field16491 != 0) {
            if (this.field16491 < 0) {
                this.field16491 = Class9546.method35642(Class9546.method35641(method1733) / this.field16496 * (this.field16495 - this.field16494) + this.field16494);
            }
        }
        else {
            if (!method1734) {
                return;
            }
            final float n = Class9546.method35641(method1733) / this.field16496;
            this.field16489.method4252(this.field16490, Class9546.method35653(n, 0.1f, 1.0f));
            this.field16491 = Class9546.method35642(n * (this.field16495 - this.field16494) + this.field16494);
        }
    }
}
