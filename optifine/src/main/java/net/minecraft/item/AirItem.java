package net.minecraft.item;

import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

public class AirItem extends Item
{
    private final Block block;

    public AirItem(Block p_i2881_1_, Item.Properties p_i2881_2_)
    {
        super(p_i2881_2_);
        this.block = p_i2881_1_;
    }

    public String getTranslationKey()
    {
        return this.block.getTranslationKey();
    }

    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
    {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        this.block.addInformation(stack, worldIn, tooltip, flagIn);
    }
}
