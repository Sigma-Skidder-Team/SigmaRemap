package net.minecraft.item;

import net.minecraft.util.ResourceLocation;

public class HorseArmorItem extends Item
{
    private final int field_219978_a;
    private final String field_219979_b;

    public HorseArmorItem(int p_i2013_1_, String p_i2013_2_, Item.Properties p_i2013_3_)
    {
        super(p_i2013_3_);
        this.field_219978_a = p_i2013_1_;
        this.field_219979_b = "textures/entity/horse/armor/horse_armor_" + p_i2013_2_ + ".png";
    }

    public ResourceLocation func_219976_d()
    {
        return new ResourceLocation(this.field_219979_b);
    }

    public int func_219977_e()
    {
        return this.field_219978_a;
    }
}
