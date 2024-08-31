package com.mentalfrostbyte.jello.module.impl.movement.speed;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.event.impl.Class4436;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.movement.BlockFly;
import com.mentalfrostbyte.jello.module.impl.movement.Fly;
import mapped.BooleanSetting;
import net.minecraft.network.play.server.SEntityVelocityPacket;
import mapped.Class9567;
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
    public void method16796(Class4399 var1) {
        if (this.isEnabled() && mc.player != null && !Client.getInstance().getModuleManager().getModuleByClass(Fly.class).isEnabled()) {
            if (mc.player.onGround && var1.method13921()) {
                var1.method13912(var1.method13911() + 1.0E-14);
            }
        }
    }

    @EventTarget
    public void method16797(Class4435 var1) {
        if (this.isEnabled()) {
            if (mc.player.onGround
                    && mc.player.collidedVertically
                    && (mc.player.field4984 != 0.0F || mc.player.field4982 != 0.0F)
                    && this.getBooleanValueFromSetttingName("AutoJump")) {
                mc.player.method2914();
                var1.method13993(mc.player.method3433().x);
                var1.method13995(mc.player.method3433().y);
                var1.method13997(mc.player.method3433().z);
            }

            double var4 = var1.method13998().y;
            var1.method13998().y = 0.0;
            double var6 = var1.method13998().method11348();
            var1.method13998().y = var4;
            this.field23916 = Class9567.method37092(var1, var6, Class9567.method37083()[0], this.field23916, 45.0F);
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
    public void method16798(Class4436 var1) {
        if (this.isEnabled() && !Jesus.method16953() && !Client.getInstance().getModuleManager().getModuleByClass(Fly.class).isEnabled()) {
            if (!mc.gameSettings.keyBindJump.isKeyDown() || !Client.getInstance().getModuleManager().getModuleByClass(BlockFly.class).isEnabled()) {
                this.field23916 = Class9567.method37083()[0];
                this.field23918 = 0;
                var1.method14003(var1.method14001().method11348() * 1.05F);
            }
        }
    }

    @EventTarget
    private void method16799(RecievePacketEvent var1) {
        if (this.isEnabled()) {
            if (mc.player != null && var1.getPacket() instanceof SEntityVelocityPacket) {
                SEntityVelocityPacket var4 = (SEntityVelocityPacket) var1.getPacket();
                if (var4.method17565() != mc.player.method3205()) {
                }
            }
        }
    }
}
