package net.minecraft.block;

import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class LogBlock extends RotatedPillarBlock
{
    private final MaterialColor verticalColor;

    public LogBlock(MaterialColor p_i4134_1_, Block.Properties p_i4134_2_)
    {
        super(p_i4134_2_);
        this.verticalColor = p_i4134_1_;
    }

    public MaterialColor getMaterialColor(BlockState state, IBlockReader worldIn, BlockPos pos)
    {
        return state.get(AXIS) == Direction.Axis.Y ? this.verticalColor : this.materialColor;
    }
}
