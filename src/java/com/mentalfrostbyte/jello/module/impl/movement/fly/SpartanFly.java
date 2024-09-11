package com.mentalfrostbyte.jello.module.impl.movement.fly;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.MouseHoverEvent;
import com.mentalfrostbyte.jello.event.impl.EventKeyPress;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.*;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CHeldItemChangePacket;
import net.minecraft.network.play.client.CPlayerTryUseItemOnBlockPacket;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockRayTraceResult;

public class SpartanFly extends Module {
    private double field23569;
    private boolean field23570;
    private boolean field23571;

    public SpartanFly() {
        super(ModuleCategory.MOVEMENT, "Spartan", "A fly for Spartan anticheat");
        this.registerSetting(new BooleanSetting("Ground Spoof", "Send on ground packets", true));
        this.registerSetting(new BooleanSetting("Fake Block", "Send on fake blockplacing packet", true));
    }

    @Override
    public void onEnable() {
        this.field23570 = false;
        this.field23569 = -10.0;
        if (!mc.gameSettings.keyBindSneak.isKeyDown()) {
            this.field23571 = false;
        } else {
            mc.gameSettings.keyBindSneak.pressed = false;
            this.field23571 = true;
        }
    }

    @EventTarget
    private void method16268(EventKeyPress var1) {
        if (this.isEnabled()) {
            if (var1.getKey() == mc.gameSettings.keyBindSneak.keycode.keyCode) {
                var1.setCancelled(true);
                this.field23571 = true;
            }
        }
    }

    @EventTarget
    private void method16269(MouseHoverEvent var1) {
        if (this.isEnabled()) {
            if (var1.getMouseButton() == mc.gameSettings.keyBindSneak.keycode.keyCode) {
                var1.setCancelled(true);
                this.field23571 = false;
            }
        }
    }

    @EventTarget
    public void method16270(EventUpdate var1) {
        if (this.isEnabled() && var1.isPre() && this.getBooleanValueFromSetttingName("Ground Spoof")) {
            if (this.field23570) {
                this.field23570 = !this.field23570;
                var1.setGround(true);
            }
        }
    }

    @EventTarget
    public void method16271(EventMove var1) {
        if (this.isEnabled()) {
            boolean var4 = mc.player.onGround || ColorUtils.method17730(mc.player, 0.001F);
            if (!var4) {
                if (var1.getY() < 0.0) {
                    if (this.field23569 != mc.player.getPositionVec().y) {
                        if (mc.player.getPositionVec().y + var1.getY() < this.field23569) {
                            this.field23570 = true;
                            int var5 = this.method16272();
                            boolean var6 = this.getBooleanValueFromSetttingName("Fake Block");
                            if (var5 >= 0 && var6) {
                                mc.getConnection().sendPacket(new CHeldItemChangePacket(var5));
                            }

                            if (var6 && (var5 >= 0 || mc.player.getHeldItem(Hand.MAIN_HAND).getItem() instanceof Class3292)) {
                                BlockRayTraceResult var7 = new BlockRayTraceResult(
                                        mc.player.getPositionVec().add(0.0, -2.0, 0.0),
                                        Direction.field673,
                                        mc.player.getPosition().method8336(0, -2, 0),
                                        false
                                );
                                CPlayerTryUseItemOnBlockPacket var8 = new CPlayerTryUseItemOnBlockPacket(Hand.MAIN_HAND, var7);
                                mc.getConnection().sendPacket(var8);
                            }

                            if (var5 >= 0 && var6) {
                                mc.getConnection().sendPacket(new CHeldItemChangePacket(mc.player.inventory.currentItem));
                            }

                            var1.setY(this.field23569 - mc.player.getPositionVec().y);
                        }
                    } else {
                        mc.player.jump();
                        var1.setY(mc.player.getMotion().y);
                        this.field23569 = !mc.gameSettings.keyBindJump.isKeyDown()
                                ? (!this.field23571 ? mc.player.getPositionVec().y : mc.player.getPositionVec().y - 1.0)
                                : (!this.field23571 ? mc.player.getPositionVec().y + 1.0 : mc.player.getPositionVec().y);
                        MovementUtils.method37088(var1, 0.35);
                    }
                }
            } else {
                mc.player.jump();
                var1.setY(mc.player.getMotion().y);
                MovementUtils.method37088(var1, 0.35);
                this.field23569 = !mc.gameSettings.keyBindJump.isKeyDown()
                        ? (!this.field23571 ? mc.player.getPositionVec().y : mc.player.getPositionVec().y - 1.0)
                        : (!this.field23571 ? mc.player.getPositionVec().y + 1.0 : mc.player.getPositionVec().y);
            }

            ColorUtils.method17724(var1.getX());
            ColorUtils.method17725(var1.getY());
            ColorUtils.method17726(var1.getZ());
        }
    }

    public int method16272() {
        for (int var3 = 36; var3 < 45; var3++) {
            if (mc.player.container.getSlot(var3).getHasStack()) {
                ItemStack var4 = mc.player.container.getSlot(var3).getStack();
                if (var4.getItem() instanceof Class3292) {
                    if (var3 - 36 == mc.player.inventory.currentItem) {
                        var3 = 34;
                    }

                    return var3 - 36;
                }
            }
        }

        return -1;
    }
}
