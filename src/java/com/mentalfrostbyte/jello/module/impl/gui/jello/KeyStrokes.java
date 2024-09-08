package com.mentalfrostbyte.jello.module.impl.gui.jello;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4415;
import com.mentalfrostbyte.jello.event.impl.ClickEvent;
import com.mentalfrostbyte.jello.event.impl.Class4430;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.BlurUtil;
import mapped.*;
import net.minecraft.client.Minecraft;

import java.util.ArrayList;
import java.util.Iterator;

public class KeyStrokes extends Module {
    public int field23585 = 10;
    public int field23586 = 260;
    public ArrayList<Class7930> field23587 = new ArrayList<Class7930>();

    public KeyStrokes() {
        super(ModuleCategory.GUI, "KeyStrokes", "Shows what keybind you are pressing");
        this.method16005(false);
    }

    // $VF: synthetic method
    public static Minecraft method16307() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16308() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16309() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16310() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16311() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16312() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16313() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16314() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16315() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16316() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16317() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16318() {
        return mc;
    }

    public Class2132 method16303(int var1) {
        if (var1 != mc.gameSettings.keyBindLeft.keycode.keyCode) {
            if (var1 != mc.gameSettings.keyBindRight.keycode.keyCode) {
                if (var1 != mc.gameSettings.keyBindForward.keycode.keyCode) {
                    if (var1 != mc.gameSettings.keyBindBack.keycode.keyCode) {
                        if (var1 != mc.gameSettings.keyBindAttack.keycode.keyCode) {
                            return var1 != mc.gameSettings.keyBindUseItem.keycode.keyCode ? null : Class2132.field13913;
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
        if (this.isEnabled() && mc.player != null) {
            if (!Minecraft.getInstance().gameSettings.showDebugInfo) {
                if (!Minecraft.getInstance().gameSettings.hideGUI) {
                    this.field23586 = var1.method13960();
                    if (Client.getInstance().getGuiManager().method33472()) {
                        for (Class2132 var7 : Class2132.values()) {
                            Class9268 var8 = var7.method8814();
                            Class9268 var9 = var7.method8815();
                            RenderUtil.method11420(
                                    this.field23585 + var8.field42635,
                                    this.field23586 + var8.field42636,
                                    this.field23585 + var8.field42635 + var9.field42635,
                                    this.field23586 + var8.field42636 + var9.field42636
                            );
                            BlurUtil.method29971(this.field23585 + var8.field42635, this.field23586 + var8.field42636, var9.field42635, var9.field42636);
                            BlurUtil.method29974();
                            RenderUtil.endScissor();
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

                        String var12 = ColorUtils.method17736(var19.field13919.keycode.keyCode);
                        if (var19.field13919 != mc.gameSettings.keyBindAttack) {
                            if (var19.field13919 == mc.gameSettings.keyBindUseItem) {
                                var12 = "R";
                            }
                        } else {
                            var12 = "L";
                        }

                        RenderUtil.method11426(
                                (float) (this.field23585 + var21.field42635),
                                (float) (this.field23586 + var21.field42636),
                                (float) (this.field23585 + var21.field42635 + var23.field42635),
                                (float) (this.field23586 + var21.field42636 + var23.field42636),
                                ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.5F * var10)
                        );
                        RenderUtil.method11463(
                                (float) (this.field23585 + var21.field42635),
                                (float) (this.field23586 + var21.field42636),
                                (float) var23.field42635,
                                (float) var23.field42636,
                                10.0F,
                                0.75F * var11
                        );
                        RenderUtil.drawString(
                                ResourceRegistry.JelloLightFont18,
                                (float) (this.field23585 + var21.field42635 + (var23.field42635 - ResourceRegistry.JelloLightFont18.method23942(var12)) / 2),
                                (float) (this.field23586 + var21.field42636 + 12),
                                var12,
                                ClientColors.LIGHT_GREYISH_BLUE.getColor
                        );
                    }

                    Iterator var14 = this.field23587.iterator();

                    while (var14.hasNext()) {
                        Class7930 var16 = (Class7930) var14.next();
                        Class2132 var18 = var16.field33987;
                        Class9268 var20 = var18.method8814();
                        Class9268 var22 = var18.method8815();
                        RenderUtil.method11420(
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

                        if (var18.method8816().isKeyDown() && var16.field33988.calcPercent() >= var24 && var25 < 2) {
                            var16.field33988.method25318(var24);
                        }

                        float var27 = var16.field33988.calcPercent();
                        int var29 = ColorUtils.applyAlpha(-5658199, (1.0F - var27 * (0.5F + var27 * 0.5F)) * 0.8F);
                        if (Client.getInstance().getGuiManager().method33472()) {
                            var29 = ColorUtils.applyAlpha(-1, (1.0F - var27 * (0.5F + var27 * 0.5F)) * 0.8F);
                        }

                        RenderUtil.method11436(
                                (float) (this.field23585 + var20.field42635 + var22.method34904() / 2),
                                (float) (this.field23586 + var20.field42636 + var22.field42636 / 2),
                                (float) (var22.method34904() - 4) * var27 + 4.0F,
                                var29
                        );
                        RenderUtil.endScissor();
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
        if (this.isEnabled() && mc.player != null) {
            if (this.method16303(var1.method13977()) != null && !var1.method13978()) {
                this.field23587.add(new Class7930(this, this.method16303(var1.method13977())));
            }
        }
    }

    @EventTarget
    private void method16306(ClickEvent var1) {
        if (!this.isEnabled() || mc.player == null) {
        }
    }
}
