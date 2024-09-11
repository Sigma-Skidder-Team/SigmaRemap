package com.mentalfrostbyte.jello.module.impl.item.autogapple;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.PremiumModule;
import com.mentalfrostbyte.jello.module.impl.item.AutoGapple;
import mapped.*;
import net.minecraft.network.play.client.CHeldItemChangePacket;
import net.minecraft.network.play.client.CPlayerTryUseItemPacket;
import net.minecraft.util.Hand;

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
    public void method16472(EventUpdate var1) {
        if (this.isEnabled() && var1.method13921() && !(mc.currentScreen instanceof Class868)) {
            if (this.field23680 < 20) {
                this.field23680++;
            }

            if (this.field23681 == -1 && this.field23680 >= 20 && this.field23678 == -1) {
                if (mc.player.getHealth() <= this.access().getNumberValueBySettingName("Health") * 2.0F && mc.player.getAbsorptionAmount() == 0.0F) {
                    this.field23681 = ((AutoGapple) this.access()).findGappleSlot(false);
                    if (this.field23681 >= 0) {
                        this.field23678 = 0;
                        this.field23680 = 0;
                    }
                }

                if (this.field23678 == -1 && this.getBooleanValueFromSetttingName("Fire resistance potions") && !mc.player.isPotionActive(Effect.method22287(12))) {
                    this.field23681 = ((AutoGapple) this.access()).findGappleSlot(true);
                    if (this.field23681 >= 0) {
                        this.field23678 = 0;
                        this.field23680 = 0;
                    }
                }
            }

            if (this.field23681 >= 0 && this.field23678 >= 0) {
                this.field23678++;
                if (this.field23678 == 2) {
                    var1.setYaw(var1.getYaw() + 1.0F);
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
