package net.minecraft.item;

public class BookItem extends Item
{
    public BookItem(Item.Properties p_i1899_1_)
    {
        super(p_i1899_1_);
    }

    public boolean isEnchantable(ItemStack stack)
    {
        return stack.getCount() == 1;
    }

    public int getItemEnchantability()
    {
        return 1;
    }
}
