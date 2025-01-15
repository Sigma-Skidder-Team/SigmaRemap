// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;

public class Class3503 extends Class3446
{
    private static String[] field16473;
    private final Class759 field16474;
    private double field16475;
    private double field16476;
    private int field16477;
    
    public Class3503(final Class759 field16474) {
        this.field16474 = field16474;
        this.method11019(EnumSet.of(Class2139.field12580, Class2139.field12581));
    }
    
    @Override
    public boolean method11013() {
        return this.field16474.method2633().nextFloat() < 0.02f;
    }
    
    @Override
    public boolean method11017() {
        return this.field16477 >= 0;
    }
    
    @Override
    public void method11015() {
        final double n = 6.283185307179586 * this.field16474.method2633().nextDouble();
        this.field16475 = Math.cos(n);
        this.field16476 = Math.sin(n);
        this.field16477 = 20 + this.field16474.method2633().nextInt(20);
    }
    
    @Override
    public void method11016() {
        --this.field16477;
        this.field16474.method4147().method24668(this.field16474.getPosX() + this.field16475, this.field16474.method1944(), this.field16474.getPosZ() + this.field16476);
    }
}
