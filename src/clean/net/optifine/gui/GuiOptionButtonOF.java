package net.optifine.gui;

import net.minecraft.client.AbstractOption;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.widget.button.OptionButton;
import net.minecraft.util.text.StringTextComponent;

public class GuiOptionButtonOF extends OptionButton implements IOptionControl
{
    public GuiOptionButtonOF(int x, int y, int width, int height, AbstractOption option, String text, Button.IPressable pressable)
    {
        super(x, y, width, height, option, new StringTextComponent(text), pressable);
    }

    public AbstractOption getControlOption()
    {
        return this.func_238517_a_();
    }
}
