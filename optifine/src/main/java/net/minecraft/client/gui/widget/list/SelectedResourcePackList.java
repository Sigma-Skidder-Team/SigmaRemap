package net.minecraft.client.gui.widget.list;

import net.minecraft.client.Minecraft;
import net.minecraft.util.text.TranslationTextComponent;

public class SelectedResourcePackList extends AbstractResourcePackList
{
    public SelectedResourcePackList(Minecraft p_i2917_1_, int p_i2917_2_, int p_i2917_3_)
    {
        super(p_i2917_1_, p_i2917_2_, p_i2917_3_, new TranslationTextComponent("resourcePack.selected.title"));
    }
}
