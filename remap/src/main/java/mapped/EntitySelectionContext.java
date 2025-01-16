// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util2.Direction;

public class EntitySelectionContext implements ISelectionContext
{
    public static final ISelectionContext DUMMY = new EntitySelectionContext(false, -Double.MAX_VALUE, Items.AIR)
    {
        public boolean func_216378_a(VoxelShape shape, BlockPos pos, boolean p_216378_3_)
        {
            return p_216378_3_;
        }
    };
    private final boolean field_227579_b_;
    private final double field_216381_c;
    private final Item item;

    protected EntitySelectionContext(final boolean field_227579_b_, final double field_216381_c, final Item item) {
        this.field_227579_b_ = field_227579_b_;
        this.field_216381_c = field_216381_c;
        this.item = item;
    }
    
    @Deprecated
    public EntitySelectionContext(final Entity slimeBodyTexOffY) {
        this(slimeBodyTexOffY.isDescending(), slimeBodyTexOffY.getPosY(), (slimeBodyTexOffY instanceof LivingEntity) ? ((LivingEntity)slimeBodyTexOffY).getHeldItemMainhand().getItem() : Items.AIR);
    }
    
    @Override
    public boolean hasItem(final Item class3820) {
        return this.item == class3820;
    }
    
    @Override
    public boolean func_225581_b_() {
        return this.field_227579_b_;
    }
    
    @Override
    public boolean func_216378_a(final VoxelShape class7702, final BlockPos class7703, final boolean b) {
        return this.field_216381_c > class7703.getY() + class7702.getEnd(Direction.Axis.Y) - 9.999999747378752E-6;
    }
}
