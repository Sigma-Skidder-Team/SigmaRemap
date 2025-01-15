package net.minecraft.client.settings;

import java.util.function.BooleanSupplier;
import net.minecraft.client.util.InputMappings;

public class ToggleableKeyBinding extends KeyBinding
{
    private final BooleanSupplier getterToggle;

    public ToggleableKeyBinding(String p_i1826_1_, int p_i1826_2_, String p_i1826_3_, BooleanSupplier p_i1826_4_)
    {
        super(p_i1826_1_, InputMappings.Type.KEYSYM, p_i1826_2_, p_i1826_3_);
        this.getterToggle = p_i1826_4_;
    }

    public void setPressed(boolean valueIn)
    {
        if (this.getterToggle.getAsBoolean())
        {
            if (valueIn)
            {
                super.setPressed(!this.isKeyDown());
            }
        }
        else
        {
            super.setPressed(valueIn);
        }
    }
}
