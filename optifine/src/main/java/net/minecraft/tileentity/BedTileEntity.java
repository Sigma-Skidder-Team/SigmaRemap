package net.minecraft.tileentity;

import net.minecraft.block.BedBlock;
import net.minecraft.item.DyeColor;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;

public class BedTileEntity extends TileEntity
{
    private DyeColor color;

    public BedTileEntity()
    {
        super(TileEntityType.BED);
    }

    public BedTileEntity(DyeColor p_i819_1_)
    {
        this();
        this.setColor(p_i819_1_);
    }

    public SUpdateTileEntityPacket getUpdatePacket()
    {
        return new SUpdateTileEntityPacket(this.pos, 11, this.getUpdateTag());
    }

    public DyeColor getColor()
    {
        if (this.color == null)
        {
            this.color = ((BedBlock)this.getBlockState().getBlock()).getColor();
        }

        return this.color;
    }

    public void setColor(DyeColor color)
    {
        this.color = color;
    }
}
