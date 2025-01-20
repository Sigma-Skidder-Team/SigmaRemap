package com.mentalfrostbyte.jello.module.impl.movement.fly;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.settings.impl.NumberSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.player.MovementUtil;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.client.CPlayerPacket;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;
import net.minecraft.network.play.server.SChatPacket;

public class ViperMCFly extends Module {
    private int field23594;
    private int field23595;
    private double field23596;
    private double field23597;
    private boolean field23598;

    public ViperMCFly() {
        super(ModuleCategory.MOVEMENT, "ViperMC", "A fly for ViperMC");
        this.registerSetting(new NumberSetting<Float>("Speed", "Fly speed", 4.0F, Float.class, 0.2F, 6.0F, 0.1F));
    }

    @Override
    public void onEnable() {
        this.field23596 = mc.player.getPosY();
        this.field23594 = 0;
        if (!mc.gameSettings.keyBindSneak.isKeyDown()) {
            if (!mc.gameSettings.keyBindSneak.isKeyDown()) {
                this.field23598 = false;
            }
        } else {
            mc.gameSettings.keyBindSneak.pressed = false;
            this.field23598 = true;
        }
    }

    @Override
    public void onDisable() {
        MovementUtil.strafe(0.0);
        if (mc.player.getMotion().y > 0.0) {
            MultiUtilities.setPlayerYMotion(-0.0789);
        }
    }

    @EventTarget
    private void method16329(EventKeyPress var1) {
        if (this.isEnabled()) {
            if (var1.getKey() == mc.gameSettings.keyBindSneak.inputMappingsInput.keyCode) {
                var1.setCancelled(true);
                this.field23598 = true;
            }
        }
    }

    @EventTarget
    private void method16330(MouseHoverEvent var1) {
        if (this.isEnabled()) {
            if (var1.getMouseButton() == mc.gameSettings.keyBindSneak.inputMappingsInput.keyCode) {
                var1.setCancelled(true);
                this.field23598 = false;
            }
        }
    }

    @EventTarget
    @LowerPriority
    public void method16331(EventMove var1) {
        if (this.isEnabled()) {
            double var4 = this.getNumberValueBySettingName("Speed");
            if (this.field23594 <= 0) {
                if (this.field23594 != -1) {
                    if (this.field23594 == 0) {
                        if (!mc.gameSettings.keyBindJump.isKeyDown() && var1.getY() > 0.0) {
                            var1.setY(-MovementUtil.getJumpValue());
                        }

                        MultiUtilities.setPlayerYMotion(var1.getY());
                        MovementUtil.setSpeed(var1, MovementUtil.getSpeed());
                    }
                } else {
                    if (mc.gameSettings.keyBindJump.isKeyDown()) {
                        var1.setY(!this.field23598 ? var4 / 2.0 : MovementUtil.getJumpValue());
                        this.field23597 = this.field23596;
                        this.field23596 = !this.field23598 ? mc.player.getPosY() + var1.getY() : this.field23596;
                    } else {
                        var1.setY(this.field23598 && !MultiUtilities.isAboveBounds(mc.player, 0.01F) ? -var4 / 2.0 : MovementUtil.getJumpValue());
                        this.field23597 = this.field23596;
                        this.field23596 = this.field23598 && !MultiUtilities.isAboveBounds(mc.player, 0.01F)
                                ? mc.player.getPosY() + var1.getY()
                                : this.field23596;
                    }

                    MultiUtilities.setPlayerYMotion(var1.getY());
                    MovementUtil.setSpeed(var1, var4);
                }
            } else {
                var1.setY(0.0);
                MovementUtil.setSpeed(var1, 0.0);
            }
        }
    }

    @EventTarget
    public void method16332(EventUpdate var1) {
        if (this.isEnabled() && var1.isPre()) {
            this.field23594++;
            if (this.field23594 != 2) {
                if (this.field23594 > 2) {
                    if (this.field23594 >= 20 && this.field23594 % 20 == 0) {
                        var1.setY(-150.0 - Math.random() * 150.0);
                        this.field23595 += 2;
                    } else {
                        var1.setCancelled(true);
                    }
                }
            } else {
                var1.setY(-150.0 - Math.random() * 150.0);
                this.field23595 += 2;
            }

            var1.setGround(true);
            var1.method13908(true);
        }
    }

    @EventTarget
    public void method16333(ReceivePacketEvent var1) {
        if (this.isEnabled()) {
            IPacket var4 = var1.getPacket();
            if (!(var4 instanceof SPlayerPositionLookPacket)) {
                if (var4 instanceof SChatPacket) {
                    SChatPacket var5 = (SChatPacket) var4;
                    String var6 = var5.getChatComponent().getString();
                    if (this.field23595 > 0 && (var6.contains("Now leaving: §") || var6.contains("Now entering: §"))) {
                        this.field23595--;
                        var1.setCancelled(true);
                    }
                }
            } else {
                SPlayerPositionLookPacket var7 = (SPlayerPositionLookPacket) var4;
                if (this.field23594 >= 1) {
                    this.field23594 = -1;
                }

                this.field23597 = this.field23596;
                this.field23596 = var7.y;
                var7.yaw = mc.player.rotationYaw;
                var7.pitch = mc.player.rotationPitch;
            }
        }
    }

    @EventTarget
    public void method16334(SendPacketEvent var1) {
        if (this.isEnabled()) {
            IPacket var4 = var1.getPacket();
            if (var4 instanceof CPlayerPacket) {
                CPlayerPacket var5 = (CPlayerPacket) var4;
                if (this.field23594 == -1) {
                    var5.onGround = true;
                }
            }
        }
    }

    @EventTarget
    public void method16335(Render2DEvent var1) {
        if (this.isEnabled()) {
            double var4 = this.field23596 - this.field23597;
            double var6 = this.field23596;
            mc.player.positionVec.y = var6;
            mc.player.lastTickPosY = var6;
            mc.player.chasingPosY = var6;
            mc.player.prevPosY = var6;
        }
    }
}
