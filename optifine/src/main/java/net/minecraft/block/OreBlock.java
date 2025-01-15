package net.minecraft.block;

import java.util.Random;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class OreBlock extends Block
{
    public OreBlock(Block.Properties p_i2638_1_)
    {
        super(p_i2638_1_);
    }

    protected int getExperience(Random p_220281_1_)
    {
        if (this == Blocks.COAL_ORE)
        {
            return MathHelper.nextInt(p_220281_1_, 0, 2);
        }
        else if (this == Blocks.DIAMOND_ORE)
        {
            return MathHelper.nextInt(p_220281_1_, 3, 7);
        }
        else if (this == Blocks.EMERALD_ORE)
        {
            return MathHelper.nextInt(p_220281_1_, 3, 7);
        }
        else if (this == Blocks.LAPIS_ORE)
        {
            return MathHelper.nextInt(p_220281_1_, 2, 5);
        }
        else
        {
            return this == Blocks.NETHER_QUARTZ_ORE ? MathHelper.nextInt(p_220281_1_, 2, 5) : 0;
        }
    }

    public void spawnAdditionalDrops(BlockState state, World worldIn, BlockPos pos, ItemStack stack)
    {
        super.spawnAdditionalDrops(state, worldIn, pos, stack);

        if (EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH, stack) == 0)
        {
            int i = this.getExperience(worldIn.rand);

            if (i > 0)
            {
                this.dropXpOnBlockBreak(worldIn, pos, i);
            }
        }
    }
}
