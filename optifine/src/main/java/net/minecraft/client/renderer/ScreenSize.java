package net.minecraft.client.renderer;

import java.util.OptionalInt;

public class ScreenSize
{
    public final int width;
    public final int height;
    public final OptionalInt fullscreenWidth;
    public final OptionalInt fullscreenHeight;
    public final boolean fullscreen;

    public ScreenSize(int p_i611_1_, int p_i611_2_, OptionalInt p_i611_3_, OptionalInt p_i611_4_, boolean p_i611_5_)
    {
        this.width = p_i611_1_;
        this.height = p_i611_2_;
        this.fullscreenWidth = p_i611_3_;
        this.fullscreenHeight = p_i611_4_;
        this.fullscreen = p_i611_5_;
    }
}
