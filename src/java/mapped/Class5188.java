package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4413;
import com.mentalfrostbyte.jello.event.impl.Class4420;
import com.mentalfrostbyte.jello.event.impl.Class4433;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import org.lwjgl.opengl.GL11;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Class5188 extends Module {
    public static Class5188 field23494;
    private final HashMap<PlayerEntity, Class8513> field23493 = new HashMap<PlayerEntity, Class8513>();

    public Class5188() {
        super(ModuleCategory.RENDER, "NameTags", "Render better name tags");
        field23494 = this;
    }

    @EventTarget
    public void method16147(Class4413 var1) {
        if (this.method15996()) {
            byte var4 = 20;
            byte var5 = 32;

            for (Entry var7 : this.field23493.entrySet()) {
                PlayerEntity var8 = (PlayerEntity) var7.getKey();
                if (!var8.method3342()) {
                    Class8513 var9 = (Class8513) var7.getValue();
                    String var10 = var8.getName().getUnformattedComponentText();
                    int var11 = Class7925.field33952.method23942(var10) + 8;
                    int var12 = Math.round(var9.field37220);
                    int var13 = Math.round(var9.field37221);
                    GL11.glPushMatrix();
                    GL11.glTranslatef((float) (-var11 / 2), (float) (-var4), 0.0F);
                    Class3192.method11424((float) var12, (float) var13, (float) var11, 20.0F, Class5628.method17688(Class1979.field12891.field12910, 0.5F));
                    Class3192.method11439(
                            Class7925.field33952, (float) (var12 + 3), (float) var13, var10, Class5628.method17688(Class1979.field12891.field12910, 0.5F)
                    );
                    Class3192.method11439(Class7925.field33952, (float) (var12 + 3), (float) (var13 - 1), var10, Class1979.field12896.field12910);
                    GL11.glPopMatrix();
                    List var14 = Class7789.method25877(var8);
                    if (var14.size() != 0) {
                        int var15 = var5 * var14.size();
                        GL11.glPushMatrix();
                        GL11.glTranslatef((float) (-var15 / 2), (float) (-var4 - var5 - 2), 0.0F);

                        for (int var16 = 0; var16 < var14.size(); var16++) {
                            int var17 = var12 + var16 * var5;
                            ItemStack var18 = (ItemStack) var14.get(var16);
                            int var19 = var17 + 6;
                            Class41 var20 = var18.method32147();
                            int var21 = var13 - Math.max(0, var20.size() - 4) * 8 - 2;

                            for (int var22 = 0; var22 < var20.size(); var22++) {
                                Class39 var23 = var20.method153(var22);
                                int var24 = var22 * 8 + 10;
                                Class2348.field16073.method9187(ResourceLocation.method8289(var23.method126("id"))).ifPresent(var1x -> {
                                    String var4x = var1x.method18820(1).getUnformattedComponentText();
                                    String var5x = "§f" + var4x.substring(0, Math.min(2, var4x.length()));
                                    int var6 = 0;
                                    if (var23.method118("lvl")) {
                                        var6 = var23.method122("lvl");
                                    }

                                    String var7x = "§a";
                                    if (var6 <= 3) {
                                        if (var6 > 2) {
                                            var7x = "§6";
                                        }
                                    } else {
                                        var7x = "§c";
                                    }

                                    String var8x = var5x + var7x + var6;
                                });
                            }

                            int var25 = !var18.method32116() ? var18.method32119() : var18.method32119() - var18.method32117();
                            String var26 = "§a";
                            if (!((float) var25 / (float) var18.method32119() < 0.2F)) {
                                if ((float) var25 / (float) var18.method32119() < 0.5F) {
                                    var26 = "§6";
                                }
                            } else {
                                var26 = "§c";
                            }
                        }

                        GL11.glPopMatrix();
                    }
                }
            }
        }
    }

    @EventTarget
    public void method16148(Class4420 var1) {
        if (this.method15996()) {
            this.field23493.clear();

            for (Entity var5 : mc.world.method6835()) {
                if (var5 instanceof PlayerEntity && !(var5 instanceof ClientPlayerEntity)) {
                    PlayerEntity var6 = (PlayerEntity) var5;
                    Class9425 var7 = Class9647.method37623(var6);
                    double[] var8 = Class3192.method11482(var7.field43722, var7.field43723 + (double) var6.method3430() + 0.3F, var7.field43724);
                    if (var8 != null && var8[2] >= 0.0 && var8[2] < 1.0) {
                        this.field23493.put(var6, new Class8513((float) var8[0], (float) var8[1]));
                    }
                }
            }
        }
    }

    @EventTarget
    public void method16149(Class4433 var1) {
        if (this.method15996() && var1.method13987() instanceof PlayerEntity) {
            var1.method13900(true);
        }
    }
}