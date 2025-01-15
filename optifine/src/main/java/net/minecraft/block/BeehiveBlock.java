package net.minecraft.block;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.item.TNTEntity;
import net.minecraft.entity.item.minecart.TNTMinecartEntity;
import net.minecraft.entity.monster.CreeperEntity;
import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.projectile.WitherSkullEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.BlockTags;
import net.minecraft.tileentity.BeehiveTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.GameRules;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootParameters;

public class BeehiveBlock extends ContainerBlock
{
    public static final Direction[] field_226871_a_ = new Direction[] {Direction.WEST, Direction.EAST, Direction.SOUTH};
    public static final DirectionProperty field_226872_b_ = HorizontalBlock.HORIZONTAL_FACING;
    public static final IntegerProperty field_226873_c_ = BlockStateProperties.field_227036_ao_;

    public BeehiveBlock(Block.Properties p_i1761_1_)
    {
        super(p_i1761_1_);
        this.setDefaultState(this.stateContainer.getBaseState().with(field_226873_c_, Integer.valueOf(0)).with(field_226872_b_, Direction.NORTH));
    }

    public boolean hasComparatorInputOverride(BlockState state)
    {
        return true;
    }

    public int getComparatorInputOverride(BlockState blockState, World worldIn, BlockPos pos)
    {
        return blockState.get(field_226873_c_);
    }

    public void harvestBlock(World worldIn, PlayerEntity player, BlockPos pos, BlockState state, @Nullable TileEntity te, ItemStack stack)
    {
        super.harvestBlock(worldIn, player, pos, state, te, stack);

        if (!worldIn.isRemote && te instanceof BeehiveTileEntity)
        {
            BeehiveTileEntity beehivetileentity = (BeehiveTileEntity)te;

            if (EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH, stack) == 0)
            {
                beehivetileentity.func_226963_a_(player, state, BeehiveTileEntity.State.EMERGENCY);
                worldIn.updateComparatorOutputLevel(pos, this);
                this.func_226881_b_(worldIn, pos);
            }

            CriteriaTriggers.field_229865_L_.func_226223_a_((ServerPlayerEntity)player, state.getBlock(), stack, beehivetileentity.func_226971_j_());
        }
    }

    private void func_226881_b_(World p_226881_1_, BlockPos p_226881_2_)
    {
        List<BeeEntity> list = p_226881_1_.getEntitiesWithinAABB(BeeEntity.class, (new AxisAlignedBB(p_226881_2_)).grow(8.0D, 6.0D, 8.0D));

        if (!list.isEmpty())
        {
            List<PlayerEntity> list1 = p_226881_1_.getEntitiesWithinAABB(PlayerEntity.class, (new AxisAlignedBB(p_226881_2_)).grow(8.0D, 6.0D, 8.0D));
            int i = list1.size();

            for (BeeEntity beeentity : list)
            {
                if (beeentity.getAttackTarget() == null)
                {
                    beeentity.func_226391_a_(list1.get(p_226881_1_.rand.nextInt(i)));
                }
            }
        }
    }

    public static void func_226878_a_(World p_226878_0_, BlockPos p_226878_1_)
    {
        spawnAsEntity(p_226878_0_, p_226878_1_, new ItemStack(Items.HONEYCOMB, 3));
    }

    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit)
    {
        ItemStack itemstack = player.getHeldItem(handIn);
        ItemStack itemstack1 = itemstack.copy();
        int i = state.get(field_226873_c_);
        boolean flag = false;

        if (i >= 5)
        {
            if (itemstack.getItem() == Items.SHEARS)
            {
                worldIn.playSound(player, player.getPosX(), player.getPosY(), player.getPosZ(), SoundEvents.field_226133_ah_, SoundCategory.NEUTRAL, 1.0F, 1.0F);
                func_226878_a_(worldIn, pos);
                itemstack.damageItem(1, player, (p_226874_1_) ->
                {
                    p_226874_1_.sendBreakAnimation(handIn);
                });
                flag = true;
            }
            else if (itemstack.getItem() == Items.GLASS_BOTTLE)
            {
                itemstack.shrink(1);
                worldIn.playSound(player, player.getPosX(), player.getPosY(), player.getPosZ(), SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.NEUTRAL, 1.0F, 1.0F);

                if (itemstack.isEmpty())
                {
                    player.setHeldItem(handIn, new ItemStack(Items.HONEY_BOTTLE));
                }
                else if (!player.inventory.addItemStackToInventory(new ItemStack(Items.HONEY_BOTTLE)))
                {
                    player.dropItem(new ItemStack(Items.HONEY_BOTTLE), false);
                }

                flag = true;
            }
        }

        if (flag)
        {
            if (!CampfireBlock.func_226914_b_(worldIn, pos, 5))
            {
                if (this.func_226882_d_(worldIn, pos))
                {
                    this.func_226881_b_(worldIn, pos);
                }

                this.func_226877_a_(worldIn, state, pos, player, BeehiveTileEntity.State.EMERGENCY);
            }
            else
            {
                this.func_226876_a_(worldIn, state, pos);

                if (player instanceof ServerPlayerEntity)
                {
                    CriteriaTriggers.field_229863_J_.func_226695_a_((ServerPlayerEntity)player, pos, itemstack1);
                }
            }

            return ActionResultType.SUCCESS;
        }
        else
        {
            return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
        }
    }

    private boolean func_226882_d_(World p_226882_1_, BlockPos p_226882_2_)
    {
        TileEntity tileentity = p_226882_1_.getTileEntity(p_226882_2_);

        if (tileentity instanceof BeehiveTileEntity)
        {
            BeehiveTileEntity beehivetileentity = (BeehiveTileEntity)tileentity;
            return !beehivetileentity.func_226969_f_();
        }
        else
        {
            return false;
        }
    }

    public void func_226877_a_(World p_226877_1_, BlockState p_226877_2_, BlockPos p_226877_3_, @Nullable PlayerEntity p_226877_4_, BeehiveTileEntity.State p_226877_5_)
    {
        this.func_226876_a_(p_226877_1_, p_226877_2_, p_226877_3_);
        TileEntity tileentity = p_226877_1_.getTileEntity(p_226877_3_);

        if (tileentity instanceof BeehiveTileEntity)
        {
            BeehiveTileEntity beehivetileentity = (BeehiveTileEntity)tileentity;
            beehivetileentity.func_226963_a_(p_226877_4_, p_226877_2_, p_226877_5_);
        }
    }

    public void func_226876_a_(World p_226876_1_, BlockState p_226876_2_, BlockPos p_226876_3_)
    {
        p_226876_1_.setBlockState(p_226876_3_, p_226876_2_.with(field_226873_c_, Integer.valueOf(0)), 3);
    }

    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand)
    {
        if (stateIn.get(field_226873_c_) >= 5)
        {
            for (int i = 0; i < rand.nextInt(1) + 1; ++i)
            {
                this.func_226879_a_(worldIn, pos, stateIn);
            }
        }
    }

    private void func_226879_a_(World p_226879_1_, BlockPos p_226879_2_, BlockState p_226879_3_)
    {
        if (p_226879_3_.getFluidState().isEmpty() && !(p_226879_1_.rand.nextFloat() < 0.3F))
        {
            VoxelShape voxelshape = p_226879_3_.getCollisionShape(p_226879_1_, p_226879_2_);
            double d0 = voxelshape.getEnd(Direction.Axis.Y);

            if (d0 >= 1.0D && !p_226879_3_.isIn(BlockTags.IMPERMEABLE))
            {
                double d1 = voxelshape.getStart(Direction.Axis.Y);

                if (d1 > 0.0D)
                {
                    this.func_226880_a_(p_226879_1_, p_226879_2_, voxelshape, (double)p_226879_2_.getY() + d1 - 0.05D);
                }
                else
                {
                    BlockPos blockpos = p_226879_2_.down();
                    BlockState blockstate = p_226879_1_.getBlockState(blockpos);
                    VoxelShape voxelshape1 = blockstate.getCollisionShape(p_226879_1_, blockpos);
                    double d2 = voxelshape1.getEnd(Direction.Axis.Y);

                    if ((d2 < 1.0D || !blockstate.isCollisionShapeOpaque(p_226879_1_, blockpos)) && blockstate.getFluidState().isEmpty())
                    {
                        this.func_226880_a_(p_226879_1_, p_226879_2_, voxelshape, (double)p_226879_2_.getY() - 0.05D);
                    }
                }
            }
        }
    }

    private void func_226880_a_(World p_226880_1_, BlockPos p_226880_2_, VoxelShape p_226880_3_, double p_226880_4_)
    {
        this.func_226875_a_(p_226880_1_, (double)p_226880_2_.getX() + p_226880_3_.getStart(Direction.Axis.X), (double)p_226880_2_.getX() + p_226880_3_.getEnd(Direction.Axis.X), (double)p_226880_2_.getZ() + p_226880_3_.getStart(Direction.Axis.Z), (double)p_226880_2_.getZ() + p_226880_3_.getEnd(Direction.Axis.Z), p_226880_4_);
    }

    private void func_226875_a_(World p_226875_1_, double p_226875_2_, double p_226875_4_, double p_226875_6_, double p_226875_8_, double p_226875_10_)
    {
        p_226875_1_.addParticle(ParticleTypes.DRIPPING_HONEY, MathHelper.lerp(p_226875_1_.rand.nextDouble(), p_226875_2_, p_226875_4_), p_226875_10_, MathHelper.lerp(p_226875_1_.rand.nextDouble(), p_226875_6_, p_226875_8_), 0.0D, 0.0D, 0.0D);
    }

    public BlockState getStateForPlacement(BlockItemUseContext context)
    {
        return this.getDefaultState().with(field_226872_b_, context.getPlacementHorizontalFacing().getOpposite());
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
    {
        builder.add(field_226873_c_, field_226872_b_);
    }

    public BlockRenderType getRenderType(BlockState state)
    {
        return BlockRenderType.MODEL;
    }

    @Nullable
    public TileEntity createNewTileEntity(IBlockReader worldIn)
    {
        return new BeehiveTileEntity();
    }

    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player)
    {
        if (!worldIn.isRemote && player.isCreative() && worldIn.getGameRules().getBoolean(GameRules.DO_TILE_DROPS))
        {
            TileEntity tileentity = worldIn.getTileEntity(pos);

            if (tileentity instanceof BeehiveTileEntity)
            {
                BeehiveTileEntity beehivetileentity = (BeehiveTileEntity)tileentity;
                ItemStack itemstack = new ItemStack(this);
                int i = state.get(field_226873_c_);
                boolean flag = !beehivetileentity.func_226969_f_();

                if (!flag && i == 0)
                {
                    return;
                }

                if (flag)
                {
                    CompoundNBT compoundnbt = new CompoundNBT();
                    compoundnbt.put("Bees", beehivetileentity.func_226974_m_());
                    itemstack.setTagInfo("BlockEntityTag", compoundnbt);
                }

                CompoundNBT compoundnbt1 = new CompoundNBT();
                compoundnbt1.putInt("honey_level", i);
                itemstack.setTagInfo("BlockStateTag", compoundnbt1);
                ItemEntity itementity = new ItemEntity(worldIn, (double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), itemstack);
                itementity.setDefaultPickupDelay();
                worldIn.addEntity(itementity);
            }
        }

        super.onBlockHarvested(worldIn, pos, state, player);
    }

    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder)
    {
        Entity entity = builder.get(LootParameters.THIS_ENTITY);

        if (entity instanceof TNTEntity || entity instanceof CreeperEntity || entity instanceof WitherSkullEntity || entity instanceof WitherEntity || entity instanceof TNTMinecartEntity)
        {
            TileEntity tileentity = builder.get(LootParameters.BLOCK_ENTITY);

            if (tileentity instanceof BeehiveTileEntity)
            {
                BeehiveTileEntity beehivetileentity = (BeehiveTileEntity)tileentity;
                beehivetileentity.func_226963_a_((PlayerEntity)null, state, BeehiveTileEntity.State.EMERGENCY);
            }
        }

        return super.getDrops(state, builder);
    }

    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos)
    {
        if (worldIn.getBlockState(facingPos).getBlock() instanceof FireBlock)
        {
            TileEntity tileentity = worldIn.getTileEntity(currentPos);

            if (tileentity instanceof BeehiveTileEntity)
            {
                BeehiveTileEntity beehivetileentity = (BeehiveTileEntity)tileentity;
                beehivetileentity.func_226963_a_((PlayerEntity)null, stateIn, BeehiveTileEntity.State.EMERGENCY);
            }
        }

        return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }
}
