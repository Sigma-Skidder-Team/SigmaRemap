package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class8433;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import org.lwjgl.opengl.GL11;

import java.awt.Color;
import java.util.List;
import java.util.*;
import java.util.Map.Entry;

public class Class5377 extends Module {
    public static Class5377 field24004;
    private static final Class282 field24002 = new Class282();
    private static final HashMap<String, Texture> field24003 = new HashMap<String, Texture>();

    static {
        field24003.put("Tomygaims", ResourcesDecrypter.tomyPNG);
        field24003.put("Andro24", ResourcesDecrypter.androPNG);
        field24003.put("Gretorm", ResourcesDecrypter.lpPNG);
        field24003.put("Flyinqq", ResourcesDecrypter.codyPNG);
        field24003.put("cxbot", ResourcesDecrypter.cxPNG);
    }

    public int field24008 = Class5628.method17688(Class5628.method17690(Class1979.field12896.field12910, Class1979.field12891.field12910, 75.0F), 0.5F);
    private final HashMap<BlockPos, Class7070> field24000 = new HashMap<BlockPos, Class7070>();
    private BlockPos field24001;
    private final List<Entity> field24005 = new ArrayList<Entity>();
    private boolean field24006 = false;
    private final HashMap<UUID, String> field24007 = new HashMap<UUID, String>();

    public Class5377() {
        super(ModuleCategory.RENDER, "NameTags", "Render better name tags");
        this.method15972(new Class6004("Magnify", "Scales nametags to keep them readable", true));
        this.method15972(new Class6004("Furnaces", "Shows furnaces info once open", true));
        this.method15972(new Class6004("Mob Owners", "Shows mob owners", true));
        this.method16005(false);
        field24004 = this;
    }

    // $VF: synthetic method
    public static Minecraft method16936() {
        return mc;
    }

    // $VF: synthetic method
    public static Class282 method16937() {
        return field24002;
    }

    // $VF: synthetic method
    public static Minecraft method16938() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16939() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16940() {
        return mc;
    }

    @EventTarget
    private void method16926(TickEvent var1) {
        if (this.method15996()) {
            this.field24006 = this.method15974("Furnaces");
            if (!this.field24006) {
                this.field24000.clear();
            } else {
                Iterator var4 = this.field24000.entrySet().iterator();

                while (var4.hasNext()) {
                    Entry var5 = (Entry) var4.next();
                    if (!(mc.field1338.method6738((BlockPos) var5.getKey()).method23383() instanceof Class3353)) {
                        var4.remove();
                    }

                    ((Class7070) var5.getValue()).method21984();
                }
            }

            this.field24005.clear();

            for (Entity var7 : Class9217.method34549(Class5628.method17680())) {
                if (var7 != mc.field1339
                        && var7 != Class5298.field23814
                        && var7 != Class5319.field23863
                        && !var7.method3342()
                        && !Client.getInstance().getCombatManager().method29346(var7)) {
                    this.field24005.add(var7);
                }
            }
        }
    }

    @EventTarget
    private void method16927(Class4402 var1) {
        if (this.method15996()) {
            if (var1.method13932() instanceof Class5570) {
                Class5570 var4 = (Class5570) var1.method13932();
                if (mc.field1338.method6738(var4.method17498().method31423()).method23383() instanceof Class3353) {
                    this.field24001 = var4.method17498().method31423();
                }
            }

            if (var1.method13932() instanceof Class5594) {
                Class5594 var7 = (Class5594) var1.method13932();
                Class7070 var5 = this.method16929(var7.method17579());
                if (var5 == null) {
                    return;
                }

                if (mc.field1355 instanceof Class856) {
                    Class856 var6 = (Class856) mc.field1355;
                    var5.field30453 = var6.method2628().method18131(0).method18265();
                    var5.field30454 = new ItemStack(var6.method2628().method18131(1).method18265().method32107());
                    var5.field30454.field39976 = var6.method2628().method18131(1).method18265().field39976;
                    var5.field30455 = var6.method2628().method18131(2).method18265();
                }
            }
        }
    }

    @EventTarget
    private void method16928(Class4396 var1) {
        if (this.method15996()) {
            if (var1.method13898() instanceof Class5498) {
                Class5498 var4 = (Class5498) var1.method13898();
                if (var4.method17285() != Class8298.field35661) {
                    return;
                }

                this.field24000.put(this.field24001, new Class7070(var4.method17284()));
            }

            if (var1.method13898() instanceof Class5501) {
                Class5501 var6 = (Class5501) var1.method13898();
                Class7070 var5 = this.method16929(var6.method17303());
                if (var5 == null) {
                    return;
                }

                if (var6.method17304() == 0) {
                    var5.field30453 = new ItemStack(var6.method17305().method32107());
                    var5.field30453.field39976 = var6.method17305().field39976;
                } else if (var6.method17304() == 1) {
                    var5.field30454 = new ItemStack(var6.method17305().method32107());
                    var5.field30454.field39976 = var6.method17305().field39976;
                } else if (var6.method17304() == 2) {
                    var5.field30455 = new ItemStack(var6.method17305().method32107());
                    var5.field30455.field39976 = var6.method17305().field39976;
                }
            }

            if (var1.method13898() instanceof Class5480) {
                Class5480 var7 = (Class5480) var1.method13898();
                Class7070 var8 = this.method16929(var7.method17239());
                if (var8 == null) {
                    return;
                }

                switch (var7.method17240()) {
                    case 0:
                        var8.field30452 = var7.method17241();
                        break;
                    case 1:
                        var8.field30451 = var7.method17241();
                        break;
                    case 2:
                        var8.field30450 = (float) var7.method17241();
                        break;
                    case 3:
                        var8.field30449 = (float) var7.method17241();
                }
            }
        }
    }

    private Class7070 method16929(int var1) {
        for (Entry var5 : this.field24000.entrySet()) {
            if (((Class7070) var5.getValue()).field30448 == var1) {
                return (Class7070) var5.getValue();
            }
        }

        return null;
    }

    @EventTarget
    public void method16930(Class4420 var1) {
        if (this.method15996()) {
            RenderSystem.method27905(33986, 240.0F, 240.0F);
            boolean var4 = this.method15974("Magnify");

            for (Entity var6 : this.field24005) {
                float var7 = 1.0F;
                if (var4) {
                    var7 = (float) Math.max(1.0, Math.sqrt(Class9647.method37620(var6) / 30.0));
                }

                this.method16933(
                        Class9647.method37622(var6).field43722,
                        Class9647.method37622(var6).field43723 + (double) var6.method3430(),
                        Class9647.method37622(var6).field43724,
                        var6,
                        var7,
                        null
                );
                var6.method3210().method35446(Entity.field5067, false);
            }

            for (Entry var11 : this.field24000.entrySet()) {
                float var13 = 1.0F;
                if (var4) {
                    var13 = (float) Math.max(0.8F, Math.sqrt(Class9647.method37621((BlockPos) var11.getKey()) / 30.0));
                }

                this.method16932((BlockPos) var11.getKey(), (Class7070) var11.getValue(), var13);
            }

            if (this.method15974("Mob Owners")) {
                for (Entity var12 : mc.field1338.method6835()) {
                    if (var12 == mc.field1339 && (var12 instanceof Class1013 || var12 instanceof Class1074)) {
                        UUID var14 = !(var12 instanceof Class1013) ? ((Class1074) var12).method4933() : ((Class1013) var12).method4397();
                        if (var14 != null) {
                            if (!this.field24007.containsKey(var14)) {
                                this.field24007.put(var14, null);
                                new Thread(() -> {
                                    try {
                                        List var4x = Class5628.method17700(var14.toString());
                                        if (var4x == null || var4x.isEmpty()) {
                                            return;
                                        }

                                        this.field24007.put(var14, (String) var4x.get(var4x.size() - 1));
                                    } catch (Exception var5) {
                                        var5.printStackTrace();
                                    }
                                }).start();
                            }

                            if (this.field24007.get(var14) != null) {
                                float var8 = 1.0F;
                                if (this.method15974("Magnify")) {
                                    var8 = (float) Math.max(1.0, Math.sqrt(Class9647.method37620(var12) / 30.0));
                                }

                                this.method16933(
                                        Class9647.method37622(var12).field43722,
                                        Class9647.method37622(var12).field43723 + (double) var12.method3430(),
                                        Class9647.method37622(var12).field43724,
                                        var12,
                                        var8,
                                        this.field24007.get(var14)
                                );
                                var12.method3210().method35446(Entity.field5067, false);
                            }
                        }
                    }
                }
            }

            GL11.glDisable(2896);
            RenderSystem.method27905(33986, 240.0F, 240.0F);
            TextureImpl.method36180();
            TextureManager var10000 = mc.getTextureManager();
            mc.getTextureManager();
            var10000.bindTexture(TextureManager.field1094);
        }
    }

    private void method16931(float var1, float var2, float var3, float var4) {
        GL11.glColor4f(var1 / 255.0F, var2 / 255.0F, var3 / 255.0F, var4);
        GL11.glTranslatef(0.0F, 0.0F, 0.3F);
        GL11.glNormal3f(0.0F, 0.0F, 1.0F);
        GL11.glRotated(-37.0, 1.0, 0.0, 0.0);
        GL11.glBegin(6);
        GL11.glVertex2f(0.0F, 0.0F);
        GL11.glVertex2f(0.0F, 0.5F);
        GL11.glVertex2f(0.5F, 0.5F);
        GL11.glVertex2f(0.5F, 0.0F);
        GL11.glEnd();
    }

    public void method16932(BlockPos var1, Class7070 var2, float var3) {
        ClientResource var6 = ResourceRegistry.JelloLightFont25;
        String var7 = "None";
        if (var2.field30453 != null) {
            var7 = var2.field30453.field39976 + " " + var2.field30453.method32149();
        }

        float var8 = (float) ((double) var1.method8304() - mc.field1295.method768().method37504().method11320() + 0.5);
        float var9 = (float) ((double) var1.getY() - mc.field1295.method768().method37504().method11321() + 1.0);
        float var10 = (float) ((double) var1.method8306() - mc.field1295.method768().method37504().method11322() + 0.5);
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(3042);
        GL11.glEnable(2848);
        GL11.glDisable(3553);
        GL11.glDisable(2929);
        GL11.glDisable(2896);
        GL11.glDepthMask(false);
        float var11 = Math.min(var2.field30450 / var2.field30449, 1.0F);
        float var12 = Math.min((float) var2.field30452 / (float) var2.field30451, 1.0F);
        int var13 = 14;
        GL11.glPushMatrix();
        GL11.glAlphaFunc(519, 0.0F);
        GL11.glTranslated(var8, var9 + 0.6F - 0.33333334F * (1.0F - var3), var10);
        GL11.glRotatef(mc.field1295.method768().method37507(), 0.0F, -1.0F, 0.0F);
        GL11.glRotatef(mc.field1295.method768().method37506(), 1.0F, 0.0F, 0.0F);
        GL11.glPushMatrix();
        float var14 = 0.008F;
        GL11.glScalef(-var14 * var3, -var14 * var3, -var14 * var3);
        int var15 = 0;
        ItemStack var16 = var2.method21987();
        if (var16 != null) {
            var15 = Math.max(ResourceRegistry.JelloLightFont20.method23942(var16.method32149().getString()), 50);
        } else {
            var15 = 37;
        }

        int var17 = 51 + var15 + var13 * 2;
        int var18 = 85 + var13 * 2;
        GL11.glTranslated(-var17 / 2, -var18 / 2, 0.0);
        byte var19 = 40;
        Class3192.method11426(0.0F, 0.0F, (float) var17, (float) var18, this.field24008);
        Class3192.method11463(0.0F, 0.0F, (float) var17, (float) var18, 20.0F, 0.5F);
        Class3192.method11439(var6, var13, (float) (var13 - 5), "Furnace", Class1979.field12896.field12910);
        if (var16 == null) {
            Class3192.method11439(
                    ResourceRegistry.JelloLightFont20, (float) (var13 + 15), (float) (var13 + 40), "Empty", Class5628.method17688(Class1979.field12896.field12910, 0.6F)
            );
        }

        ItemStack var20 = var2.method21987();
        if (var20 != null) {
            Class3192.method11479(var20, var13, var13 + 27, 45, 45);
            Class3192.method11439(ResourceRegistry.JelloLightFont20, (float) (var13 + 51), 40.0F, var20.method32149().getString(), Class1979.field12896.field12910);
            Class3192.method11439(ResourceRegistry.JelloLightFont14, (float) (var13 + 51), 62.0F, "Count: " + var20.field39976, Class1979.field12896.field12910);
        }

        Class3192.method11426(0.0F, (float) var18 - 12.0F, Math.min((float) var17 * var12, (float) var17), (float) var18 - 6.0F, Class5628.method17688(-106750, 0.3F));
        Class3192.method11426(
                0.0F, (float) var18 - 6.0F, Math.min((float) var17 * var11, (float) var17), (float) var18, Class5628.method17688(Class1979.field12896.field12910, 0.75F)
        );
        GL11.glPopMatrix();
        GL11.glPopMatrix();
        GL11.glEnable(3553);
        GL11.glEnable(2929);
        GL11.glEnable(2896);
        GL11.glDisable(2848);
        GL11.glDepthMask(true);
        GL11.glDisable(3042);
    }

    public void method16933(double var1, double var3, double var5, Entity var7, float var8, String var9) {
        ClientResource var12 = ResourceRegistry.JelloLightFont25;
        String var13 = var9 == null ? var7.method2941().getString().replaceAll("§.", "") : var9;
        if (Client.getInstance().getModuleManager().method14662(Class5364.class).method15996() && var13.equals(mc.method1533().method21526())) {
            var13 = Client.getInstance().getModuleManager().method14662(Class5364.class).getStringSettingValueByName("Username");
        }

        if (var13.length() != 0) {
            float var14 = (float) (var1 - mc.field1295.method768().method37504().method11320());
            float var15 = (float) (var3 - mc.field1295.method768().method37504().method11321());
            float var16 = (float) (var5 - mc.field1295.method768().method37504().method11322());
            GL11.glBlendFunc(770, 771);
            GL11.glEnable(3042);
            GL11.glEnable(2848);
            GL11.glDisable(2929);
            GL11.glDisable(2896);
            GL11.glDepthMask(false);
            String var17 = (float) Math.round(((Class880) var7).method3042() * 10.0F) / 10.0F + "";
            float var18 = Math.min(((Class880) var7).method3042() / ((Class880) var7).method3075(), 1.0F);
            GL11.glPushMatrix();
            GL11.glAlphaFunc(519, 0.0F);
            GL11.glTranslated(var14, var15 + 0.6F - 0.33333334F * (1.0F - var8), var16);
            GL11.glRotatef(mc.field1295.method768().method37507(), 0.0F, -1.0F, 0.0F);
            GL11.glRotatef(mc.field1295.method768().method37506(), 1.0F, 0.0F, 0.0F);
            GL11.glScalef(-0.009F * var8, -0.009F * var8, -0.009F * var8);
            int var19 = this.field24008;
            if (!Client.getInstance().getFriendManager().method26997(var7)) {
                if (Client.getInstance().getFriendManager().method26999(var7)) {
                    var19 = Class5628.method17688(-6750208, 0.5F);
                }
            } else {
                var19 = Class5628.method17688(-16171506, 0.5F);
            }

            int var20 = Class5628.method17688(
                    !(var7 instanceof PlayerEntity) ? Class1979.field12896.field12910 : new Color(Class8781.method31663((PlayerEntity) var7)).getRGB(), 0.5F
            );
            int var21 = var12.method23942(var13) / 2;
            if (!field24003.containsKey(var13)) {
                Class3192.method11463((float) (-var21 - 10), -25.0F, (float) (var21 * 2 + 20), (float) (var12.method23952() + 27), 20.0F, 0.5F);
            } else {
                int var22 = Color.getHSBColor((float) (System.currentTimeMillis() % 10000L) / 10000.0F, 0.5F, 1.0F).getRGB();
                Class3192.method11449(
                        (float) (-var21 - 10 - 31),
                        -25.0F,
                        (float) (var12.method23952() + 27),
                        (float) (var12.method23952() + 27),
                        field24003.get(var13),
                        Class5628.method17688(var22, 0.7F)
                );
                Class3192.method11449(
                        (float) (-var21 - 10 - 31 + var12.method23952() + 27),
                        -25.0F,
                        14.0F,
                        (float) (var12.method23952() + 27),
                        ResourcesDecrypter.shadowRightPNG,
                        Class5628.method17688(Class1979.field12896.field12910, 0.6F)
                );
                Class3192.method11463((float) (-var21 - 10 - 31), -25.0F, (float) (var21 * 2 + 20 + 31 + 27), (float) (var12.method23952() + 27), 20.0F, 0.5F);
                GL11.glTranslatef(27.0F, 0.0F, 0.0F);
            }

            Class3192.method11426((float) (-var21 - 10), -25.0F, (float) (var21 + 10), (float) (var12.method23952() + 2), var19);
            Class3192.method11426(
                    (float) (-var21 - 10),
                    (float) (var12.method23952() - 1) - (float) ((Class880) var7).field4952 / 3.0F,
                    Math.min((float) (var21 * 2 + 20) * (var18 - 0.5F), (float) (var21 + 10)),
                    (float) (var12.method23952() + 2),
                    var20
            );
            GL11.glPushMatrix();
            GL11.glTranslated(-var12.method23942(var13) / 2, 0.0, 0.0);
            int var26 = ResourceRegistry.JelloLightFont14.method23942("Health: 20.0");
            String var23 = "Health: ";
            int var24 = var12.method23942(var13);
            if (var26 > var24) {
                var23 = "H: ";
            }

            Class3192.method11439(var12, 0.0F, -20.0F, var13, Class1979.field12896.field12910);
            Class3192.method11439(ResourceRegistry.JelloLightFont14, 0.0F, 10.0F, var23 + var17, Class1979.field12896.field12910);
            Class8433 var25 = Client.getInstance().getNetworkManager().field38429.method29512(var7);
            if (var25 != null) {
                Class3192.method11439(ResourceRegistry.JelloLightFont14, 0.0F, -30.0F, var25.field36141, Class1979.field12896.field12910);
            }

            GL11.glPopMatrix();
            GL11.glPopMatrix();
            GL11.glEnable(2929);
            GL11.glEnable(2896);
            GL11.glDisable(2848);
            GL11.glDepthMask(true);
            GL11.glDisable(3042);
        }
    }

    @EventTarget
    public void method16934(Class4433 var1) {
        if (this.method15996() && var1.method13987() instanceof PlayerEntity) {
            var1.method13900(true);
        }
    }
}
