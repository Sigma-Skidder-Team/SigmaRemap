package com.mentalfrostbyte.jello.module.impl.player;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventRayTraceResult;
import com.mentalfrostbyte.jello.event.impl.Class4423;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import com.mentalfrostbyte.jello.module.impl.movement.BlockFly;
import com.mentalfrostbyte.jello.module.impl.movement.blockfly.BlockFlyAACMode;
import mapped.*;
import net.minecraft.entity.ai.attributes.ModifiableAttributeInstance;
import net.minecraft.item.Items;

public class AutoSprint extends Module {
    private final double[] field23605 = new double[]{0.0, 0.0};
    private boolean field23606;

    public AutoSprint() {
        super(ModuleCategory.PLAYER, "AutoSprint", "Sprints for you");
        this.registerSetting(new BooleanSetting("Keep Sprint", "Keep Sprinting after hitting a player", true));
    }

    @EventTarget
    public void method16343(TickEvent var1) {
        if (this.isEnabled()) {
            ModuleWithModuleSettings var4 = (ModuleWithModuleSettings) Client.getInstance().getModuleManager().getModuleByClass(BlockFly.class);
            Module var5 = var4.module;
            if (var5 == null || !var5.isEnabled() || !(var5 instanceof BlockFlyAACMode) || var5.getBooleanValueFromSetttingName("Haphe (AACAP)")) {
                mc.player.setSprinting(mc.player.moveForward > 0.0F && !((BlockFly) Client.getInstance().getModuleManager().getModuleByClass(BlockFly.class)).method16732());
            }
        }
    }

    @EventTarget
    public void method16344(Class4423 var1) {
        if (this.isEnabled()
                && !(mc.player.moveForward <= 0.0F)
                && (!mc.player.isHandActive() || mc.player.getActiveItemStack().getItem() != Items.BOW)
                && !((BlockFly) Client.getInstance().getModuleManager().getModuleByClass(BlockFly.class)).method16732()) {
            ModifiableAttributeInstance var4 = mc.player.getAttribute(Attributes.MOVEMENT_SPEED);
            float var5 = (float) (
                    (var4.getBaseValue() + 0.03F + (double) (0.015F * (float) MovementUtils.method37078())) / (double) mc.player.abilities.getWalkSpeed() + 1.0
            )
                    / 2.0F;
            var1.field21557 = var5;
        }
    }

    @EventTarget
    public void method16345(EventRayTraceResult var1) {
        if (this.isEnabled() && this.getBooleanValueFromSetttingName("Keep Sprint")) {
            if (!var1.isHovering()) {
                if (this.field23605.length == 2) {
                    double var4 = this.field23605[0] - mc.player.getMotion().x;
                    double var6 = this.field23605[1] - mc.player.getMotion().z;
                    if (var4 != 0.0 || var6 != 0.0) {
                        mc.player.setMotion(this.field23605[0], mc.player.getMotion().y, this.field23605[1]);
                    }

                    if (this.field23606 && !mc.player.isSprinting()) {
                        mc.player.setSprinting(true);
                    }
                }
            } else {
                this.field23605[0] = mc.player.getMotion().x;
                this.field23605[1] = mc.player.getMotion().z;
                this.field23606 = mc.player.isSprinting();
            }
        }
    }
}
