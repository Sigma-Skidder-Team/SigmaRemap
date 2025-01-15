package net.minecraft.client.gui.screen.inventory;

import net.minecraft.client.gui.recipebook.BlastFurnaceRecipeGui;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.BlastFurnaceContainer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class BlastFurnaceScreen extends AbstractFurnaceScreen<BlastFurnaceContainer>
{
    private static final ResourceLocation GUI_TEXTURE = new ResourceLocation("textures/gui/container/blast_furnace.png");

    public BlastFurnaceScreen(BlastFurnaceContainer p_i535_1_, PlayerInventory p_i535_2_, ITextComponent p_i535_3_)
    {
        super(p_i535_1_, new BlastFurnaceRecipeGui(), p_i535_2_, p_i535_3_, GUI_TEXTURE);
    }
}
