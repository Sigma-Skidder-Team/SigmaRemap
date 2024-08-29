package com.mentalfrostbyte.jello.unmapped;

import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import mapped.*;
import totalcross.json.JSONObject;

public class Class4321 extends Class4307 {
    private static final Minecraft field21078 = Minecraft.getInstance();
    private static Animation field21079;
    private static final boolean field21080 = true;
    private Class4333 field21081;

    public Class4321() {
        super("ClassicScreen");
        field21079 = new Animation(250, 200, Direction.FORWARDS);
        this.method13419();
        Class5628.method17739();
    }

    public void method13417() {
        this.method13222(() -> this.method13419());
    }

    public void method13418(String var1, ModuleCategory... var2) {
        this.method13222(() -> {
            if (this.field21081 != null) {
                this.method13236(this.field21081);
            }

            this.method13230(this.field21081 = new Class4335(this, var1, this.method13267() / 2, this.method13269() / 2, var2));
        });
    }

    private void method13419() {
        if (this.field21081 != null) {
            this.method13236(this.field21081);
        }

        this.method13230(this.field21081 = new Class4334(this, "Sigma", this.method13267() / 2, this.method13269() / 2));
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
        Class5628.method17742();
        return super.method13160(var1);
    }

    @Override
    public void method13161(JSONObject var1) {
        super.method13161(var1);
    }

    @Override
    public void method13065(int var1) {
        super.method13065(var1);
        if (var1 == 256) {
            field21078.displayGuiScreen(null);
        }
    }

    @Override
    public void method13027(float var1) {
        float var4 = field21079.calcPercent();
        Class3192.method11426(
                (float) this.field20895,
                (float) this.field20896,
                (float) (this.field20895 + this.field20897),
                (float) (this.field20896 + this.field20898),
                Class5628.method17688(Class1979.field12891.field12910, var4 * 0.35F)
        );
        super.method13027(var1);
    }
}
