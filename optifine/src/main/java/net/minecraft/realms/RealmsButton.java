package net.minecraft.realms;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

public abstract class RealmsButton extends AbstractRealmsButton<RealmsButtonProxy>
{
    protected static final ResourceLocation WIDGETS_LOCATION = new ResourceLocation("textures/gui/widgets.png");
    private final int id;
    private final RealmsButtonProxy proxy;

    public RealmsButton(int p_i1400_1_, int p_i1400_2_, int p_i1400_3_, String p_i1400_4_)
    {
        this(p_i1400_1_, p_i1400_2_, p_i1400_3_, 200, 20, p_i1400_4_);
    }

    public RealmsButton(int p_i1401_1_, int p_i1401_2_, int p_i1401_3_, int p_i1401_4_, int p_i1401_5_, String p_i1401_6_)
    {
        this.id = p_i1401_1_;
        this.proxy = new RealmsButtonProxy(this, p_i1401_2_, p_i1401_3_, p_i1401_6_, p_i1401_4_, p_i1401_5_, (p_229953_1_) ->
        {
            this.onPress();
        });
    }

    public RealmsButtonProxy getProxy()
    {
        return this.proxy;
    }

    public int id()
    {
        return this.id;
    }

    public void setMessage(String p_setMessage_1_)
    {
        this.proxy.setMessage(p_setMessage_1_);
    }

    public int getWidth()
    {
        return this.proxy.getWidth();
    }

    public int getHeight()
    {
        return this.proxy.getHeight();
    }

    public int func_223291_y_()
    {
        return this.proxy.y();
    }

    public int func_214457_x()
    {
        return this.proxy.x;
    }

    public void renderBg(int p_renderBg_1_, int p_renderBg_2_)
    {
    }

    public int getYImage(boolean p_getYImage_1_)
    {
        return this.proxy.getSuperYImage(p_getYImage_1_);
    }

    public abstract void onPress();

    public void onRelease(double p_onRelease_1_, double p_onRelease_3_)
    {
    }

    public void renderButton(int p_renderButton_1_, int p_renderButton_2_, float p_renderButton_3_)
    {
        this.getProxy().superRenderButton(p_renderButton_1_, p_renderButton_2_, p_renderButton_3_);
    }

    public void drawCenteredString(String p_drawCenteredString_1_, int p_drawCenteredString_2_, int p_drawCenteredString_3_, int p_drawCenteredString_4_)
    {
        this.getProxy().drawCenteredString(Minecraft.getInstance().fontRenderer, p_drawCenteredString_1_, p_drawCenteredString_2_, p_drawCenteredString_3_, p_drawCenteredString_4_);
    }
}
