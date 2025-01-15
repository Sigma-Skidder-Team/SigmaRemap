package net.minecraft.item;

public class EnchantedGoldenAppleItem extends Item
{
    public EnchantedGoldenAppleItem(Item.Properties p_i1370_1_)
    {
        super(p_i1370_1_);
    }

    public boolean hasEffect(ItemStack stack)
    {
        return true;
    }
}
