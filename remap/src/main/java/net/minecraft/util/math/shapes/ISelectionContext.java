package net.minecraft.util.math.shapes;

import net.minecraft.util.math.BlockPos;
import mapped.EntitySelectionContext;
import mapped.Item;
import net.minecraft.entity.Entity;

public interface ISelectionContext
{
    static ISelectionContext dummy()
    {
        return EntitySelectionContext.DUMMY;
    }

    static ISelectionContext forEntity(Entity entityIn)
    {
        return new EntitySelectionContext(entityIn);
    }

    boolean func_225581_b_();

    boolean func_216378_a(VoxelShape shape, BlockPos pos, boolean p_216378_3_);

    boolean hasItem(Item itemIn);
}
