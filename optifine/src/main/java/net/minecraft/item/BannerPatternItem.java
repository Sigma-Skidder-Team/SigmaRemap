package net.minecraft.item;

import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.tileentity.BannerPattern;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class BannerPatternItem extends Item
{
    private final BannerPattern field_219982_a;

    public BannerPatternItem(BannerPattern p_i2545_1_, Item.Properties p_i2545_2_)
    {
        super(p_i2545_2_);
        this.field_219982_a = p_i2545_1_;
    }

    public BannerPattern func_219980_b()
    {
        return this.field_219982_a;
    }

    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
    {
        tooltip.add(this.func_219981_d().applyTextStyle(TextFormatting.GRAY));
    }

    public ITextComponent func_219981_d()
    {
        return new TranslationTextComponent(this.getTranslationKey() + ".desc");
    }
}
