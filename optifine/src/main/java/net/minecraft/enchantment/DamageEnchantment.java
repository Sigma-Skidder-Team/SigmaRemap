package net.minecraft.enchantment;

import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class DamageEnchantment extends Enchantment
{
    private static final String[] DAMAGE_NAMES = new String[] {"all", "undead", "arthropods"};
    private static final int[] MIN_COST = new int[] {1, 5, 5};
    private static final int[] LEVEL_COST = new int[] {11, 8, 8};
    private static final int[] LEVEL_COST_SPAN = new int[] {20, 20, 20};
    public final int damageType;

    public DamageEnchantment(Enchantment.Rarity p_i2634_1_, int p_i2634_2_, EquipmentSlotType... p_i2634_3_)
    {
        super(p_i2634_1_, EnchantmentType.WEAPON, p_i2634_3_);
        this.damageType = p_i2634_2_;
    }

    public int getMinEnchantability(int enchantmentLevel)
    {
        return MIN_COST[this.damageType] + (enchantmentLevel - 1) * LEVEL_COST[this.damageType];
    }

    public int getMaxEnchantability(int enchantmentLevel)
    {
        return this.getMinEnchantability(enchantmentLevel) + LEVEL_COST_SPAN[this.damageType];
    }

    public int getMaxLevel()
    {
        return 5;
    }

    public float calcDamageByCreature(int level, CreatureAttribute creatureType)
    {
        if (this.damageType == 0)
        {
            return 1.0F + (float)Math.max(0, level - 1) * 0.5F;
        }
        else if (this.damageType == 1 && creatureType == CreatureAttribute.UNDEAD)
        {
            return (float)level * 2.5F;
        }
        else
        {
            return this.damageType == 2 && creatureType == CreatureAttribute.ARTHROPOD ? (float)level * 2.5F : 0.0F;
        }
    }

    public boolean canApplyTogether(Enchantment ench)
    {
        return !(ench instanceof DamageEnchantment);
    }

    public boolean canApply(ItemStack stack)
    {
        return stack.getItem() instanceof AxeItem ? true : super.canApply(stack);
    }

    public void onEntityDamaged(LivingEntity user, Entity target, int level)
    {
        if (target instanceof LivingEntity)
        {
            LivingEntity livingentity = (LivingEntity)target;

            if (this.damageType == 2 && livingentity.getCreatureAttribute() == CreatureAttribute.ARTHROPOD)
            {
                int i = 20 + user.getRNG().nextInt(10 * level);
                livingentity.addPotionEffect(new EffectInstance(Effects.SLOWNESS, i, 3));
            }
        }
    }
}
