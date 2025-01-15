package net.minecraft.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ShearsItem extends Item
{
    public ShearsItem(Item.Properties p_i2525_1_)
    {
        super(p_i2525_1_);
    }

    public boolean onBlockDestroyed(ItemStack stack, World worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving)
    {
        if (!worldIn.isRemote)
        {
            stack.damageItem(1, entityLiving, (p_220036_0_) ->
            {
                p_220036_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
            });
        }

        Block block = state.getBlock();
        return !state.isIn(BlockTags.LEAVES) && block != Blocks.COBWEB && block != Blocks.GRASS && block != Blocks.FERN && block != Blocks.DEAD_BUSH && block != Blocks.VINE && block != Blocks.TRIPWIRE && !block.isIn(BlockTags.WOOL) ? super.onBlockDestroyed(stack, worldIn, state, pos, entityLiving) : true;
    }

    public boolean canHarvestBlock(BlockState blockIn)
    {
        Block block = blockIn.getBlock();
        return block == Blocks.COBWEB || block == Blocks.REDSTONE_WIRE || block == Blocks.TRIPWIRE;
    }

    public float getDestroySpeed(ItemStack stack, BlockState state)
    {
        Block block = state.getBlock();

        if (block != Blocks.COBWEB && !state.isIn(BlockTags.LEAVES))
        {
            return block.isIn(BlockTags.WOOL) ? 5.0F : super.getDestroySpeed(stack, state);
        }
        else
        {
            return 15.0F;
        }
    }
}
