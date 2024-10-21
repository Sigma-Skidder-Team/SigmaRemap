package com.mentalfrostbyte.jello.module.impl.render;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventRender;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.unmapped.ResourceList;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import net.minecraft.util.math.vector.Vector2f;
import mapped.Class9108;
import mapped.RenderUtil;

import java.awt.Color;
import java.io.IOException;

public class DVDSimulator extends Module {
    public Vector2f dvdPosition = new Vector2f(1.0F, 1.0F);
    public float dvdX;
    public float dvdY = 0.0F;
    public float xDirection = 1.0F;
    public float yDirection = 1.0F;
    public Class9108 dvdDimensions = new Class9108(201, 90);
    public int dvdColor = 0;

    public DVDSimulator() {
        super(ModuleCategory.RENDER, "DVD Simulator", "wtf");
        this.changeColor();
    }

    @Override
    public void onEnable() {
        this.dvdX = (float) ((double) (mc.mainWindow.getWidth() - this.dvdDimensions.field41839) * Math.random());
        this.dvdY = (float) ((double) (mc.mainWindow.getHeight() - this.dvdDimensions.field41840) * Math.random());
        this.changeColor();
    }

    @EventTarget
    private void onRender(EventRender event) throws IOException {
        if (this.isEnabled() && mc.player != null && mc.world != null) {
            int windowHeight = mc.mainWindow.getHeight();
            int windowWidth = mc.mainWindow.getWidth();
            float speed = 2;

            if (!(this.dvdY <= speed)) {
                if (this.dvdY + (float) this.dvdDimensions.field41840 > (float) windowHeight) {
                    this.yDirection = -1.0F;
                    this.changeColor();
                }
            } else {
                this.yDirection = 1.0F;
                this.changeColor();
            }

            if (!(this.dvdX <= speed)) {
                if (this.dvdX + (float) this.dvdDimensions.field41839 > (float) windowWidth) {
                    this.xDirection = -1.0F;
                    this.changeColor();
                }
            } else {
                this.xDirection = 1.0F;
                this.changeColor();
            }

            this.dvdX += this.xDirection * speed;
            this.dvdY += this.yDirection * speed;

            RenderUtil.drawImage(
                    this.dvdX,
                    this.dvdY,
                    (float) this.dvdDimensions.field41839,
                    (float) this.dvdDimensions.field41840,
                    ResourceList.dvdPNG,
                    MultiUtilities.applyAlpha(this.dvdColor, 0.8F)
            );
        }
    }

    private void changeColor() {
        this.dvdColor = Color.getHSBColor((float) Math.random(), 0.6F, 1.0F).getRGB();
    }
}
