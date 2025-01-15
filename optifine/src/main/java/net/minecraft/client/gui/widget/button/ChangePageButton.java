package net.minecraft.client.gui.widget.button;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SimpleSound;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.gui.screen.ReadBookScreen;
import net.minecraft.util.SoundEvents;

public class ChangePageButton extends Button
{
    private final boolean field_212940_a;
    private final boolean field_212941_b;

    public ChangePageButton(int p_i1519_1_, int p_i1519_2_, boolean p_i1519_3_, Button.IPressable p_i1519_4_, boolean p_i1519_5_)
    {
        super(p_i1519_1_, p_i1519_2_, 23, 13, "", p_i1519_4_);
        this.field_212940_a = p_i1519_3_;
        this.field_212941_b = p_i1519_5_;
    }

    public void renderButton(int p_renderButton_1_, int p_renderButton_2_, float p_renderButton_3_)
    {
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        Minecraft.getInstance().getTextureManager().bindTexture(ReadBookScreen.BOOK_TEXTURES);
        int i = 0;
        int j = 192;

        if (this.isHovered())
        {
            i += 23;
        }

        if (!this.field_212940_a)
        {
            j += 13;
        }

        this.blit(this.x, this.y, i, j, 23, 13);
    }

    public void playDownSound(SoundHandler p_playDownSound_1_)
    {
        if (this.field_212941_b)
        {
            p_playDownSound_1_.play(SimpleSound.master(SoundEvents.ITEM_BOOK_PAGE_TURN, 1.0F));
        }
    }
}
