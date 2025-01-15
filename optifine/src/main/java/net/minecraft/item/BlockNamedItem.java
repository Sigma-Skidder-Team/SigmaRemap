package net.minecraft.item;

import net.minecraft.block.Block;

public class BlockNamedItem extends BlockItem
{
    public BlockNamedItem(Block p_i407_1_, Item.Properties p_i407_2_)
    {
        super(p_i407_1_, p_i407_2_);
    }

    public String getTranslationKey()
    {
        return this.getDefaultTranslationKey();
    }
}
