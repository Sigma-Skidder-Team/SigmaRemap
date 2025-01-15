package net.minecraft.block;

import javax.annotation.Nullable;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.DyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.BannerTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public abstract class AbstractBannerBlock extends ContainerBlock
{
    private final DyeColor color;

    protected AbstractBannerBlock(DyeColor p_i856_1_, Block.Properties p_i856_2_)
    {
        super(p_i856_2_);
        this.color = p_i856_1_;
    }

    public boolean canSpawnInBlock()
    {
        return true;
    }

    public TileEntity createNewTileEntity(IBlockReader worldIn)
    {
        return new BannerTileEntity(this.color);
    }

    public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack)
    {
        if (stack.hasDisplayName())
        {
            TileEntity tileentity = worldIn.getTileEntity(pos);

            if (tileentity instanceof BannerTileEntity)
            {
                ((BannerTileEntity)tileentity).func_213136_a(stack.getDisplayName());
            }
        }
    }

    public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state)
    {
        TileEntity tileentity = worldIn.getTileEntity(pos);
        return tileentity instanceof BannerTileEntity ? ((BannerTileEntity)tileentity).getItem(state) : super.getItem(worldIn, pos, state);
    }

    public DyeColor getColor()
    {
        return this.color;
    }
}
