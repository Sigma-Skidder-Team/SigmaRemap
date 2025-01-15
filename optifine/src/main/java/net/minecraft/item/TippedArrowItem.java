package net.minecraft.item;

import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionUtils;
import net.minecraft.potion.Potions;
import net.minecraft.util.NonNullList;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

public class TippedArrowItem extends ArrowItem
{
    public TippedArrowItem(Item.Properties p_i1670_1_)
    {
        super(p_i1670_1_);
    }

    public ItemStack getDefaultInstance()
    {
        return PotionUtils.addPotionToItemStack(super.getDefaultInstance(), Potions.POISON);
    }

    public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items)
    {
        if (this.isInGroup(group))
        {
            for (Potion potion : Registry.POTION)
            {
                if (!potion.getEffects().isEmpty())
                {
                    items.add(PotionUtils.addPotionToItemStack(new ItemStack(this), potion));
                }
            }
        }
    }

    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
    {
        PotionUtils.addPotionTooltip(stack, tooltip, 0.125F);
    }

    public String getTranslationKey(ItemStack stack)
    {
        return PotionUtils.getPotionFromItem(stack).getNamePrefixed(this.getTranslationKey() + ".effect.");
    }
}
