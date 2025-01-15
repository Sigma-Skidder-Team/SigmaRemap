package net.minecraft.client.gui.widget.list;

import net.minecraft.client.Minecraft;
import net.minecraft.util.text.TranslationTextComponent;

public class AvailableResourcePackList extends AbstractResourcePackList
{
    public AvailableResourcePackList(Minecraft p_i3461_1_, int p_i3461_2_, int p_i3461_3_)
    {
        super(p_i3461_1_, p_i3461_2_, p_i3461_3_, new TranslationTextComponent("resourcePack.available.title"));
    }
}
