package net.minecraft.block;

import net.minecraft.tileentity.SkullTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public abstract class AbstractSkullBlock extends ContainerBlock
{
    private final SkullBlock.ISkullType skullType;

    public AbstractSkullBlock(SkullBlock.ISkullType p_i3385_1_, Block.Properties p_i3385_2_)
    {
        super(p_i3385_2_);
        this.skullType = p_i3385_1_;
    }

    public TileEntity createNewTileEntity(IBlockReader worldIn)
    {
        return new SkullTileEntity();
    }

    public SkullBlock.ISkullType getSkullType()
    {
        return this.skullType;
    }
}
