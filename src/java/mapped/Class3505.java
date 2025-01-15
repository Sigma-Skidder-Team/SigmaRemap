// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;

public class Class3505 extends Class3446
{
    private static String[] field16481;
    public int field16482;
    public final /* synthetic */ Class803 field16483;
    
    public Class3505(final Class803 field16483) {
        this.field16483 = field16483;
        this.method11019(EnumSet.of(Class2139.field12581, Class2139.field12582, Class2139.field12580));
    }
    
    @Override
    public boolean method11013() {
        return this.field16483.method4656();
    }
    
    @Override
    public boolean method11017() {
        return this.method11013() && this.field16482 > 0;
    }
    
    @Override
    public void method11015() {
        this.field16482 = 40;
    }
    
    @Override
    public void method11018() {
        Class803.method4694(this.field16483, false);
    }
    
    @Override
    public void method11016() {
        --this.field16482;
    }
}
