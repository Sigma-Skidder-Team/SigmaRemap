package mapped;

import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5327 extends Class5325 {
    public Class5327() {
        super(ModuleCategory.MOVEMENT, "LongJump", "Makes you jump far away", new Class5178(), new Class5193(), new Class5292(), new Class5366());
        this.method15972(new Class6004("Auto Disable", "Disable Longjump when landing", true));
        this.method15972(new Class6004("BorderJump", "Jumps when you are close to a border", true));
        this.method15972(new Class6004("Auto Jump", "Automatically jumps when you can", true));
    }

    public double method16730(int var1) {
        double[] var4 = new double[]{0.345, 0.2699, 0.183, 0.103, 0.024, -0.008, -0.04, -0.072, -0.104, -0.13, -0.019, -0.097};
        double[] var5 = new double[]{0.345, 0.2699, 0.183, 0.103, 0.024, -0.008, -0.04, -0.072, -0.14, -0.17, -0.019, -0.13};
        var1--;
        if (var1 < 0 || var1 >= var4.length) {
            return mc.field1339.method3433().field18049;
        } else {
            return Class5628.method17686() && !mc.field1339.field5037 ? var4[var1] : var5[var1];
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
        return var1 >= 0 && var1 < var4.length ? var4[var1] : mc.field1339.method3433().field18049;
    }
}
