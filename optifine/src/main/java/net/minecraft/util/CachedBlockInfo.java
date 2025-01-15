package net.minecraft.util;

import java.util.function.Predicate;
import javax.annotation.Nullable;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;

public class CachedBlockInfo
{
    private final IWorldReader world;
    private final BlockPos pos;
    private final boolean forceLoad;
    private BlockState state;
    private TileEntity tileEntity;
    private boolean tileEntityInitialized;

    public CachedBlockInfo(IWorldReader p_i2995_1_, BlockPos p_i2995_2_, boolean p_i2995_3_)
    {
        this.world = p_i2995_1_;
        this.pos = p_i2995_2_.toImmutable();
        this.forceLoad = p_i2995_3_;
    }

    public BlockState getBlockState()
    {
        if (this.state == null && (this.forceLoad || this.world.isBlockLoaded(this.pos)))
        {
            this.state = this.world.getBlockState(this.pos);
        }

        return this.state;
    }

    @Nullable
    public TileEntity getTileEntity()
    {
        if (this.tileEntity == null && !this.tileEntityInitialized)
        {
            this.tileEntity = this.world.getTileEntity(this.pos);
            this.tileEntityInitialized = true;
        }

        return this.tileEntity;
    }

    public IWorldReader getWorld()
    {
        return this.world;
    }

    public BlockPos getPos()
    {
        return this.pos;
    }

    public static Predicate<CachedBlockInfo> hasState(Predicate<BlockState> predicatesIn)
    {
        return (p_201002_1_) ->
        {
            return p_201002_1_ != null && predicatesIn.test(p_201002_1_.getBlockState());
        };
    }
}
