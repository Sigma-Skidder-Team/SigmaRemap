package com.mentalfrostbyte.jello.module.impl.gui.jello;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventRender;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.event.priority.LowestPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.player.MovementUtil;
import com.mentalfrostbyte.jello.util.render.animation.Animation;
import com.mentalfrostbyte.jello.util.ClientColors;
import mapped.*;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class Cords extends Module {
    private int field23755;
    private final Animation field23756 = new Animation(1500, 1500, Animation.Direction.BACKWARDS);

    public Cords() {
        super(ModuleCategory.GUI, "Cords", "Displays coordinates");
    }

    @EventTarget
    private void method16578(TickEvent var1) {
        if (this.isEnabled()) {
            if (MultiUtilities.method17705() > this.field23755 && mc.player.ticksExisted % 3 == 0) {
                this.field23755++;
            }

            if (MultiUtilities.method17705() < this.field23755 && mc.player.ticksExisted % 3 == 0) {
                this.field23755--;
            }

            boolean var4 = MovementUtil.isMoving() || mc.player.isJumping || mc.player.isSneaking();
            if (!var4) {
                if (this.field23756.calcPercent() == 1.0F && this.field23756.getDirection() == Animation.Direction.FORWARDS) {
                    this.field23756.changeDirection(Animation.Direction.BACKWARDS);
                }
            } else {
                this.field23756.changeDirection(Animation.Direction.FORWARDS);
            }
        }
    }

    @EventTarget
    @LowestPriority
    private void method16579(EventRender var1) {
        if (this.isEnabled()) {
            if (mc.player != null) {
                if (!Minecraft.getInstance().gameSettings.showDebugInfo) {
                    if (!Minecraft.getInstance().gameSettings.hideGUI) {
                        float var4 = Math.min(1.0F, 0.6F + this.field23756.calcPercent() * 4.0F);
                        String var5 = mc.player.getPosition().getX()
                                + " "
                                + mc.player.getPosition().getY()
                                + " "
                                + mc.player.getPosition().getZ();
                        float var6 = 85;
                        int var7 = var1.getYOffset();
                        float var8 = 150;
                        float var9 = (float) ResourceRegistry.JelloLightFont18.getWidth(var5);
                        float var10 = Math.min(1.0F, (float) var8 / var9);
                        if (this.field23756.getDirection() != Animation.Direction.FORWARDS) {
                            var10 *= 0.9F
                                    + QuadraticEasing.easeInQuad(Math.min(1.0F, this.field23756.calcPercent() * 8.0F),
                                            0.0F, 1.0F, 1.0F) * 0.1F;
                        } else {
                            var10 *= 0.9F
                                    + EasingFunctions.easeOutBack(Math.min(1.0F, this.field23756.calcPercent() * 7.0F),
                                            0.0F, 1.0F, 1.0F) * 0.1F;
                        }

                        GL11.glPushMatrix();
                        GL11.glTranslatef(var6, (float) (var7 + 10), 0.0F);
                        GL11.glScalef(var10, var10, 1.0F);
                        GL11.glTranslatef(-var6, (float) (-var7 - 10), 0.0F);
                        RenderUtil.method11440(
                                ResourceRegistry.JelloLightFont18_1,
                                var6,
                                (float) var7,
                                var5,
                                MultiUtilities.applyAlpha(-16777216, 0.5F * var4),
                                Class2218.field14492,
                                Class2218.field14488);
                        RenderUtil.method11440(
                                ResourceRegistry.JelloLightFont18,
                                var6,
                                (float) var7,
                                var5,
                                MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor(), 0.8F * var4),
                                Class2218.field14492,
                                Class2218.field14488);
                        GL11.glPopMatrix();
                    }
                }
            }
        }
    }
}
