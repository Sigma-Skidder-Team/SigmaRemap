// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;

public class Class3447 extends Class3446
{
    private static String[] field16272;
    private final Class850 field16273;
    private Class511 field16274;
    
    public Class3447(final Class850 field16273) {
        this.field16273 = field16273;
        this.method11019(EnumSet.of(Class2139.field12582, Class2139.field12580));
    }
    
    @Override
    public boolean method11013() {
        this.field16274 = this.field16273.method4152();
        return this.field16274 instanceof Class512 && this.field16274.method1734(this.field16273) <= 256.0 && Class850.method5085(this.field16273, (Class512)this.field16274);
    }
    
    @Override
    public void method11015() {
        this.field16273.method4150().method24733();
    }
    
    @Override
    public void method11016() {
        this.field16273.method4147().method24668(this.field16274.getPosX(), this.field16274.method1944(), this.field16274.getPosZ());
    }
}
