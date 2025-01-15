package net.optifine.gui;

import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.widget.button.OptionButton;
import net.minecraft.client.settings.AbstractOption;

public class GuiOptionButtonOF extends OptionButton implements IOptionControl
{
    private AbstractOption option = null;

    public GuiOptionButtonOF(int x, int y, int width, int height, AbstractOption option, String text, Button.IPressable pressable)
    {
        super(x, y, width, height, option, text, pressable);
        this.option = option;
    }

    public AbstractOption getControlOption()
    {
        return this.option;
    }
}
