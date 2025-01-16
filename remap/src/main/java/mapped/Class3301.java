// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class3301 extends Class3167
{
    private Random field15869;
    private boolean field15870;
    private int field15871;
    private int field15872;
    
    public Class3301() {
        super(Class8013.field32985, "Derp", "Spazzes around");
        this.field15869 = new Random();
        this.method9881(new Class5001("Rotation Mode", "Rotation Mode", 0, new String[] { "Random", "Spin", "None" }));
        this.method9881(new Class4999("Hit", "Randomly hit", true));
        this.method9881(new Class4999("Sneak", "Randomly sneak", true));
    }
    
    @Class6753
    public void method10456(final Class5744 class5744) {
        if (!this.method9906() || !class5744.method17046()) {
            return;
        }
        if (this.method9883("Sneak")) {
            if (this.field15870) {
                Class3301.field15514.method5269().method17292(new Class4336(Class3301.field15514.player, Class287.field1592));
            }
            else {
                Class3301.field15514.method5269().method17292(new Class4336(Class3301.field15514.player, Class287.field1591));
            }
        }
        this.field15870 = !this.field15870;
        ++this.field15871;
        if (this.method9883("Hit") && this.field15871 > this.field15869.nextInt(5) + 3) {
            this.field15871 = 0;
            Class3301.field15514.player.method2707(Class316.values()[this.field15869.nextInt(1)]);
        }
        final String method9887 = this.method9887("Rotation Mode");
        switch (method9887) {
            case "Random": {
                class5744.method17043(this.field15869.nextFloat() * 360.0f);
                class5744.method17041(this.field15869.nextFloat() * 180.0f - 90.0f);
                break;
            }
            case "Spin": {
                this.field15872 += 20;
                while (this.field15872 > 360) {
                    this.field15872 -= 360;
                }
                class5744.method17043(this.field15872 + this.field15869.nextFloat());
                break;
            }
        }
    }
    
    @Override
    public void method9879() {
        this.field15872 = (int)Class3301.field15514.player.rotationYaw;
    }
}
