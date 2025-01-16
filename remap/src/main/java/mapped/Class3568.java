// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;
import net.minecraft.util.math.AxisAlignedBB;

public class Class3568 extends Class3555<PlayerEntity>
{
    private static String[] field16658;
    public final /* synthetic */ Class841 field16659;
    
    public Class3568(final Class841 field16659, final Class841 class841) {
        this.field16659 = field16659;
        super(class841, PlayerEntity.class, true);
    }
    
    @Override
    public boolean method11013() {
        return this.field16659.world.method6954() != Class2113.field12290 && super.method11013();
    }
    
    @Override
    public AxisAlignedBB method11103(final double n) {
        final Direction method5018 = ((Class841)this.field16602).method5018();
        if (method5018.getAxis() != Direction.Axis.X) {
            return (method5018.getAxis() != Direction.Axis.Z) ? this.field16602.getBoundingBox().method18495(n, 4.0, n) : this.field16602.getBoundingBox().method18495(n, n, 4.0);
        }
        return this.field16602.getBoundingBox().method18495(4.0, n, n);
    }
}
