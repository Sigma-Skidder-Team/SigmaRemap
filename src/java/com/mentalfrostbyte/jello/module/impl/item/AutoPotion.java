package com.mentalfrostbyte.jello.module.impl.item;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.priority.LowestPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.combat.Criticals;
import com.mentalfrostbyte.jello.module.impl.combat.KillAura;
import com.mentalfrostbyte.jello.settings.BooleanSetting;
import com.mentalfrostbyte.jello.settings.NumberSetting;
import mapped.*;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CPlayerPacket;
import net.minecraft.network.play.client.CPlayerTryUseItemPacket;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.Hand;

import java.util.ArrayList;
import java.util.List;

public class AutoPotion extends Module {
    private int field23808;
    private int field23809;
    private int field23810;
    private int field23811;

    public AutoPotion() {
        super(ModuleCategory.ITEM, "AutoPotion", "Automatically throws potion to regen or speed up");
        this.registerSetting(new NumberSetting<Float>("Health", "Maximum health before healing.", 6.0F, Float.class, 0.5F, 10.0F, 0.5F));
        this.registerSetting(new BooleanSetting("Predict", "Predicts where to pot when moving.", true));
        this.registerSetting(new BooleanSetting("Instant", "Instant potting (more packets).", false));
        this.registerSetting(new BooleanSetting("Speed", "Uses Speed pots.", true));
        this.registerSetting(new BooleanSetting("Regen", "Uses Regen pots.", true));
        this.registerSetting(new BooleanSetting("Custom potion", "Allow the use of custom potions", false));
        this.registerSetting(new BooleanSetting("In fight", "Allows using autopot with killaura", true));
    }

    @Override
    public void onEnable() {
        this.field23811 = 0;
    }

    @EventTarget
    @LowestPriority
    private void method16629(EventUpdate var1) {
        if (this.isEnabled() && var1.isPre()) {
            if (this.getBooleanValueFromSetttingName("In fight") || KillAura.field23949 == null && KillAura.target == null) {
                int var4 = this.method16631();
                this.field23808++;
                int[] var5 = new int[]{6, -1, -1};
                if (this.getBooleanValueFromSetttingName("Regen")) {
                    var5[1] = 10;
                }

                if (this.getBooleanValueFromSetttingName("Speed")) {
                    var5[2] = 1;
                }

                if (!mc.player.onGround) {
                    this.field23809 = 0;
                } else {
                    this.field23809++;
                }

                if (this.field23811 != 1) {
                    if (this.field23811 >= 2) {
                        mc.player.inventory.currentItem = this.field23810;
                        mc.playerController.syncCurrentPlayItem();
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
                                        && !mc.player.isPotionActive(Effect.get(var5[var6]))
                                        && mc.player.getHealth() < this.getNumberValueBySettingName("Health") * 2.0F) {
                                    this.method16634(var1, var4, var5[var6]);
                                }
                            }
                        }
                    }
                } else {
                    this.field23811++;
                    mc.getConnection().sendPacket(new CPlayerTryUseItemPacket(Hand.MAIN_HAND));
                }
            }
        }
    }

    public float[] method16630() {
        double var3 = mc.player.getPosX() + mc.player.getMotion().x * 26.0;
        double var5 = mc.player.boundingBox.minY - 3.6;
        double var7 = mc.player.getPosZ() + mc.player.getMotion().z * 26.0;
        return !this.getBooleanValueFromSetttingName("Predict") ? new float[]{mc.player.rotationYaw, 90.0F} : RotationHelper.method34144(var3, var7, var5);
    }

    public int method16631() {
        int var3 = 5;

        for (int var4 = 36; var4 < 45; var4++) {
            if (!mc.player.container.getSlot(var4).getHasStack()) {
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
            if (mc.player.container.getSlot(var8).getHasStack()) {
                ItemStack var9 = mc.player.container.getSlot(var8).getStack();
                if (var9.getItem() instanceof Class3323) {
                    List<EffectInstance> var10 = InvManagerUtils.getPotionEffects(var9);
                    int var11 = this.method16633(var10);
                    if (var10 != null && !var10.isEmpty() && (this.getBooleanValueFromSetttingName("Custom potion") || var11 == 1)) {
                        for (EffectInstance var13 : var10) {
                            int var14 = Effect.getId(var13.getPotion());
                            int var15 = var13.method8629();
                            int var16 = var13.method8628();
                            if (var14 == var1 && InvManagerUtils.method25859(var9)) {
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

        return mc.player.isPotionActive(Effect.get(var1)) && mc.player.getActivePotionEffect(Effect.get(var1)).method8629() >= var4
                ? -1
                : var6;
    }

    private int method16633(List<EffectInstance> var1) {
        ArrayList var4 = new ArrayList();
        int var5 = 0;

        for (EffectInstance var7 : var1) {
            int var8 = Effect.getId(var7.getPotion());
            if (!var4.contains(var8)) {
                var5++;
                var4.add(var8);
            }
        }

        return var5;
    }

    public void method16634(EventUpdate var1, int var2, int var3) {
        int var6 = this.method16632(var3);
        if (var6 != -1) {
            if (var6 < 36) {
                if (Client.getInstance().getPlayerTracker().getMode() > 2) {
                    InvManagerUtils.moveItemToHotbar(var6, var2);
                }
            } else {
                this.field23808 = 0;
                int var7 = mc.player.inventory.currentItem;
                boolean var8 = Client.getInstance().getModuleManager().getModuleByClass(Criticals.class).isEnabled()
                        && Client.getInstance().getModuleManager().getModuleByClass(Criticals.class).getStringSettingValueByName("Type").equalsIgnoreCase("NoGround");
                float[] var9 = this.method16630();
                mc.player.inventory.currentItem = var6 - 36;
                mc.playerController.syncCurrentPlayItem();
                if (!this.getBooleanValueFromSetttingName("Instant")) {
                    this.field23811 = 1;
                    var1.setPitch(var9[0]);
                    var1.setYaw(var9[1]);
                } else {
                    mc.getConnection().sendPacket(new CPlayerPacket.RotationPacket(var9[0], var9[1], !var8 && mc.player.onGround));
                    mc.getConnection().sendPacket(new CPlayerTryUseItemPacket(Hand.MAIN_HAND));
                    mc.getConnection().sendPacket(new CPlayerTryUseItemPacket(Hand.field183));
                    mc.player.inventory.currentItem = var7;
                    mc.playerController.syncCurrentPlayItem();
                    KillAura.field23954 = 1;
                }

                this.field23810 = var7;
            }
        }
    }
}
