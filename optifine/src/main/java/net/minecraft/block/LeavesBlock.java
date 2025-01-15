package net.minecraft.block;

import java.util.Random;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class LeavesBlock extends Block
{
    public static final IntegerProperty DISTANCE = BlockStateProperties.DISTANCE_1_7;
    public static final BooleanProperty PERSISTENT = BlockStateProperties.PERSISTENT;

    public LeavesBlock(Block.Properties p_i3355_1_)
    {
        super(p_i3355_1_);
        this.setDefaultState(this.stateContainer.getBaseState().with(DISTANCE, Integer.valueOf(7)).with(PERSISTENT, Boolean.valueOf(false)));
    }

    public boolean ticksRandomly(BlockState state)
    {
        return state.get(DISTANCE) == 7 && !state.get(PERSISTENT);
    }

    public void randomTick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random)
    {
        if (!state.get(PERSISTENT) && state.get(DISTANCE) == 7)
        {
            spawnDrops(state, worldIn, pos);
            worldIn.removeBlock(pos, false);
        }
    }

    public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand)
    {
        worldIn.setBlockState(pos, updateDistance(state, worldIn, pos), 3);
    }

    public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos)
    {
        return 1;
    }

    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos)
    {
        int i = getDistance(facingState) + 1;

        if (i != 1 || stateIn.get(DISTANCE) != i)
        {
            worldIn.getPendingBlockTicks().scheduleTick(currentPos, this, 1);
        }

        return stateIn;
    }

    private static BlockState updateDistance(BlockState state, IWorld worldIn, BlockPos pos)
    {
        int i = 7;

        try (BlockPos.PooledMutable blockpos$pooledmutable = BlockPos.PooledMutable.retain())
        {
            for (Direction direction : Direction.values())
            {
                blockpos$pooledmutable.setPos(pos).move(direction);
                i = Math.min(i, getDistance(worldIn.getBlockState(blockpos$pooledmutable)) + 1);

                if (i == 1)
                {
                    break;
                }
            }
        }

        return state.with(DISTANCE, Integer.valueOf(i));
    }

    private static int getDistance(BlockState neighbor)
    {
        if (BlockTags.LOGS.contains(neighbor.getBlock()))
        {
            return 0;
        }
        else
        {
            return neighbor.getBlock() instanceof LeavesBlock ? neighbor.get(DISTANCE) : 7;
        }
    }

    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand)
    {
        if (worldIn.isRainingAt(pos.up()))
        {
            if (rand.nextInt(15) == 1)
            {
                BlockPos blockpos = pos.down();
                BlockState blockstate = worldIn.getBlockState(blockpos);

                if (!blockstate.isSolid() || !blockstate.isSolidSide(worldIn, blockpos, Direction.UP))
                {
                    double d0 = (double)((float)pos.getX() + rand.nextFloat());
                    double d1 = (double)pos.getY() - 0.05D;
                    double d2 = (double)((float)pos.getZ() + rand.nextFloat());
                    worldIn.addParticle(ParticleTypes.DRIPPING_WATER, d0, d1, d2, 0.0D, 0.0D, 0.0D);
                }
            }
        }
    }

    public boolean causesSuffocation(BlockState state, IBlockReader worldIn, BlockPos pos)
    {
        return false;
    }

    public boolean canEntitySpawn(BlockState state, IBlockReader worldIn, BlockPos pos, EntityType<?> type)
    {
        return type == EntityType.OCELOT || type == EntityType.PARROT;
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
    {
        builder.add(DISTANCE, PERSISTENT);
    }

    public BlockState getStateForPlacement(BlockItemUseContext context)
    {
        return updateDistance(this.getDefaultState().with(PERSISTENT, Boolean.valueOf(true)), context.getWorld(), context.getPos());
    }
}
