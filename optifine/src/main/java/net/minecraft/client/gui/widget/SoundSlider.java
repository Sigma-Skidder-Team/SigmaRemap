package net.minecraft.client.gui.widget;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.SoundCategory;

public class SoundSlider extends AbstractSlider
{
    private final SoundCategory category;

    public SoundSlider(Minecraft p_i1870_1_, int p_i1870_2_, int p_i1870_3_, SoundCategory p_i1870_4_, int p_i1870_5_)
    {
        super(p_i1870_1_.gameSettings, p_i1870_2_, p_i1870_3_, p_i1870_5_, 20, (double)p_i1870_1_.gameSettings.getSoundLevel(p_i1870_4_));
        this.category = p_i1870_4_;
        this.updateMessage();
    }

    protected void updateMessage()
    {
        String s = (float)this.value == (float)this.getYImage(false) ? I18n.format("options.off") : (int)((float)this.value * 100.0F) + "%";
        this.setMessage(I18n.format("soundCategory." + this.category.getName()) + ": " + s);
    }

    protected void applyValue()
    {
        this.options.setSoundLevel(this.category, (float)this.value);
        this.options.saveOptions();
    }
}
