package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.FallingBlockEntity;
import net.minecraft.particles.BlockParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class FallingBlock extends Block
{
    public FallingBlock(Block.Properties p_i1580_1_)
    {
        super(p_i1580_1_);
    }

    public void onBlockAdded(BlockState state, World worldIn, BlockPos pos, BlockState oldState, boolean isMoving)
    {
        worldIn.getPendingBlockTicks().scheduleTick(pos, this, this.tickRate(worldIn));
    }

    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos)
    {
        worldIn.getPendingBlockTicks().scheduleTick(currentPos, this, this.tickRate(worldIn));
        return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand)
    {
        if (canFallThrough(worldIn.getBlockState(pos.down())) && pos.getY() >= 0)
        {
            FallingBlockEntity fallingblockentity = new FallingBlockEntity(worldIn, (double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, worldIn.getBlockState(pos));
            this.onStartFalling(fallingblockentity);
            worldIn.addEntity(fallingblockentity);
        }
    }

    protected void onStartFalling(FallingBlockEntity fallingEntity)
    {
    }

    public int tickRate(IWorldReader worldIn)
    {
        return 2;
    }

    public static boolean canFallThrough(BlockState state)
    {
        Block block = state.getBlock();
        Material material = state.getMaterial();
        return state.isAir() || block == Blocks.FIRE || material.isLiquid() || material.isReplaceable();
    }

    public void onEndFalling(World worldIn, BlockPos pos, BlockState fallingState, BlockState hitState)
    {
    }

    public void onBroken(World worldIn, BlockPos pos)
    {
    }

    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand)
    {
        if (rand.nextInt(16) == 0)
        {
            BlockPos blockpos = pos.down();

            if (canFallThrough(worldIn.getBlockState(blockpos)))
            {
                double d0 = (double)pos.getX() + (double)rand.nextFloat();
                double d1 = (double)pos.getY() - 0.05D;
                double d2 = (double)pos.getZ() + (double)rand.nextFloat();
                worldIn.addParticle(new BlockParticleData(ParticleTypes.FALLING_DUST, stateIn), d0, d1, d2, 0.0D, 0.0D, 0.0D);
            }
        }
    }

    public int getDustColor(BlockState state)
    {
        return -16777216;
    }
}
