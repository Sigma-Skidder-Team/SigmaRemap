package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4415;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import org.lwjgl.opengl.GL11;

public class Class5314 extends Module {
    public float field23851 = 0.0F;

    public Class5314() {
        super(ModuleCategory.GUI, "Info HUD", "Shows a bunch of usefull stuff");
        this.method15972(new Class6005("Cords", "Coordinate display type", 1, "None", "Normal", "Precise"));
        this.method15972(new Class6004("Show Player", "Renders a miniature version of your character", true));
        this.method15972(new Class6004("Show Armor", "Shows your armor's status", true));
        this.method16005(false);
    }

    @EventTarget
    private void method16692(Class4415 var1) {
        if (this.method15996() && mc.field1339 != null) {
            if (!Minecraft.getInstance().field1299.field44662) {
                if (!(mc.field1355 instanceof Class1331)) {
                    float var4 = mc.field1339.field5031 % 360.0F - this.field23851 % 360.0F;
                    this.field23851 = this.field23851 + var4 / (float) Minecraft.method1586() * 1.5F;
                    boolean var5 = false;
                    int var6 = 14;
                    if (this.method15974("Show Player")) {
                        var6 += this.method16696(0, mc.field1283.method8044() - 23, 114);
                    }

                    if (this.method15974("Show Armor")) {
                        var6 += this.method16695(var6, mc.field1283.method8044() - 14) + 10;
                    }

                    if (!this.getStringSettingValueByName("Cords").equals("None")) {
                        var6 += this.method16694(var6, 42) + 10;
                    }
                }
            }
        }
    }

    public String method16693(boolean var1) {
        return !var1
                ? Math.round(mc.field1339.getPosX())
                + " "
                + Math.round(mc.field1339.getPosY())
                + " "
                + Math.round(mc.field1339.getPosZ())
                : (float) Math.round(mc.field1339.getPosX() * 10.0) / 10.0F
                + " "
                + (float) Math.round(mc.field1339.getPosY() * 10.0) / 10.0F
                + " "
                + (float) Math.round(mc.field1339.getPosZ() * 10.0) / 10.0F;
    }

    public int method16694(int var1, int var2) {
        String var5 = "Facing South";
        String var6 = this.method16693(this.getStringSettingValueByName("Cords").equals("Precise"));
        Class3192.method11439(
                ResourceRegistry.JelloMediumFont20,
                (float) var1,
                (float) (mc.field1283.method8044() - var2),
                var6,
                Class5628.method17688(Class1979.field12896.field12910, 0.8F)
        );
        return Math.max(ResourceRegistry.JelloLightFont20.method23942(var5), ResourceRegistry.JelloMediumFont20.method23942(var6));
    }

    public int method16695(int var1, int var2) {
        int var5 = 0;

        for (int var6 = 0; var6 < mc.field1339.field4902.field5440.size(); var6++) {
            Class8848 var7 = mc.field1339.field4902.field5440.get(var6);
            if (!(var7.method32107() instanceof Class3280)) {
                var5++;
                int var8 = var2 - 32 * var5;
                Class3192.method11479(var7, var1, var8, 32, 32);
                GL11.glDisable(2896);
                float var9 = 1.0F - (float) var7.method32117() / (float) var7.method32119();
                if (var9 != 1.0F) {
                    Class3192.method11424((float) (var1 + 2), (float) (var8 + 28), 28.0F, 5.0F, Class5628.method17688(Class1979.field12891.field12910, 0.5F));
                    Class3192.method11424(
                            (float) (var1 + 2),
                            (float) (var8 + 28),
                            28.0F * var9,
                            3.0F,
                            Class5628.method17688(!((double) var9 <= 0.2) ? Class1979.field12894.field12910 : Class1979.field12901.field12910, 0.9F)
                    );
                }
            }
        }

        return var5 != 0 ? 32 : -7;
    }

    public int method16696(int var1, int var2, int var3) {
        return var3 - 24;
    }
}
