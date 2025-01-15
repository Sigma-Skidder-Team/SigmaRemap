package net.minecraft.client.gui.screen;

import net.minecraft.client.GameSettings;
import net.minecraft.util.text.ITextComponent;

public class SettingsScreen extends Screen
{
    protected final Screen parentScreen;
    protected final GameSettings gameSettings;

    public SettingsScreen(Screen p_i1297_1_, GameSettings p_i1297_2_, ITextComponent p_i1297_3_)
    {
        super(p_i1297_3_);
        this.parentScreen = p_i1297_1_;
        this.gameSettings = p_i1297_2_;
    }

    public void removed()
    {
        this.minecraft.gameSettings.saveOptions();
    }

    public void onClose()
    {
        this.minecraft.displayGuiScreen(this.parentScreen);
    }
}
