package com.mentalfrostbyte.jello.module.impl.movement.fly;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.settings.NumberSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import mapped.*;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;

public class LibreCraftFly extends Module {
    private int field23910;
    private boolean field23911;

    public LibreCraftFly() {
        super(ModuleCategory.MOVEMENT, "LibreCraft", "A fly for LibreCraft");
        this.registerSetting(new NumberSetting<Float>("Speed", "Fly speed", 4.0F, Float.class, 0.3F, 10.0F, 0.1F));
    }

    @Override
    public void onEnable() {
        this.field23910 = 0;
        if (!mc.gameSettings.keyBindSneak.isKeyDown()) {
            if (!mc.gameSettings.keyBindSneak.isKeyDown()) {
                this.field23911 = false;
            }
        } else {
            mc.gameSettings.keyBindSneak.pressed = false;
            this.field23911 = true;
        }
    }

    @Override
    public void onDisable() {
        MovementUtils.strafe(0.0);
        if (mc.player.getMotion().y > 0.0) {
            MultiUtilities.setPlayerYMotion(-0.0789);
        }
    }

    @EventTarget
    private void method16791(EventKeyPress var1) {
        if (this.isEnabled()) {
            if (var1.getKey() == mc.gameSettings.keyBindSneak.inputMappingsInput.keyCode) {
                var1.setCancelled(true);
                this.field23911 = true;
            }
        }
    }

    @EventTarget
    private void method16792(MouseHoverEvent var1) {
        if (this.isEnabled()) {
            if (var1.getMouseButton() == mc.gameSettings.keyBindSneak.inputMappingsInput.keyCode) {
                var1.setCancelled(true);
                this.field23911 = false;
            }
        }
    }

    @EventTarget
    @LowerPriority
    public void method16793(EventMove var1) {
        if (this.isEnabled()) {
            if (this.field23910 <= 0) {
                if (this.field23910 != -1) {
                    if (this.field23910 == 0) {
                        var1.setY(0.0);
                        MultiUtilities.setPlayerYMotion(var1.getY());
                        MovementUtils.setSpeed(var1, 0.35);
                    }
                } else {
                    var1.setY(0.299);
                    MultiUtilities.setPlayerYMotion(var1.getY());
                    MovementUtils.setSpeed(var1, this.getNumberValueBySettingName("Speed"));
                }
            } else {
                var1.setY(0.0);
                MovementUtils.setSpeed(var1, 0.0);
            }
        }
    }

    @EventTarget
    public void method16794(EventUpdate var1) {
        if (this.isEnabled() && var1.isPre()) {
            this.field23910++;
            if (this.field23910 != 2) {
                if (this.field23910 > 2) {
                    if (this.field23910 >= 20 && this.field23910 % 20 == 0) {
                        var1.setY(0.1);
                    } else {
                        var1.setCancelled(true);
                    }
                }
            } else {
                var1.setY(0.1);
            }

            var1.method13908(true);
        }
    }

    @EventTarget
    public void method16795(ReceivePacketEvent var1) {
        if (this.isEnabled()) {
            IPacket var4 = var1.getPacket();
            if (mc.player != null && var4 instanceof SPlayerPositionLookPacket) {
                SPlayerPositionLookPacket var5 = (SPlayerPositionLookPacket) var4;
                if (this.field23910 >= 1) {
                    this.field23910 = -1;
                }

                var5.yaw = mc.player.rotationYaw;
                var5.pitch = mc.player.rotationPitch;
            }
        }
    }
}
