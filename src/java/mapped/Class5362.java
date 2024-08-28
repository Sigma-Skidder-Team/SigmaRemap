package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5362 extends Module {
    public Class5362() {
        super(ModuleCategory.WORLD, "AutoFarm", "Automatically breaks and replants crops");
    }

    // $VF: synthetic method
    public static Minecraft method16866() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16867() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16868() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16869() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16870() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16871() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16872() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16873() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16874() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16875() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16876() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16877() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16878() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16879() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16880() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16881() {
        return mc;
    }

    @EventTarget
    public void method16865(Class4399 var1) {
        if (this.method15996()) {
            if (mc.field1339 != null && mc.field1338 != null) {
                for (BlockPos var5 : Class9217.method34545(Class9217.method34561(mc.field1337.method23135()))) {
                    if (Class9217.method34535(mc.field1339, var5)) {
                        Class7380 var6 = mc.field1338.method6738(var5);
                        if (var6.method23383() instanceof Class3480 || var6.method23383() instanceof Class3481 || var6.method23383() instanceof Class3483) {
                            Class8848 var14 = mc.field1339.method3094(Class79.field182);
                            if (var14 != null && var14.method32107() instanceof Class3321) {
                                if (var6.<Integer>method23463(Class8820.field39742) != 7) {
                                    float[] var18 = Class9217.method34542(var5, Direction.field672);
                                    var1.method13918(var18[0]);
                                    var1.method13916(var18[1]);
                                    var1.method13922(new Class1358(this, var18));
                                    return;
                                }
                            } else if (var6.<Integer>method23463(Class8820.field39742) == 7) {
                                float[] var17 = Class9217.method34542(var5, Direction.field672);
                                var1.method13918(var17[0]);
                                var1.method13916(var17[1]);
                                var1.method13922(new Class532(this, var5));
                                mc.field1338.method7179(var5, false);
                                return;
                            }
                        } else if (!(var6.method23383() instanceof Class3221)) {
                            if (!(var6.method23383() instanceof Class3408)) {
                                if (var6.method23383() instanceof Class3448) {
                                    Class7380 var7 = mc.field1338.method6738(var5.method8313());
                                    Class7380 var8 = mc.field1338.method6738(var5.method8311());
                                    if (!(var7.method23383() instanceof Class3448) && var8.method23383() instanceof Class3448) {
                                        float[] var9 = Class9217.method34541(var5.method8311());
                                        var1.method13918(var9[0]);
                                        var1.method13916(var9[1]);
                                        var1.method13922(new Class1431(this, var5));
                                        mc.field1338.method7179(var5.method8311(), false);
                                    }
                                }
                            } else {
                                Class7380 var12 = mc.field1338.method6738(var5.method8313());
                                Class7380 var15 = mc.field1338.method6738(var5.method8311());
                                if (!(var12.method23383() instanceof Class3408) && var15.method23383() instanceof Class3408) {
                                    float[] var19 = Class9217.method34541(var5.method8311());
                                    var1.method13918(var19[0]);
                                    var1.method13916(var19[1]);
                                    var1.method13922(new Class654(this, var5));
                                    mc.field1338.method7179(var5.method8311(), false);
                                }
                            }
                        } else if (mc.field1347 == 0) {
                            Class7380 var13 = mc.field1338.method6738(var5.method8311());
                            int var16 = Class7789.method25843(Class8514.field37841);
                            if (var16 == -1) {
                                var16 = Class7789.method25843(Class8514.field38052);
                            }

                            if (var16 == -1) {
                                var16 = Class7789.method25843(Class8514.field38053);
                            }

                            if (var16 == -1) {
                                var16 = Class7789.method25843(Class8514.field38112);
                            }

                            if (var16 == -1) {
                                var16 = Class7789.method25843(Class8514.field37960);
                            }

                            if (var16 == -1) {
                                var16 = Class7789.method25843(Class8514.field37959);
                            }

                            if (var16 != -1 && var13.method23383() instanceof Class3419) {
                                float[] var20 = Class9217.method34542(var5, Direction.field673);
                                var1.method13918(var20[0]);
                                var1.method13916(var20[1]);
                                var1.method13922(new Class649(this, var16, var20));
                                mc.field1347 = 2;
                                Class7380 var11 = Blocks.field36539.method11579();
                                mc.field1338.method6730(var5.method8311(), var11);
                                return;
                            }
                        }
                    }
                }
            }
        }
    }
}
