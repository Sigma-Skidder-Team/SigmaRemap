// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.AxisAlignedBB;

import java.util.List;
import java.util.EnumSet;

public class Class3546 extends Class3545
{
    private static String[] field16610;
    private final Class786 field16611;
    private LivingEntity field16612;
    private final Class7843 field16613;
    
    public Class3546(final Class786 field16611) {
        super(field16611, false, true);
        this.field16613 = new Class7843().method25337(64.0);
        this.field16611 = field16611;
        this.method11019(EnumSet.of(Class2139.field12583));
    }
    
    @Override
    public boolean method11013() {
        final AxisAlignedBB method18495 = this.field16611.getBoundingBox().grow(10.0, 8.0, 10.0);
        final List<LivingEntity> method18496 = this.field16611.world.method7142(Class824.class, this.field16613, this.field16611, method18495);
        final List<PlayerEntity> method18497 = this.field16611.world.method7141(this.field16613, this.field16611, method18495);
        for (final Class824 class824 : method18496) {
            for (final PlayerEntity field16612 : method18497) {
                if (class824.method4876(field16612) > -100) {
                    continue;
                }
                this.field16612 = field16612;
            }
        }
        return this.field16612 != null && (!(this.field16612 instanceof PlayerEntity) || (!this.field16612.isSpectator() && !((PlayerEntity)this.field16612).method2889()));
    }
    
    @Override
    public void method11015() {
        this.field16611.method4153(this.field16612);
        super.method11015();
    }
}
