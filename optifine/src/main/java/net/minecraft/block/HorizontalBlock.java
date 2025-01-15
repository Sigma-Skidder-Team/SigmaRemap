package net.minecraft.block;

import net.minecraft.state.DirectionProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;

public abstract class HorizontalBlock extends Block
{
    public static final DirectionProperty HORIZONTAL_FACING = BlockStateProperties.HORIZONTAL_FACING;

    protected HorizontalBlock(Block.Properties p_i2102_1_)
    {
        super(p_i2102_1_);
    }

    public BlockState rotate(BlockState state, Rotation rot)
    {
        return state.with(HORIZONTAL_FACING, rot.rotate(state.get(HORIZONTAL_FACING)));
    }

    public BlockState mirror(BlockState state, Mirror mirrorIn)
    {
        return state.rotate(mirrorIn.toRotation(state.get(HORIZONTAL_FACING)));
    }
}
