package mapped;

import com.mentalfrostbyte.jello.unmapped.GuiComponent;
import com.mentalfrostbyte.jello.unmapped.ResourceList;
import com.mentalfrostbyte.jello.util.ClientColors;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.render.animation.Animation;
import org.lwjgl.opengl.GL11;

public class UICheckBox extends InteractiveWidget {
    public boolean value;
    public Animation animation = new Animation(70, 90);

    public UICheckBox(GuiComponent var1, String var2, int var3, int var4, int var5, int var6) {
        super(var1, var2, var3, var4, var5, var6, false);
    }

    public boolean getValue() {
        return this.value;
    }

    public void setValue(boolean value, boolean call) {
        if (value != this.getValue()) {
            this.value = value;
            this.animation.changeDirection(!this.value ? Animation.Direction.FORWARDS : Animation.Direction.BACKWARDS);
            if (call) {
                this.firePressHandlers();
            }
        }
    }

    @Override
    public void draw(float partialTicks) {
        float over = !this.isMouseDownOverComponent() ? 0.43F : 0.6F;
        RenderUtil.drawRect(
                (float) this.xA,
                (float) this.yA,
                (float) this.widthA,
                (float) this.heightA,
                10.0F,
                MultiUtilities.applyAlpha(-4144960, over * this.animation.calcPercent() * partialTicks));
        float scale = (1.0F - this.animation.calcPercent()) * partialTicks;
        RenderUtil.drawRect(
                (float) this.xA,
                (float) this.yA,
                (float) this.widthA,
                (float) this.heightA,
                10.0F,
                MultiUtilities.applyAlpha(MultiUtilities.blendColors(-14047489, ClientColors.DEEP_TEAL.getColor(),
                        !this.isMouseDownOverComponent() ? 1.0F : 0.9F), scale));
        GL11.glPushMatrix();
        GL11.glTranslatef((float) (this.getXA() + this.getWidthA() / 2), (float) (this.getYA() + this.getHeightA() / 2),
                0.0F);
        GL11.glScalef(1.5F - 0.5F * scale, 1.5F - 0.5F * scale, 0.0F);
        GL11.glTranslatef((float) (-this.getXA() - this.getWidthA() / 2), (float) (-this.getYA() - this.getHeightA() / 2),
                0.0F);
        RenderUtil.drawImage(
                (float) this.xA,
                (float) this.yA,
                (float) this.widthA,
                (float) this.heightA,
                ResourceList.checkPNG,
                MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor(), scale));
        GL11.glPopMatrix();
        scale *= scale;
        super.draw(partialTicks);
    }

    @Override
    public void onMouseClick(int mouseX, int mouseY, int mouseButton) {
        this.setValue(!this.value, true);
    }
}
