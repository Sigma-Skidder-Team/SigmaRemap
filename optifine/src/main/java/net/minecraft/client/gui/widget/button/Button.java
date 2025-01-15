package net.minecraft.client.gui.widget.button;

public class Button extends AbstractButton
{
    protected final Button.IPressable onPress;

    public Button(int p_i4001_1_, int p_i4001_2_, int p_i4001_3_, int p_i4001_4_, String p_i4001_5_, Button.IPressable p_i4001_6_)
    {
        super(p_i4001_1_, p_i4001_2_, p_i4001_3_, p_i4001_4_, p_i4001_5_);
        this.onPress = p_i4001_6_;
    }

    public void onPress()
    {
        this.onPress.onPress(this);
    }

    public interface IPressable
    {
        void onPress(Button p_onPress_1_);
    }
}
