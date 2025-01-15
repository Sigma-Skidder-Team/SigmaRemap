package net.minecraft.block;

import javax.annotation.Nullable;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.properties.AttachFace;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;

public class HorizontalFaceBlock extends HorizontalBlock
{
    public static final EnumProperty<AttachFace> FACE = BlockStateProperties.FACE;

    protected HorizontalFaceBlock(Block.Properties p_i983_1_)
    {
        super(p_i983_1_);
    }

    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos)
    {
        return func_220185_b(worldIn, pos, getFacing(state).getOpposite());
    }

    public static boolean func_220185_b(IWorldReader p_220185_0_, BlockPos p_220185_1_, Direction p_220185_2_)
    {
        BlockPos blockpos = p_220185_1_.offset(p_220185_2_);
        return p_220185_0_.getBlockState(blockpos).isSolidSide(p_220185_0_, blockpos, p_220185_2_.getOpposite());
    }

    @Nullable
    public BlockState getStateForPlacement(BlockItemUseContext context)
    {
        for (Direction direction : context.getNearestLookingDirections())
        {
            BlockState blockstate;

            if (direction.getAxis() == Direction.Axis.Y)
            {
                blockstate = this.getDefaultState().with(FACE, direction == Direction.UP ? AttachFace.CEILING : AttachFace.FLOOR).with(HORIZONTAL_FACING, context.getPlacementHorizontalFacing());
            }
            else
            {
                blockstate = this.getDefaultState().with(FACE, AttachFace.WALL).with(HORIZONTAL_FACING, direction.getOpposite());
            }

            if (blockstate.isValidPosition(context.getWorld(), context.getPos()))
            {
                return blockstate;
            }
        }

        return null;
    }

    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos)
    {
        return getFacing(stateIn).getOpposite() == facing && !stateIn.isValidPosition(worldIn, currentPos) ? Blocks.AIR.getDefaultState() : super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    protected static Direction getFacing(BlockState p_196365_0_)
    {
        switch ((AttachFace)p_196365_0_.get(FACE))
        {
            case CEILING:
                return Direction.DOWN;

            case FLOOR:
                return Direction.UP;

            default:
                return p_196365_0_.get(HORIZONTAL_FACING);
        }
    }
}
