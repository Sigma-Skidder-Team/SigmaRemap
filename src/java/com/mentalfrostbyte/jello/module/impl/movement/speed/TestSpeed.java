package com.mentalfrostbyte.jello.module.impl.movement.speed;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.event.impl.JumpEvent;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.movement.BlockFly;
import com.mentalfrostbyte.jello.module.impl.movement.Fly;
import com.mentalfrostbyte.jello.settings.BooleanSetting;
import net.minecraft.network.play.server.SEntityVelocityPacket;
import lol.MovementUtils;
import com.mentalfrostbyte.jello.module.impl.movement.Jesus;

public class TestSpeed extends Module {
    public int field23918 = 0;
    private double field23912;
    private float field23913;
    private float field23914;
    private boolean field23915;
    private float field23916;
    private float field23917 = 1.0F;

    public TestSpeed() {
        super(ModuleCategory.MOVEMENT, "TestSpeed", "Legit Sprint jumping.");
        this.registerSetting(new BooleanSetting("Sprint", "Sprints when walking", true));
        this.registerSetting(new BooleanSetting("AutoJump", "Automatically jumps for you.", true));
    }

    @EventTarget
    public void method16796(EventUpdate var1) {
        if (this.isEnabled() && mc.player != null && !Client.getInstance().moduleManager.getModuleByClass(Fly.class).isEnabled()) {
            if (mc.player.onGround && var1.isPre()) {
                var1.setY(var1.getY() + 1.0E-14);
            }
        }
    }

    @EventTarget
    public void method16797(EventMove var1) {
        if (this.isEnabled()) {
            if (mc.player.onGround
                    && mc.player.collidedVertically
                    && (mc.player.moveForward != 0.0F || mc.player.moveStrafing != 0.0F)
                    && this.getBooleanValueFromSettingName("AutoJump")) {
                mc.player.jump();
                var1.setX(mc.player.getMotion().x);
                var1.setY(mc.player.getMotion().y);
                var1.setZ(mc.player.getMotion().z);
            }

            double var4 = var1.getVector().y;
            var1.getVector().y = 0.0;
            double var6 = var1.getVector().length();
            var1.getVector().y = var4;
            this.field23916 = MovementUtils.method37092(var1, var6, MovementUtils.method37083()[0], this.field23916, 45.0F);
            if (this.field23913 != 0.0F || this.field23914 != 0.0F) {
                this.field23913 = (float) ((double) this.field23913 * 0.85);
                this.field23914 = (float) ((double) this.field23914 * 0.85);
                this.field23917 = Math.min(1.0F, this.field23917 + 0.1F);
            }

            if (mc.player.onGround && !this.field23915) {
                this.field23913 = 0.0F;
                this.field23914 = 0.0F;
                this.field23917 = Math.min(1.0F, this.field23917 + 0.33F);
            }

            this.field23915 = false;
            this.field23918++;
        }
    }

    @EventTarget
    @LowerPriority
    public void method16798(JumpEvent var1) {
        if (this.isEnabled() && !Jesus.isWalkingOnLiquid() && !Client.getInstance().moduleManager.getModuleByClass(Fly.class).isEnabled()) {
            if (!mc.gameSettings.keyBindJump.isKeyDown() || !Client.getInstance().moduleManager.getModuleByClass(BlockFly.class).isEnabled()) {
                this.field23916 = MovementUtils.method37083()[0];
                this.field23918 = 0;
                var1.method14003(var1.getVector().length() * 1.05F);
            }
        }
    }

    @EventTarget
    private void method16799(ReceivePacketEvent var1) {
        if (this.isEnabled()) {
            if (mc.player != null && var1.getPacket() instanceof SEntityVelocityPacket) {
                SEntityVelocityPacket var4 = (SEntityVelocityPacket) var1.getPacket();
                if (var4.getEntityID() != mc.player.getEntityId()) {
                }
            }
        }
    }
}
