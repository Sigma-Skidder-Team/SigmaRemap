package net.minecraft.item;

public class TieredItem extends Item
{
    private final IItemTier tier;

    public TieredItem(IItemTier p_i2660_1_, Item.Properties p_i2660_2_)
    {
        super(p_i2660_2_.defaultMaxDamage(p_i2660_1_.getMaxUses()));
        this.tier = p_i2660_1_;
    }

    public IItemTier getTier()
    {
        return this.tier;
    }

    public int getItemEnchantability()
    {
        return this.tier.getEnchantability();
    }

    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        return this.tier.getRepairMaterial().test(repair) || super.getIsRepairable(toRepair, repair);
    }
}
