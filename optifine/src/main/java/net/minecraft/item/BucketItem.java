package net.minecraft.item;

import javax.annotation.Nullable;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.BlockState;
import net.minecraft.block.IBucketPickupHandler;
import net.minecraft.block.ILiquidContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.stats.Stats;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class BucketItem extends Item
{
    private final Fluid containedBlock;

    public BucketItem(Fluid p_i3435_1_, Item.Properties p_i3435_2_)
    {
        super(p_i3435_2_);
        this.containedBlock = p_i3435_1_;
    }

    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn)
    {
        ItemStack itemstack = playerIn.getHeldItem(handIn);
        RayTraceResult raytraceresult = rayTrace(worldIn, playerIn, this.containedBlock == Fluids.EMPTY ? RayTraceContext.FluidMode.SOURCE_ONLY : RayTraceContext.FluidMode.NONE);

        if (raytraceresult.getType() == RayTraceResult.Type.MISS)
        {
            return ActionResult.resultPass(itemstack);
        }
        else if (raytraceresult.getType() != RayTraceResult.Type.BLOCK)
        {
            return ActionResult.resultPass(itemstack);
        }
        else
        {
            BlockRayTraceResult blockraytraceresult = (BlockRayTraceResult)raytraceresult;
            BlockPos blockpos = blockraytraceresult.getPos();
            Direction direction = blockraytraceresult.getFace();
            BlockPos blockpos1 = blockpos.offset(direction);

            if (worldIn.isBlockModifiable(playerIn, blockpos) && playerIn.canPlayerEdit(blockpos1, direction, itemstack))
            {
                if (this.containedBlock == Fluids.EMPTY)
                {
                    BlockState blockstate1 = worldIn.getBlockState(blockpos);

                    if (blockstate1.getBlock() instanceof IBucketPickupHandler)
                    {
                        Fluid fluid = ((IBucketPickupHandler)blockstate1.getBlock()).pickupFluid(worldIn, blockpos, blockstate1);

                        if (fluid != Fluids.EMPTY)
                        {
                            playerIn.addStat(Stats.ITEM_USED.get(this));
                            playerIn.playSound(fluid.isIn(FluidTags.LAVA) ? SoundEvents.ITEM_BUCKET_FILL_LAVA : SoundEvents.ITEM_BUCKET_FILL, 1.0F, 1.0F);
                            ItemStack itemstack1 = this.fillBucket(itemstack, playerIn, fluid.getFilledBucket());

                            if (!worldIn.isRemote)
                            {
                                CriteriaTriggers.FILLED_BUCKET.trigger((ServerPlayerEntity)playerIn, new ItemStack(fluid.getFilledBucket()));
                            }

                            return ActionResult.resultSuccess(itemstack1);
                        }
                    }

                    return ActionResult.resultFail(itemstack);
                }
                else
                {
                    BlockState blockstate = worldIn.getBlockState(blockpos);
                    BlockPos blockpos2 = blockstate.getBlock() instanceof ILiquidContainer && this.containedBlock == Fluids.WATER ? blockpos : blockpos1;

                    if (this.tryPlaceContainedLiquid(playerIn, worldIn, blockpos2, blockraytraceresult))
                    {
                        this.onLiquidPlaced(worldIn, itemstack, blockpos2);

                        if (playerIn instanceof ServerPlayerEntity)
                        {
                            CriteriaTriggers.PLACED_BLOCK.trigger((ServerPlayerEntity)playerIn, blockpos2, itemstack);
                        }

                        playerIn.addStat(Stats.ITEM_USED.get(this));
                        return ActionResult.resultSuccess(this.emptyBucket(itemstack, playerIn));
                    }
                    else
                    {
                        return ActionResult.resultFail(itemstack);
                    }
                }
            }
            else
            {
                return ActionResult.resultFail(itemstack);
            }
        }
    }

    protected ItemStack emptyBucket(ItemStack p_203790_1_, PlayerEntity p_203790_2_)
    {
        return !p_203790_2_.abilities.isCreativeMode ? new ItemStack(Items.BUCKET) : p_203790_1_;
    }

    public void onLiquidPlaced(World worldIn, ItemStack p_203792_2_, BlockPos pos)
    {
    }

    private ItemStack fillBucket(ItemStack emptyBuckets, PlayerEntity player, Item fullBucket)
    {
        if (player.abilities.isCreativeMode)
        {
            return emptyBuckets;
        }
        else
        {
            emptyBuckets.shrink(1);

            if (emptyBuckets.isEmpty())
            {
                return new ItemStack(fullBucket);
            }
            else
            {
                if (!player.inventory.addItemStackToInventory(new ItemStack(fullBucket)))
                {
                    player.dropItem(new ItemStack(fullBucket), false);
                }

                return emptyBuckets;
            }
        }
    }

    public boolean tryPlaceContainedLiquid(@Nullable PlayerEntity player, World worldIn, BlockPos posIn, @Nullable BlockRayTraceResult p_180616_4_)
    {
        if (!(this.containedBlock instanceof FlowingFluid))
        {
            return false;
        }
        else
        {
            BlockState blockstate = worldIn.getBlockState(posIn);
            Material material = blockstate.getMaterial();
            boolean flag = blockstate.isReplaceable(this.containedBlock);

            if (blockstate.isAir() || flag || blockstate.getBlock() instanceof ILiquidContainer && ((ILiquidContainer)blockstate.getBlock()).canContainFluid(worldIn, posIn, blockstate, this.containedBlock))
            {
                if (worldIn.dimension.doesWaterVaporize() && this.containedBlock.isIn(FluidTags.WATER))
                {
                    int i = posIn.getX();
                    int j = posIn.getY();
                    int k = posIn.getZ();
                    worldIn.playSound(player, posIn, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.BLOCKS, 0.5F, 2.6F + (worldIn.rand.nextFloat() - worldIn.rand.nextFloat()) * 0.8F);

                    for (int l = 0; l < 8; ++l)
                    {
                        worldIn.addParticle(ParticleTypes.LARGE_SMOKE, (double)i + Math.random(), (double)j + Math.random(), (double)k + Math.random(), 0.0D, 0.0D, 0.0D);
                    }
                }
                else if (blockstate.getBlock() instanceof ILiquidContainer && this.containedBlock == Fluids.WATER)
                {
                    if (((ILiquidContainer)blockstate.getBlock()).receiveFluid(worldIn, posIn, blockstate, ((FlowingFluid)this.containedBlock).getStillFluidState(false)))
                    {
                        this.playEmptySound(player, worldIn, posIn);
                    }
                }
                else
                {
                    if (!worldIn.isRemote && flag && !material.isLiquid())
                    {
                        worldIn.destroyBlock(posIn, true);
                    }

                    this.playEmptySound(player, worldIn, posIn);
                    worldIn.setBlockState(posIn, this.containedBlock.getDefaultState().getBlockState(), 11);
                }

                return true;
            }
            else
            {
                return p_180616_4_ == null ? false : this.tryPlaceContainedLiquid(player, worldIn, p_180616_4_.getPos().offset(p_180616_4_.getFace()), (BlockRayTraceResult)null);
            }
        }
    }

    protected void playEmptySound(@Nullable PlayerEntity player, IWorld worldIn, BlockPos pos)
    {
        SoundEvent soundevent = this.containedBlock.isIn(FluidTags.LAVA) ? SoundEvents.ITEM_BUCKET_EMPTY_LAVA : SoundEvents.ITEM_BUCKET_EMPTY;
        worldIn.playSound(player, pos, soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
    }
}
