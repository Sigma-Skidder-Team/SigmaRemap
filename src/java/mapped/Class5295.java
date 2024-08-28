package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.priority.LowestPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

import java.util.ArrayList;
import java.util.List;

public class Class5295 extends Module {
    private int field23808;
    private int field23809;
    private int field23810;
    private int field23811;

    public Class5295() {
        super(ModuleCategory.ITEM, "AutoPotion", "Automatically throws potion to regen or speed up");
        this.method15972(new Class6009<Float>("Health", "Maximum health before healing.", 6.0F, Float.class, 0.5F, 10.0F, 0.5F));
        this.method15972(new Class6004("Predict", "Predicts where to pot when moving.", true));
        this.method15972(new Class6004("Instant", "Instant potting (more packets).", false));
        this.method15972(new Class6004("Speed", "Uses Speed pots.", true));
        this.method15972(new Class6004("Regen", "Uses Regen pots.", true));
        this.method15972(new Class6004("Custom potion", "Allow the use of custom potions", false));
        this.method15972(new Class6004("In fight", "Allows using autopot with killaura", true));
    }

    @Override
    public void method15966() {
        this.field23811 = 0;
    }

    @EventTarget
    @LowestPriority
    private void method16629(Class4399 var1) {
        if (this.method15996() && var1.method13921()) {
            if (this.method15974("In fight") || Class5357.field23949 == null && Class5357.field23948 == null) {
                int var4 = this.method16631();
                this.field23808++;
                int[] var5 = new int[]{6, -1, -1};
                if (this.method15974("Regen")) {
                    var5[1] = 10;
                }

                if (this.method15974("Speed")) {
                    var5[2] = 1;
                }

                if (!field23386.field1339.field5036) {
                    this.field23809 = 0;
                } else {
                    this.field23809++;
                }

                if (this.field23811 != 1) {
                    if (this.field23811 >= 2) {
                        field23386.field1339.field4902.field5443 = this.field23810;
                        field23386.field1337.method23138();
                        this.field23811 = 0;
                    }

                    if (this.field23809 > 1) {
                        for (int var6 = 0; var6 < var5.length; var6++) {
                            if (var5[var6] != -1) {
                                if (var5[var6] != 6 && var5[var6] != 10) {
                                    if (this.field23808 > 60) {
                                        this.method16634(var1, var4, var5[var6]);
                                    }
                                } else if (this.field23808 > 18
                                        && !field23386.field1339.method3033(Class7144.method22287(var5[var6]))
                                        && field23386.field1339.method3042() < this.method15977("Health") * 2.0F) {
                                    this.method16634(var1, var4, var5[var6]);
                                }
                            }
                        }
                    }
                } else {
                    this.field23811++;
                    field23386.getClientPlayNetHandler().sendPacket(new Class5555(Class79.field182));
                }
            }
        }
    }

    public float[] method16630() {
        double var3 = field23386.field1339.getPosX() + field23386.field1339.method3433().field18048 * 26.0;
        double var5 = field23386.field1339.field5035.field28450 - 3.6;
        double var7 = field23386.field1339.getPosZ() + field23386.field1339.method3433().field18050 * 26.0;
        return !this.method15974("Predict") ? new float[]{field23386.field1339.field5031, 90.0F} : Class9142.method34144(var3, var7, var5);
    }

    public int method16631() {
        int var3 = 5;

        for (int var4 = 36; var4 < 45; var4++) {
            if (!field23386.field1339.field4904.method18131(var4).method18266()) {
                var3 = var4 - 36;
                break;
            }
        }

        return var3;
    }

    public int method16632(int var1) {
        byte var4 = 0;
        byte var5 = 0;
        int var6 = -1;
        int var7 = 0;

        for (int var8 = 9; var8 < 45; var8++) {
            if (field23386.field1339.field4904.method18131(var8).method18266()) {
                Class8848 var9 = field23386.field1339.field4904.method18131(var8).method18265();
                if (var9.method32107() instanceof Class3323) {
                    List<Class2023> var10 = Class7789.method25858(var9);
                    int var11 = this.method16633(var10);
                    if (var10 != null && !var10.isEmpty() && (this.method15974("Custom potion") || var11 == 1)) {
                        for (Class2023 var13 : var10) {
                            int var14 = Class7144.method22288(var13.method8627());
                            int var15 = var13.method8629();
                            int var16 = var13.method8628();
                            if (var14 == var1 && Class7789.method25859(var9)) {
                                if (var15 <= var4) {
                                    if (var15 == var4 && var16 > var5) {
                                        var6 = var8;
                                        var7 = var11;
                                    } else if (var7 > var11 && var15 >= var4) {
                                        var7 = var11;
                                    }
                                } else {
                                    var6 = var8;
                                    var7 = var11;
                                }
                            }
                        }
                    }
                }
            }
        }

        return field23386.field1339.method3033(Class7144.method22287(var1)) && field23386.field1339.method3034(Class7144.method22287(var1)).method8629() >= var4
                ? -1
                : var6;
    }

    private int method16633(List<Class2023> var1) {
        ArrayList var4 = new ArrayList();
        int var5 = 0;

        for (Class2023 var7 : var1) {
            int var8 = Class7144.method22288(var7.method8627());
            if (!var4.contains(var8)) {
                var5++;
                var4.add(var8);
            }
        }

        return var5;
    }

    public void method16634(Class4399 var1, int var2, int var3) {
        int var6 = this.method16632(var3);
        if (var6 != -1) {
            if (var6 < 36) {
                if (Client.getInstance().method19939().method31333() > 2) {
                    Class7789.method25873(var6, var2);
                }
            } else {
                this.field23808 = 0;
                int var7 = field23386.field1339.field4902.field5443;
                boolean var8 = Client.getInstance().getModuleManager().method14662(Class5332.class).method15996()
                        && Client.getInstance().getModuleManager().method14662(Class5332.class).method15978("Type").equalsIgnoreCase("NoGround");
                float[] var9 = this.method16630();
                field23386.field1339.field4902.field5443 = var6 - 36;
                field23386.field1337.method23138();
                if (!this.method15974("Instant")) {
                    this.field23811 = 1;
                    var1.method13918(var9[0]);
                    var1.method13916(var9[1]);
                } else {
                    field23386.getClientPlayNetHandler().sendPacket(new Class5606(var9[0], var9[1], !var8 && field23386.field1339.field5036));
                    field23386.getClientPlayNetHandler().sendPacket(new Class5555(Class79.field182));
                    field23386.getClientPlayNetHandler().sendPacket(new Class5555(Class79.field183));
                    field23386.field1339.field4902.field5443 = var7;
                    field23386.field1337.method23138();
                    Class5357.field23954 = 1;
                }

                this.field23810 = var7;
            }
        }
    }
}
