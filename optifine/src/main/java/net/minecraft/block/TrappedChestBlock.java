package net.minecraft.block;

import net.minecraft.stats.Stat;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.ChestTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.tileentity.TrappedChestTileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockReader;

public class TrappedChestBlock extends ChestBlock
{
    public TrappedChestBlock(Block.Properties p_i4025_1_)
    {
        super(p_i4025_1_, () ->
        {
            return TileEntityType.TRAPPED_CHEST;
        });
    }

    public TileEntity createNewTileEntity(IBlockReader worldIn)
    {
        return new TrappedChestTileEntity();
    }

    protected Stat<ResourceLocation> getOpenStat()
    {
        return Stats.CUSTOM.get(Stats.TRIGGER_TRAPPED_CHEST);
    }

    public boolean canProvidePower(BlockState state)
    {
        return true;
    }

    public int getWeakPower(BlockState blockState, IBlockReader blockAccess, BlockPos pos, Direction side)
    {
        return MathHelper.clamp(ChestTileEntity.getPlayersUsing(blockAccess, pos), 0, 15);
    }

    public int getStrongPower(BlockState blockState, IBlockReader blockAccess, BlockPos pos, Direction side)
    {
        return side == Direction.UP ? blockState.getWeakPower(blockAccess, pos, side) : 0;
    }
}
