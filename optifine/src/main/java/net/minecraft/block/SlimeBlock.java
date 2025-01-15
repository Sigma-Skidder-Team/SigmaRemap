package net.minecraft.block;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class SlimeBlock extends BreakableBlock
{
    public SlimeBlock(Block.Properties p_i1714_1_)
    {
        super(p_i1714_1_);
    }

    public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance)
    {
        if (entityIn.isSuppressingBounce())
        {
            super.onFallenUpon(worldIn, pos, entityIn, fallDistance);
        }
        else
        {
            entityIn.onLivingFall(fallDistance, 0.0F);
        }
    }

    public void onLanded(IBlockReader worldIn, Entity entityIn)
    {
        if (entityIn.isSuppressingBounce())
        {
            super.onLanded(worldIn, entityIn);
        }
        else
        {
            this.func_226946_a_(entityIn);
        }
    }

    private void func_226946_a_(Entity p_226946_1_)
    {
        Vec3d vec3d = p_226946_1_.getMotion();

        if (vec3d.y < 0.0D)
        {
            double d0 = p_226946_1_ instanceof LivingEntity ? 1.0D : 0.8D;
            p_226946_1_.setMotion(vec3d.x, -vec3d.y * d0, vec3d.z);
        }
    }

    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn)
    {
        double d0 = Math.abs(entityIn.getMotion().y);

        if (d0 < 0.1D && !entityIn.isSteppingCarefully())
        {
            double d1 = 0.4D + d0 * 0.2D;
            entityIn.setMotion(entityIn.getMotion().mul(d1, 1.0D, d1));
        }

        super.onEntityWalk(worldIn, pos, entityIn);
    }
}
