package net.minecraft.block;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class StemBlock extends BushBlock implements IGrowable
{
    public static final IntegerProperty AGE = BlockStateProperties.AGE_0_7;
    protected static final VoxelShape[] SHAPES = new VoxelShape[] {Block.makeCuboidShape(7.0D, 0.0D, 7.0D, 9.0D, 2.0D, 9.0D), Block.makeCuboidShape(7.0D, 0.0D, 7.0D, 9.0D, 4.0D, 9.0D), Block.makeCuboidShape(7.0D, 0.0D, 7.0D, 9.0D, 6.0D, 9.0D), Block.makeCuboidShape(7.0D, 0.0D, 7.0D, 9.0D, 8.0D, 9.0D), Block.makeCuboidShape(7.0D, 0.0D, 7.0D, 9.0D, 10.0D, 9.0D), Block.makeCuboidShape(7.0D, 0.0D, 7.0D, 9.0D, 12.0D, 9.0D), Block.makeCuboidShape(7.0D, 0.0D, 7.0D, 9.0D, 14.0D, 9.0D), Block.makeCuboidShape(7.0D, 0.0D, 7.0D, 9.0D, 16.0D, 9.0D)};
    private final StemGrownBlock crop;

    protected StemBlock(StemGrownBlock p_i4042_1_, Block.Properties p_i4042_2_)
    {
        super(p_i4042_2_);
        this.crop = p_i4042_1_;
        this.setDefaultState(this.stateContainer.getBaseState().with(AGE, Integer.valueOf(0)));
    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context)
    {
        return SHAPES[state.get(AGE)];
    }

    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos)
    {
        return state.getBlock() == Blocks.FARMLAND;
    }

    public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand)
    {
        super.tick(state, worldIn, pos, rand);

        if (worldIn.getLightSubtracted(pos, 0) >= 9)
        {
            float f = CropsBlock.getGrowthChance(this, worldIn, pos);

            if (rand.nextInt((int)(25.0F / f) + 1) == 0)
            {
                int i = state.get(AGE);

                if (i < 7)
                {
                    state = state.with(AGE, Integer.valueOf(i + 1));
                    worldIn.setBlockState(pos, state, 2);
                }
                else
                {
                    Direction direction = Direction.Plane.HORIZONTAL.random(rand);
                    BlockPos blockpos = pos.offset(direction);
                    Block block = worldIn.getBlockState(blockpos.down()).getBlock();

                    if (worldIn.getBlockState(blockpos).isAir() && (block == Blocks.FARMLAND || block == Blocks.DIRT || block == Blocks.COARSE_DIRT || block == Blocks.PODZOL || block == Blocks.GRASS_BLOCK))
                    {
                        worldIn.setBlockState(blockpos, this.crop.getDefaultState());
                        worldIn.setBlockState(pos, this.crop.getAttachedStem().getDefaultState().with(HorizontalBlock.HORIZONTAL_FACING, direction));
                    }
                }
            }
        }
    }

    @Nullable
    protected Item getSeedItem()
    {
        if (this.crop == Blocks.PUMPKIN)
        {
            return Items.PUMPKIN_SEEDS;
        }
        else
        {
            return this.crop == Blocks.MELON ? Items.MELON_SEEDS : null;
        }
    }

    public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state)
    {
        Item item = this.getSeedItem();
        return item == null ? ItemStack.EMPTY : new ItemStack(item);
    }

    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient)
    {
        return state.get(AGE) != 7;
    }

    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state)
    {
        return true;
    }

    public void grow(ServerWorld p_225535_1_, Random p_225535_2_, BlockPos p_225535_3_, BlockState p_225535_4_)
    {
        int i = Math.min(7, p_225535_4_.get(AGE) + MathHelper.nextInt(p_225535_1_.rand, 2, 5));
        BlockState blockstate = p_225535_4_.with(AGE, Integer.valueOf(i));
        p_225535_1_.setBlockState(p_225535_3_, blockstate, 2);

        if (i == 7)
        {
            blockstate.tick(p_225535_1_, p_225535_3_, p_225535_1_.rand);
        }
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
    {
        builder.add(AGE);
    }

    public StemGrownBlock getCrop()
    {
        return this.crop;
    }
}
