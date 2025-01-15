package net.minecraft.block;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.DyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.BeaconTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class BeaconBlock extends ContainerBlock implements IBeaconBeamColorProvider
{
    public BeaconBlock(Block.Properties p_i2753_1_)
    {
        super(p_i2753_1_);
    }

    public DyeColor getColor()
    {
        return DyeColor.WHITE;
    }

    public TileEntity createNewTileEntity(IBlockReader worldIn)
    {
        return new BeaconTileEntity();
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

            if (tileentity instanceof BeaconTileEntity)
            {
                player.openContainer((BeaconTileEntity)tileentity);
                player.addStat(Stats.INTERACT_WITH_BEACON);
            }

            return ActionResultType.SUCCESS;
        }
    }

    public boolean isNormalCube(BlockState state, IBlockReader worldIn, BlockPos pos)
    {
        return false;
    }

    public BlockRenderType getRenderType(BlockState state)
    {
        return BlockRenderType.MODEL;
    }

    public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, LivingEntity placer, ItemStack stack)
    {
        if (stack.hasDisplayName())
        {
            TileEntity tileentity = worldIn.getTileEntity(pos);

            if (tileentity instanceof BeaconTileEntity)
            {
                ((BeaconTileEntity)tileentity).setCustomName(stack.getDisplayName());
            }
        }
    }
}
