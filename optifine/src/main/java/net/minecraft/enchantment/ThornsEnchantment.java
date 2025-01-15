package net.minecraft.enchantment;

import java.util.Random;
import java.util.Map.Entry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;

public class ThornsEnchantment extends Enchantment
{
    public ThornsEnchantment(Enchantment.Rarity p_i3194_1_, EquipmentSlotType... p_i3194_2_)
    {
        super(p_i3194_1_, EnchantmentType.ARMOR_CHEST, p_i3194_2_);
    }

    public int getMinEnchantability(int enchantmentLevel)
    {
        return 10 + 20 * (enchantmentLevel - 1);
    }

    public int getMaxEnchantability(int enchantmentLevel)
    {
        return super.getMinEnchantability(enchantmentLevel) + 50;
    }

    public int getMaxLevel()
    {
        return 3;
    }

    public boolean canApply(ItemStack stack)
    {
        return stack.getItem() instanceof ArmorItem ? true : super.canApply(stack);
    }

    public void onUserHurt(LivingEntity user, Entity attacker, int level)
    {
        Random random = user.getRNG();
        Entry<EquipmentSlotType, ItemStack> entry = EnchantmentHelper.getRandomItemWithEnchantment(Enchantments.THORNS, user);

        if (shouldHit(level, random))
        {
            if (attacker != null)
            {
                attacker.attackEntityFrom(DamageSource.causeThornsDamage(user), (float)getDamage(level, random));
            }

            if (entry != null)
            {
                entry.getValue().damageItem(3, user, (p_222183_1_) ->
                {
                    p_222183_1_.sendBreakAnimation(entry.getKey());
                });
            }
        }
        else if (entry != null)
        {
            entry.getValue().damageItem(1, user, (p_222182_1_) ->
            {
                p_222182_1_.sendBreakAnimation(entry.getKey());
            });
        }
    }

    public static boolean shouldHit(int level, Random rnd)
    {
        if (level <= 0)
        {
            return false;
        }
        else
        {
            return rnd.nextFloat() < 0.15F * (float)level;
        }
    }

    public static int getDamage(int level, Random rnd)
    {
        return level > 10 ? level - 10 : 1 + rnd.nextInt(4);
    }
}
