package net.minecraft.enchantment;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.World;

public class FrostWalkerEnchantment extends Enchantment
{
    public FrostWalkerEnchantment(Enchantment.Rarity p_i3155_1_, EquipmentSlotType... p_i3155_2_)
    {
        super(p_i3155_1_, EnchantmentType.ARMOR_FEET, p_i3155_2_);
    }

    public int getMinEnchantability(int enchantmentLevel)
    {
        return enchantmentLevel * 10;
    }

    public int getMaxEnchantability(int enchantmentLevel)
    {
        return this.getMinEnchantability(enchantmentLevel) + 15;
    }

    public boolean isTreasureEnchantment()
    {
        return true;
    }

    public int getMaxLevel()
    {
        return 2;
    }

    public static void freezeNearby(LivingEntity living, World worldIn, BlockPos pos, int level)
    {
        if (living.onGround)
        {
            BlockState blockstate = Blocks.FROSTED_ICE.getDefaultState();
            float f = (float)Math.min(16, 2 + level);
            BlockPos.Mutable blockpos$mutable = new BlockPos.Mutable();

            for (BlockPos blockpos : BlockPos.getAllInBoxMutable(pos.add((double)(-f), -1.0D, (double)(-f)), pos.add((double)f, -1.0D, (double)f)))
            {
                if (blockpos.withinDistance(living.getPositionVec(), (double)f))
                {
                    blockpos$mutable.setPos(blockpos.getX(), blockpos.getY() + 1, blockpos.getZ());
                    BlockState blockstate1 = worldIn.getBlockState(blockpos$mutable);

                    if (blockstate1.isAir())
                    {
                        BlockState blockstate2 = worldIn.getBlockState(blockpos);

                        if (blockstate2.getMaterial() == Material.WATER && blockstate2.get(FlowingFluidBlock.LEVEL) == 0 && blockstate.isValidPosition(worldIn, blockpos) && worldIn.func_226663_a_(blockstate, blockpos, ISelectionContext.dummy()))
                        {
                            worldIn.setBlockState(blockpos, blockstate);
                            worldIn.getPendingBlockTicks().scheduleTick(blockpos, Blocks.FROSTED_ICE, MathHelper.nextInt(living.getRNG(), 60, 120));
                        }
                    }
                }
            }
        }
    }

    public boolean canApplyTogether(Enchantment ench)
    {
        return super.canApplyTogether(ench) && ench != Enchantments.DEPTH_STRIDER;
    }
}
