package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4415;
import com.mentalfrostbyte.jello.event.impl.Class4429;
import com.mentalfrostbyte.jello.event.impl.Class4430;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class8480;

import java.util.ArrayList;
import java.util.Iterator;

public class Class5234 extends Module {
    public int field23585 = 10;
    public int field23586 = 260;
    public ArrayList<Class7930> field23587 = new ArrayList<Class7930>();

    public Class5234() {
        super(ModuleCategory.GUI, "KeyStrokes", "Shows what keybind you are pressing");
        this.method16005(false);
    }

    // $VF: synthetic method
    public static Minecraft method16307() {
        return field23386;
    }

    // $VF: synthetic method
    public static Minecraft method16308() {
        return field23386;
    }

    // $VF: synthetic method
    public static Minecraft method16309() {
        return field23386;
    }

    // $VF: synthetic method
    public static Minecraft method16310() {
        return field23386;
    }

    // $VF: synthetic method
    public static Minecraft method16311() {
        return field23386;
    }

    // $VF: synthetic method
    public static Minecraft method16312() {
        return field23386;
    }

    // $VF: synthetic method
    public static Minecraft method16313() {
        return field23386;
    }

    // $VF: synthetic method
    public static Minecraft method16314() {
        return field23386;
    }

    // $VF: synthetic method
    public static Minecraft method16315() {
        return field23386;
    }

    // $VF: synthetic method
    public static Minecraft method16316() {
        return field23386;
    }

    // $VF: synthetic method
    public static Minecraft method16317() {
        return field23386;
    }

    // $VF: synthetic method
    public static Minecraft method16318() {
        return field23386;
    }

    public Class2132 method16303(int var1) {
        if (var1 != field23386.field1299.field44633.field13070.field34875) {
            if (var1 != field23386.field1299.field44635.field13070.field34875) {
                if (var1 != field23386.field1299.field44632.field13070.field34875) {
                    if (var1 != field23386.field1299.field44634.field13070.field34875) {
                        if (var1 != field23386.field1299.field44643.field13070.field34875) {
                            return var1 != field23386.field1299.field44642.field13070.field34875 ? null : Class2132.field13913;
                        } else {
                            return Class2132.field13912;
                        }
                    } else {
                        return Class2132.field13911;
                    }
                } else {
                    return Class2132.field13910;
                }
            } else {
                return Class2132.field13909;
            }
        } else {
            return Class2132.field13908;
        }
    }

    @EventTarget
    private void method16304(Class4415 var1) {
        if (this.method15996() && field23386.field1339 != null) {
            if (!Minecraft.getInstance().field1299.field44664) {
                if (!Minecraft.getInstance().field1299.field44662) {
                    this.field23586 = var1.method13960();
                    if (Client.getInstance().getGuiManager().method33472()) {
                        for (Class2132 var7 : Class2132.values()) {
                            Class9268 var8 = var7.method8814();
                            Class9268 var9 = var7.method8815();
                            Class3192.method11420(
                                    this.field23585 + var8.field42635,
                                    this.field23586 + var8.field42636,
                                    this.field23585 + var8.field42635 + var9.field42635,
                                    this.field23586 + var8.field42636 + var9.field42636
                            );
                            Class8480.method29971(this.field23585 + var8.field42635, this.field23586 + var8.field42636, var9.field42635, var9.field42636);
                            Class8480.method29974();
                            Class3192.method11422();
                        }
                    }

                    for (Class2132 var19 : Class2132.values()) {
                        Class9268 var21 = var19.method8814();
                        Class9268 var23 = var19.method8815();
                        float var10 = 1.0F;
                        float var11 = 1.0F;
                        if (Client.getInstance().getGuiManager().method33472()) {
                            var11 = 0.5F;
                            var10 = 0.5F;
                        }

                        String var12 = Class5628.method17736(var19.field13919.field13070.field34875);
                        if (var19.field13919 != field23386.field1299.field44643) {
                            if (var19.field13919 == field23386.field1299.field44642) {
                                var12 = "R";
                            }
                        } else {
                            var12 = "L";
                        }

                        Class3192.method11426(
                                (float) (this.field23585 + var21.field42635),
                                (float) (this.field23586 + var21.field42636),
                                (float) (this.field23585 + var21.field42635 + var23.field42635),
                                (float) (this.field23586 + var21.field42636 + var23.field42636),
                                Class5628.method17688(Class1979.field12891.field12910, 0.5F * var10)
                        );
                        Class3192.method11463(
                                (float) (this.field23585 + var21.field42635),
                                (float) (this.field23586 + var21.field42636),
                                (float) var23.field42635,
                                (float) var23.field42636,
                                10.0F,
                                0.75F * var11
                        );
                        Class3192.method11439(
                                ResourceRegistry.field38853,
                                (float) (this.field23585 + var21.field42635 + (var23.field42635 - ResourceRegistry.field38853.method23942(var12)) / 2),
                                (float) (this.field23586 + var21.field42636 + 12),
                                var12,
                                Class1979.field12896.field12910
                        );
                    }

                    Iterator var14 = this.field23587.iterator();

                    while (var14.hasNext()) {
                        Class7930 var16 = (Class7930) var14.next();
                        Class2132 var18 = var16.field33987;
                        Class9268 var20 = var18.method8814();
                        Class9268 var22 = var18.method8815();
                        Class3192.method11420(
                                this.field23585 + var20.field42635,
                                this.field23586 + var20.field42636,
                                this.field23585 + var20.field42635 + var22.field42635,
                                this.field23586 + var20.field42636 + var22.field42636
                        );
                        float var24 = 0.7F;
                        int var25 = 0;

                        for (Class7930 var28 : this.field23587) {
                            if (var28.field33987.equals(var18)) {
                                var25++;
                            }
                        }

                        if (var18.method8816().method8509() && var16.field33988.calcPercent() >= var24 && var25 < 2) {
                            var16.field33988.method25318(var24);
                        }

                        float var27 = var16.field33988.calcPercent();
                        int var29 = Class5628.method17688(-5658199, (1.0F - var27 * (0.5F + var27 * 0.5F)) * 0.8F);
                        if (Client.getInstance().getGuiManager().method33472()) {
                            var29 = Class5628.method17688(-1, (1.0F - var27 * (0.5F + var27 * 0.5F)) * 0.8F);
                        }

                        Class3192.method11436(
                                (float) (this.field23585 + var20.field42635 + var22.method34904() / 2),
                                (float) (this.field23586 + var20.field42636 + var22.field42636 / 2),
                                (float) (var22.method34904() - 4) * var27 + 4.0F,
                                var29
                        );
                        Class3192.method11422();
                        if (var16.field33988.calcPercent() == 1.0F) {
                            var14.remove();
                        }
                    }

                    var1.method13962(160);
                }
            }
        }
    }

    @EventTarget
    private void method16305(Class4430 var1) {
        if (this.method15996() && field23386.field1339 != null) {
            if (this.method16303(var1.method13977()) != null && !var1.method13978()) {
                this.field23587.add(new Class7930(this, this.method16303(var1.method13977())));
            }
        }
    }

    @EventTarget
    private void method16306(Class4429 var1) {
        if (!this.method15996() || field23386.field1339 == null) {
        }
    }
}
