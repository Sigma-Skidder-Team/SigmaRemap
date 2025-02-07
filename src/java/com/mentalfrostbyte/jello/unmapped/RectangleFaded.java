package com.mentalfrostbyte.jello.unmapped;

import com.mentalfrostbyte.jello.gui.GuiSwitch;
import com.mentalfrostbyte.jello.util.MathUtils;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.render.animation.Animation;
import com.mentalfrostbyte.jello.util.ClientColors;
import org.newdawn.slick.opengl.Texture;
import mapped.*;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class RectangleFaded extends ButtonPanel {
    private final Texture field20590;
    private final Animation field20592 = new Animation(150, 190, Animation.Direction.BACKWARDS);
    private boolean field20591;

    public RectangleFaded(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, Texture var7) {
        super(var1, var2, var3, var4, var5, var6);
        this.field20590 = var7;
    }

    @Override
    public void updatePanelDimensions(int newHeight, int newWidth) {
        this.field20591 = this.method13298();
        super.updatePanelDimensions(newHeight, newWidth);
    }

    @Override
    public void draw(float partialTicks) {
        this.field20592.changeDirection(!this.field20591 ? Animation.Direction.BACKWARDS : Animation.Direction.FORWARDS);
        float var4 = MathUtils.lerp(this.field20592.calcPercent(), 0.07, 0.73, 0.63, 1.01);
        if (this.field20592.getDirection() == Animation.Direction.BACKWARDS) {
            var4 = MathUtils.lerp(this.field20592.calcPercent(), 0.71, 0.18, 0.95, 0.57);
        }

        RenderUtil.startScissor((float) this.getXA(), (float) this.getYA() - var4 * 3.0F, (float) this.getWidthA(),
                (float) this.getHeightA());
        int var5 = 40;
        float var6 = -GuiSwitch.field21070 / (float) Minecraft.getInstance().mainWindow.getWidth();
        float var7 = -GuiSwitch.field21071 / (float) Minecraft.getInstance().mainWindow.getHeight();
        RenderUtil.method11455(
                (float) var5 * var6,
                (float) var5 * var7,
                (float) (Minecraft.getInstance().mainWindow.getWidth() + var5),
                (float) (Minecraft.getInstance().mainWindow.getHeight() + var5),
                CustomResourceLoadProgressGui.field6780);
        RenderUtil.endScissor();
        if (this.field20591) {
            RenderUtil.renderBackgroundBox(
                    (float) this.getXA(),
                    (float) this.getYA() - var4 * 3.0F,
                    (float) this.getWidthA(),
                    (float) this.getHeightA(),
                    MultiUtilities.applyAlpha(-12319668, 0.5F));
        }

        RenderUtil.drawImage(
                (float) this.getXA(),
                (float) this.getYA() - var4 * 3.0F,
                (float) this.getWidthA(),
                (float) this.getHeightA(),
                this.field20590,
                ClientColors.LIGHT_GREYISH_BLUE.getColor());
        GL11.glPushMatrix();
        super.method13226(partialTicks);
        GL11.glPopMatrix();
    }
}
