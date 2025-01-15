package net.minecraft.block;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.EnchantmentContainer;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.SimpleNamedContainerProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.pathfinding.PathType;
import net.minecraft.tileentity.EnchantingTableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.INameable;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class EnchantingTableBlock extends ContainerBlock
{
    protected static final VoxelShape SHAPE = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D);

    protected EnchantingTableBlock(Block.Properties p_i2076_1_)
    {
        super(p_i2076_1_);
    }

    public boolean isTransparent(BlockState state)
    {
        return true;
    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context)
    {
        return SHAPE;
    }

    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand)
    {
        super.animateTick(stateIn, worldIn, pos, rand);

        for (int i = -2; i <= 2; ++i)
        {
            for (int j = -2; j <= 2; ++j)
            {
                if (i > -2 && i < 2 && j == -1)
                {
                    j = 2;
                }

                if (rand.nextInt(16) == 0)
                {
                    for (int k = 0; k <= 1; ++k)
                    {
                        BlockPos blockpos = pos.add(i, k, j);

                        if (worldIn.getBlockState(blockpos).getBlock() == Blocks.BOOKSHELF)
                        {
                            if (!worldIn.isAirBlock(pos.add(i / 2, 0, j / 2)))
                            {
                                break;
                            }

                            worldIn.addParticle(ParticleTypes.ENCHANT, (double)pos.getX() + 0.5D, (double)pos.getY() + 2.0D, (double)pos.getZ() + 0.5D, (double)((float)i + rand.nextFloat()) - 0.5D, (double)((float)k - rand.nextFloat() - 1.0F), (double)((float)j + rand.nextFloat()) - 0.5D);
                        }
                    }
                }
            }
        }
    }

    public BlockRenderType getRenderType(BlockState state)
    {
        return BlockRenderType.MODEL;
    }

    public TileEntity createNewTileEntity(IBlockReader worldIn)
    {
        return new EnchantingTableTileEntity();
    }

    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit)
    {
        if (worldIn.isRemote)
        {
            return ActionResultType.SUCCESS;
        }
        else
        {
            player.openContainer(state.getContainer(worldIn, pos));
            return ActionResultType.SUCCESS;
        }
    }

    @Nullable
    public INamedContainerProvider getContainer(BlockState state, World worldIn, BlockPos pos)
    {
        TileEntity tileentity = worldIn.getTileEntity(pos);

        if (tileentity instanceof EnchantingTableTileEntity)
        {
            ITextComponent itextcomponent = ((INameable)tileentity).getDisplayName();
            return new SimpleNamedContainerProvider((p_220147_2_, p_220147_3_, p_220147_4_) ->
            {
                return new EnchantmentContainer(p_220147_2_, p_220147_3_, IWorldPosCallable.of(worldIn, pos));
            }, itextcomponent);
        }
        else
        {
            return null;
        }
    }

    public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, LivingEntity placer, ItemStack stack)
    {
        if (stack.hasDisplayName())
        {
            TileEntity tileentity = worldIn.getTileEntity(pos);

            if (tileentity instanceof EnchantingTableTileEntity)
            {
                ((EnchantingTableTileEntity)tileentity).setCustomName(stack.getDisplayName());
            }
        }
    }

    public boolean allowsMovement(BlockState state, IBlockReader worldIn, BlockPos pos, PathType type)
    {
        return false;
    }
}
