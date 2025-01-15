package net.minecraft.block;

import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.properties.DoubleBlockHalf;

public class ShearableDoublePlantBlock extends DoublePlantBlock
{
    public static final EnumProperty<DoubleBlockHalf> PLANT_HALF = DoublePlantBlock.HALF;

    public ShearableDoublePlantBlock(Block.Properties p_i2377_1_)
    {
        super(p_i2377_1_);
    }

    public boolean isReplaceable(BlockState state, BlockItemUseContext useContext)
    {
        boolean flag = super.isReplaceable(state, useContext);
        return flag && useContext.getItem().getItem() == this.asItem() ? false : flag;
    }
}
