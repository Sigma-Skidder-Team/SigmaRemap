package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4407;
import com.mentalfrostbyte.jello.event.impl.Class4415;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import org.lwjgl.opengl.GL11;

import java.awt.Color;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.*;

public class Class5246 extends Module {
    public int field23613 = 0;
    public int field23614;
    public HashMap<Module, Animation> field23615 = new HashMap<Module, Animation>();
    public ClientResource field23616 = ResourceRegistry.field38854;
    private final List<Module> field23612 = new ArrayList<Module>();

    public Class5246() {
        super(ModuleCategory.GUI, "ActiveMods", "Renders active mods");
        this.method15972(new Class6005("Size", "The font size", 0, "Normal", "Small", "Tiny"));
        this.method15972(new Class6004("Animations", "Scale in animation", true));
        this.method15972(new Class6004("Sound", "Toggle sound", true));
        this.method15989().get("Size").method18616(var1 -> this.method16353());
        this.method16005(false);
    }

    @Override
    public void method15966() {
        this.method16353();
    }

    public void method16353() {
        String var3 = this.method15978("Size");
        switch (var3) {
            case "Normal":
                this.field23616 = ResourceRegistry.field38854;
                break;
            case "Small":
                this.field23616 = ResourceRegistry.field38853;
                break;
            default:
                this.field23616 = ResourceRegistry.field38852;
        }
    }

    @Override
    public void method15953() {
        this.field23612.clear();

        for (Module var4 : Client.getInstance().getModuleManager().method14664().values()) {
            if (var4.method15993() != ModuleCategory.GUI) {
                this.field23612.add(var4);
                this.field23615.put(var4, new Animation(150, 150, Direction.BACKWARDS));
                if (this.method15974("Animations")) {
                    this.field23615.get(var4).changeDirection(!var4.method15996() ? Direction.BACKWARDS : Direction.FORWARDS);
                }
            }
        }

        Collections.sort(this.field23612, new Class3602(this));
    }

    @EventTarget
    private void method16354(Class4407 var1) {
        if (this.method15996() && mc.field1339 != null) {
            if (!var1.method13939()) {
                Class7414.method23839(0.0F, (float) (-this.field23614), 0.0F);
            } else {
                Class6886 var4 = mc.field1338.method6805();
                Class8375 var5 = null;
                Class8218 var6 = var4.method20998(mc.field1339.method2956());
                if (var6 != null) {
                    int var7 = var6.method28591().getColorIndex();
                    if (var7 >= 0) {
                        var5 = var4.method20989(3 + var7);
                    }
                }

                Class8375 var14 = var5 == null ? var4.method20989(1) : var5;
                Collection var8 = var4.method20981(var14);
                int var9 = 0;

                for (Module var11 : this.field23612) {
                    if (var11.method15996()) {
                        var9++;
                    }
                }

                int var15 = 23 + var9 * (this.field23616.method23952() + 1);
                int var16 = var8.size();
                int var12 = Minecraft.getInstance().field1283.method8044();
                int var13 = var12 / 2 - (9 + 5) * (var16 - 3 + 2);
                if (var15 <= var13) {
                    this.field23614 = 0;
                } else {
                    this.field23614 = (var15 - var13) / 2;
                    Class7414.method23839(0.0F, (float) this.field23614, 0.0F);
                }
            }
        }
    }

    @EventTarget
    private void method16355(Class4415 var1) {
        if (this.method15996() && mc.field1339 != null) {
            for (Module var5 : this.field23615.keySet()) {
                if (this.method15974("Animations")) {
                    this.field23615.get(var5).changeDirection(!var5.method15996() ? Direction.BACKWARDS : Direction.FORWARDS);
                }
            }

            if (!Minecraft.getInstance().field1299.field44662) {
                byte var20 = 10;
                byte var21 = 1;
                int var6 = Minecraft.getInstance().field1283.method8043();
                ClientResource var8 = this.field23616;
                byte var9 = -1;
                int var7 = var20 - 4;
                if (this.field23616 == ResourceRegistry.field38852) {
                    var20 -= 3;
                }

                if (Minecraft.getInstance().field1299.field44664) {
                    var7 = (int) ((double) (mc.field1298.field6726.field6674.size() * 9) * mc.field1283.method8049() + 7.0);
                }

                byte var10 = 0;
                int var11 = Class5628.method17688(-1, 0.95F);

                for (Module var13 : this.field23612) {
                    float var14 = 1.0F;
                    float var15 = 1.0F;
                    if (!this.method15974("Animations")) {
                        if (!var13.method15996()) {
                            continue;
                        }
                    } else {
                        Animation var16 = this.field23615.get(var13);
                        if (var16.calcPercent() == 0.0F) {
                            continue;
                        }

                        var15 = var16.calcPercent();
                        var14 = 0.86F + 0.14F * var15;
                    }

                    String var22 = var13.method15990();
                    GL11.glAlphaFunc(519, 0.0F);
                    GL11.glPushMatrix();
                    int var17 = var6 - var20 - var8.method23942(var22) / 2;
                    int var18 = var7 + 12;
                    GL11.glTranslatef((float) var17, (float) var18, 0.0F);
                    GL11.glScalef(var14, var14, 1.0F);
                    GL11.glTranslatef((float) (-var17), (float) (-var18), 0.0F);
                    float var19 = (float) Math.sqrt(Math.min(1.2F, (float) var8.method23942(var22) / 63.0F));
                    Class3192.method11449(
                            (float) var6 - (float) var8.method23942(var22) * 1.5F - (float) var20 - 20.0F,
                            (float) (var7 - 20),
                            (float) var8.method23942(var22) * 3.0F,
                            (float) (var8.method23952() + var21 + 40),
                            ResourcesDecrypter.shadowPNG,
                            Class5628.method17688(Class1979.field12896.field12910, 0.36F * var15 * var19)
                    );
                    Class3192.method11439(
                            var8, (float) (var6 - var20 - var8.method23942(var22)), (float) var7, var22, var15 != 1.0F ? Class5628.method17688(-1, var15 * 0.95F) : var11
                    );
                    GL11.glPopMatrix();
                    var10 -= 100;
                    var7 = (int) ((float) var7 + (float) (var8.method23952() + var21) * Class9782.method38558(var15, 0.0F, 1.0F, 1.0F));
                }

                this.field23613 = var7;
            }
        }
    }

    public int method16356() {
        return this.field23613;
    }

    private Color method16357(int var1, int var2, Color var3) {
        ByteBuffer var6 = ByteBuffer.allocateDirect(3);
        GL11.glPixelStorei(3317, 1);
        GL11.glReadPixels(var1, Minecraft.getInstance().field1283.method8044() - var2, 1, 1, 6407, 5120, var6);
        Color var7 = new Color(var6.get(0) * 2, var6.get(1) * 2, var6.get(2) * 2, 1);
        if (var3 != null) {
            var7 = Class5628.method17681(var7, var3, 0.08F);
        }

        return var7;
    }
}
