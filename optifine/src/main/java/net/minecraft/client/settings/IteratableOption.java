package net.minecraft.client.settings;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import net.minecraft.client.GameSettings;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.gui.widget.button.OptionButton;

public class IteratableOption extends AbstractOption
{
    protected BiConsumer<GameSettings, Integer> setter;
    protected BiFunction<GameSettings, IteratableOption, String> getter;

    public IteratableOption(String p_i21_1_, BiConsumer<GameSettings, Integer> p_i21_2_, BiFunction<GameSettings, IteratableOption, String> p_i21_3_)
    {
        super(p_i21_1_);
        this.setter = p_i21_2_;
        this.getter = p_i21_3_;
    }

    public void setValueIndex(GameSettings options, int valueIn)
    {
        this.setter.accept(options, valueIn);
        options.saveOptions();
    }

    public Widget createWidget(GameSettings options, int xIn, int yIn, int widthIn)
    {
        return new OptionButton(xIn, yIn, widthIn, 20, this, this.getText(options), (p_lambda$createWidget$0_2_) ->
        {
            this.setValueIndex(options, 1);
            p_lambda$createWidget$0_2_.setMessage(this.getText(options));
        });
    }

    public String getText(GameSettings options)
    {
        return this.getter.apply(options, this);
    }
}
