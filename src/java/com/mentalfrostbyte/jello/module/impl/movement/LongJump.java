package com.mentalfrostbyte.jello.module.impl.movement;

import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import com.mentalfrostbyte.jello.module.impl.movement.longjump.NCPLongJump;
import com.mentalfrostbyte.jello.module.impl.movement.longjump.MineplexLongJump;
import com.mentalfrostbyte.jello.module.impl.movement.longjump.RedeskyLongJump;
import com.mentalfrostbyte.jello.module.impl.movement.longjump.CubecraftLongJump;
import com.mentalfrostbyte.jello.module.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;

public class LongJump extends ModuleWithModuleSettings {
    public LongJump() {
        super(ModuleCategory.MOVEMENT,
                "LongJump",
                "Makes you jump far away",
                new NCPLongJump(),
                new CubecraftLongJump(),
                new MineplexLongJump(),
                new RedeskyLongJump());
        this.registerSetting(new BooleanSetting("Auto Disable", "Disable Longjump when landing", true));
        this.registerSetting(new BooleanSetting("BorderJump", "Jumps when you are close to a border", true));
        this.registerSetting(new BooleanSetting("Auto Jump", "Automatically jumps when you can", true));
    }

    public double method16730(int var1) {
        double[] var4 = new double[]{0.345, 0.2699, 0.183, 0.103, 0.024, -0.008, -0.04, -0.072, -0.104, -0.13, -0.019, -0.097};
        double[] var5 = new double[]{0.345, 0.2699, 0.183, 0.103, 0.024, -0.008, -0.04, -0.072, -0.14, -0.17, -0.019, -0.13};
        var1--;
        if (var1 < 0 || var1 >= var4.length) {
            return mc.player.getMotion().y;
        } else {
            return MultiUtilities.method17686() && !mc.player.collidedHorizontally ? var4[var1] : var5[var1];
        }
    }

    public double method16731(int var1) {
        double[] var4 = new double[]{
                0.423,
                0.35,
                0.28,
                0.217,
                0.15,
                0.025,
                -0.00625,
                -0.038,
                -0.0693,
                -0.102,
                -0.13,
                -0.018,
                -0.1,
                -0.117,
                -0.14532,
                -0.1334,
                -0.1581,
                -0.183141,
                -0.170695,
                -0.195653,
                -0.221,
                -0.209,
                -0.233,
                -0.25767,
                -0.314917,
                -0.371019,
                -0.426
        };
        var1--;
        return var1 >= 0 && var1 < var4.length ? var4[var1] : mc.player.getMotion().y;
    }
}
