// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;

public class Class3623 extends Class3617
{
    private static String[] field16832;
    private int field16833;
    public final /* synthetic */ Class798 field16834;
    
    public Class3623(final Class798 field16834) {
        this.field16834 = field16834;
        super(field16834, null);
        this.field16833 = this.field16834.world.rand.nextInt(10);
        this.method11019(EnumSet.of(Class2139.field12580));
    }
    
    @Override
    public boolean method11137() {
        if (Class798.method4561(this.field16834) != null) {
            if (!this.field16834.method4201()) {
                if (this.method11162()) {
                    if (Class798.method4562(this.field16834, Class798.method4561(this.field16834))) {
                        if (!Class798.method4550(this.field16834, Class798.method4561(this.field16834), 2)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean method11138() {
        return this.method11137();
    }
    
    @Override
    public void method11015() {
        this.field16833 = 0;
        super.method11015();
    }
    
    @Override
    public void method11018() {
        this.field16833 = 0;
        Class798.method4563(this.field16834).method24733();
        Class798.method4564(this.field16834).method24712();
    }
    
    @Override
    public void method11016() {
        if (Class798.method4561(this.field16834) != null) {
            ++this.field16833;
            if (this.field16833 <= 600) {
                if (!Class798.method4566(this.field16834).method24732()) {
                    if (!Class798.method4551(this.field16834, Class798.method4561(this.field16834))) {
                        Class798.method4552(this.field16834, Class798.method4561(this.field16834));
                    }
                    else {
                        Class798.method4565(this.field16834, null);
                    }
                }
            }
            else {
                Class798.method4565(this.field16834, null);
            }
        }
    }
    
    private boolean method11162() {
        return Class798.method4567(this.field16834) > 2400;
    }
}
