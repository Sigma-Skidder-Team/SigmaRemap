package com.mentalfrostbyte.jello.module.impl.movement.fly;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.settings.BooleanSetting;
import com.mentalfrostbyte.jello.settings.NumberSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import lol.MovementUtils;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.client.CPlayerPacket;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;

public class ACRFly extends Module {
    private int field23986;
    private double field23987;
    private boolean field23988;

    public ACRFly() {
        super(ModuleCategory.MOVEMENT, "Reloaded", "A fly for AnticheatReloaded");
        this.registerSetting(new NumberSetting<Float>("Speed", "Fly speed", 4.0F, Float.class, 0.3F, 8.0F, 0.1F));
        this.registerSetting(new BooleanSetting("Offset", "Offset while flying", false));
        this.registerSetting(new BooleanSetting("NoFall", "Avoid getting fall damage when flying down", true));
    }

    @Override
    public void onEnable() {
        this.field23987 = mc.player.getPosY();
        this.field23986 = 0;
        if (!mc.gameSettings.keyBindSneak.isKeyDown()) {
            if (!mc.gameSettings.keyBindSneak.isKeyDown()) {
                this.field23988 = false;
            }
        } else {
            mc.gameSettings.keyBindSneak.pressed = false;
            this.field23988 = true;
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
    private void method16902(EventKeyPress var1) {
        if (this.isEnabled()) {
            if (var1.getKey() == mc.gameSettings.keyBindSneak.inputMappingsInput.keyCode) {
                var1.setCancelled(true);
                this.field23988 = true;
            }
        }
    }

    @EventTarget
    private void method16903(MouseHoverEvent var1) {
        if (this.isEnabled()) {
            if (var1.getMouseButton() == mc.gameSettings.keyBindSneak.inputMappingsInput.keyCode) {
                var1.setCancelled(true);
                this.field23988 = false;
            }
        }
    }

    @EventTarget
    @LowerPriority
    public void method16904(EventMove var1) {
        if (this.isEnabled()) {
            if (this.field23986 != -1) {
                if (this.field23986 == 0) {
                    if (Math.abs(var1.getY()) < 0.08) {
                        var1.setY(!this.getBooleanValueFromSettingName("Offset") ? 0.0 : -0.01);
                    }

                    MultiUtilities.setPlayerYMotion(var1.getY());
                    MovementUtils.setSpeed(var1, 0.35);
                }
            } else {
                double var4 = !this.getBooleanValueFromSettingName("Offset") ? 0.0 : 0.01;
                if (this.field23988) {
                    var4 -= this.getNumberValueBySettingName("Speed") / 2.0F;
                }

                if (mc.gameSettings.keyBindJump.isKeyDown()) {
                    var4 += this.getNumberValueBySettingName("Speed") / 2.0F;
                }

                var1.setY(var4);
                MultiUtilities.setPlayerYMotion(var1.getY());
                MovementUtils.setSpeed(var1, this.getNumberValueBySettingName("Speed"));
            }
        }
    }

    @EventTarget
    public void method16905(EventUpdate var1) {
        if (this.isEnabled() && var1.isPre()) {
            this.field23986++;
            if (this.field23986 != 2) {
                if (this.field23986 > 2 && this.field23986 >= 20 && this.field23986 % 20 == 0) {
                    var1.setY(-150.0 - Math.random() * 150.0);
                }
            } else {
                var1.setY(-150.0 - Math.random() * 150.0);
            }

            if (this.getBooleanValueFromSettingName("NoFall")) {
                var1.setGround(true);
            }

            var1.method13908(true);
        }
    }

    @EventTarget
    public void method16906(ReceivePacketEvent var1) {
        if (this.isEnabled()) {
            IPacket var4 = var1.getPacket();
            if (var4 instanceof SPlayerPositionLookPacket) {
                SPlayerPositionLookPacket var5 = (SPlayerPositionLookPacket) var4;
                if (this.field23986 >= 1) {
                    this.field23986 = -1;
                }

                this.field23987 = var5.y;
                var5.yaw = mc.player.rotationYaw;
                var5.pitch = mc.player.rotationPitch;
            }
        }
    }

    @EventTarget
    public void method16907(SendPacketEvent var1) {
        if (this.isEnabled()) {
            IPacket var4 = var1.getPacket();
            if (var4 instanceof CPlayerPacket) {
                CPlayerPacket var5 = (CPlayerPacket) var4;
                if (this.field23986 == -1 && this.getBooleanValueFromSettingName("NoFall")) {
                    var5.onGround = true;
                }
            }
        }
    }

    @EventTarget
    public void method16908(Render2DEvent var1) {
        if (this.isEnabled()) {
            double var4 = this.field23987;
            mc.player.positionVec.y = var4;
            mc.player.lastTickPosY = var4;
            mc.player.chasingPosY = var4;
            mc.player.prevPosY = var4;
        }
    }
}
