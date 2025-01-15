package net.minecraft.client.gui.screen.inventory;

import net.minecraft.client.gui.recipebook.SmokerRecipeGui;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.SmokerContainer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class SmokerScreen extends AbstractFurnaceScreen<SmokerContainer>
{
    private static final ResourceLocation GUI_TEXTURE = new ResourceLocation("textures/gui/container/smoker.png");

    public SmokerScreen(SmokerContainer p_i1087_1_, PlayerInventory p_i1087_2_, ITextComponent p_i1087_3_)
    {
        super(p_i1087_1_, new SmokerRecipeGui(), p_i1087_2_, p_i1087_3_, GUI_TEXTURE);
    }
}
