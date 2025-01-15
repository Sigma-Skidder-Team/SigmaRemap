package net.minecraft.block;

import javax.annotation.Nullable;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WitherSkeletonWallSkullBlock extends WallSkullBlock
{
    protected WitherSkeletonWallSkullBlock(Block.Properties p_i558_1_)
    {
        super(SkullBlock.Types.WITHER_SKELETON, p_i558_1_);
    }

    public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack)
    {
        Blocks.WITHER_SKELETON_SKULL.onBlockPlacedBy(worldIn, pos, state, placer, stack);
    }
}
