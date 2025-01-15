package net.minecraft.block;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class WebBlock extends Block
{
    public WebBlock(Block.Properties p_i1595_1_)
    {
        super(p_i1595_1_);
    }

    public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn)
    {
        entityIn.setMotionMultiplier(state, new Vec3d(0.25D, (double)0.05F, 0.25D));
    }
}
