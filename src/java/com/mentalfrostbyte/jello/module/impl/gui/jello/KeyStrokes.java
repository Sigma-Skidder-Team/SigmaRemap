package com.mentalfrostbyte.jello.module.impl.gui.jello;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ClickEvent;
import com.mentalfrostbyte.jello.event.impl.EventKeyPress;
import com.mentalfrostbyte.jello.event.impl.EventRender;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.BlurEngine;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.animation.Animation;
import mapped.ClientColors;
import mapped.KeyBinding;
import mapped.RenderUtil;
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

    public Class2132 method16303(int var1) {
        if (var1 != mc.gameSettings.keyBindLeft.inputMappingsInput.keyCode) {
            if (var1 != mc.gameSettings.keyBindRight.inputMappingsInput.keyCode) {
                if (var1 != mc.gameSettings.keyBindForward.inputMappingsInput.keyCode) {
                    if (var1 != mc.gameSettings.keyBindBack.inputMappingsInput.keyCode) {
                        if (var1 != mc.gameSettings.keyBindAttack.inputMappingsInput.keyCode) {
                            return var1 != mc.gameSettings.keyBindUseItem.inputMappingsInput.keyCode ? null : Class2132.field13913;
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
    private void method16304(EventRender var1) {
        if (this.isEnabled() && mc.player != null) {
            if (!Minecraft.getInstance().gameSettings.showDebugInfo) {
                if (!Minecraft.getInstance().gameSettings.hideGUI) {
                    this.field23586 = var1.method13960();
                    if (Client.getInstance().getGuiManager().method33472()) {
                        for (Class2132 var7 : Class2132.values()) {
                            Class9268 var8 = var7.method8814();
                            Class9268 var9 = var7.method8815();
                            RenderUtil.drawPortalBackground(
                                    this.field23585 + var8.field42635,
                                    this.field23586 + var8.field42636,
                                    this.field23585 + var8.field42635 + var9.field42635,
                                    this.field23586 + var8.field42636 + var9.field42636
                            );
                            BlurEngine.drawBlur(this.field23585 + var8.field42635, this.field23586 + var8.field42636, var9.field42635, var9.field42636);
                            BlurEngine.endBlur();
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

                        String var12 = MultiUtilities.method17736(var19.field13919.inputMappingsInput.keyCode);
                        if (var19.field13919 != mc.gameSettings.keyBindAttack) {
                            if (var19.field13919 == mc.gameSettings.keyBindUseItem) {
                                var12 = "R";
                            }
                        } else {
                            var12 = "L";
                        }

                        RenderUtil.drawRect(
                                (float) (this.field23585 + var21.field42635),
                                (float) (this.field23586 + var21.field42636),
                                (float) (this.field23585 + var21.field42635 + var23.field42635),
                                (float) (this.field23586 + var21.field42636 + var23.field42636),
                                MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.5F * var10)
                        );
                        RenderUtil.drawRoundedRect(
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
                        RenderUtil.drawPortalBackground(
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
                        int var29 = MultiUtilities.applyAlpha(-5658199, (1.0F - var27 * (0.5F + var27 * 0.5F)) * 0.8F);
                        if (Client.getInstance().getGuiManager().method33472()) {
                            var29 = MultiUtilities.applyAlpha(-1, (1.0F - var27 * (0.5F + var27 * 0.5F)) * 0.8F);
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
    private void method16305(EventKeyPress var1) {
        if (this.isEnabled() && mc.player != null) {
            if (this.method16303(var1.getKey()) != null && !var1.isPressed()) {
                this.field23587.add(new Class7930(this, this.method16303(var1.getKey())));
            }
        }
    }

    @EventTarget
    private void method16306(ClickEvent var1) {
        if (!this.isEnabled() || mc.player == null) {
        }
    }

    public enum Class2132 {
       field13908(0.0F, 1.0F, mc.gameSettings.keyBindLeft),
       field13909(2.0F, 1.0F, mc.gameSettings.keyBindRight),
       field13910(1.0F, 0.0F, mc.gameSettings.keyBindForward),
       field13911(1.0F, 1.0F, mc.gameSettings.keyBindBack),
       field13912(0.0F, 2.0F, 74, mc.gameSettings.keyBindAttack),
       field13913(1.02F, 2.0F, 73, mc.gameSettings.keyBindUseItem);

       public float field13914;
       public float field13915;
       public int field13916 = 48;
       public int field13917 = 48;
       public int field13918 = 3;
       public KeyBinding field13919;
       private static final Class2132[] field13920 = new Class2132[]{field13908, field13909, field13910, field13911, field13912, field13913};

       private Class2132(float var3, float var4, KeyBinding var5) {
          this.field13914 = var3;
          this.field13915 = var4;
          this.field13919 = var5;
       }

       private Class2132(float var3, float var4, int var5, KeyBinding var6) {
          this.field13914 = var3;
          this.field13915 = var4;
          this.field13919 = var6;
          this.field13916 = var5;
       }

       public Class9268 method8814() {
          return new Class9268(
             this, (int)(this.field13914 * (float)(this.field13916 + this.field13918)), (int)(this.field13915 * (float)(this.field13917 + this.field13918))
          );
       }

       public Class9268 method8815() {
          return new Class9268(this, this.field13916, this.field13917);
       }

       public KeyBinding method8816() {
          if (this != field13908) {
             if (this != field13909) {
                if (this != field13910) {
                   if (this != field13911) {
                      if (this != field13912) {
                         return this != field13913 ? null : mc.gameSettings.keyBindUseItem;
                      } else {
                         return mc.gameSettings.keyBindAttack;
                      }
                   } else {
                      return mc.gameSettings.keyBindBack;
                   }
                } else {
                   return mc.gameSettings.keyBindForward;
                }
             } else {
                return mc.gameSettings.keyBindRight;
             }
          } else {
             return mc.gameSettings.keyBindLeft;
          }
       }
    }

    public static class Class7930 {
        public Class2132 field33987;
       public Animation field33988;
       public final KeyStrokes field33989;

       public Class7930(KeyStrokes var1, Class2132 var2) {
          this.field33989 = var1;
          this.field33988 = new Animation(300, 0);
          this.field33987 = var2;
       }
    }

    public static class Class9268 {
        public int field42635;
       public int field42636;
       public final Class2132 field42637;

       public Class9268(Class2132 var1, int var2, int var3) {
          this.field42637 = var1;
          this.field42635 = var2;
          this.field42636 = var3;
       }

       public int method34904() {
          return this.field42635;
       }
    }
}
