package com.mentalfrostbyte.jello.module.impl.item.autogapple;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.PremiumModule;
import com.mentalfrostbyte.jello.module.impl.item.AutoGapple;
import mapped.*;

public class HypixelAutoGapple extends PremiumModule {
    private int field23678;
    private int field23679;
    private int field23680;
    private int field23681;

    public HypixelAutoGapple() {
        super("Hypixel", "Hypixel bypass", ModuleCategory.PLAYER);
        this.registerSetting(new BooleanSetting("Fire resistance potions", "Automatically drink fire pots", true));
        this.field23678 = -1;
        this.field23681 = -1;
    }

    @Override
    public void onEnable() {
        this.field23678 = -1;
        this.field23680 = 20;
        this.field23681 = -1;
    }

    @EventTarget
    public void method16472(Class4399 var1) {
        if (this.isEnabled() && var1.method13921() && !(mc.currentScreen instanceof Class868)) {
            if (this.field23680 < 20) {
                this.field23680++;
            }

            if (this.field23681 == -1 && this.field23680 >= 20 && this.field23678 == -1) {
                if (mc.player.getHealth() <= this.method16004().getNumberValueBySettingName("Health") * 2.0F && mc.player.method2959() == 0.0F) {
                    this.field23681 = ((AutoGapple) this.method16004()).method16749(false);
                    if (this.field23681 >= 0) {
                        this.field23678 = 0;
                        this.field23680 = 0;
                    }
                }

                if (this.field23678 == -1 && this.getBooleanValueFromSetttingName("Fire resistance potions") && !mc.player.method3033(Effect.method22287(12))) {
                    this.field23681 = ((AutoGapple) this.method16004()).method16749(true);
                    if (this.field23681 >= 0) {
                        this.field23678 = 0;
                        this.field23680 = 0;
                    }
                }
            }

            if (this.field23681 >= 0 && this.field23678 >= 0) {
                this.field23678++;
                if (this.field23678 == 2) {
                    var1.method13916(var1.method13915() + 1.0F);
                }

                if (this.field23678 != 1) {
                    if (this.field23678 >= 3) {
                        mc.getConnection().sendPacket(new CPlayerTryUseItemPacket(Hand.MAIN_HAND));
                        mc.getConnection().sendPacket(new CHeldItemChangePacket(this.field23681 + (this.field23681 != 8 ? 1 : -1)));
                        mc.getConnection().sendPacket(new CHeldItemChangePacket(this.field23681));
                        mc.player.inventory.currentItem = this.field23679;
                        this.field23679 = -1;
                        this.field23678 = -1;
                        this.field23681 = -1;
                    }
                } else {
                    this.field23679 = mc.player.inventory.currentItem;
                    mc.player.inventory.currentItem = this.field23681;
                }
            }
        }
    }
}
