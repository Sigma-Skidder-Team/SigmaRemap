package net.minecraft.block;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.BarrelTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class BarrelBlock extends ContainerBlock
{
    public static final DirectionProperty PROPERTY_FACING = BlockStateProperties.FACING;
    public static final BooleanProperty PROPERTY_OPEN = BlockStateProperties.OPEN;

    public BarrelBlock(Block.Properties p_i2093_1_)
    {
        super(p_i2093_1_);
        this.setDefaultState(this.stateContainer.getBaseState().with(PROPERTY_FACING, Direction.NORTH).with(PROPERTY_OPEN, Boolean.valueOf(false)));
    }

    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit)
    {
        if (worldIn.isRemote)
        {
            return ActionResultType.SUCCESS;
        }
        else
        {
            TileEntity tileentity = worldIn.getTileEntity(pos);

            if (tileentity instanceof BarrelTileEntity)
            {
                player.openContainer((BarrelTileEntity)tileentity);
                player.addStat(Stats.OPEN_BARREL);
            }

            return ActionResultType.SUCCESS;
        }
    }

    public void onReplaced(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving)
    {
        if (state.getBlock() != newState.getBlock())
        {
            TileEntity tileentity = worldIn.getTileEntity(pos);

            if (tileentity instanceof IInventory)
            {
                InventoryHelper.dropInventoryItems(worldIn, pos, (IInventory)tileentity);
                worldIn.updateComparatorOutputLevel(pos, this);
            }

            super.onReplaced(state, worldIn, pos, newState, isMoving);
        }
    }

    public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand)
    {
        TileEntity tileentity = worldIn.getTileEntity(pos);

        if (tileentity instanceof BarrelTileEntity)
        {
            ((BarrelTileEntity)tileentity).barrelTick();
        }
    }

    @Nullable
    public TileEntity createNewTileEntity(IBlockReader worldIn)
    {
        return new BarrelTileEntity();
    }

    public BlockRenderType getRenderType(BlockState state)
    {
        return BlockRenderType.MODEL;
    }

    public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack)
    {
        if (stack.hasDisplayName())
        {
            TileEntity tileentity = worldIn.getTileEntity(pos);

            if (tileentity instanceof BarrelTileEntity)
            {
                ((BarrelTileEntity)tileentity).setCustomName(stack.getDisplayName());
            }
        }
    }

    public boolean hasComparatorInputOverride(BlockState state)
    {
        return true;
    }

    public int getComparatorInputOverride(BlockState blockState, World worldIn, BlockPos pos)
    {
        return Container.calcRedstone(worldIn.getTileEntity(pos));
    }

    public BlockState rotate(BlockState state, Rotation rot)
    {
        return state.with(PROPERTY_FACING, rot.rotate(state.get(PROPERTY_FACING)));
    }

    public BlockState mirror(BlockState state, Mirror mirrorIn)
    {
        return state.rotate(mirrorIn.toRotation(state.get(PROPERTY_FACING)));
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
    {
        builder.add(PROPERTY_FACING, PROPERTY_OPEN);
    }

    public BlockState getStateForPlacement(BlockItemUseContext context)
    {
        return this.getDefaultState().with(PROPERTY_FACING, context.getNearestLookingDirection().getOpposite());
    }
}
