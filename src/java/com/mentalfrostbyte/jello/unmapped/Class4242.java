package com.mentalfrostbyte.jello.unmapped;

import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import mapped.*;
import org.lwjgl.opengl.GL11;

public class Class4242 extends Class4240 {
    private static String[] field20583;
    private final Texture field20590;
    private final Animation field20592 = new Animation(150, 190, Direction.BACKWARDS);
    private boolean field20591;

    public Class4242(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Texture var7) {
        super(var1, var2, var3, var4, var5, var6);
        this.field20590 = var7;
    }

    @Override
    public void method13028(int var1, int var2) {
        this.field20591 = this.method13298();
        super.method13028(var1, var2);
    }

    @Override
    public void method13027(float var1) {
        this.field20592.changeDirection(!this.field20591 ? Direction.BACKWARDS : Direction.FORWARDS);
        float var4 = Class8603.method30791(this.field20592.calcPercent(), 0.07, 0.73, 0.63, 1.01);
        if (this.field20592.method25319() == Direction.BACKWARDS) {
            var4 = Class8603.method30791(this.field20592.calcPercent(), 0.71, 0.18, 0.95, 0.57);
        }

        Class3192.method11419((float) this.method13263(), (float) this.method13265() - var4 * 3.0F, (float) this.method13267(), (float) this.method13269());
        int var5 = 40;
        float var6 = -Class4318.field21070 / (float) Minecraft.getInstance().mainWindow.method8043();
        float var7 = -Class4318.field21071 / (float) Minecraft.getInstance().mainWindow.method8044();
        Class3192.method11455(
                (float) var5 * var6,
                (float) var5 * var7,
                (float) (Minecraft.getInstance().mainWindow.method8043() + var5),
                (float) (Minecraft.getInstance().mainWindow.method8044() + var5),
                Class1272.field6780
        );
        Class3192.method11422();
        if (this.field20591) {
            Class3192.method11424(
                    (float) this.method13263(),
                    (float) this.method13265() - var4 * 3.0F,
                    (float) this.method13267(),
                    (float) this.method13269(),
                    Class5628.method17688(-12319668, 0.5F)
            );
        }

        Class3192.method11449(
                (float) this.method13263(),
                (float) this.method13265() - var4 * 3.0F,
                (float) this.method13267(),
                (float) this.method13269(),
                this.field20590,
                Class1979.field12896.field12910
        );
        GL11.glPushMatrix();
        super.method13226(var1);
        GL11.glPopMatrix();
    }
}
