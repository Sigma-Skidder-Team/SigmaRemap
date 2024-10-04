package com.mentalfrostbyte.jello.module.impl.movement;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.MouseHoverEvent;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.event.impl.EventKeyPress;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.PremiumModule;
import lol.MovementUtils;
import com.mentalfrostbyte.jello.settings.NumberSetting;
import net.minecraft.entity.Entity;

public class BoatFly extends PremiumModule {
    public boolean field23643 = false;

    public BoatFly() {
        super("BoatFly", "Fly with a boat", ModuleCategory.MOVEMENT);
        this.registerSetting(new NumberSetting<Float>("Speed", "Fly speed", 4.0F, Float.class, 0.28F, 10.0F, 0.01F));
    }

    @EventTarget
    public void method16416(TickEvent var1) {
        if (this.isEnabled()) {
            if (mc.player.getRidingEntity() != null) {
                float var4 = MovementUtils.method37086();
                float var5 = this.getNumberValueBySettingName("Speed");
                double var6 = Math.cos(Math.toRadians(var4)) * (double) var5;
                double var8 = Math.sin(Math.toRadians(var4)) * (double) var5;
                if (!MovementUtils.isMoving()) {
                    var6 = 0.0;
                    var8 = 0.0;
                }

                Entity var10 = mc.player.getRidingEntity();
                var10.rotationYaw = mc.player.rotationYaw;
                var10.setMotion(var6, !mc.player.isJumping ? (!this.field23643 ? 0.0 : (double) (-var5)) : (double) var5, var8);
            }
        }
    }

    @EventTarget
    private void method16417(EventKeyPress var1) {
        if (this.isEnabled()) {
            if (mc.player.getRidingEntity() != null) {
                if (!mc.player.getRidingEntity().onGround) {
                    if (var1.getKey() == mc.gameSettings.keyBindSneak.inputMappingsInput.keyCode) {
                        var1.setCancelled(true);
                        this.field23643 = true;
                    }
                }
            }
        }
    }

    @EventTarget
    private void method16418(MouseHoverEvent var1) {
        if (this.isEnabled()) {
            if (this.field23643 && var1.getMouseButton() == mc.gameSettings.keyBindSneak.inputMappingsInput.keyCode) {
                this.field23643 = false;
            }

            if (mc.player.getRidingEntity() != null) {
                if (!mc.player.getRidingEntity().onGround) {
                    if (var1.getMouseButton() == mc.gameSettings.keyBindSneak.inputMappingsInput.keyCode) {
                        var1.setCancelled(true);
                        this.field23643 = false;
                    }
                }
            }
        }
    }

    @Override
    public void onEnable() {
        if (!mc.gameSettings.keyBindSneak.isKeyDown()) {
            if (!mc.gameSettings.keyBindSneak.isKeyDown()) {
                this.field23643 = false;
            }
        } else {
            mc.gameSettings.keyBindSneak.pressed = false;
            this.field23643 = true;
        }
    }

    @Override
    public void onDisable() {
        mc.gameSettings.keyBindSneak.pressed = this.field23643;
    }
}
