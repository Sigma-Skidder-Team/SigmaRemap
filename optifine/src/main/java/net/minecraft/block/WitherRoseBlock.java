package net.minecraft.block;

import java.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.Difficulty;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class WitherRoseBlock extends FlowerBlock
{
    public WitherRoseBlock(Effect p_i270_1_, Block.Properties p_i270_2_)
    {
        super(p_i270_1_, 8, p_i270_2_);
    }

    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos)
    {
        Block block = state.getBlock();
        return super.isValidGround(state, worldIn, pos) || block == Blocks.NETHERRACK || block == Blocks.SOUL_SAND;
    }

    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand)
    {
        VoxelShape voxelshape = this.getShape(stateIn, worldIn, pos, ISelectionContext.dummy());
        Vec3d vec3d = voxelshape.getBoundingBox().getCenter();
        double d0 = (double)pos.getX() + vec3d.x;
        double d1 = (double)pos.getZ() + vec3d.z;

        for (int i = 0; i < 3; ++i)
        {
            if (rand.nextBoolean())
            {
                worldIn.addParticle(ParticleTypes.SMOKE, d0 + (double)(rand.nextFloat() / 5.0F), (double)pos.getY() + (0.5D - (double)rand.nextFloat()), d1 + (double)(rand.nextFloat() / 5.0F), 0.0D, 0.0D, 0.0D);
            }
        }
    }

    public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn)
    {
        if (!worldIn.isRemote && worldIn.getDifficulty() != Difficulty.PEACEFUL)
        {
            if (entityIn instanceof LivingEntity)
            {
                LivingEntity livingentity = (LivingEntity)entityIn;

                if (!livingentity.isInvulnerableTo(DamageSource.WITHER))
                {
                    livingentity.addPotionEffect(new EffectInstance(Effects.WITHER, 40));
                }
            }
        }
    }
}
