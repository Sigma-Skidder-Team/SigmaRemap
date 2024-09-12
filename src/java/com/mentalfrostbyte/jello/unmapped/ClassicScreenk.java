package com.mentalfrostbyte.jello.unmapped;

import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.ColorUtils;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import mapped.*;
import net.minecraft.client.Minecraft;
import totalcross.json.JSONObject;

public class ClassicScreenk extends Screen {
    private static final Minecraft field21078 = Minecraft.getInstance();
    private static Animation field21079;
    private static final boolean field21080 = true;
    private Class4333 field21081;

    public ClassicScreenk() {
        super("ClassicScreen");
        field21079 = new Animation(250, 200, Direction.FORWARDS);
        this.method13419();
        ColorUtils.method17739();
    }

    public void method13417() {
        this.method13222(() -> this.method13419());
    }

    public void method13418(String var1, ModuleCategory... var2) {
        this.method13222(() -> {
            if (this.field21081 != null) {
                this.method13236(this.field21081);
            }

            this.addToList(this.field21081 = new Class4335(this, var1, this.getWidth() / 2, this.getHeight() / 2, var2));
        });
    }

    private void method13419() {
        if (this.field21081 != null) {
            this.method13236(this.field21081);
        }

        this.addToList(this.field21081 = new Class4334(this, "Sigma", this.getWidth() / 2, this.getHeight() / 2));
    }

    @Override
    public void method13028(int var1, int var2) {
        super.method13028(var1, var2);
    }

    @Override
    public int method13313() {
        return Minecraft.getFps();
    }

    @Override
    public JSONObject method13160(JSONObject var1) {
        ColorUtils.method17742();
        return super.method13160(var1);
    }

    @Override
    public void method13161(JSONObject var1) {
        super.method13161(var1);
    }

    @Override
    public void keyPressed(int var1) {
        super.keyPressed(var1);
        if (var1 == 256) {
            field21078.displayGuiScreen(null);
        }
    }

    @Override
    public void draw(float var1) {
        float var4 = field21079.calcPercent();
        RenderUtil.drawRect(
                (float) this.x,
                (float) this.y,
                (float) (this.x + this.width),
                (float) (this.y + this.height),
                ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.getColor, var4 * 0.35F)
        );
        super.draw(var1);
    }
}