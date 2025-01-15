package net.minecraft.client.gui.widget;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

public class ToggleWidget extends Widget
{
    protected ResourceLocation resourceLocation;
    protected boolean stateTriggered;
    protected int xTexStart;
    protected int yTexStart;
    protected int xDiffTex;
    protected int yDiffTex;

    public ToggleWidget(int p_i2557_1_, int p_i2557_2_, int p_i2557_3_, int p_i2557_4_, boolean p_i2557_5_)
    {
        super(p_i2557_1_, p_i2557_2_, p_i2557_3_, p_i2557_4_, "");
        this.stateTriggered = p_i2557_5_;
    }

    public void initTextureValues(int xTexStartIn, int yTexStartIn, int xDiffTexIn, int yDiffTexIn, ResourceLocation resourceLocationIn)
    {
        this.xTexStart = xTexStartIn;
        this.yTexStart = yTexStartIn;
        this.xDiffTex = xDiffTexIn;
        this.yDiffTex = yDiffTexIn;
        this.resourceLocation = resourceLocationIn;
    }

    public void setStateTriggered(boolean triggered)
    {
        this.stateTriggered = triggered;
    }

    public boolean isStateTriggered()
    {
        return this.stateTriggered;
    }

    public void setPosition(int xIn, int yIn)
    {
        this.x = xIn;
        this.y = yIn;
    }

    public void renderButton(int p_renderButton_1_, int p_renderButton_2_, float p_renderButton_3_)
    {
        Minecraft minecraft = Minecraft.getInstance();
        minecraft.getTextureManager().bindTexture(this.resourceLocation);
        RenderSystem.disableDepthTest();
        int i = this.xTexStart;
        int j = this.yTexStart;

        if (this.stateTriggered)
        {
            i += this.xDiffTex;
        }

        if (this.isHovered())
        {
            j += this.yDiffTex;
        }

        this.blit(this.x, this.y, i, j, this.width, this.height);
        RenderSystem.enableDepthTest();
    }
}
