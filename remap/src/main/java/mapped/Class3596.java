// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import java.util.EnumSet;

public class Class3596 extends Class3446
{
    private static String[] field16751;
    private final Class761 field16752;
    
    public Class3596(final Class761 field16752) {
        this.field16752 = field16752;
        this.method11019(EnumSet.of(Class2139.field12581));
    }
    
    @Override
    public boolean method11013() {
        return true;
    }
    
    @Override
    public void method11016() {
        if (this.field16752.method4152() != null) {
            final Class511 method4152 = this.field16752.method4152();
            if (method4152.method1734(this.field16752) < 4096.0) {
                this.field16752.field2399 = -(float) MathHelper.method35693(method4152.getPosX() - this.field16752.getPosX(), method4152.getPosZ() - this.field16752.getPosZ()) * 57.295776f;
                this.field16752.field2951 = this.field16752.field2399;
            }
        }
        else {
            final Vec3d method4153 = this.field16752.method1935();
            this.field16752.field2399 = -(float) MathHelper.method35693(method4153.x, method4153.z) * 57.295776f;
            this.field16752.field2951 = this.field16752.field2399;
        }
    }
}
