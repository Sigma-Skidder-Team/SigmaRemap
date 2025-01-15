package net.minecraft.item;

public class SimpleFoiledItem extends Item
{
    public SimpleFoiledItem(Item.Properties p_i2699_1_)
    {
        super(p_i2699_1_);
    }

    public boolean hasEffect(ItemStack stack)
    {
        return true;
    }
}
