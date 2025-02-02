// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;

public class Class3563 extends Class3555<LivingEntity>
{
    private static String[] field16651;
    
    public Class3563(final Class841 class841) {
        super(class841, LivingEntity.class, 10, true, false, class842 -> class842 instanceof IMob);
    }
    
    @Override
    public boolean method11013() {
        return this.field16602.getTeam() != null && super.method11013();
    }
    
    @Override
    public AxisAlignedBB method11103(final double n) {
        final Direction method5018 = ((Class841)this.field16602).method5018();
        if (method5018.getAxis() != Direction.Axis.X) {
            return (method5018.getAxis() != Direction.Axis.Z) ? this.field16602.getBoundingBox().grow(n, 4.0, n) : this.field16602.getBoundingBox().grow(n, n, 4.0);
        }
        return this.field16602.getBoundingBox().grow(4.0, n, n);
    }
}
