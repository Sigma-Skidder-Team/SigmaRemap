package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;

public class Class3386 extends Block {
    private static String[] field18993;
    public static final EnumProperty<Direction.Axis> field18994 = BlockStateProperties.AXIS;

    public Class3386(Properties var1) {
        super(var1);
        this.setDefaultState(this.getDefaultState().with(field18994, Direction.Axis.Y));
    }

    @Override
    public BlockState rotate(BlockState var1, Rotation var2) {
        switch (Class9779.field45746[var2.ordinal()]) {
            case 1:
            case 2:
                switch (Class9779.field45745[var1.<Direction.Axis>get(field18994).ordinal()]) {
                    case 1:
                        return var1.with(field18994, Direction.Axis.Z);
                    case 2:
                        return var1.with(field18994, Direction.Axis.X);
                    default:
                        return var1;
                }
            default:
                return var1;
        }
    }

    @Override
    public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
        var1.add(field18994);
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext var1) {
        return this.getDefaultState().with(field18994, var1.getFace().getAxis());
    }
}