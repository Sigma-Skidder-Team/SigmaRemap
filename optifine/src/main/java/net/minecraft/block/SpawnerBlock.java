package net.minecraft.block;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.MobSpawnerTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class SpawnerBlock extends ContainerBlock
{
    protected SpawnerBlock(Block.Properties p_i2859_1_)
    {
        super(p_i2859_1_);
    }

    public TileEntity createNewTileEntity(IBlockReader worldIn)
    {
        return new MobSpawnerTileEntity();
    }

    public void spawnAdditionalDrops(BlockState state, World worldIn, BlockPos pos, ItemStack stack)
    {
        super.spawnAdditionalDrops(state, worldIn, pos, stack);
        int i = 15 + worldIn.rand.nextInt(15) + worldIn.rand.nextInt(15);
        this.dropXpOnBlockBreak(worldIn, pos, i);
    }

    public BlockRenderType getRenderType(BlockState state)
    {
        return BlockRenderType.MODEL;
    }

    public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state)
    {
        return ItemStack.EMPTY;
    }
}
