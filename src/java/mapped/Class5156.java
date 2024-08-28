package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4400;
import com.mentalfrostbyte.jello.event.priority.HigherPriority;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.viaversion.ViaVersionLoader;
import com.mentalfrostbyte.jello.unmapped.Class8005;
import com.mojang.datafixers.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Class5156 extends Module {
    public static boolean field23408 = false;
    private boolean field23409;

    public Class5156() {
        super(ModuleCategory.PLAYER, "OldHitting", "Reverts to 1.7/1.8 hitting");
        this.method15972(new Class6005("Animation", "Animation mode", 0, "Vanilla", "Tap", "Tap2", "Slide", "Slide2", "Scale", "Leaked", "Ninja", "Down"));
        this.method16005(true);
    }

    @EventTarget
    @HigherPriority
    @Class5631
    private void method16020(Class4399 var1) {
        if (this.method15996() || Class8005.method27372() == Class5989.field26129) {
            if (var1.method13921()) {
                boolean var4 = field23386.field1339.method3090() != null && field23386.field1339.method3090().method32107() instanceof Class3267;
                boolean var5 = Client.getInstance().getModuleManager().method14662(Class5357.class).method15988();
                boolean var6 = true;
                if (!field23386.field1339.method3331()
                        && field23386.field1346.method31417() == Class2100.field13690
                        && !Client.getInstance().getModuleManager().method14662(Class5357.class).method15988()) {
                    Class8711 var7 = (Class8711) field23386.field1346;
                    BlockPos var8 = var7.method31423();
                    Class3209 var9 = field23386.field1338.method6738(var8).method23383();
                    ArrayList var10 = new ArrayList<Class3209>(
                            Arrays.asList(
                                    Class8487.field36534,
                                    Class8487.field36657,
                                    Class8487.field36716,
                                    Class8487.field36538,
                                    Class8487.field36665,
                                    Class8487.field36541,
                                    Class8487.field37057,
                                    Class8487.field36646,
                                    Class8487.field36713,
                                    Class8487.field36714,
                                    Class8487.field36715,
                                    Class8487.field36457,
                                    Class8487.field36461,
                                    Class8487.field36558,
                                    Class8487.field36723,
                                    Class8487.field36729,
                                    Class8487.field36592,
                                    Class8487.field36719
                            )
                    );
                    if (var10.contains(var9)
                            || var9 instanceof Class3204
                            || var9 instanceof Class3203
                            || var9 instanceof Class3199
                            || var9 instanceof Class3461 && var9 != Class8487.field36560) {
                        var6 = false;
                    }
                }

                field23408 = field23386.field1299.field44642.method8509() && var4 && var6 && var6 || var5;
                if (!field23408) {
                    if (ViaVersionLoader.field31493.contains(field23386.field1339)) {
                        ViaVersionLoader.field31493.remove(field23386.field1339);
                    }
                } else if (!ViaVersionLoader.field31493.contains(field23386.field1339)) {
                    ViaVersionLoader.field31493.add(field23386.field1339);
                }

                if (field23408 && !this.field23409) {
                    this.field23409 = !this.field23409;
                    if (!var5) {
                        Class5628.method17733();
                    }
                } else if (!field23408 && this.field23409) {
                    this.field23409 = !this.field23409;
                }
            }
        }
    }

    @EventTarget
    @LowerPriority
    @Class5631
    private void method16021(Class4396 var1) {
        if (this.method15996() || Class8005.method27372() == Class5989.field26129) {
            if (field23386.field1339 != null) {
                if (var1.method13898() instanceof Class5588) {
                    Class5588 var4 = (Class5588) var1.method13898();

                    var4.method17562().removeIf(var6 -> var4.method17561() == field23386.field1339.method3205()
                            && var6.getFirst() == Class2106.field13732
                            && var6.getSecond() != null
                            && var6.getSecond().method32107() == Class8514.field38119);
                }
            }
        }
    }

    @EventTarget
    @LowerPriority
    @Class5631
    private void method16022(Class4400 var1) {
        if (this.method15996() || Class8005.method27372() == Class5989.field26129) {
            float var4 = var1.method13924();
            if (var1.method13926() && var1.method13927() == Class2205.field14417 && var1.method13928().method32107() instanceof Class3334) {
                var1.method13931(false);
            } else if (var1.method13927() != Class2205.field14417 || !field23408) {
                if (field23408 && var1.method13926()) {
                    var1.method13900(true);
                    String var5 = this.method15978("Animation");
                    switch (var5) {
                        case "Vanilla":
                            this.method16026(0.0F, var4, var1.method13929());
                            break;
                        case "Tap":
                            this.method16027(0.0F, var4, var1.method13929());
                            break;
                        case "Tap2":
                            this.method16028(0.0F, var4, var1.method13929());
                            break;
                        case "Slide":
                            this.method16029(0.0F, var4, var1.method13929());
                            break;
                        case "Slide2":
                            this.method16030(0.0F, var4, var1.method13929());
                            break;
                        case "Scale":
                            this.method16031(0.0F, var4, var1.method13929());
                            break;
                        case "Leaked":
                            this.method16032(0.0F, var4, var1.method13929());
                            break;
                        case "Ninja":
                            this.method16025(0.0F, var4, var1.method13929());
                            break;
                        case "Tomy":
                            this.method16024(0.0F, var4, var1.method13929());
                            break;
                        case "Down":
                            this.method16033(0.0F, var4, var1.method13929());
                    }
                }
            }
        }
    }

    private void method16023(float var1, float var2, float var3, float var4, Class9332 var5) {
        var5.method35293(new Class7680(var2, var3, var4).method25286(var1));
    }

    private void method16024(float var1, float var2, Class9332 var3) {
        var3.method35291(0.48F, -0.55F, -0.71999997F);
        var3.method35291(0.0, (double) (var1 * -0.6F), 0.0);
        this.method16023(77.0F, 0.0F, 1.0F, 0.0F, var3);
        this.method16023(-10.0F, 0.0F, 0.0F, 1.0F, var3);
        float var6 = Class9679.method37763(var2 * var2 * (float) Math.PI);
        float var7 = Class9679.method37763(Class9679.method37765(var2) * (float) Math.PI);
        this.method16023(var6 * -20.0F, 0.0F, 1.0F, 0.0F, var3);
        this.method16023(var7 * -20.0F, 0.0F, 0.0F, 1.0F, var3);
        this.method16023(var7 * -69.0F, 1.0F, 0.0F, 0.0F, var3);
        this.method16023(-80.0F, 1.0F, 0.0F, 0.0F, var3);
        float var8 = 1.2F;
        var3.method35292(var8, var8, var8);
    }

    private void method16025(float var1, float var2, Class9332 var3) {
        var3.method35291(0.48F, -0.39F, -0.71999997F);
        var3.method35291(0.0, (double) (var1 * -0.6F), 0.0);
        this.method16023(100.0F, 0.0F, 1.0F, 0.0F, var3);
        this.method16023(-50.0F, 0.0F, 0.0F, 1.0F, var3);
        float var6 = Class9679.method37763(var2 * (float) Math.PI);
        float var7 = Class9679.method37763(var2 * (float) Math.PI);
        this.method16023(var6 * -10.0F, 0.0F, 1.0F, 0.0F, var3);
        this.method16023(var7 * -30.0F, 0.0F, 0.0F, 1.0F, var3);
        this.method16023(var7 * 109.0F, 1.0F, 0.0F, 0.0F, var3);
        this.method16023(-90.0F, 1.0F, 0.0F, 0.0F, var3);
        float var8 = 1.2F;
        var3.method35292(var8, var8, var8);
    }

    private void method16026(float var1, float var2, Class9332 var3) {
        var3.method35291(0.48F, -0.55F, -0.71999997F);
        var3.method35291(0.0, (double) (var1 * -0.6F), 0.0);
        this.method16023(77.0F, 0.0F, 1.0F, 0.0F, var3);
        this.method16023(-10.0F, 0.0F, 0.0F, 1.0F, var3);
        float var6 = Class9679.method37763(var2 * var2 * (float) Math.PI);
        float var7 = Class9679.method37763(Class9679.method37765(var2) * (float) Math.PI);
        this.method16023(var6 * -20.0F, 0.0F, 1.0F, 0.0F, var3);
        this.method16023(var7 * -20.0F, 0.0F, 0.0F, 1.0F, var3);
        this.method16023(var7 * -69.0F, 1.0F, 0.0F, 0.0F, var3);
        this.method16023(-80.0F, 1.0F, 0.0F, 0.0F, var3);
        float var8 = 1.2F;
        var3.method35292(var8, var8, var8);
    }

    private void method16027(float var1, float var2, Class9332 var3) {
        var3.method35291(0.0, -3.5, 0.0);
        var3.method35291(0.56F, -0.52F, -0.72F);
        var3.method35291(0.56F, -0.22F, -0.71999997F);
        this.method16023(45.0F, 0.0F, 1.0F, 0.0F, var3);
        float var6 = Class9679.method37763(Class9679.method37765(var2) * (float) Math.PI);
        this.method16023(0.0F, 0.0F, 0.0F, 1.0F, var3);
        this.method16023(var6 * -9.0F, 1.0F, 0.0F, 0.0F, var3);
        this.method16023(-9.0F, 0.0F, 0.0F, 1.0F, var3);
        var3.method35291(0.0, 3.2F, 0.0);
        this.method16023(-80.0F, 1.0F, 0.0F, 0.0F, var3);
        var3.method35292(2.7F, 2.7F, 2.7F);
    }

    private void method16028(float var1, float var2, Class9332 var3) {
        var3.method35291(0.648F, -0.55F, -0.71999997F);
        var3.method35291(0.0, (double) (var1 * -0.6F), 0.0);
        this.method16023(77.0F, 0.0F, 1.0F, 0.0F, var3);
        this.method16023(-10.0F, 0.0F, 0.0F, 1.0F, var3);
        float var6 = Class9679.method37763(Class9679.method37765(var2) * (float) Math.PI);
        this.method16023(-80.0F, 1.0F, 0.0F, 0.0F, var3);
        this.method16023(-var6 * 10.0F, 1.0F, -2.0F, 3.0F, var3);
        float var7 = 1.2F;
        var3.method35292(var7, var7, var7);
    }

    private void method16029(float var1, float var2, Class9332 var3) {
        var3.method35291(0.648F, -0.55F, -0.71999997F);
        var3.method35291(0.0, (double) (var1 * -0.6F), 0.0);
        this.method16023(77.0F, 0.0F, 1.0F, 0.0F, var3);
        this.method16023(-10.0F, 0.0F, 0.0F, 1.0F, var3);
        float var6 = Class9679.method37763(Class9679.method37765(var2) * (float) Math.PI);
        this.method16023(-80.0F, 1.0F, 0.0F, 0.0F, var3);
        this.method16023(-var6 * 20.0F, 1.0F, 0.0F, 0.0F, var3);
        float var7 = 1.2F;
        var3.method35292(var7, var7, var7);
    }

    private void method16030(float var1, float var2, Class9332 var3) {
        var3.method35291(0.48F, -0.55F, -0.71999997F);
        var3.method35291(0.0, (double) (var1 * -0.6F), 0.0);
        this.method16023(77.0F, 0.0F, 1.0F, 0.0F, var3);
        this.method16023(-10.0F, 0.0F, 0.0F, 1.0F, var3);
        float var6 = Class9679.method37763(var2 * var2 * (float) Math.PI);
        float var7 = Class9679.method37763(Class9679.method37765(var2) * (float) Math.PI);
        this.method16023(var6 * -20.0F, 0.0F, 1.0F, 0.0F, var3);
        this.method16023(var7 * -20.0F, 0.0F, 0.0F, 1.0F, var3);
        this.method16023(var7 * -69.0F, 1.0F, 0.0F, 0.0F, var3);
        this.method16023(-80.0F, 1.0F, 0.0F, 0.0F, var3);
        float var8 = 1.2F;
        var3.method35292(var8, var8, var8);
    }

    private void method16031(float var1, float var2, Class9332 var3) {
        var3.method35291(0.48F, -0.55F, -0.71999997F);
        var3.method35291(0.0, (double) (var1 * -0.2F), 0.0);
        this.method16023(77.0F, 0.0F, 1.0F, 0.0F, var3);
        this.method16023(-10.0F, 0.0F, 0.0F, 1.0F, var3);
        float var6 = Class9679.method37763(Class9679.method37765(var2) * (float) Math.PI);
        this.method16023(-80.0F, 1.0F, 0.0F, 0.0F, var3);
        float var7 = 1.2F - var6 * 0.3F;
        var3.method35292(var7, var7, var7);
    }

    private void method16032(float var1, float var2, Class9332 var3) {
        var3.method35291(0.56, -0.52, -0.72);
        float var6 = Class9679.method37763(Class9679.method37765(var2) * (float) Math.PI);
        this.method16023(77.0F, 0.0F, 1.0F, 0.0F, var3);
        this.method16023(-10.0F, 0.0F, 0.0F, 1.0F, var3);
        this.method16023(-80.0F, 1.0F, 0.0F, 0.0F, var3);
        this.method16023(var6 * 10.0F, -4.0F, -2.0F, 5.0F, var3);
        this.method16023(var6 * 30.0F, 1.0F, -0.0F, -1.0F, var3);
    }

    private void method16033(float var1, float var2, Class9332 var3) {
        float var6 = Class9679.method37763(Class9679.method37765(var2) * (float) Math.PI);
        var3.method35291(0.48F, -0.55F, -0.71999997F);
        var3.method35291(0.0, (double) (var6 * -0.2F), 0.0);
        this.method16023(77.0F, 0.0F, 1.0F, 0.0F, var3);
        this.method16023(-10.0F, 0.0F, 0.0F, 1.0F, var3);
        this.method16023(-80.0F, 1.0F, 0.0F, 0.0F, var3);
        float var7 = 1.2F;
        var3.method35292(var7, var7, var7);
    }
}
