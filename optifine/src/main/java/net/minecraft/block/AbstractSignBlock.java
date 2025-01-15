package net.minecraft.block;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.DyeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.SignTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public abstract class AbstractSignBlock extends ContainerBlock implements IWaterLoggable
{
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    protected static final VoxelShape SHAPE = Block.makeCuboidShape(4.0D, 0.0D, 4.0D, 12.0D, 16.0D, 12.0D);
    private final WoodType woodType;

    protected AbstractSignBlock(Block.Properties p_i1161_1_, WoodType p_i1161_2_)
    {
        super(p_i1161_1_);
        this.woodType = p_i1161_2_;
    }

    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos)
    {
        if (stateIn.get(WATERLOGGED))
        {
            worldIn.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
        }

        return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context)
    {
        return SHAPE;
    }

    public boolean canSpawnInBlock()
    {
        return true;
    }

    public TileEntity createNewTileEntity(IBlockReader worldIn)
    {
        return new SignTileEntity();
    }

    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit)
    {
        ItemStack itemstack = player.getHeldItem(handIn);
        boolean flag = itemstack.getItem() instanceof DyeItem && player.abilities.allowEdit;

        if (worldIn.isRemote)
        {
            return flag ? ActionResultType.SUCCESS : ActionResultType.CONSUME;
        }
        else
        {
            TileEntity tileentity = worldIn.getTileEntity(pos);

            if (tileentity instanceof SignTileEntity)
            {
                SignTileEntity signtileentity = (SignTileEntity)tileentity;

                if (flag)
                {
                    boolean flag1 = signtileentity.setTextColor(((DyeItem)itemstack.getItem()).getDyeColor());

                    if (flag1 && !player.isCreative())
                    {
                        itemstack.shrink(1);
                    }
                }

                return signtileentity.executeCommand(player) ? ActionResultType.SUCCESS : ActionResultType.PASS;
            }
            else
            {
                return ActionResultType.PASS;
            }
        }
    }

    public IFluidState getFluidState(BlockState state)
    {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
    }

    public WoodType getWoodType()
    {
        return this.woodType;
    }
}
