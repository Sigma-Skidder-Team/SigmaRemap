// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;

public class Class3481 extends Class3479
{
    private static String[] field16402;
    private final Class800 field16403;
    
    public Class3481(final Class800 field16403, final double n, final int n2) {
        super(field16403, n, n2, 6);
        this.field16403 = field16403;
        this.field16399 = -2;
        this.method11019(EnumSet.of(Class2139.field12582, Class2139.field12580));
    }
    
    @Override
    public boolean method11013() {
        if (this.field16403.method4480()) {
            if (!this.field16403.method4483()) {
                if (!this.field16403.method4610()) {
                    if (super.method11013()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public void method11015() {
        super.method11015();
        this.field16403.method4490().method11058(false);
    }
    
    @Override
    public int method11044(final Class787 class787) {
        return 40;
    }
    
    @Override
    public void method11018() {
        super.method11018();
        this.field16403.method4609(false);
    }
    
    @Override
    public void method11016() {
        super.method11016();
        this.field16403.method4490().method11058(false);
        if (this.method11048()) {
            if (!this.field16403.method4610()) {
                this.field16403.method4609(true);
            }
        }
        else {
            this.field16403.method4609(false);
        }
    }
    
    @Override
    public boolean method11050(final Class1852 class1852, final BlockPos class1853) {
        return class1852.method6961(class1853.method1137()) && class1852.method6701(class1853).method21696().method11785(Class7188.field27910);
    }
}
