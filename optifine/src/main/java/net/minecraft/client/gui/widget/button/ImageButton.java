package net.minecraft.client.gui.widget.button;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

public class ImageButton extends Button
{
    private final ResourceLocation resourceLocation;
    private final int xTexStart;
    private final int yTexStart;
    private final int yDiffText;
    private final int field_212935_e;
    private final int field_212936_f;

    public ImageButton(int p_i580_1_, int p_i580_2_, int p_i580_3_, int p_i580_4_, int p_i580_5_, int p_i580_6_, int p_i580_7_, ResourceLocation p_i580_8_, Button.IPressable p_i580_9_)
    {
        this(p_i580_1_, p_i580_2_, p_i580_3_, p_i580_4_, p_i580_5_, p_i580_6_, p_i580_7_, p_i580_8_, 256, 256, p_i580_9_);
    }

    public ImageButton(int p_i581_1_, int p_i581_2_, int p_i581_3_, int p_i581_4_, int p_i581_5_, int p_i581_6_, int p_i581_7_, ResourceLocation p_i581_8_, int p_i581_9_, int p_i581_10_, Button.IPressable p_i581_11_)
    {
        this(p_i581_1_, p_i581_2_, p_i581_3_, p_i581_4_, p_i581_5_, p_i581_6_, p_i581_7_, p_i581_8_, p_i581_9_, p_i581_10_, p_i581_11_, "");
    }

    public ImageButton(int p_i582_1_, int p_i582_2_, int p_i582_3_, int p_i582_4_, int p_i582_5_, int p_i582_6_, int p_i582_7_, ResourceLocation p_i582_8_, int p_i582_9_, int p_i582_10_, Button.IPressable p_i582_11_, String p_i582_12_)
    {
        super(p_i582_1_, p_i582_2_, p_i582_3_, p_i582_4_, p_i582_12_, p_i582_11_);
        this.field_212935_e = p_i582_9_;
        this.field_212936_f = p_i582_10_;
        this.xTexStart = p_i582_5_;
        this.yTexStart = p_i582_6_;
        this.yDiffText = p_i582_7_;
        this.resourceLocation = p_i582_8_;
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
        int i = this.yTexStart;

        if (this.isHovered())
        {
            i += this.yDiffText;
        }

        blit(this.x, this.y, (float)this.xTexStart, (float)i, this.width, this.height, this.field_212935_e, this.field_212936_f);
        RenderSystem.enableDepthTest();
    }
}
