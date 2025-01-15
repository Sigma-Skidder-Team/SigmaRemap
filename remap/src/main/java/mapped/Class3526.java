// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3d;

import java.util.EnumSet;

public class Class3526 extends Class3446
{
    private static String[] field16537;
    private final Class759 field16538;
    private Class511 field16539;
    private final float field16540;
    
    public Class3526(final Class759 field16538, final float field16539) {
        this.field16538 = field16538;
        this.field16540 = field16539;
        this.method11019(EnumSet.of(Class2139.field12582, Class2139.field12580));
    }
    
    @Override
    public boolean method11013() {
        if (this.field16538.method1806()) {
            return false;
        }
        this.field16539 = this.field16538.method4152();
        if (this.field16539 != null) {
            final double method1734 = this.field16538.method1734(this.field16539);
            return method1734 >= 4.0 && method1734 <= 16.0 && this.field16538.field2404 && this.field16538.method2633().nextInt(5) == 0;
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        return !this.field16538.field2404;
    }
    
    @Override
    public void method11015() {
        final Vec3d method1935 = this.field16538.method1935();
        Vec3d method1936 = new Vec3d(this.field16539.getPosX() - this.field16538.getPosX(), 0.0, this.field16539.getPosZ() - this.field16538.getPosZ());
        if (method1936.lengthSquared() > 1.0E-7) {
            method1936 = method1936.normalize().scale(0.4).add(method1935.scale(0.2));
        }
        this.field16538.method1937(method1936.x, this.field16540, method1936.z);
    }
}
