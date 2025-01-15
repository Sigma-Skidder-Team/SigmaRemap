package net.minecraft.item;

import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.tileentity.SignTileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SignItem extends WallOrFloorItem
{
    public SignItem(Item.Properties p_i758_1_, Block p_i758_2_, Block p_i758_3_)
    {
        super(p_i758_2_, p_i758_3_, p_i758_1_);
    }

    protected boolean onBlockPlaced(BlockPos pos, World worldIn, @Nullable PlayerEntity player, ItemStack stack, BlockState state)
    {
        boolean flag = super.onBlockPlaced(pos, worldIn, player, stack, state);

        if (!worldIn.isRemote && !flag && player != null)
        {
            player.openSignEditor((SignTileEntity)worldIn.getTileEntity(pos));
        }

        return flag;
    }
}
