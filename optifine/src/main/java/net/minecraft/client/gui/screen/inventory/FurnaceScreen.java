package net.minecraft.client.gui.screen.inventory;

import net.minecraft.client.gui.recipebook.FurnaceRecipeGui;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.FurnaceContainer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class FurnaceScreen extends AbstractFurnaceScreen<FurnaceContainer>
{
    private static final ResourceLocation FURNACE_GUI_TEXTURES = new ResourceLocation("textures/gui/container/furnace.png");

    public FurnaceScreen(FurnaceContainer p_i584_1_, PlayerInventory p_i584_2_, ITextComponent p_i584_3_)
    {
        super(p_i584_1_, new FurnaceRecipeGui(), p_i584_2_, p_i584_3_, FURNACE_GUI_TEXTURES);
    }
}
